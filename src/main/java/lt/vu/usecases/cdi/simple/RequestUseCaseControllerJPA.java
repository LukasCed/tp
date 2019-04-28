package lt.vu.usecases.cdi.simple;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import lt.vu.entities.Customer;
import lt.vu.entities.Order;
import lt.vu.entities.Product;
import lt.vu.entities.ProductCategory;
import lt.vu.usecases.cdi.dao.OrderDao;
import lt.vu.usecases.cdi.dao.ProductCategoryDao;
import lt.vu.usecases.cdi.dao.ProductDao;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Model // tas pats kaip: @Named ir @RequestScoped
@Slf4j
public class RequestUseCaseControllerJPA {

    @Getter
    private Order order = new Order();
    @Getter
    private Customer customer = new Customer();
    @Getter
    private ProductCategory productCategory = new ProductCategory();
    @Getter
    private Product product = new Product();
    @Getter
    private List<Order> allOrders;
    @Getter
    private List<Product> allProducts;

    @PostConstruct
    public void init() {
        loadAllOrders();
        loadAllProducts();
    }

    @Inject
    private ProductCategoryDao productCategoryDao;
    @Inject
    private ProductDao productDao;
    @Inject
    private OrderDao orderDao;


    @Transactional
    public void createOrder() {
        Product existingProduct = productDao.findByName(product.getName());
        productCategory = existingProduct == null ? productCategory : existingProduct.getProductCategory();
        List<ProductCategory> productCategories = new ArrayList<>();
        productCategories.add(productCategory);
        order.setProductCategoryList(productCategories);

        orderDao.create(order);
        productCategoryDao.create(productCategory);
        productDao.create(product);

        log.info("Maybe OK...");
    }

    @Transactional
    public void createProduct() {
        Product existingProduct = productDao.findByName(product.getName());
        productCategory = existingProduct == null ? productCategory : existingProduct.getProductCategory();

        product.setProductCategory(productCategory);
        productDao.create(product);

        log.info("Maybe OK...");
    }


    private void loadAllOrders() {
        allOrders = orderDao.getAllOrders();
    }

    private void loadAllProducts() {
        allProducts = productDao.getAllProducts();
    }
}

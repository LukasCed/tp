package lt.vu.usecases.cdi.simple;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
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
import java.util.List;

@Model // tas pats kaip: @Named ir @RequestScoped
@Slf4j
public class RequestUseCaseControllerJPA {

    @Getter
    private Order order = new Order();
    @Getter
    private ProductCategory productCategory = new ProductCategory();
    @Getter
    private Product product = new Product();
    @Getter
    private List<Product> allProducts;

    @PostConstruct
    public void init() {
        loadAllProducts();
    }

    @Inject
    private ProductCategoryDao productCategoryDao;
    @Inject
    private ProductDao productDao;
    @Inject
    private OrderDao orderDao;


    @Transactional
    public void createCourseStudent() {
//        ProductCategory existing = orderDao.findByTitle(productCategory.getTitle());
//        productCategory = existing == null ? productCategory : existing;
//        product.getOrderList().add(order);
//        product.setProductCategory(productCategory);
//        order.getProductList().add(product);
//        productCategoryDao.create(order);
//        productDao.create(product);
//        log.info("Maybe OK...");
    }

    private void loadAllProducts() {
        allProducts = productDao.getAllProducts();
    }
}

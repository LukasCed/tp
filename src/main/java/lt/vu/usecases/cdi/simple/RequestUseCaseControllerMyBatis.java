package lt.vu.usecases.cdi.simple;

import lombok.extern.slf4j.Slf4j;

import javax.enterprise.inject.Model;

@Model // tas pats kaip: @Named ir @RequestScoped
@Slf4j
public class RequestUseCaseControllerMyBatis {

//    @Getter
//    private Order order = new Order();
//    @Getter
//    private Customer customer = new Customer();
//    @Getter
//    private Product product = new Product();
//    @Getter
//    private List<Order> allOrders;
//    @Getter
//    private List<Product> allProducts;
//
//    @PostConstruct
//    public void init() {
//        loadAllOrders();
//        loadAllProducts();
//    }
//
//    @Inject
//    private ProductCategoryMapper productCategoryDao;
//    @Inject
//    private ProductMapper productDao;
//    @Inject
//    private OrderMapper orderDao;
//    @Inject
//    private CustomerMapper customerDao;
//
//
//    @Transactional
//    public void createOrder() {
//        Product existingProduct = productDao.selectAll().stream()
//                .filter(p -> p.getName() == product.getName())
//                .collect(Collectors.toList()).get(0);
//
//        int productCategoryId = existingProduct.getProductCategoryId();
//        List<Integer> productCategories = new ArrayList<>();
//
//
//        productCategories.add(productCategoryId);
//
//        productCategoryDao.selectAll().get(0)
//
//        order.setProductCategoryList(productCategories);
//        Customer customer = customerDao.findByUserName(this.customer.getUserName());
//        order.setCustomer(customer);
//
//        if (existingProduct == null) {
//            productDao.create(product);
//            productCategoryDao.create(productCategory);
//        }
//
//        orderDao.create(order);
//
//        log.info("Maybe OK...");
//    }
//
//    @Transactional
//    public void createProduct() {
//        Product existingProduct = productDao.findByName(product.getName());
//        productCategory = existingProduct == null ? productCategory : existingProduct.getProductCategory();
//
//        product.setProductCategory(productCategory);
//        productDao.create(product);
//
//        log.info("Maybe OK...");
//    }
//
//
//    private void loadAllOrders() {
//        allOrders = orderDao.getAllOrders();
//    }
//
//    private void loadAllProducts() {
//        allProducts = productDao.getAllProducts();
//    }
}

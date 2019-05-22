package lt.vu.usecases.cdi.simple;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import lt.vu.entities.Order;
import lt.vu.usecases.cdi.dao.OrderDao;
import lt.vu.usecases.cdi.dao.ProductDao;
import org.primefaces.context.RequestContext;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.OptimisticLockException;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@Named("editOrderUseCaseController")
@ViewScoped
@Slf4j
public class EditOrderUseCaseController implements Serializable {

    @Getter private Order selectedOrder;
    @Getter private Order conflictingOrder;
    @Getter private List<Order> allOrders;
//    @Getter private List<University> allUniversities;
//    @Getter private List<Course> allCourses;

    /*
     * DAO:
     */
    @Inject private OrderDao orderDao;
    @Inject private ProductDao productDao;
//    @Inject private CourseDAO courseDAO;
//    @Inject private UniversityDAO universityDAO;

    @PostConstruct
    public void init() {
        reloadAll();
    }

    public void prepareForEditing(Order order) {
        selectedOrder = order;
        conflictingOrder = null;
    }

    @Transactional
    public void updateSelectedOrder() {
        try {
//            selectedOrder.getProductCategoryList().stream()
//            productDao.findByName(selectedOrder)
            orderDao.updateAndFlush(selectedOrder);
            reloadAll();
        } catch (OptimisticLockException ole) {
            conflictingOrder = orderDao.findById(selectedOrder.getId());
            // Pranešam PrimeFaces dialogui, kad užsidaryti dar negalima:
            RequestContext.getCurrentInstance().addCallbackParam("validationFailed", true);
        }
    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public void overwriteOrder() {
        selectedOrder.setOptLockVersion(conflictingOrder.getOptLockVersion());
        updateSelectedOrder();
    }

    public void reloadAll() {
//        allStudents = studentDAO.getAllStudents();
//        allUniversities = universityDAO.getAllUniversities();
         allOrders = orderDao.getAllOrders();
    }

}

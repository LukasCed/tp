package lt.vu.usecases.cdi.dao;

import lt.vu.entities.Order;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class OrderDao {
    @Inject
    private EntityManager em;

    public void create(Order order) {
        em.persist(order);
    }

    public void updateAndFlush(Order order) {
        em.merge(order);
        em.flush();
    }

    public Order findById(Integer id) {
        return em.find(Order.class, id);
    }


    public List<Order> getAllOrders() {
        return em.createNamedQuery("Order.findAll", Order.class).getResultList();
    }

}

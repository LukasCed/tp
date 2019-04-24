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

    public List<Order> getAllORders() {
        return em.createNamedQuery("OrderDao.findAll", Order.class).getResultList();
    }

}

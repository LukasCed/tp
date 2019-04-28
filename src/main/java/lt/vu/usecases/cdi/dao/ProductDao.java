package lt.vu.usecases.cdi.dao;

import lt.vu.entities.Product;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class ProductDao {
    @Inject
    private EntityManager em;

    public void create(Product product) {
        em.persist(product);
    }
    public void updateAndFlush(Product product) {
        em.merge(product);
        em.flush();
    }

    public List<Product> getAllProducts() {
        return em.createNamedQuery("Product.findAll", Product.class).getResultList();
    }

    public Product findById(Integer id) {
        return em.find(Product.class, id);
    }

    public Product findByName(String name) {
        try {
            return em.createNamedQuery("Product.findByName", Product.class).setParameter("name", name).getSingleResult();
        } catch (Exception ex) {
            return null;
        }
    }
}

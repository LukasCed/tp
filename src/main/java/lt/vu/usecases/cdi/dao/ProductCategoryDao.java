package lt.vu.usecases.cdi.dao;

import lt.vu.entities.ProductCategory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class ProductCategoryDao {
    @Inject
    private EntityManager em;

    public void create(ProductCategory productCategory) {
        em.persist(productCategory);
    }

    public List<ProductCategory> getAllProductCategories() {
        return em.createNamedQuery("ProductCategory.findAll", ProductCategory.class).getResultList();
    }

    public ProductCategory findByTitle(String title) {
        try {
            return em.createNamedQuery("ProductCategory.findByTitle", ProductCategory.class).setParameter("title", title).getSingleResult();
        }
        catch (Exception ex) {
            return null;
        }
    }
}

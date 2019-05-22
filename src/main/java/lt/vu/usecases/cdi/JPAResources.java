package lt.vu.usecases.cdi;

import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@ApplicationScoped
public class JPAResources {

    @PersistenceUnit
    private EntityManagerFactory emf;

    @Produces
    @Default
    @RequestScoped
    private EntityManager createJTAEntityManager() {
        return emf.createEntityManager();
    }

    private void closeDefaultEntityManager(@Disposes @Default EntityManager em) {
        em.close();
    }

    private void closeResqueEntityManager(@Disposes @RescueOrAsync EntityManager em) {
        em.close();
    }

    @PreDestroy
    private void nznKasIvyks() {
        System.out.println("fgffd");
    }

}

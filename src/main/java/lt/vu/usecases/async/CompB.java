package lt.vu.usecases.async;

import lt.vu.usecases.interceptor.AsyncCompInterceptor;
import org.apache.deltaspike.core.api.future.Futureable;

import javax.ejb.AsyncResult;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.concurrent.Future;

@ApplicationScoped
@AsyncCompInterceptor
public class CompB implements AsyncComp {

    @Inject
    private EntityManager em; // Jei šis komponentas turi dirbti su DB per JPA

    @Futureable
    @Transactional(Transactional.TxType.REQUIRES_NEW) // be šios anotacijos negalėsime gauti @RescueOrAsync EntityManager
    public Future<String> asyncMethod() {
        System.out.println("CompB async method start...");
        try {
            Thread.sleep(10000); // sleep for 10 seconds
        } catch (InterruptedException e) {
        }
        System.out.println("CompB async method end.");
        return new AsyncResult<>("59B");
    }

}

package lt.vu.usecases.async;

import lt.vu.usecases.interceptor.AsyncCompInterceptor;
import org.apache.deltaspike.core.api.future.Futureable;

import javax.ejb.AsyncResult;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import java.util.concurrent.Future;

@ApplicationScoped
@Alternative
@AsyncCompInterceptor
public class CompC implements AsyncComp {
    @Futureable
    public Future<String> asyncMethod() {
        System.out.println("CompC async method start...");
        try {
            Thread.sleep(100); // sleep for 10 seconds
        } catch (InterruptedException e) {
        }
        System.out.println("CompC async method end.");
        return new AsyncResult<>("54C");
    }

}

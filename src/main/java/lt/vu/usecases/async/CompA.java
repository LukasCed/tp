package lt.vu.usecases.async;

import lt.vu.usecases.interceptor.AsyncCompInterceptor;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Named
@ApplicationScoped
@AsyncCompInterceptor
public class CompA implements Serializable {

    @Inject
    private AsyncComp comp;

    private Future<String> resultInFuture = null;

    public String callAsyncMethod() throws ExecutionException, InterruptedException {
        if (resultInFuture == null) {
            resultInFuture = comp.asyncMethod();
            return "Async comp is done? " + resultInFuture.isDone();
        } else {
            if (resultInFuture.isDone()) {
                String result = resultInFuture.get();
                resultInFuture = null;
                return "Result from async comp: " + result;
            } else {
                return "Result from async comp not ready yet";
            }
        }
    }

}

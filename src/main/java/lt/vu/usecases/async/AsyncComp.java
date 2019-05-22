package lt.vu.usecases.async;

import lt.vu.usecases.interceptor.AsyncCompInterceptor;

import java.io.Serializable;
import java.util.concurrent.Future;

public interface AsyncComp extends Serializable {
    Future<String> asyncMethod();
}

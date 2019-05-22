package lt.vu.usecases.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@AsyncCompInterceptor
public class LoggerInterceptor {
    @AroundInvoke
    public Object execute(InvocationContext ctx)
            throws Exception {
        System.out.println("Logging an invocation to async component...");
        Object result = ctx.proceed();
        return result; // or something else
    }
}

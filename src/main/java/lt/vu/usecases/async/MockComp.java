package lt.vu.usecases.async;

import org.apache.deltaspike.core.api.future.Futureable;

import javax.ejb.AsyncResult;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Specializes;
import java.util.concurrent.Future;

@Alternative
@Specializes
public class MockComp extends CompC {
    @Futureable
    public Future<String> asyncMethod() {
        System.out.println("Mock async method start...");
        return new AsyncResult<>("MOCK11");
    }

}

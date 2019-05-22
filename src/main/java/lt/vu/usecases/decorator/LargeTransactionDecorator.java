package lt.vu.usecases.decorator;

import lt.vu.entities.Order;
import lt.vu.usecases.rest.OrderService;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.ws.rs.QueryParam;

@Decorator
public abstract class LargeTransactionDecorator
        implements OrderService {
    @Inject
    @Delegate
    @Any
    OrderService orderService;

    public Order create(@QueryParam("amount") int amount,
                 @QueryParam("customerId") int customerId,
                 @QueryParam("productId") int productId) {
        if (amount > 1000) {
            System.out.print("Sending information to VMI....");
        }

       return orderService.create(amount, customerId, productId);
    }

}
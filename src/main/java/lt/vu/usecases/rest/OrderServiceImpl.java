package lt.vu.usecases.rest;

import lt.vu.entities.Customer;
import lt.vu.entities.Order;
import lt.vu.entities.ProductCategory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;

@ApplicationScoped
@Path("/order")
@Produces(MediaType.APPLICATION_JSON)
public class OrderServiceImpl implements OrderService  {

    @Inject
    private EntityManager em;

    @Path("/{orderId}")
    @GET
    public Order find(@PathParam("orderId") int id) {
        Order order = em.find(Order.class, id);
        return order;
    }

    @Path("/")
    @POST
    @Transactional
    public Order create(@QueryParam("amount") int amount,
                 @QueryParam("customerId") int customerId,
                 @QueryParam("productId") int productId) {
        Order order = new Order();
        Customer customer = em.find(Customer.class, customerId);
        ProductCategory productCategory = em.find(ProductCategory.class, productId);
        order.setAmount(amount);
        order.setCustomer(customer);
        order.setProductCategoryList(Collections.singletonList(productCategory));
        em.persist(order);
        return order;
    }

    @Path("/{orderId}")
    @PUT @Transactional
    public Response update(@PathParam("orderId") int id,
                    @QueryParam("amount") int amount,
                    @QueryParam("customerId") int customerId,
                    @QueryParam("productId") int productId) {
        Order order = em.find(Order.class, id);
        Customer customer = em.find(Customer.class, customerId);
        ProductCategory productCategory = em.find(ProductCategory.class, productId);
        order.setAmount(amount);
        order.setCustomer(customer);
        order.setProductCategoryList(Collections.singletonList(productCategory));
        em.merge(order);
        return Response.ok(order).build(); // low level API
    }

}


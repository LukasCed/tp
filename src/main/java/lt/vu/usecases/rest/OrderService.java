package lt.vu.usecases.rest;

import lt.vu.entities.Order;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/order")
public interface OrderService {
    @Path("/{orderId}")
    @GET
    Order find(@PathParam("orderId") int id);

    @Path("/")
    @POST
    @Transactional
    Order create(@QueryParam("amount") int amount,
                        @QueryParam("customerId") int customerId,
                        @QueryParam("productId") int productId);

    @Path("/{orderId}")
    @PUT @Transactional
    Response update(@PathParam("orderId") int id,
        @QueryParam("amount") int amount,
        @QueryParam("customerId") int customerId,
        @QueryParam("productId") int productId);

}

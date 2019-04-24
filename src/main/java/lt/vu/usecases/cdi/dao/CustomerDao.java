package lt.vu.usecases.cdi.dao;


import lt.vu.entities.Customer;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

/**
 * Reikia nepamiršti beans.xml faile pridėti:

 <pre>
 {@code
 <alternatives>
    <class>org.apache.deltaspike.jpa.impl.transaction.ContainerManagedTransactionStrategy</class>
 </alternatives>
 }
 </pre>

 */
@Repository
public interface CustomerDao extends EntityRepository<Customer, Integer> {

    Customer findByUserName(String userName);
}

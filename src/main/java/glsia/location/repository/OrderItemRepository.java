package glsia.location.repository;

import glsia.location.models.Customer;
import glsia.location.models.OrderItem;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

    List<OrderItem> findOrderItemByCustomer(Customer customer);
    List<OrderItem> findOrderItemByRef(String ref);
}

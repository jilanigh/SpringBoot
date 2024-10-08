package glsia.location.services;

import glsia.location.models.OrderItem;
import glsia.location.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {
    @Autowired
    OrderItemRepository orderItemRepository;

    public OrderItem createOrderItem(OrderItem orderItem){
        return orderItemRepository.save(orderItem);
    }
    public List<OrderItem> getAllOrderItems(){
        return orderItemRepository.findAll();
    }
    public OrderItem getOrderItemById(Long id){
        return orderItemRepository.findById(id).get();
    }
    public OrderItem updateOrderItem(OrderItem orderItem){
        return orderItemRepository.saveAndFlush(orderItem);
    }
    public void deleteOrderItem(Long id){
        orderItemRepository.deleteById(id);
    }

}


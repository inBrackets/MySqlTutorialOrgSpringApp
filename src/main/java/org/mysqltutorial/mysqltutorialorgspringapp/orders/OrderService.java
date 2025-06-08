package org.mysqltutorial.mysqltutorialorgspringapp.orders;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {

    private OrderRepository orderRepository;

    public Iterable<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }

    public void printAllOrders() {
        for (OrderEntity order : getAllOrders()) {
            System.out.println(order);
        }
    }
}

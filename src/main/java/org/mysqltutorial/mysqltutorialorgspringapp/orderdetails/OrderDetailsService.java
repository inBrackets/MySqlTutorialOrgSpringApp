package org.mysqltutorial.mysqltutorialorgspringapp.orderdetails;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderDetailsService {

    private OrderDetailsRepository orderDetailsRepository;

    public void printAllOrderDetails() {
        for(OrderDetailsEntity orderDetails : orderDetailsRepository.findAll()) {
            System.out.println(orderDetails.toString());
        }
    }

    public void printAllProductNamesByOrderId(long orderId) {
        for(String productName : orderDetailsRepository.findProductNamesByOrderNumber(orderId)) {
            System.out.println(productName);
        }
    }
}

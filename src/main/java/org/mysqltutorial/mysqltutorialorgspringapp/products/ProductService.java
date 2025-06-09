package org.mysqltutorial.mysqltutorialorgspringapp.products;

import lombok.AllArgsConstructor;
import org.mysqltutorial.mysqltutorialorgspringapp.orderdetails.OrderDetailsEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;

    public void printAllOrderDetails() {
        for(ProductEntity product : productRepository.findAll()) {
            System.out.println(product.toString());
        }
    }
}

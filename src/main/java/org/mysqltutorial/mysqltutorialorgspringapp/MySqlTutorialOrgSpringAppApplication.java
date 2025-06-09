package org.mysqltutorial.mysqltutorialorgspringapp;

import org.mysqltutorial.mysqltutorialorgspringapp.customers.CustomerService;
import org.mysqltutorial.mysqltutorialorgspringapp.orderdetails.OrderDetailsService;
import org.mysqltutorial.mysqltutorialorgspringapp.orders.OrderService;
import org.mysqltutorial.mysqltutorialorgspringapp.products.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MySqlTutorialOrgSpringAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MySqlTutorialOrgSpringAppApplication.class, args);
        CustomerService customerService = context.getBean(CustomerService.class);
        // customerService.printAllCustomers();
        OrderService orderService = context.getBean(OrderService.class);
        // orderService.printAllOrders();
        // orderService.printAllOrdersByCustomer(103);
        OrderDetailsService orderDetailsService = context.getBean(OrderDetailsService.class);
        // orderDetailsService.printAllOrderDetails();
        ProductService productService = context.getBean(ProductService.class);
        productService.printAllOrderDetails();
    }

}

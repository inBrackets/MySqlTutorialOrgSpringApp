package org.mysqltutorial.mysqltutorialorgspringapp;

import org.mysqltutorial.mysqltutorialorgspringapp.customers.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MySqlTutorialOrgSpringAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MySqlTutorialOrgSpringAppApplication.class, args);
        CustomerService customerService = context.getBean(CustomerService.class);
        customerService.printAllCustomers();
    }

}

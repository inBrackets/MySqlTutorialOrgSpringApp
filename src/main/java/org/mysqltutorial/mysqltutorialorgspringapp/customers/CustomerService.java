package org.mysqltutorial.mysqltutorialorgspringapp.customers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

    private CustomerRepository customerRepository;

    public Iterable<CustomerEntity> getAllCustomers() {
        return customerRepository.findAll();
    }

    public void printAllCustomers() {
        for(CustomerEntity c : getAllCustomers()) {
            System.out.println(c.toString());
        }
    }
}

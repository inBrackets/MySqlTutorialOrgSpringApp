package org.mysqltutorial.mysqltutorialorgspringapp.customers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {

}

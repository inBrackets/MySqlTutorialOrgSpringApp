package org.mysqltutorial.mysqltutorialorgspringapp.orderdetails;

import org.springframework.data.repository.CrudRepository;

interface OrderDetailsRepository extends CrudRepository<OrderDetailsEntity, Long> {
}

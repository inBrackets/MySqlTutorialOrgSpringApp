package org.mysqltutorial.mysqltutorialorgspringapp.orders;

import org.mysqltutorial.mysqltutorialorgspringapp.productlines.ProductLineEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface OrderRepository extends CrudRepository<OrderEntity, Long> {

    @Query("""
                    SELECT o
                    FROM OrderEntity o
                    WHERE o.customer.customerNumber = :customerNumber
            """)
    List<OrderEntity> findByCustomerNumber(int customerNumber);
}

package org.mysqltutorial.mysqltutorialorgspringapp.orderdetails;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

interface OrderDetailsRepository extends CrudRepository<OrderDetailsEntity, Long> {

    @Query("""
                    SELECT p.productName
                    FROM OrderDetailsEntity od
                    JOIN od.product p
                    JOIN od.order o
                    WHERE o.orderNumber = :orderNumber
            """)
    List<String> findProductNamesByOrderNumber(@Param("orderNumber") int orderNumber);
}

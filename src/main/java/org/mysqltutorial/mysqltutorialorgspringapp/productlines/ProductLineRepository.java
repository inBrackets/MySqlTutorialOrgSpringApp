package org.mysqltutorial.mysqltutorialorgspringapp.productlines;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

interface ProductLineRepository extends CrudRepository<ProductLineEntity, Long> {

    @EntityGraph(attributePaths = "products") // prevent the n+1 problem
    Iterable<ProductLineEntity> findAll();
}

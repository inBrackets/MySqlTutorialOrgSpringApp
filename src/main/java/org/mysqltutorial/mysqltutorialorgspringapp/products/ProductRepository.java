package org.mysqltutorial.mysqltutorialorgspringapp.products;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ProductRepository extends CrudRepository<ProductEntity, Long> {

    @EntityGraph(attributePaths = "productLine")  // prevent the n+1 problem
    Iterable<ProductEntity> findAll();
}

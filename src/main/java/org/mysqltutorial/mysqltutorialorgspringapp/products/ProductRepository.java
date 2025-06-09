package org.mysqltutorial.mysqltutorialorgspringapp.products;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ProductRepository extends CrudRepository<ProductEntity, Long> {
}

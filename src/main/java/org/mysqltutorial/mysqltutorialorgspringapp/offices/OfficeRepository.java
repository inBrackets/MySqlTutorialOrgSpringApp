package org.mysqltutorial.mysqltutorialorgspringapp.offices;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepository extends CrudRepository<OfficeEntity, Long> {

    @Override
    @EntityGraph(attributePaths = "employees")
    Iterable<OfficeEntity> findAll();
}

package org.mysqltutorial.mysqltutorialorgspringapp.employees;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long> {

}

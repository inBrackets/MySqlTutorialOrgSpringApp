package org.mysqltutorial.mysqltutorialorgspringapp.payments;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PaymentRepository extends CrudRepository<PaymentEntity, Long> {

}

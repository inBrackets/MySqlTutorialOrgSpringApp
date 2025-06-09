package org.mysqltutorial.mysqltutorialorgspringapp.payments;

import org.springframework.data.repository.CrudRepository;

interface PaymentRepository extends CrudRepository<PaymentEntity, Long> {

}

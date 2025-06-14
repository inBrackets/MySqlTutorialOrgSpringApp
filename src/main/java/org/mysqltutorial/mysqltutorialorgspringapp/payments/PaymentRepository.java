package org.mysqltutorial.mysqltutorialorgspringapp.payments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {

}

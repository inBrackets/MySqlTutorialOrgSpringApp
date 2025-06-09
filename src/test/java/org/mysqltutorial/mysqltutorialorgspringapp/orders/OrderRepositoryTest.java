package org.mysqltutorial.mysqltutorialorgspringapp.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class OrderRepositoryTest {

    @Autowired
    private OrderRepository orderRepository;

    @Test
    void testFindAll() {
        assertThat(orderRepository.findAll())
                .hasSize(326);
    }

    @Test
    void testFindByCustomerNumber() {
        assertThat(orderRepository.findByCustomerNumber(103))
                .hasSize(3);
    }
}
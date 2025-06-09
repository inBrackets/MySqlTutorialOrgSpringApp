package org.mysqltutorial.mysqltutorialorgspringapp.productlines;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProductLineRepositoryTest {

    @Autowired
    private ProductLineRepository productLineRepository;

    @Test
    void testFindAll() {
        assertThat(productLineRepository.findAll()).hasSize(7);
    }
}
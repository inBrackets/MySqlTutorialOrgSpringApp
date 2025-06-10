package org.mysqltutorial.mysqltutorialorgspringapp.offices;

import jakarta.persistence.EntityManagerFactory;
import org.assertj.core.api.SoftAssertions;
import org.hibernate.SessionFactory;
import org.hibernate.stat.Statistics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class OfficeRepositoryTest {

    @Autowired
    private OfficeRepository officeRepository;

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    private Statistics stats;
    private SoftAssertions softAssertions;

    @BeforeEach
    public void beforeEach() {
        SessionFactory sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
        sessionFactory.getStatistics().setStatisticsEnabled(true);
        stats = sessionFactory.getStatistics();
        stats.clear();
        softAssertions = new SoftAssertions();
    }

    @Test
    void testFindAll() {
        softAssertions.assertThat(officeRepository.findAll())
                .hasSize(7);

        long queryCount = stats.getPrepareStatementCount();
        softAssertions.assertThat(queryCount).isEqualTo(1);

        softAssertions.assertAll();
    }
}
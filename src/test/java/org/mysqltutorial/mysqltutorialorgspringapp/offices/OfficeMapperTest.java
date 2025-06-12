package org.mysqltutorial.mysqltutorialorgspringapp.offices;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

class OfficeMapperTest {

    private final OfficeMapper mapper = Mappers.getMapper(OfficeMapper.class);
    private final SoftAssertions softly = new SoftAssertions();

    @Test
    void testToOfficeDto() {

        OfficeEntity entity = OfficeEntity.builder()
                .officeCode("1")
                .city("San Francisco")
                .phone("+1 650 219 4782")
                .addressLine1("100 Market Street")
                .addressLine2("Suite 300")
                .state("CA")
                .country("USA")
                .postalCode("94080")
                .territory("NA")
                .build();

        OfficeDto dto = mapper.toOfficeDto(entity);

        softly.assertThat(dto).isNotNull();
        softly.assertThat(dto.getOfficeCode()).isEqualTo(entity.getOfficeCode());
        softly.assertThat(dto.getCity()).isEqualTo(entity.getCity());
        softly.assertThat(dto.getPhone()).isEqualTo(entity.getPhone());
        softly.assertThat(dto.getAddressLine1()).isEqualTo(entity.getAddressLine1());
        softly.assertThat(dto.getAddressLine2()).isEqualTo(entity.getAddressLine2());
        softly.assertThat(dto.getState()).isEqualTo(entity.getState());
        softly.assertThat(dto.getCountry()).isEqualTo(entity.getCountry());
        softly.assertThat(dto.getTerritory()).isEqualTo(entity.getTerritory());

        softly.assertAll();
    }
}
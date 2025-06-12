package org.mysqltutorial.mysqltutorialorgspringapp.offices;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mysqltutorial.mysqltutorialorgspringapp.offices.OfficeDto;
import org.mysqltutorial.mysqltutorialorgspringapp.offices.OfficeEntity;

@Mapper(componentModel = "spring")
interface OfficeMapper {

    OfficeDto toOfficeDto(OfficeEntity office);
}

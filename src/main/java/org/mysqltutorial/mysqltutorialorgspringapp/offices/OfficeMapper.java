package org.mysqltutorial.mysqltutorialorgspringapp.offices;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
interface OfficeMapper {

    @Mapping(source = "officeCode", target = "officeCode")
    OfficeDto toOfficeDto(OfficeEntity office);
}

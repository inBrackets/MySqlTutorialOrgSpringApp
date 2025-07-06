package org.mysqltutorial.mysqltutorialorgspringapp.productlines;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
interface ProductLineMapper {

    @Mapping(source = "productLine", target = "productLine")
    ProductLineDto toProductLineDto(ProductLineEntity order);
}

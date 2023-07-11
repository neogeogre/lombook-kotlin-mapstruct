package org.mapstruct.example.kotlin;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
interface PersonMapper {

    @Mapping(source = "phoneNumber", target = "phone")
    PersonDtoJ mapToDto(PersonJ person);

    @InheritInverseConfiguration
    PersonJ convertToModel(PersonDtoJ personDto);

}

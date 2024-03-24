package com.nobroker.util;

import com.nobroker.entity.Property;
import com.nobroker.payload.PropertyDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PropertyMapper {


    PropertyDTO propertyEntityToDto(Property property);

    @Mapping(target = "id", ignore = true)
    Property propertyDtoToEntity(PropertyDTO propertyDTO);
}

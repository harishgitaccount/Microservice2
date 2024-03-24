package com.nobroker.service;

import com.nobroker.payload.PropertyDTO;

public interface PropertyService {
    PropertyDTO saveProperty(PropertyDTO propertyDTO);
    PropertyDTO updatePropertyStatus(Long id, String newStatus);

}

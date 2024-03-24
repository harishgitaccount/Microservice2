package com.nobroker.service;

import com.nobroker.entity.Property;
import com.nobroker.payload.PropertyDTO;
import com.nobroker.repository.PropertyRepository;
import com.nobroker.util.PropertyMapper;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService {

    private final PropertyRepository propertyRepository; // Assuming you have a repository to interact with the database
    private final PropertyMapper propertyMapper;

    @Autowired
    public PropertyServiceImpl(PropertyRepository propertyRepository, PropertyMapper propertyMapper) {
        this.propertyRepository = propertyRepository;
        this.propertyMapper = propertyMapper;
    }

    @Override
    public PropertyDTO saveProperty(PropertyDTO propertyDTO) {
        Property property = propertyMapper.propertyDtoToEntity(propertyDTO);
        property.setStatus("Pending");
        Property savedProperty = propertyRepository.save(property);
        return propertyMapper.propertyEntityToDto(savedProperty);
    }

    @Override
    public PropertyDTO updatePropertyStatus(Long id, String newStatus) {
        Property property = propertyRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Property not found"));
        property.setStatus(newStatus);
        Property updateProperty = propertyRepository.save(property);
        return propertyMapper.propertyEntityToDto(updateProperty);
    }


}

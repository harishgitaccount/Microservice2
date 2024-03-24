package com.nobroker.controller;

import com.nobroker.payload.PropertyDTO;
import com.nobroker.payload.PropertyStatusUpdateRequest;
import com.nobroker.service.PropertyService;
import com.nobroker.util.PropertyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/properties")
public class PropertyController {

    private final PropertyService propertyService;


    @Autowired
    public PropertyController(PropertyService propertyService, PropertyMapper propertyMapper) {
        this.propertyService = propertyService;

    }

    @PostMapping
    public ResponseEntity<PropertyDTO> addProperty(@RequestBody PropertyDTO propertyDTO) {
        PropertyDTO savedProperty = propertyService.saveProperty(propertyDTO);
        return new ResponseEntity<>(savedProperty, HttpStatus.CREATED);
    }
    @PatchMapping("/{id}")
    public ResponseEntity<PropertyDTO> updatePropertyStatus(
            @PathVariable Long id,
            @RequestBody PropertyStatusUpdateRequest request) {
        PropertyDTO updatedProperty = propertyService.updatePropertyStatus(id, request.getstatus());
        return new ResponseEntity<>(updatedProperty, HttpStatus.OK);
    }
}


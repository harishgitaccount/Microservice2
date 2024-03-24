package com.nobroker.payload;

public class PropertyDTO {
    private Long id;
    private String apartmentType;
    private int bhkType;
    private int floor;
    private int totalFloor;
    private int propertyAge;
    private String facing;
    private double builtUpArea;
    private String status;

    // Constructors, getters, and setters

    public PropertyDTO() {
    }

    // Getters and setters for all fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApartmentType() {
        return apartmentType;
    }

    public void setApartmentType(String apartmentType) {
        this.apartmentType = apartmentType;
    }

    public int getBhkType() {
        return bhkType;
    }

    public void setBhkType(int bhkType) {
        this.bhkType = bhkType;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(int totalFloor) {
        this.totalFloor = totalFloor;
    }

    public int getPropertyAge() {
        return propertyAge;
    }

    public void setPropertyAge(int propertyAge) {
        this.propertyAge = propertyAge;
    }

    public String getFacing() {
        return facing;
    }

    public void setFacing(String facing) {
        this.facing = facing;
    }

    public double getBuiltUpArea() {
        return builtUpArea;
    }

    public void setBuiltUpArea(double builtUpArea) {
        this.builtUpArea = builtUpArea;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


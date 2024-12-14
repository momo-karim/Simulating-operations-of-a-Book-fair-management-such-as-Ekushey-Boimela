package com.example.finalprojectbookfair.Logistics.Goal4;

import java.time.LocalDate;

public class DeliveryRequest {
    private String vendorName;
    private String pickupLocation;
    private String dropoffLocation;
    private LocalDate deliveryDate;
    private String deliveryTime;
    private String deliveryItem;
    private String deliveryType;

    public DeliveryRequest(String vendorName, String pickupLocation, String dropoffLocation, LocalDate deliveryDate, String deliveryTime, String deliveryItem, String deliveryType) {
        this.vendorName = vendorName;
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
        this.deliveryDate = deliveryDate;
        this.deliveryTime = deliveryTime;
        this.deliveryItem = deliveryItem;
        this.deliveryType = deliveryType;
    }


    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropoffLocation() {
        return dropoffLocation;
    }

    public void setDropoffLocation(String dropoffLocation) {
        this.dropoffLocation = dropoffLocation;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDeliveryItem() {
        return deliveryItem;
    }

    public void setDeliveryItem(String deliveryItem) {
        this.deliveryItem = deliveryItem;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }
}




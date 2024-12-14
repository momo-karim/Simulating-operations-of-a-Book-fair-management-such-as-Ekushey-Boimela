package com.example.finalprojectbookfair.Logistics.Goal3;

public class VendorMC {
    private String Name,Item,Service;

    public VendorMC(String item, String name, String service) {
        Item = item;
        Name = name;
        Service = service;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String items) {
        Item = items;
    }

    public String getService() {
        return Service;
    }

    public void setService(String service) {
        Service = service;
    }
}

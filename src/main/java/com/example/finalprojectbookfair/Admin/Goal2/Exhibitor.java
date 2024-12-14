package com.example.finalprojectbookfair.Admin.Goal2;

public class Exhibitor {    private String name;
    private String phoneNo;
    private String companyName;
    private String typeOfStall;
    private String status;

    public Exhibitor(String name, String phoneNo, String companyName, String typeOfStall, String status) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.companyName = companyName;
        this.typeOfStall = typeOfStall;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getTypeOfStall() {
        return typeOfStall;
    }

    public String getStatus() {
        return status;
    }



    public void setStatus(String status) {
        this.status = status;
    }
}



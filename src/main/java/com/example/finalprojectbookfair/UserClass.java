package com.example.finalprojectbookfair;

import java.time.LocalDate;

public class UserClass {
    private String id, UserName, Password, Gender, Designation;
    private LocalDate dob;

    public UserClass(String id, String userName, String password, String gender, String designation, LocalDate dob) {
        this.id = id;
        UserName = userName;
        Password = password;
        Gender = gender;
        Designation = designation;
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "UserClass{" +
                "id='" + id + '\'' +
                ", UserName='" + UserName + '\'' +
                ", Password='" + Password + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Designation='" + Designation + '\'' +
                ", dob=" + dob +
                '}';
    }
}

//    public String generateID(String type){
//        String id = "";
//        if (type == "admin"){
//            id+= this.Designation.substring(0,3);
//            id+=this.Password.substring(this.getPassword().length());
//        } else if (type == "Logistics") {
//            id+= this.Designation.substring(0,3);
//            id+=this.Password.substring(this.getPassword().length());
//
//
//
//
//        }
//
//        return id;



//    }
//    public boolean loginVR(String id, String password){
//        if(this.getId()==id && this.getPassword()==password){
//            return true;
//        }
//        else{
//            return false;
//
//        }




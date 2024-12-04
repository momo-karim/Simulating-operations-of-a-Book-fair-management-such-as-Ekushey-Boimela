package com.example.finalprojectbookfair;

import java.time.LocalDate;

public class UserClass {
    String UserName,Password,Gender,Designation;
    LocalDate dob;

    public UserClass(String userName, String password, String gender, String designation, LocalDate dob) {
        UserName = userName;
        Password = password;
        Gender = gender;
        Designation = designation;
        this.dob = dob;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
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

}

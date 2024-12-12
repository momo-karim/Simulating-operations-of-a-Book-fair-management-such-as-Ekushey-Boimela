package com.example.finalprojectbookfair;

import java.time.LocalDate;

public class admin extends UserClass {

    public admin(String id, String userName, String password, String gender, String designation, LocalDate dob) {
        super(id, userName, password, gender, designation, dob);
    }
    public void assignUser(String id, String userName, String password, String gender, String designation, LocalDate dob, String PhoneNumber, String Email){
        verifiedUsers Users = new verifiedUsers(id,userName,password,gender,designation,dob,PhoneNumber,Email);
        System.out.print(Users);

    }
}

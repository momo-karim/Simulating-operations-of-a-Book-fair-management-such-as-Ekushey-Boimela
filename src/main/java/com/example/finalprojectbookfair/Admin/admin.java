package com.example.finalprojectbookfair.Admin;

import com.example.finalprojectbookfair.Admin.Goal1.verifiedUsers;
import com.example.finalprojectbookfair.UserClass;

import java.time.LocalDate;

public class  admin extends UserClass {

    public admin(String id, String userName, String password, String gender, String designation, LocalDate dob) {
        super(id, userName, password, gender, designation, dob);
    }
    public void assignUser(String id, String userName, String password, String gender, String designation, LocalDate dob, String PhoneNumber, String Email){
        verifiedUsers Users = new verifiedUsers(id,userName,password,gender,designation,dob,PhoneNumber,Email);
        System.out.print(Users);

    }
}

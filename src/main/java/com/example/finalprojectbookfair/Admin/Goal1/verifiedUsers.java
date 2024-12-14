package com.example.finalprojectbookfair.Admin.Goal1;

import com.example.finalprojectbookfair.UserClass;

import java.time.LocalDate;

public class verifiedUsers extends UserClass {
    private String PhoneNumber,Email;

    public verifiedUsers(String id, String userName, String password, String gender, String designation, LocalDate dob, String PhoneNumber, String Email ) {

        super(id, userName, password, gender, designation, dob);
        this.PhoneNumber=PhoneNumber;
        this.Email=Email;


    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }


    public void assignUser(String id, String userName, String password, String gender, String designation, LocalDate dob, String PhoneNumber, String Email) {
        verifiedUsers Users = new verifiedUsers(id, userName, password, gender, designation, dob, PhoneNumber, Email) ;
        System.out.print(Users);
    }
}

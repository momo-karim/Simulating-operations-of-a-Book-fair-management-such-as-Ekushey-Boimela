package com.example.finalprojectbookfair.Admin.Goal5;

import java.time.LocalDate;

public class Reports {
    public String Name;
    public LocalDate reportDate;

    public Reports(LocalDate reportDate, String name) {
        this.reportDate = reportDate;
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    @Override
    public String toString() {
        return "Reports{" +
                "Name='" + Name + '\'' +
                ", reportDate=" + reportDate +
                '}';
    }
}

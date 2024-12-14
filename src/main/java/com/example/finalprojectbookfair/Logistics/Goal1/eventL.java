package com.example.finalprojectbookfair.Logistics.Goal1;

import com.example.finalprojectbookfair.Admin.Event;

import java.time.LocalDate;

public class eventL extends Event {
    public eventL(String name, LocalDate date, String location, String description) {
        super(name, date, location, description);
    }
}

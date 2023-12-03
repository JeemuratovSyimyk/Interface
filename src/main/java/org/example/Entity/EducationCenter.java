package org.example.Entity;

import java.time.LocalDate;

public class EducationCenter {
    String name;
    String locatedCountry;
    LocalDate foundationYear;

    public EducationCenter(String name, String locatedCountry, LocalDate foundationYear) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        this.foundationYear = foundationYear;
    }
}
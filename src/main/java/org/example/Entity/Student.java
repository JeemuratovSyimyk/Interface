package org.example.Entity;

import org.example.Enum.Gender;
import org.example.Service.Study;

import java.time.LocalDate;

public class Student implements Study {
    public String name;
    public String surname;
    Gender gender;
    LocalDate dateOfStart;
    private EducationCenter educationCenter;

    public Student(String name, String surname, Gender gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }

    @Override
    public void getStudentsEducationCenter() {
        System.out.println(name + " " + surname + " studies at " + educationCenter.name);
    }

    @Override
    public void getStudentsStudyingYear() {
        int years = LocalDate.now().getYear() - dateOfStart.getYear();
        System.out.println(name + " " + surname + " has been studying for " + years + " years.");
    }

}

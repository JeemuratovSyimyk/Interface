package org.example;

import org.example.Entity.College;
import org.example.Entity.School;
import org.example.Entity.Student;
import org.example.Entity.University;
import org.example.Enum.Gender;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Student[] students = new Student[15];

        School school = new School("	The Putney School", "America", LocalDate.of(1990, 9, 13));
        University university = new University("Prinston", "USA", LocalDate.of(1965, 8, 1));
        College college = new College("Green River", "Mexico", LocalDate.of(1980, 6, 3));

        students[0] = new Student("John", "Doe", Gender.MALE, LocalDate.of(2020, 9, 1), school);
        students[1] = new Student("Jane", "Smith", Gender.FEMALE, LocalDate.of(2019, 9, 1), university);
        students[2] = new Student("Bob", "Johnson", Gender.MALE, LocalDate.of(2021, 9, 1), school);
        students[3] = new Student("Jimmy", "Bennet", Gender.MALE, LocalDate.of(2021, 9, 1), college);
        students[4] = new Student("John", "Belushi", Gender.MALE, LocalDate.of(2021, 9, 1), university);
        students[5] = new Student("Robert", "Ile", Gender.MALE, LocalDate.of(2021, 9, 1), college);
        students[6] = new Student("Ed", "Begley", Gender.MALE, LocalDate.of(2021, 9, 1), school);
        students[7] = new Student("Jed", "Allan", Gender.MALE, LocalDate.of(2021, 9, 1), college);
        students[8] = new Student("Ben", "Gazzara", Gender.MALE, LocalDate.of(2021, 9, 1), university);
        students[9] = new Student("Seth", "Gable", Gender.MALE, LocalDate.of(2021, 9, 1), college);
        students[10] = new Student("Peter", "Parker", Gender.MALE, LocalDate.of(2021, 9, 1), school);
        students[12] = new Student("David", "Gallagher", Gender.MALE, LocalDate.of(2021, 9, 1), university);
        students[13] = new Student("Larry", "Gable", Gender.MALE, LocalDate.of(2021, 9, 1), college);
        students[14] = new Student("Ben", "Stiler", Gender.MALE, LocalDate.of(2021, 9, 1), school);

        // Add more students and assign them to different education centers
        // Extract information about students
        for (Student student : students) {
            student.getStudentsEducationCenter();
            student.getStudentsStudyingYear();
        }
    }
}
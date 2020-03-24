package com.company;

public class MainTeacher extends Teacher {
    private String specialty;

    public MainTeacher(String name, String lastName, int teacherCode, int employmentPeriod, String specialty) {
        super(name, lastName, teacherCode, employmentPeriod);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}

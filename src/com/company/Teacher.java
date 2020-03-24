package com.company;

public class Teacher {
    private String name;
    private String lastName;
    private int teacherCode;
    private int employmentPeriod;

    public Teacher(String name, String lastName, int teacherCode, int employmentPeriod) {
        this.name = name;
        this.lastName = lastName;
        this.teacherCode = teacherCode;
        this.employmentPeriod = employmentPeriod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(int teacherCode) {
        this.teacherCode = teacherCode;
    }

    public int getEmploymentPeriod() {
        return employmentPeriod;
    }

    public void setEmploymentPeriod(int employmentPeriod) {
        this.employmentPeriod = employmentPeriod;
    }

    public boolean isEqualTo(int newTeachersCode) {
        int teacherCode = this.getTeacherCode();
        if (teacherCode == newTeachersCode) {
            return true;
        } else {
            return false;
        }
    }
}

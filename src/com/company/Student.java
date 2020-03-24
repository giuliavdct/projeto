package com.company;

public class Student {
    private String name;
    private String lastName;
    private int studentCode;

    public Student(String name, String lastName, int studentCode) {
        this.name = name;
        this.lastName = lastName;
        this.studentCode = studentCode;
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

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public boolean isEqualTo(int searchStudentCode) {
        int studentCode = this.getStudentCode();

        if (studentCode == searchStudentCode) {
            return true;
        } else {
            return false;
        }
    }
}

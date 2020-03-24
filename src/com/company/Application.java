package com.company;

import java.util.Date;

public class Application {
    private Student student;
    private Course course;
    private Date applicationDate;

    public Application(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.applicationDate = new Date();
    }

    public Application(Student foundStudent, int foundCourse) {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public boolean hasStudent(int studentCode) {
        if (student.getStudentCode() == studentCode) {
            return true;
        } else {
            return false;
        }
    }
}



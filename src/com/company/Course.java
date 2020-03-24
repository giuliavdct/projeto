package com.company;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private int courseCode;
    private MainTeacher mainTeacher;
    private AssistantTeacher assistantTeacher;
    private int maxNumberStudents;
    private ArrayList<Student> studentArrayList;

    public Course() {};

    public Course(String courseName, int courseCode, int maxNumberStudents) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.maxNumberStudents = maxNumberStudents;
        this.studentArrayList = new ArrayList<Student>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public MainTeacher getMainTeacher() {
        return mainTeacher;
    }

    public void setMainTeacher(MainTeacher mainTeacher) {
        this.mainTeacher = mainTeacher;
    }

    public AssistantTeacher getAssistantTeacher() {
        return assistantTeacher;
    }

    public void setAssistantTeacher(AssistantTeacher assistantTeacher) {
        this.assistantTeacher = assistantTeacher;
    }

    public int getMaxNumberStudents() {
        return maxNumberStudents;
    }

    public void setMaxNumberStudents(int maxNumberStudents) {
        this.maxNumberStudents = maxNumberStudents;
    }

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

    public void setStudentArrayList(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }

    public boolean addStudent(Student newStudent) {
        int max = this.getMaxNumberStudents();
        int amountOfStudent = this.studentArrayList.size();
        if (amountOfStudent >= maxNumberStudents) {
            return false;
        } else {
            this.studentArrayList.add(newStudent);
            return true;
        }
    }

    public void removeStudent(Student dropoutStudent) {
        for (Student index : this.studentArrayList) {
            if (index == dropoutStudent) {
                this.studentArrayList.remove(dropoutStudent);
                break;
            }
        }

    }

    public boolean isEqualTo(int searchCourseCode) {
        int courseCode = this.getCourseCode();

        if (courseCode == searchCourseCode) {
            return true;
        } else {
            return false;
        }
    }

}
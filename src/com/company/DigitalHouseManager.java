package com.company;

import java.util.ArrayList;

public class DigitalHouseManager {
    private ArrayList<Student> studentsDigitalHouse;
    private ArrayList<Application> applicationsDigitalHouse;
    private ArrayList<Course> coursesDigitalHouse;
    private ArrayList<Teacher> teachersDigitalHouse;

    public DigitalHouseManager() {
        this.studentsDigitalHouse = new ArrayList<Student>();
        this.applicationsDigitalHouse = new ArrayList<Application>();
        this.coursesDigitalHouse = new ArrayList<Course>();
        this.teachersDigitalHouse = new ArrayList<Teacher>();
    }

    public ArrayList<Student> getStudentsDigitalHouse() {
        return studentsDigitalHouse;
    }

    public void setStudentsDigitalHouse(ArrayList<Student> studentsDigitalHouse) {
        this.studentsDigitalHouse = studentsDigitalHouse;
    }

    public ArrayList<Teacher> getTeachersDigitalHouse() {
        return teachersDigitalHouse;
    }

    public void setTeachersDigitalHouse(ArrayList<Teacher> teachersDigitalHouse) {
        this.teachersDigitalHouse = teachersDigitalHouse;
    }

    public ArrayList<Course> getCoursesDigitalHouse() {
        return coursesDigitalHouse;
    }

    public void setCoursesDigitalHouse(ArrayList<Course> coursesDigitalHouse) {
        this.coursesDigitalHouse = coursesDigitalHouse;
    }

    public ArrayList<Application> getApplicationsDigitalHouse() {
        return applicationsDigitalHouse;
    }

    public void setApplicationsDigitalHouse(ArrayList<Application> applicationsDigitalHouse) {
        this.applicationsDigitalHouse = applicationsDigitalHouse;
    }

    public void registerCourse(String name, int courseCode, int maxNumberStudents) {
        Course newCourse = new Course(name, courseCode, maxNumberStudents);
        this.coursesDigitalHouse.add(newCourse);

    }

    public void removeCourse(int deleteCode) {
        for (Course indexCourse : this.coursesDigitalHouse) {
            if (indexCourse.isEqualTo(deleteCode)) {
                this.coursesDigitalHouse.remove(indexCourse);
                break;
            }
        }
    }

    public void registerAssistantTeacher(String name, String lastName, int teacherCode, int monitoringHours) {
        AssistantTeacher newAssistantTeacher = new AssistantTeacher(name, lastName, teacherCode, 0, monitoringHours);
        this.teachersDigitalHouse.add(newAssistantTeacher);

    }

    public void registerMainTeacher(String name, String lastName, int teacherCode, String specialty) {
        MainTeacher newMainTeacher = new MainTeacher(name, lastName, teacherCode, 0, specialty);
        this.teachersDigitalHouse.add(newMainTeacher);
    }

    public void removeTeacher(int deleteCode) {
        for (Teacher indexTeacher : this.teachersDigitalHouse) {
            if (indexTeacher.isEqualTo(deleteCode)) {
                this.teachersDigitalHouse.remove(indexTeacher);
                break;
            }
        }

    }

    public void registerStudent(String name, String lastName, int studentCode) {
        Student newStudent = new Student(name, lastName, studentCode);
        this.studentsDigitalHouse.add(newStudent);

    }

    public void registerStudent(int studentCode, int courseCode) {
        Course wantedCourse = null;
        Student foundStudent = null;

        for (Course course : this.coursesDigitalHouse) {
            if (course.isEqualTo(courseCode)) {
                wantedCourse = course;
                break;
            }
        }
        for (Student student : this.studentsDigitalHouse) {
            if (student.isEqualTo(studentCode)) {
                foundStudent = student;
                break;
            }
        }

        if (wantedCourse == null ) {
            System.out.println("Course not found! \n");
            return;
        }
        if (foundStudent == null ) {
            System.out.println("Student not found! \n");
            return;
        }

        if (wantedCourse.addStudent(foundStudent)) {
            Application newApplication = new Application(foundStudent, wantedCourse);
            this.applicationsDigitalHouse.add(newApplication);
            System.out.println("Application accepted! \n Congratulations!");
        } else {
            System.out.println("Application not accepted, unfortunately there is no vacancies.");
        }
    }
    public void allocateTeacher(int courseCode, int mainTeacherCode, int assistantTeacherCode){
        MainTeacher foundMainTeacher = null;
        AssistantTeacher foundAssistantTeacher = null;
        Course foundCourse = null;

        for (Course course : this.coursesDigitalHouse){
            if (course.isEqualTo(courseCode)){
                foundCourse = course;
                break;
            }
        }

        if (foundCourse == null ) {
            System.out.println("Course not found! \n");
            return;
        }

        for(Teacher teacher : this.teachersDigitalHouse){
            if(teacher.isEqualTo(mainTeacherCode)) {
                foundMainTeacher = (MainTeacher) teacher;
            }else if(teacher.isEqualTo(assistantTeacherCode)){
                foundAssistantTeacher = (AssistantTeacher) teacher;
            }
        }

        if (foundAssistantTeacher != null) {
            foundCourse.setAssistantTeacher(foundAssistantTeacher);
        } else {
            System.out.println("Assistant Teacher not found! \n");
        }

        if (foundMainTeacher != null) {
            foundCourse.setMainTeacher(foundMainTeacher);
        } else {
            System.out.println("Main Teacher not found! \n");
        }

    }

    public void checkStudentCourse(int studentCode) {
        Application foundApplication = null;

        for (Application application : this.applicationsDigitalHouse) {
            if (application.hasStudent(studentCode)) {
                foundApplication = application;
                break;
            }
        }

        System.out.println(foundApplication.getStudent().getName() + " " + foundApplication.getStudent().getLastName() + " registered in: " + foundApplication.getCourse().getCourseName() + "\n");

    }
}





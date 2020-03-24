package com.company;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		DigitalHouseManager run = new DigitalHouseManager();

		run.registerCourse("Full Stack", 20001, 3);
		run.registerCourse("Android", 20002, 2);

		run.registerMainTeacher("Barbara", "Mello", 0001, "Full Stack");
		run.registerAssistantTeacher("Gabriela", "Menezes", 0002, 40);
		run.allocateTeacher(20001,0001, 0002);

		run.registerMainTeacher("Gean-Carlos", "Prata", 0003, "Android");
		run.registerAssistantTeacher("Nando", "Cota", 0004, 30);
		run.allocateTeacher(20002,0003, 0004);

		run.registerStudent("Ana","Raposo",01);
		run.registerStudent(01,20001);
		run.registerStudent("Beatriz","Pimentel",02);
		run.registerStudent(02,20001);

		run.registerStudent("Karen","Flipovich",03);
		run.registerStudent(3,20002);
		run.registerStudent("Urias","Oliveira",04);
		run.registerStudent(04,20002);
		run.registerStudent("André","Silva",05);
		run.registerStudent(05,20002);

		run.checkStudentCourse(01);
	}
}

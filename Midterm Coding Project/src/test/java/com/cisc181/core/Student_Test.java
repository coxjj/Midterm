
package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eMajor;

public class Student_Test {

	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Section> sections = new ArrayList<Section>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Student> students = new ArrayList<Student>();

	static ArrayList<Enrollment> MATHF = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> MATHS = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> ACCTF = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> ACCTS = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> CISCF = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> CISCS = new ArrayList<Enrollment>();

	public static Date setDate(int month, int day, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, day);
		return cal.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException {

		Course MATH = new Course();
		Course ACCT = new Course();
		Course CISC = new Course();
		courses.add(MATH);
		courses.add(ACCT);
		courses.add(CISC);

		Semester f16 = new Semester();
		Semester s17 = new Semester();
		semesters.add(f16);
		semesters.add(s17);

		Section fallMATH = new Section();
		Section springMATH = new Section();
		Section fallACCT = new Section();
		Section springACCT = new Section();
		Section fallCISC = new Section();
		Section springCISC = new Section();
		sections.add(fallMATH);
		sections.add(springMATH);
		sections.add(fallACCT);
		sections.add(springACCT);
		sections.add(fallCISC);
		sections.add(springCISC);

		Student student1 = new Student("Jennifer", "Mae", "Cox", setDate(5, 12, 1998), eMajor.PHYSICS, "158 south college",
				"(123)-456-7899", "coxj@udel.edu", UUID.randomUUID());
		Student student2 = new Student("kathy", "mae", "staib", setDate(1, 20, 1977), eMajor.COMPSI, "prospect road",
				"(123)-456-7891", "kstaib@yahoo.com", UUID.randomUUID());
		Student student3 = new Student("tim", "joseph", "cox", setDate(5, 21, 1976), eMajor.BUSINESS, "West main",
				"(123)-456-7892", "timmmy@yahoo.com", UUID.randomUUID());
		Student student4 = new Student("JOhn", "b", "doe", setDate(1, 20, 1975), eMajor.COMPSI, "south chap",
				"(123)-456-7893", "john@yahoo.com", UUID.randomUUID());
		Student student5 = new Student("Sammmmmmm", "A", "Brown", setDate(2, 20, 1999), eMajor.CHEM, "ridge",
				"(123)-456-7894", "sammmmm@yahoo.com", UUID.randomUUID());
		Student student6 = new Student("Hannah", "margs", "Staib", setDate(3, 20, 1998), eMajor.COMPSI, "heyhey",
				"(123)-456-7895", "hannah@yahoo.com", UUID.randomUUID());
		Student student7 = new Student("hannah", "rose", "irganag", setDate(4, 20, 1998), eMajor.NURSING,
				"mainest Street", "(123)-456-7896", "IRGS@yahoo.com", UUID.randomUUID());
		Student student8 = new Student("lauren", "b", "Jean", setDate(6, 20, 1998), eMajor.PHYSICS, "star Street",
				"(123)-456-7897", "bluejean@yahoo.com", UUID.randomUUID());
		Student student9 = new Student("kim", "k", "Kardashian", setDate(7, 20, 1998), eMajor.CHEM, "phone Street",
				"(123)-321-1234", "kimmmy@yahoo.com", UUID.randomUUID());
		Student student10 = new Student("puppy", "dog", "woof", setDate(1, 21, 1998), eMajor.PHYSICS,
				"table Street", "(123)-456-7855", "dogdog@yahoo.com", UUID.randomUUID());
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		students.add(student7);
		students.add(student8);
		students.add(student9);
		students.add(student10);

		ArrayList<Integer> grades1 = new ArrayList<Integer>(Arrays.asList(100, 90, 80, 70, 60, 70, 80, 90, 100, 90));
		ArrayList<Integer> grades2 = new ArrayList<Integer>(Arrays.asList(100, 95, 85, 75, 65, 75, 85, 95, 100, 95));
		for (int i = 0; i < students.size(); i++) {

			MATHF.add(new Enrollment(sections.get(0).getSectionID(), students.get(i).getStudentID()));
			MATHF.get(i).SetGrade(grades1.get(i));
			MATHS.add(new Enrollment(sections.get(1).getSectionID(), students.get(i).getStudentID()));
			MATHS.get(i).SetGrade(grades2.get(i));
			ACCTF.add(new Enrollment(sections.get(2).getSectionID(), students.get(i).getStudentID()));
			ACCTF.get(i).SetGrade(grades1.get(i));
			ACCTS.add(new Enrollment(sections.get(3).getSectionID(), students.get(i).getStudentID()));
			ACCTS.get(i).SetGrade(grades2.get(i));
			CISCF.add(new Enrollment(sections.get(4).getSectionID(), students.get(i).getStudentID()));
			CISCF.get(i).SetGrade(grades1.get(i));
			CISCS.add(new Enrollment(sections.get(5).getSectionID(), students.get(i).getStudentID()));
			CISCS.get(i).SetGrade(grades2.get(i));
		}

	}

	public double getGPA(ArrayList<Enrollment> MATHF, ArrayList<Enrollment> MATHS, ArrayList<Enrollment> ACCTF,
			ArrayList<Enrollment> ACCTS, ArrayList<Enrollment> CISCF, ArrayList<Enrollment> CISCS, int courses,
			int Student) {
		if ((MATHF.get(Student).getGrade() + MATHS.get(Student).getGrade() + ACCTF.get(Student).getGrade()
				+ ACCTS.get(Student).getGrade() + CISCF.get(Student).getGrade() + CISCS.get(Student).getGrade())
				/ courses >= 90) {
			return 4.0;
		} else if ((MATHF.get(Student).getGrade() + MATHS.get(Student).getGrade() + ACCTF.get(Student).getGrade()
				+ ACCTS.get(Student).getGrade() + CISCF.get(Student).getGrade() + CISCS.get(Student).getGrade())
				/ courses >= 85) {
			return 3.5;
		} else if ((MATHF.get(Student).getGrade() + MATHS.get(Student).getGrade() + ACCTF.get(Student).getGrade()
				+ ACCTS.get(Student).getGrade() + CISCF.get(Student).getGrade() + CISCS.get(Student).getGrade())
				/ courses >= 80) {
			return 3.0;
		} else if ((MATHF.get(Student).getGrade() + MATHS.get(Student).getGrade() + ACCTF.get(Student).getGrade()
				+ ACCTS.get(Student).getGrade() + CISCF.get(Student).getGrade() + CISCS.get(Student).getGrade())
				/ courses >= 75) {
			return 2.5;
		} else if ((MATHF.get(Student).getGrade() + MATHS.get(Student).getGrade() + ACCTF.get(Student).getGrade()
				+ ACCTS.get(Student).getGrade() + CISCF.get(Student).getGrade() + CISCS.get(Student).getGrade())
				/ courses >= 70) {
			return 2.0;
		} else if ((MATHF.get(Student).getGrade() + MATHS.get(Student).getGrade() + ACCTF.get(Student).getGrade()
				+ ACCTS.get(Student).getGrade() + CISCF.get(Student).getGrade() + CISCS.get(Student).getGrade())
				/ courses >= 65) {
			return 1.5;
		} else if ((MATHF.get(Student).getGrade() + MATHS.get(Student).getGrade() + ACCTF.get(Student).getGrade()
				+ ACCTS.get(Student).getGrade() + CISCF.get(Student).getGrade() + CISCS.get(Student).getGrade())
				/ courses >= 60) {
			return 1.0;
		} else {
			return 0.00;
		}
	}

	@Test
	public void StudentGPATest() {
		assertEquals(4.0, getGPA(MATHF, MATHS, ACCTF, ACCTS, CISCF, CISCS, 6, 0), .001);
		assertEquals(4.0, getGPA(MATHF, MATHS, ACCTF, ACCTS, CISCF, CISCS, 6, 1), .001);
		assertEquals(3.0, getGPA(MATHF, MATHS, ACCTF, ACCTS, CISCF, CISCS, 6, 2), .001);
		assertEquals(2.0, getGPA(MATHF, MATHS, ACCTF, ACCTS, CISCF, CISCS, 6, 3), .001);
		assertEquals(1.0, getGPA(MATHF, MATHS, ACCTF, ACCTS, CISCF, CISCS, 6, 4), .001);
		assertEquals(2.0, getGPA(MATHF, MATHS, ACCTF, ACCTS, CISCF, CISCS, 6, 5), .001);
		assertEquals(3.0, getGPA(MATHF, MATHS, ACCTF, ACCTS, CISCF, CISCS, 6, 6), .001);
		assertEquals(4.0, getGPA(MATHF, MATHS, ACCTF, ACCTS, CISCF, CISCS, 6, 7), .001);
		assertEquals(4.0, getGPA(MATHF, MATHS, ACCTF, ACCTS, CISCF, CISCS, 6, 8), .001);
		assertEquals(4.0, getGPA(MATHF, MATHS, ACCTF, ACCTS, CISCF, CISCS, 6, 9), .001);
	}

	public static double avgGrades(ArrayList<Enrollment> courses) {
		double average = 0;
		double courseAvg = 0;

		for (int i = 0; i < students.size(); i++) {
			average += courses.get(i).getGrade();
			courseAvg = (average / students.size());
		}
		return courseAvg;
	}

	@Test
	public void testCourseGrades() {
		assertEquals(83, avgGrades(MATHF), .01);
		assertEquals(87, avgGrades(MATHS), 01);
		assertEquals(83, avgGrades(ACCTF), .01);
		assertEquals(87, avgGrades(ACCTS), .01);
		assertEquals(83, avgGrades(CISCF), 01);
		assertEquals(87, avgGrades(CISCS), .01);
	}

	public static void ChangeMajor(eMajor major, Student student) {
		student.setMajor(major);
	}

	@Test
	public void testMajorChangeChangeStudent() {
		ChangeMajor(eMajor.COMPSI, students.get(5));
		assertEquals(eMajor.COMPSI, students.get(5).getMajor());
	}

}
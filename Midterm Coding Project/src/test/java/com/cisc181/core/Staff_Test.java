package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;


public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void salariess()
			//throws PersonException 
	{
		{
			Date DOB = new Date(1990 - 03 - 25);
			Date start = new Date(2015 - 03 - 25);

			ArrayList<Staff> StaffList = new ArrayList<Staff>();
			try {
			Staff staff1 = new Staff("John", "A", "Doe", DOB, "158 south College", "6318062384", "coxj@udel.edu",
					"Monday 10am", 2, 10000.00, start, eTitle.MR);
			Staff staff2 = new Staff("John", "A", "Doe", DOB, "158 south College", "6318062384", "coxj@udel.edu",
					"Monday 10am", 2, 20000.00, start, eTitle.MR);
			Staff staff3 = new Staff("John", "A", "Doe", DOB, "158 south College", "6318062384", "coxj@udel.edu",
					"Monday 10am", 2, 30000.00, start, eTitle.MR);
			Staff staff4 = new Staff("John", "A", "Doe", DOB, "158 south College", "6318062384", "coxj@udel.edu",
					"Monday 10am", 2, 40000.00, start, eTitle.MR);
			Staff staff5 = new Staff("John", "A", "Doe", DOB, "158 south College", "6318062384", "coxj@udel.edu",
						"Monday 10am", 2, 50000.00, start, eTitle.MR);


			StaffList.add(staff1);
			StaffList.add(staff2);
			StaffList.add(staff3);
			StaffList.add(staff4);
			StaffList.add(staff5);

			final double sal1 = staff1.getSalary();
			final double sal2 = staff2.getSalary();
			final double sal3 = staff3.getSalary();
			final double sal4 = staff4.getSalary();
			final double sal5 = staff5.getSalary();

			final double DELTA = 1e-15;
			double average = ((sal1 + sal2 + sal3 + sal4 + sal5) / 5);
			assertEquals(30000, average, DELTA);
		} catch (PersonException e) {
			e.printStackTrace();
		}
		}
	}

	
	@Test(expected=PersonException.class)
	
	public void TestBadPhone() throws PersonException {
		Date DOB = new Date(1990 - 03 - 25);
		Date start = new Date(2015 - 03 - 25);
	
		Staff Person1= new Staff("John", "A", "Doe", DOB, "158 south College", "12345", "coxj@udel.edu",
				"Monday 10am", 2, 10000.00, start, eTitle.MR);
		Person1.getPhone();
		
		
		

		}
	@Test(expected=PersonException.class)
	
	public void TestTooOld() throws PersonException {
		Date DOB = new Date(1890 - 03 - 25);
		Date start = new Date(2015 - 03 - 25);
	
		Staff Person1= new Staff("John", "A", "Doe", DOB, "158 south College", "12345", "coxj@udel.edu",
				"Monday 10am", 2, 10000.00, start, eTitle.MR);
		Person1.getDOB();
	}

	
	@AfterClass
	public static void teardown() {
	}
	
}


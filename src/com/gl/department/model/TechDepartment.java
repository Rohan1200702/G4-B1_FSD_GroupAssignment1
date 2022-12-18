package com.gl.department.model;

/**
 * 
 * @author Abhishek Shah 
 * Date: 18.12.2022 
 * This class is created to show the details of Tech. Department
 * 
 */

public class TechDepartment extends SuperDepartment {
	// method to display Depart Name
	public static String departmentName() {
		return "Welcome to Tech Department";
	}

	// method to display work details
	public static String getTodaysWork() {
		return "Complete coding of Module 1";
	}

	// method to display work deadline
	public static String getWorkDeadline() {
		return "Complete by EOD";
	}

	// method to display the activity of the department
	public String getTechStackInformation() {
		return "Core Java";
	}

	/*
	 * method to display all the above details together under one method Added by
	 * Rohan Chakraborty
	 */
	public void showDetails() {
		System.out.println(departmentName() + "\n" + getTodaysWork() + "\n" + getWorkDeadline() + "\n"
				+ getTechStackInformation() + "\n" + super.isTodayAHoliday());

	}
}

package com.gl.department.model;

/**
 * 
 * @author Tanya Sharma 
 * Date: 18.12.2022 
 * This class is created to show the details of Admin Department
 * 
 */

public class AdminDepartment extends SuperDepartment {
	// method to display Depart Name
	public static String departmentName() {
		return "Welcome to Admin Department";
	}

	// method to display work details
	public static String getTodaysWork() {
		return "Complete your documents submission";
	}

	// method to display work deadline
	public static String getWorkDeadline() {
		return "Complete by EOD";
	}

	/*
	 * method to display all the above details together under one method Added by
	 * Rohan Chakraborty
	 */
	public void showDetails() {
		System.out.println(
				departmentName() + "\n" + getTodaysWork() + "\n" + getWorkDeadline() + "\n" + super.isTodayAHoliday());

	}
}

package com.gl.department.model;

/**
 * 
 * @author Pushpendra Kumar Trivedi 
 * Date: 17.12.2022
 * This class is created to show the details of Super Department.
 * This class will be inherited by other departments to get the holiday status of the day
 *  
 */

public class SuperDepartment {

	// method to display Depart Name
	public static String departmentName() {
		return "Super Department";
	}

	// method to display work details
	public static String getTodaysWork() {
		return "No Work as of now";
	}

	// method to display work deadline
	public static String getWorkDeadline() {
		return "Nil";
	}

	// method to return if the day is holiday or not
	public static String isTodayAHoliday() {
		return "Today is not a Holiday \n";
	}

	/*
	 * method to display all the above details together under one method Added by
	 * Rohan Chakraborty
	 */
	public void showDetails() {
		departmentName();
		getTodaysWork();
		getWorkDeadline();
	}
}

package com.gl.department.model;

/**
 * 
 * @author Lalita Choudhary 
 * Date: 17.12.2022 
 * This class is created to show the details of HR Department
 * 
 */
public class HrDepartment extends SuperDepartment {
	// method to display Depart Name
	public static String departmentName() {
		return "Welcome to HR Department";
	}

	// method to display work details
	public static String getTodaysWork() {
		return "Fill today's timesheet and maark your attendance";
	}

	// method to display work deadline
	public static String getWorkDeadline() {
		return "Complete by EOD";
	}

	// method to display the activity of the department
	public String doActivity() {
		return "team Lunch";
	}

	/*
	 * method to display all the above details together under one method Added by
	 * Rohan Chakraborty
	 */
	public void showDetails() {
		System.out.println(departmentName() + "\n" + doActivity() + "\n" + getTodaysWork() + "\n" + getWorkDeadline()
				+ "\n" + super.isTodayAHoliday());

	}
}

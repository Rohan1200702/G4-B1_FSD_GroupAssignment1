package com.gl.department.main;

/**
 * @author Rohan Chakraborty
 * Date: 17.12.2022
 * This is the main class to show the details of all other departments
 * 
 */
import com.gl.department.model.AdminDepartment;
import com.gl.department.model.HrDepartment;
import com.gl.department.model.TechDepartment;

public class DepartmentMain {
	public static void main(String[] args) {
		//creating objects for each class to display the details throgh method showDetails
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		//showDetails method from Admin Department
		admin.showDetails();
		//showDetails method from HR Department
		hr.showDetails();
		//showDetails method from Tech Department
		tech.showDetails();
	}
}

package com.oops;
import com.oops.Person;
public class Employee extends Person {

	private double annualSalary;
	private String InsuranceNum;
	private int yearOfStart;
	
	public Employee(String name, double annualSalary, String insuranceNum, int yearOfStart) {
		super(name);
		this.annualSalary = annualSalary;
		InsuranceNum = insuranceNum;
		this.yearOfStart = yearOfStart;
	}
	
	public double getAnnualSalary() {
		return annualSalary;
	}
	
	public String getInsuranceNum() {
		return InsuranceNum;
	}
	
	public int getYearOfStart() {
		return yearOfStart;
	}

	
	
	
	
}

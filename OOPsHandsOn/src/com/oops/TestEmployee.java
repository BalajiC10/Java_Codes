package com.oops;

public class TestEmployee {
public static void main(String[] args) {
	
	Employee e1 = new Employee("Joe", 240000, "0932782323", 2020);
	System.out.println("Details of Employee");
	
	System.out.println("Year of Starting: "+e1.getYearOfStart());
	System.out.println("Annual Salary:s "+e1.getAnnualSalary());
	System.out.println("Insurance Number: "+e1.getInsuranceNum());
	
}


}

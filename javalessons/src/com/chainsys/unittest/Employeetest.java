package com.chainsys.unittest;
import com.chainsys.classandmethods.Employee;
/**
 * 
 * @author abin3133
 *
 */


public class Employeetest {
	public static void testEmployeeName()
	{
		Employee firstEmployee=new Employee(12345);
		firstEmployee.setName("Abinaya");
		System.out.println(firstEmployee.getName());
	}
	public static void testCity()
	{
		Employee firstEmployee=new Employee(12345);
		firstEmployee.setCity("chennai");
		System.out.println(firstEmployee.getCity());
	}
	
	public static void testSalary()
	{
		Employee firstEmployee=new Employee(12345);
		firstEmployee.setSalary(50000);
		System.out.println(firstEmployee.getSalary());
		
	}
}

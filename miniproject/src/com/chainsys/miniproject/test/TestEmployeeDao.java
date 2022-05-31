package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

public class TestEmployeeDao {
    public static void testGetAllEmployees() {
        List<Employee> allEmployees = EmployeeDao.getAllEmployee();
        ;
        Iterator<Employee> empIterator = allEmployees.iterator();
        while (empIterator.hasNext()) {
            Employee emp = empIterator.next();
            System.out.println(emp.getEmp_ID() + " " + emp.getFirst_name() + " " + emp.getSalary());
        }

    }

    public static void testGetEmployeeById() {
        Employee emp = EmployeeDao.getEmployeeById(126);
        System.out.println(emp.getEmp_ID() + " " + emp.getSalary());
    }

    public static void testInsertEmployee() {
        Employee newemp = new Employee();
        newemp.setEmp_ID(300);
        newemp.setFirst_name("babuu");
        newemp.setEmail("tytyt@mail.com");
        newemp.setLast_name("varadharaj");
        newemp.setSalary(10000);
        Calendar c1 = Calendar.getInstance();
        java.util.Date newDate = c1.getTime();
        newemp.setHire_date(newDate);
        newemp.setJob_id("IT_PROG");

        // newemp.setHire_date(new java.util.Date(22-02-2022));

        int result = EmployeeDao.insertEmployee(newemp);
        System.out.println(result);
    }

    public static void testUpdateEmployee() {
        Employee oldEmp = EmployeeDao.getEmployeeById(125);
        System.out.println(oldEmp.getEmp_ID() + " " + oldEmp.getFirst_name() + " " + oldEmp.getSalary());
        oldEmp.setEmp_ID(300);
        oldEmp.setFirst_name("babu");
        oldEmp.setLast_name("nirmal");
        oldEmp.setEmail("babu@gmail.com");
        Calendar c1 = Calendar.getInstance();
        java.util.Date newDate = c1.getTime();
        oldEmp.setHire_date(newDate);
        oldEmp.setJob_id("IT_PROG");
        oldEmp.setSalary(500000);
        int result = EmployeeDao.updateEmployee(oldEmp);
        System.out.println(result);
    }

    public static void testDeleteEmployee() {
        int result = EmployeeDao.deleteEmployee(300);
        System.out.println(result);

    }
}
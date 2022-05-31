package com.chainsys.webapp.first;

import java.io.IOException;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.LogManager;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;
import com.chainsys.miniproject.commonutil.ExceptionManager;
import com.chainsys.miniproject.commonutil.HTMLHelper;

/**
 * Servlet implementation class Employee
 */
public class Employees extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Employees() {
		super();
	}
     /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		List<Employee> allEmployees = EmployeeDao.getAllEmployee();
		Iterator<Employee> empIterator = allEmployees.iterator();
		while (empIterator.hasNext()) {
			Employee result = empIterator.next();
			// out.println("Employee id: " + "\t" + "Employee first name: " + "\t" +
			// "Employee last name: " + "\t"
			// + "Employee email: " + "\t" + "Employee hiredate: " + "\t" + "Employee job
			// id: " + "\t"
			// + "Employee salary: " + "\t");
			out.println("<hr/>");

			out.println(result.getEmp_ID() + "," + result.getFirst_name() + "," + result.getLast_name() + ","
					+ result.getEmail() + "," + result.getHire_date() + "," + result.getJob_id() + ","
					+ result.getSalary() + ",");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String submitValue = request.getParameter("submit");
		if (submitValue.equals("UPDATE")) {
			doPut(request, response);
		} else if (submitValue.equals("DELETE")) {
			doDelete(request, response);
		} else if (submitValue.equals("ADD")) {
			String source = "AddNewEmployee";
			String Message = "<h1>Error While" + source + "</h1>";

			Employee newemp = null;
			int result = 0;
			int employee_Id = 0;
			try {
				newemp = new Employee();

				String id = request.getParameter("id");
				try {
					Validator.checkStringForParse(id);
				} catch (InvalidInputDataException err) {
					Message += "Error in Employee Id input</p>";
					String errorPage = ExceptionManager.handleException(err, source, Message);
					out.print(errorPage);
					return;

				}
				employee_Id = Integer.parseInt(id);
				try {
					Validator.CheckNumberForGreaterThanZero(employee_Id);
				} catch (InvalidInputDataException err) {
					Message += "Error in Employee Id input</p>";
					String errorPage = ExceptionManager.handleException(err, source, Message);
					out.print(errorPage);
					return;
				}
				newemp.setEmp_ID(employee_Id);
				// --------------------------------------------------------------------------------------
				String fname = request.getParameter("fname");
				try {
					Validator.checkStringOnly(fname);
				} catch (InvalidInputDataException e) {
					Message += "Error in First Name input</p>";
					String errorPage = ExceptionManager.handleException(e, source, Message);
					out.print(errorPage);
					return;
				}
				try {
					Validator.checklengthOfString(fname);
				} catch (InvalidInputDataException err) {
					Message += "Error in First Name input</p>";
					String errorPage = ExceptionManager.handleException(err, source, Message);
					out.print(errorPage);
					return;
				}

				newemp.setFirst_name(fname);
				// --------------------------------------------------------------------------------------------
				String lname = request.getParameter("lname");
				try {
					Validator.checkStringOnly(fname);
				} catch (InvalidInputDataException e) {
					Message += "Error in Last_Name input</p>";
					String errorPage = ExceptionManager.handleException(e, source, Message);
					out.print(errorPage);
					return;
				}
				try {
					Validator.checklengthOfString(lname);
				} catch (InvalidInputDataException err) {
					Message += "Error in last_Name input</p>";
					String errorPage = ExceptionManager.handleException(err, source, Message);
					out.print(errorPage);
					return;
				}
				newemp.setLast_name(lname);

				// ----------------------------------------------------------------------------------------------
				String email = request.getParameter("email");
				try {
					Validator.checkMail(email);
				} catch (InvalidInputDataException e) {
					Message += "Error in Email input</p>";
					String errorPage = ExceptionManager.handleException(e, source, Message);
					out.print(errorPage);
					return;
				}
				newemp.setEmail(email);
				// -----------------------------------------------------------------------------------------------
				SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
				String hdate = request.getParameter("hdate");
				// Date hire_date=hire_dateFormate.parse(emp_HireDate);

				try {
					Validator.checkDateFormat(hdate);
				} catch (InvalidInputDataException e) {
					Message += "Error in Hire Date input</p>";
					String errorPage = ExceptionManager.handleException(e, source, Message);
					out.print(errorPage);
					return;
				}
				Date newDate = null;
				try {
					newDate = hire_dateFormate.parse(hdate);
				} catch (ParseException e) {
					Message += "Error in Hire Date input</p>";
					String errorPage = ExceptionManager.handleException(e, source, Message);
					out.print(errorPage);
					return;
				}

				newemp.setHire_date(newDate);
				// ------------------------------------------------------------------------
				String jobid = request.getParameter("jobid");
				try {
					Validator.checkjob(jobid);
				} catch (InvalidInputDataException err) {
					Message += "Error in Job id input</p>";
					String errorPage = ExceptionManager.handleException(err, source, Message);
					out.print(errorPage);
					return;
				}
				newemp.setJob_id(jobid);
				// ------------------------------------------------------------------------
				String sal = request.getParameter("salary");
				try {
					Validator.checkStringForParse(sal);
				} catch (InvalidInputDataException err) {
					Message += "Error in Salery input</p>";
					String errorPage = ExceptionManager.handleException(err, source, Message);
					out.print(errorPage);
					return;
				}
				float salParse = Float.parseFloat(sal);
				try {
					Validator.checkSalary(salParse);
				} catch (InvalidInputDataException err) {
					Message += "Error in Salery input</p>";
					String errorPage = ExceptionManager.handleException(err, source, Message);
					out.print(errorPage);
					return;
				}
				newemp.setSalary(salParse);

				result = EmployeeDao.insertEmployee(newemp);
			} catch(Exception e) {
				e.printStackTrace();}
				out.println("<div> Add New Employee: " + result + "</div>");
			}
		}
	

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Employee newemp = new Employee();
		int result = 0;
		try {

			String id = request.getParameter("id");
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setEmp_ID(empId);
			// --------------------------------
			String fname = request.getParameter("fname");
			try {
				Validator.checkStringOnly(fname);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			try {
				Validator.checklengthOfString(fname);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setFirst_name(fname);
			// -----------------------------------
			String lname = request.getParameter("lname");
			try {
				Validator.checkStringOnly(fname);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			try {
				Validator.checklengthOfString(lname);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setLast_name(lname);
			// ----------------------------------
			String email = request.getParameter("email");
			try {
				Validator.checkMail(email);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			newemp.setEmail(email);
			// --------------------------------------
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String emp_HireDate = request.getParameter("hdate");
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);

			try {
				Validator.checkDateFormat(emp_HireDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			Date newDate = null;
			try {
				newDate = hire_dateFormate.parse(emp_HireDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			newemp.setHire_date(newDate);
			// ----------------------------------------
			String jobId = request.getParameter("jobid");
			try {
				Validator.checkjob(jobId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setJob_id(jobId);
			// ---------------------------------------
			String sal = request.getParameter("salary");
			try {
				Validator.checkStringForParse(sal);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			float salParse = Float.parseFloat(sal);
			try {
				Validator.checkSalary(salParse);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setSalary(salParse);
			// ----------------------------------------------
			result = EmployeeDao.updateEmployee(newemp);
			System.out.println(result + " Updated Successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
		out.println("<div> Update Employee: " + result + "</div>");
	}
    /**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int result = 0;
		String id = null;
		try {
			id = request.getParameter("id");
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			result = EmployeeDao.deleteEmployee(empId);
			System.out.println(result);
			out.println(result + " Deleted Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.print("<div> Deleted Employee: " + result + "</div>");
	}

}

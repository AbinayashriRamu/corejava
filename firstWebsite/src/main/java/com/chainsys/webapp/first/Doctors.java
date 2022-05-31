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

import com.chainsys.miniproject.commonutil.ExceptionManager;
import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.DoctorDao;

import com.chainsys.miniproject.pojo.Doctor;

/**
 * Servlet implementation class Doctor
 */
public class Doctors extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Doctors() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		List<Doctor> allDoctors = DoctorDao.getAllDoctors();
		Iterator<Doctor> dociterator = allDoctors.iterator();
		while (dociterator.hasNext()) {
			Doctor doc = dociterator.next();
			out.print("<hr/>");
			out.println(doc.getDoctor_id() + "," + doc.getDoctor_name() + "," + doc.getDob() + "," + ","
					+ doc.getSpeciality() + "," + doc.getStandard_fees() + "," + doc.getCity() + "</p>");
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
			String source ="AddDoctors";
	        String message ="<h1>Error while"+source+ "</h1>";
			int result = 0;
			String id = null;
			Doctor newdoctor = new Doctor();

			System.out.println("Enter Doctor id");
			id = request.getParameter("id");

			int dId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(dId);
			}catch (InvalidInputDataException err) {
				message += "Error in doc id input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			newdoctor.setDoctor_id(dId);
//---------------------------------------------				
			System.out.println("Enter Doctor name");
			String name = request.getParameter("name");

			newdoctor.setDoctor_name(name);
//----------------------------------------------				
			String sDate = request.getParameter("dob");
			try {
				Validator.checkDateFormat(sDate);
			} catch (InvalidInputDataException err) {
				message += "Error in doc name input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			Date date = null;
			try {
				date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			newdoctor.setDob(date);

//----------------------------------------------------				
			String cty = request.getParameter("city");
			try {
				Validator.checkStringOnly(cty);
			}catch (InvalidInputDataException err) {
				message += "Error in city input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			newdoctor.setCity(cty);
//-----------------------------------------------------				
			String phno = request.getParameter("phone");
			try {
				Validator.checkStringForParse(phno);
			} catch (InvalidInputDataException err) {
				message += "Error in ph no input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			try {
				Validator.checklengthOfString(phno);
			} catch (InvalidInputDataException err) {
				message += "Error in ph no input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			long pno = Long.parseLong(phno);

			newdoctor.setDoc_phone_no(pno);
//------------------------------------------------------					
			String spec = request.getParameter("speciality");
			try {
				Validator.checklengthOfString(spec);
			} catch (InvalidInputDataException err) {
				message += "Error in speciality input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			newdoctor.setSpeciality(spec);
//------------------------------------				
			String fees = request.getParameter("fee");
			try {
				Validator.checkStringForParse(fees);
			} catch (InvalidInputDataException err) {
				message += "Error in fees input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			float sfee = Integer.parseInt(fees);
			try {
				Validator.Checkfees(sfee);
			} catch (InvalidInputDataException err) {
				message += "Error in fees input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			try {
				newdoctor.setStandard_fees(sfee);
//---------------------------------
				result = DoctorDao.insertDoctor(newdoctor);
				System.out.println(result);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			out.print("<div> Added Doctor: " + result + "</div>");
		} else {
			out.print("<h1> SELECT VALID CHOICE </h1>");
		}
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String source ="UpdateDoctors";
        String message ="<h1>Error while"+source+ "</h1>";
		int result = 0;
		try {
			Doctor newdoctor = new Doctor();
			String id = request.getParameter("id");
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				message += "Error in doc id input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			int dId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(dId);
			} catch (InvalidInputDataException err) {
				message += "Error in doc id input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			newdoctor.setDoctor_id(dId);
//---------------------------------------------				
			String name = request.getParameter("name");
			try {
				Validator.checklengthOfString(name);
			} catch (InvalidInputDataException err) {
				message += "Error in doc name input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			newdoctor.setDoctor_name(name);
//----------------------------------------------				
			String sDate = request.getParameter("dob");
			try {
				Validator.checkDateFormat(sDate);
			}catch (InvalidInputDataException err) {
				message += "Error in date of birth input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			Date date = null;
			try {
				date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			newdoctor.setDob(date);

//----------------------------------------------------				
			String cty = request.getParameter("city");
			try {
				Validator.checkStringOnly(cty);
			} catch (InvalidInputDataException err) {
				message += "Error in city input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			newdoctor.setCity(cty);
//-----------------------------------------------------				
			String phno = request.getParameter("phone");
			try {
				Validator.checkStringForParse(phno);
			} catch (InvalidInputDataException err) {
				message += "Error in phno input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			try {
				Validator.checklengthOfString(phno);
			} catch (InvalidInputDataException err) {
				message += "Error in phno input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			long pno = Long.parseLong(phno);

			newdoctor.setDoc_phone_no(pno);
//------------------------------------------------------					
			String spec = request.getParameter("speciality");
			try {
				Validator.checklengthOfString(spec);
			} catch (InvalidInputDataException err) {
				message += "Error in spciality input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			newdoctor.setSpeciality(spec);
//------------------------------------				
			String fees = request.getParameter("fee");
			try {
				Validator.checkStringForParse(fees);
			} catch (InvalidInputDataException err) {
				message += "Error in fees input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			float sfee = Integer.parseInt(fees);
			try {
				Validator.Checkfees(sfee);
			} catch (InvalidInputDataException err) {
				message += "Error in fees input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			newdoctor.setStandard_fees(sfee);
//---------------------------------
			result = DoctorDao.updateDoctor(newdoctor);
			System.out.println(result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		out.print("<div> Updated Doctor: " + result + "</div>");

	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String source ="DeleteDoctors";
        String message ="<h1>Error while"+source+ "</h1>";
		int result = 0;
		try {
			System.out.println("Enter doctor id");
			String s1 = request.getParameter("id");
			try {
				Validator.checkStringForParse(s1);
			} catch (InvalidInputDataException err) {
				message += "Error in doc id input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			int id = Integer.parseInt(s1);
			try {
				Validator.CheckNumberForGreaterThanZero(id);
			} catch (InvalidInputDataException err) {
				message += "Error in doc id input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			result = DoctorDao.deleteDoctor(id);

			System.out.println(result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		out.print("<div> Deleted Doctor: " + result + "</div>");
	}

}

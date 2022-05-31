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
import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.pojo.Appointment;

/**
 * Servlet implementation class Appointments
 */
public class Appointments extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Appointments() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		List<Appointment> allAppointmentss = AppointmentDao.getAllAppointments();
		Iterator<Appointment> dociterator = allAppointmentss.iterator();
		while (dociterator.hasNext()) {
			Appointment doc = dociterator.next();
			out.println("<hr/>");
			out.println(doc.getApp_id() + "," + doc.getPatient_name() + "," + doc.getApp_date() + ","
					+ doc.getFees_collected() + "," + doc.getDoctor_id() + "," + "</p>");
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
		System.out.println(submitValue);
		if (submitValue.equals("UPDATE")) {
			doPut(request, response);
		} else if (submitValue.equals("DELETE")) {
			doDelete(request, response);
		} else if (submitValue.equals("ADD")) {
			String source = "AddAppointments";
			String message = "<h1>Error while" + source + "</h1>";
			int result = 0;
			try {
				Appointment newapt = new Appointment();
				System.out.println("Enter Appointment Id ");
				String id = request.getParameter("id");
				try {
					Validator.checkStringForParse(id);
				} catch (InvalidInputDataException err) {
					message += "Error in app id input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					// err.printStackTrace();
					return;
				}
				int aId = Integer.parseInt(id);
				try {
					Validator.CheckNumberForGreaterThanZero(aId);
				} catch (InvalidInputDataException err) {
					message += "Error in app id input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					// err.printStackTrace();
					return;
				}
				newapt.setApp_id(aId);
//------------------------			
				System.out.println("Enter Patient Name ");
				String name = request.getParameter("name");
				try {
					Validator.checklengthOfString(name);
				} catch (InvalidInputDataException err) {
					message += "Error in patient name input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					// err.printStackTrace();
					return;
				}
				newapt.setPatient_name(name);
//------------------------------
				System.out.println("Enter Appointment Date as dd/mm/yyyy");
				String sDate = request.getParameter("date");
				try {
					Validator.checkDateFormat(sDate);
				} catch (InvalidInputDataException err) {
					message += "Error in app date input </p>";
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
				newapt.setApp_date(date);
//-------------------------------			
				System.out.println("Enter Doctor Id");
				String docid = request.getParameter("docid");
				try {
					Validator.checkStringForParse(docid);
				} catch (InvalidInputDataException err) {
					message += "Error in doc id input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					// err.printStackTrace();
					return;
				}
				int dId = Integer.parseInt(docid);
				try {
					Validator.CheckNumberForGreaterThanZero(dId);
				} catch (InvalidInputDataException err) {
					message += "Error in doc id input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					// err.printStackTrace();
					return;
				}
				newapt.setDoctor_id(dId);
//--------------------------------		
				System.out.println("Enter fee Collected ");
				String fee = request.getParameter("fee");
				try {
					Validator.checkStringForParse(fee);
				} catch (InvalidInputDataException err) {
					message += "Error in fee input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					// err.printStackTrace();
					return;
				}
				float cfee = Float.parseFloat(fee);
				try {
					Validator.Checkfees(cfee);
				} catch (InvalidInputDataException err) {
					message += "Error in fee input </p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					// err.printStackTrace();
					return;
				}
				newapt.setFees_collected(cfee);
//----------------------------------			
				result = AppointmentDao.insertAppointment(newapt);
				System.out.println(result);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			out.println("<div> Add New Appointment: " + result + "</div>");
		} else {
			out.print("<h1> SELECT VALID CHOICE </h1>");
		}
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String source = "updateAppointments";
		String message = "<h1>Error while" + source + "</h1>";
		int result = 0;
		try {
			Appointment newapt = new Appointment();
			System.out.println("Enter Appointment Id ");
			String id = request.getParameter("id");
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				message += "Error in app id input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			int aId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(aId);
			} catch (InvalidInputDataException err) {
				message += "Error in app id input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			newapt.setApp_id(aId);
//------------------------			
			System.out.println("Enter Patient Name ");
			String name = request.getParameter("name");
			try {
				Validator.checklengthOfString(name);
			} catch (InvalidInputDataException err) {
				message += "Error in app id input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			newapt.setPatient_name(name);
//------------------------------
			System.out.println("Enter Appointment Date as dd/mm/yyyy");
			String sDate = request.getParameter("date");
			try {
				Validator.checkDateFormat(sDate);
			} catch (InvalidInputDataException err) {
				message += "Error in app date input </p>";
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
			newapt.setApp_date(date);

//-----------------------------------			
			System.out.println("Enter Doctor Id");
			String docid = request.getParameter("docid");
			try {
				Validator.checkStringForParse(docid);
			} catch (InvalidInputDataException err) {
				message += "Error in doc id input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			int dId = Integer.parseInt(docid);
			try {
				Validator.CheckNumberForGreaterThanZero(dId);
			} catch (InvalidInputDataException err) {
				message += "Error in doc id input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			newapt.setDoctor_id(dId);
//--------------------------------		
			System.out.println("Enter fee Collected ");
			String fee = request.getParameter("fee");

			float cfee = Float.parseFloat(fee);
			try {
				Validator.checkStandard_fees(cfee);
			} catch (InvalidInputDataException err) {
				message += "Error in fee input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			newapt.setFees_collected(cfee);
//----------------------------------			
			result = AppointmentDao.updateAppointment(newapt);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		out.println("<div> Update Appointment: " + result + "</div>");
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String source = "DeleteAppointments";
		String message = "<h1>Error while" + source + "</h1>";
		String s1 = null;
		int result = 0;
		try {
			System.out.println("Enter Appointment Id ");
			s1 = request.getParameter("id");
			try {
				Validator.checkStringForParse(s1);
			} catch (InvalidInputDataException err) {
				message += "Error in app id input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			int id = Integer.parseInt(s1);
			try {
				Validator.CheckNumberForGreaterThanZero(id);
			} catch (InvalidInputDataException err) {
				message += "Error in app id input </p>";
				String errorPage = ExceptionManager.handleException(err, source, message);
				out.print(errorPage);
				// err.printStackTrace();
				return;
			}
			result = AppointmentDao.deleteAppointment(id);
			System.out.println(result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		out.print("<div> Deleted Appointment: " + result + "</div>");
	}

}

package com.chainsys.miniproject.ui;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.*;
import com.chainsys.miniproject.pojo.*;

public class DoctorUi {

	public static void addNewDoctorInformation() {
		try {
			Scanner sc = new Scanner(System.in);
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor ID : ");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			int docId = Integer.parseInt(id);
			newdoc.setDoctor_id(Integer.parseInt(id));
			try {
				Validator.CheckNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			System.out.println("Enter Doctor Name : ");
			String name = sc.nextLine();
			try {
				Validator.checkStringForParse(name);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newdoc.setDoctor_name(name);
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = c1.getTime();
			newdoc.setDob(newDate);
			System.out.println("Enter Doctor Speciality : ");
			String sp = sc.nextLine();
			try {
				Validator.checkStringForParse(sp);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newdoc.setSpeciality(sp);
			System.out.println("Enter Doctor City : ");
			String cy = sc.nextLine();
			try {
				Validator.checkStringForParse(cy);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newdoc.setCity(cy);
			System.out.println("Enter Doctor Phone number : ");
			long phone = sc.nextLong();
			newdoc.setPhoneno(phone);
			System.out.println("Enter Doctor Standard fees : ");
			float fees = sc.nextFloat();
			try {
				Validator.Checkfees(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newdoc.setStandard_fees(fees);
			int result = DoctorDao.insertDoctor(newdoc);
			System.out.println("Record added : " + result);
			sc.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public static void updateDoctor() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId = Integer.parseInt(id);
			newdoc.setDoctor_id(Integer.parseInt(id));
			try {
				Validator.CheckNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Doctor doc = DoctorDao.getDoctorById(docId);
			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDoctor_id(docId);
			System.out.println("Enter Update Name :");
			String name = sc.nextLine();
			try {
				Validator.checkStringForParse(name);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setDoctor_name(name);
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = new java.util.Date();
			newdoc.setDob(newDate);
			System.out.println("Enter Update Speciality :");
			String sp = sc.nextLine();
			try {
				Validator.checkStringForParse(sp);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setSpeciality(sp);
			// newdoc.setSpeciality(sc.nextLine());
			System.out.println("Enter Update City :");
			String cy = sc.nextLine();
			try {
				Validator.checkStringForParse(cy);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setCity(cy);
			System.out.println("Enter Update Phone_Number");
			newdoc.setPhoneno(sc.nextLong());
			System.out.println("Enter Update Standard_Fees :");
			float fees = sc.nextFloat();
			try {
				Validator.Checkfees(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setStandard_fees(fees);
			int result = DoctorDao.updateDoctor(newdoc);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void updateDoctorFirstName() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId = Integer.parseInt(id);
			newdoc.setDoctor_id(Integer.parseInt(id));
			try {
				Validator.CheckNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Doctor doc = DoctorDao.getDoctorById(docId);
			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDoctor_id(docId);
			System.out.println("Enter Update Name :");
			String name = sc.nextLine();
			try {
				Validator.checkStringForParse(name);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setDoctor_name(name);
			int result = DoctorDao.updateDoctorName(Integer.parseInt(id), name);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void deleteDoctor() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId = Integer.parseInt(id);
			newdoc.setDoctor_id(Integer.parseInt(id));
			try {
				Validator.CheckNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Doctor doc = DoctorDao.getDoctorById(docId);

			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDoctor_id(docId);
			int result = DoctorDao.deleteDoctor(Integer.parseInt(id));
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void getDoctorById() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId = Integer.parseInt(id);
			newdoc.setDoctor_id(Integer.parseInt(id));
			try {
				Validator.CheckNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Doctor doc = DoctorDao.getDoctorById(docId);
			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDoctor_id(docId);
			Doctor result = DoctorDao.getDoctorById(Integer.parseInt(id));
			System.out.println(result.getDoctor_id() + " " + result.getDoctor_name() + " " + result.getDob() + " "
					+ result.getSpeciality() + " " + result.getCity() + " " + result.getPhoneno() + " "
					+ result.getStandard_fees());
		} finally {
			sc.close();
		}
	}

	public static void getAllDoctorDetails() {
		List<Doctor> allDoctor = DoctorDao.getAllDoctors();
		Iterator<Doctor> drIterator = allDoctor.iterator();
		while (drIterator.hasNext()) {
			Doctor dr = drIterator.next();
			System.out.println(dr.getDoctor_id() + " " + dr.getDoctor_name() + " " + dr.getDob() + " "
					+ dr.getSpeciality() + " " + dr.getCity() + " " + dr.getPhoneno() + " " + dr.getStandard_fees());
		}
	}
}
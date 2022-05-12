package com.chainsys.unittest;
import com.chainsys.classandmethods.Phone;

public class PhoneTester {
	
	

	
	public static void testPhone()
	{
	     Phone phone=new Phone(6381395633l);
	     phone.setFrontCameraPixel(16);
	     phone.setRearCameraPixel(64);
	     phone.setCost(20000);
	     phone.setModel("Redmi 10 pro");
	     phone.setManufacturer("2020");
	     phone.setMemory(128);
	     phone.setDataOfPurchase("12-02-2001");
	     phone.setPlanDetails("199");
	         System.out.println(phone.getPhoneNo());
	         System.out.println(phone.getFrontCameraPixel()+"MP");
	         System.out.println(phone.getRearCameraPixel()+"MP");
	         System.out.println(phone.getCost());
	         System.out.println(phone.getModel());
	         System.out.println(phone.getManufacturer());
             System.out.println(phone.getMemory()+"GP");
	         System.out.println(phone.getDataOfPurchase());
	         System.out.println(phone.getPlanDetails());

	}
	}




package com.chainsys.unittest;
import com.chainsys.classandmethods.Car;
/**
 * 
 * @author abin3133
 *
 */
public class Cartest {
	public static void testCar()
	{
		Car firstCar=new Car("TN 39 BV 8943");
		firstCar.setName("Benz");
		System.out.println(firstCar.getName());
	}
	public static void testcolour()
	{
		Car firstCar=new Car("TN 39 BV 8943");
		firstCar.setColour("Red");
		System.out.println(firstCar.getColour());
	}
	
	
	public static void testyearofpurchase()
	{
		Car firstCar=new Car("TN 39 BV 8943");
		firstCar.setYearofpurchase(2000);
		System.out.println(firstCar.getYearofpurchase());
		
	}
}



package com.chainsys.classandmethods;
/**

 * @author abin3133
 *
 */

public class Car {
	private int yearofpurchase;
	private String name;
	private String colour;
	private String fuel ;
	private final String registerNumber;
	public Car(String registernumber)
	{
		this.registerNumber=registernumber;
	}
	public int getYearofpurchase() {
		return yearofpurchase;
	}
	public void setYearofpurchase(int yearofpurchase) {
		this.yearofpurchase = yearofpurchase;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getRegisterNumber() {
		return registerNumber;
	}
}

	

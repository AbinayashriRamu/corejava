package com.chainsys.interfaces;

class CalculatorB {
	public static void main(String[] args) {
		CalculatorA cal = new CalculatorA();

		cal.add(3, 5);
		cal.multiply(2, 3);
		cal.divide(10, 2);

	}
	/*
	 * marker Interface
	 */
	public static void testmarker() {
	    
	    CalculatorA c1=new CalculatorA();
	    if( c1 instanceof Interface)
	    {
	        Interface c= new CalculatorA();
	        int out = 0;
	        out =c.add(8,4);
	        System.out.println(out);
	        out=c.multiply(8,4);
	        System.out.println(out);
	        out=c.divide(8,4);
	        System.out.println(out);
	}
	    else
	    {
	        System.out.println(c1.getClass().getName()+"does not implement ICalculator");
	    }
	}
	}

		
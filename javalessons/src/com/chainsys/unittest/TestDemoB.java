package com.chainsys.unittest;
import com.chainsys.abstractclass.*;
public class TestDemoB
{
	
public static void testDemoB() {
	
	// abstract class can not be instantiated
	//AbsDemoB objectDemob=new AbsDemoB();
	AbsDemoB objectDemob=new DemoBChild();
	objectDemob.echo();
}
}
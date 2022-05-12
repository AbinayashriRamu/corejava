package com.chainsys.usingFinal;

public class Phone {
	public void makeCall() {
		System.out.println("call made...");
	}

	public final void sendSMS() {
		System.out.println("SMS send...");
	}
}

class Nokia extends Phone {
	public void makeAcall() {
		System.out.println("call made from Nokia");
	}
	/*
	 * @override public void send sms { system.out.println("sms send"); }
	 */
}

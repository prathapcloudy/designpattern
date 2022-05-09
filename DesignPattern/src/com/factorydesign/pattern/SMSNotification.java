package com.factorydesign.pattern;

public class SMSNotification implements Notification{

	@Override
	public void notifyMe() {
		System.out.println("SMS notification");
		
	}

}

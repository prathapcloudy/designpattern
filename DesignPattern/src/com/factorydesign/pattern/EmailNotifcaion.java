package com.factorydesign.pattern;

public class EmailNotifcaion implements Notification {

	@Override
	public void notifyMe() {
		System.out.println("Email Notification");
	}

}

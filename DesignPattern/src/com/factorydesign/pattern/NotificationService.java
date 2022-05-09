package com.factorydesign.pattern;

public class NotificationService {

	public static void main(String[] args) {
	
		NotificationFactory notifictaionFactory = new NotificationFactory();
		 
		Notification notification =  notifictaionFactory.createNotification("Email");
		notification.notifyMe();
	}
}

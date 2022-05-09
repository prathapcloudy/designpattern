package com.factorydesign.pattern;

public class NotificationFactory {

	public Notification createNotification(String channel) {
		
		if(channel ==null || channel.isEmpty()) 
		{ 
			return null;
		}else if(channel.equals("SMS"))
		{
			return new SMSNotification();
		}else if(channel.equals("Email")) 
		{
			return new EmailNotifcaion();
		}else if(channel.equals("Push")) 
		{
			return new PushNotification();
		}else return null;
	}

}

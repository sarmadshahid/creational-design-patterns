package com.example;

public class Push implements Notification {
	
	@Override
	public void notifyUser() {
		System.out.println("Sending a push notification");
	}
	
}

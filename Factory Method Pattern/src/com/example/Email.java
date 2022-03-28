package com.example;

public class Email implements Notification {
	
	@Override
	public void notifyUser() {
		System.out.println("Sending an Email notification");
	}
	
}

package com.example;

public class SMS implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending an SMS notification");
	}

}

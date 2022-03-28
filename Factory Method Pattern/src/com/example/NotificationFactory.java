package com.example;

public class NotificationFactory {
	public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
        case "SMS":
            return new SMS();
        case "EMAIL":
            return new Email();
        case "PUSH":
            return new Push();
        default:
            throw new IllegalArgumentException("Unknown channel " + channel);
        }
    }
}

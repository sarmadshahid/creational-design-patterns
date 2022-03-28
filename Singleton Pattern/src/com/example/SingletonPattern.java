package com.example;

public class SingletonPattern {
	public static void main(String[] args) {
			Singleton object = Singleton.getInstance();
			System.out.println(object.get());
			object.set("Hello World!!!");
			System.out.println(object.get());
		}
}

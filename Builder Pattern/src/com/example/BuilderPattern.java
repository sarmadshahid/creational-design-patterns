package com.example;

public class BuilderPattern {
	public static void main(String[] args) 
	{
		User user1 = new User.UserBuilder("Aiden", "Curtis")
		.age(30)
		.phone("1234567")
		.address("Fake address 1234")
		.build();

		System.out.println(user1);

		User user2 = new User.UserBuilder("James", "Payne")
		.age(40)
		.phone("5655")
		.build();

		System.out.println(user2);

		User user3 = new User.UserBuilder("Ted", "Berry")
		.build();

		System.out.println(user3);
	}
}

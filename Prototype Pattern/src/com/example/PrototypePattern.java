package com.example;

public class PrototypePattern {
	public static void main(String[] args) {
		Tree plasticTreeOne = new PlasticTree(12, 12);
		plasticTreeOne.setPosition(new Position(1, 2));
		System.out.println(plasticTreeOne.toString());
		Tree plasticTreeTwo = plasticTreeOne.copy(); 
		System.out.println(plasticTreeTwo.toString());
		
		Tree pineTreeOne = new PineTree(24, 24);
		pineTreeOne.setPosition(new Position(3, 4));
		System.out.println(pineTreeOne.toString());
		Tree pineTreeTwo = pineTreeOne.copy(); 
		System.out.println(pineTreeTwo.toString());
	}
}

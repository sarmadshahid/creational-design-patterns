package com.example;

public class Singleton {
	private static Singleton INSTANCE;
    private String info = "Initialized";
    
    //make the constructor private so that this class cannot be instantiated
    private Singleton() { }
    
    public static Singleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
    
    public void set(String info) {
    	this.info = info;
    }
    
    public String get() {
    	return this.info;
    }
}

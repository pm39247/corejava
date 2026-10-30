package com.app.fruits;

public class Apple extends Fruits {

	public Apple(String name,double weight,String color) {
		super(name,weight,color);
	}
	@Override
	public void Taste() {
		System.out.println("Apple taste is Sweet and Sour");
	}
	

	
	

}

package com.app.fruits;

public abstract class Fruits {
	String color;
	double weight;
	String name;
	boolean isFresh;
	Fruits(String name,double weight,String color){
		this.name=name;
		this.weight=weight;
		this.color=color;
		
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	abstract void Taste();

	@Override
	public String toString() {
		return "FruitName: "+name+" , "+"color: "+color+" , "+"weight: "+weight;
	}

}

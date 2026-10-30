package com.app.fruits;
import java.util.Scanner;
public abstract class fruit {
	Scanner sc=new Scanner(System.in);
  private String color,name;
  private double weight;
  private boolean isfresh;
  public fruit(){}
//  public fruit(String color, String name, double weight, String taste) {
//	
//	this.color = color;
//	this.name = name;
//	this.weight = weight;
//	this.isfresh = true;
//	
//  }
  public fruit(String name, double weight,String color) {
		
		this.color = color;
		this.name = name;
		this.weight = weight;
		this.isfresh = true;
	  }
  public String getColor() {
	return color;
  }
  public void setColor(String color) {
	this.color = color;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public double getWeight() {
	return weight;
  }
  public void setWeight(double weight) {
	this.weight = weight;
  }
  public boolean Isfresh() {
	return isfresh;
  }
  public void Isfresh(boolean isfresh) {
	this.isfresh = isfresh;
	
  }
  public void acceptRec() {
	  System.out.println("Enter fruit name :");
	  setName(sc.next());
	  System.out.println("Enter fruit color :");
	  setColor(sc.next());
	  System.out.println("Enter fruit weight :");
	  setWeight(sc.nextDouble());
	  System.out.println("Enter if fruit is fresh (yes/no) :");
	  String input = sc.next();
	  if (input.equalsIgnoreCase("yes")) 
		    Isfresh(true);
	  else 
		    Isfresh(false);
		    
	  
	  
	  
		
	}
@Override
  public String toString( ) {
	  return "Name: "+name+" "+"Color: "+color+" "+"Weight: "+weight;
	   
  }
public abstract String taste();


}
//Arrange Fruit, Apple, Orange, Mango in inheritance hierarchy 
//b) Properties (instance variables) : color: String, weight : double , name: String, isFresh: 
// boolean 
//c)  Add suitable constructors. 
//d) Override toString correctly to return state of all fruits (including: name ,color , weight ) 
//e)  Add a taste() method : public String taste() which will be an abstract method 
//
// 
//
//Apple: should return "sweet and sour” 
//Mango: should return "sweet" 
//Orange: should return "sour" 
//
// 
//
//f) Add all of above classes under the package "com.app.fruits" 
//g) Create a Class FruitBasket , with main method inside it. Use it for testing
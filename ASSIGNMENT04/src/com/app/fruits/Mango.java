package com.app.fruits;

public  class Mango extends fruit {
	@Override
	public  String taste() {
		return "sweet";
	}
//	Mango(){
//		this.color="Yellow";
//		this.weight=130;
//	}
	Mango(String name,double weight,String color){
		
		super(name,weight,color);
			
		}
	

}

package com.app.fruits;
import java.util.Scanner;

public class FruitBasket {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of basket:");
		int n= sc.nextInt();
		int counter=0;
		
		fruit[] basket=new fruit[n];
		boolean exit=true;
				//Fruit[] basket = new Fruit[5];
		while(exit) {
		System.out.println("================================================================");
		System.out.println("0. Exit:");
		System.out.println("1. Add Mango:");
		System.out.println("2. Add Orange:");
		System.out.println("3. Add Apple:");
		System.out.println("4. Display names of all fruits in the basket:");
		System.out.println("5. Display name, color, weight, taste of all fresh fruits, in the basket:");
		System.out.println("6. Display tastes of all stale (not fresh) fruits in the basket:");
		System.out.println("7. Mark a fruit as stale:");
		System.out.println("8. Mark all sour fruits stale:");
		System.out.println("================================================================");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		
		
		switch (choice) {
		case 0: exit=false;
		case 1:{
			
			if(counter==n)
				System.out.println("Basket is full");
			if(n>0 && counter<n) {
				
				System.out.println("Enter Mango name: ");
		         //String name=sc.nextLine();
				String name=sc.next();
				System.out.println("Enter Mango weight: ");
				double weight=sc.nextDouble();
				//sc.nextLine();
				System.out.println("Enter Mango color: ");
				String color=sc.next();
				
			basket[counter++] =new Mango(name,weight,color);
			System.out.println("Mango added sucessfully");
			}
			break;
			
		}
		case 2:{
			
			if(counter==n)
				System.out.println("Basket is full");
			if(n>0&&counter<n) {
				System.out.println("Enter Orange name: ");
				String name=sc.next();
				System.out.println("Enter Orange weight: ");
				double weight=sc.nextDouble();
				System.out.println("Enter Orange color: ");
				String color=sc.next();
				
			basket[counter++] =new Orange(name,weight,color);
			System.out.println("Orange added sucessfully");
			}
			break;
		}
		case 3:{
			if(counter==n)
				System.out.println("Basket is full");
			if(n>0&&counter<n) {
				System.out.println("Enter Apple name: ");
				String name=sc.next();
				System.out.println("Enter Apple weight: ");
				double weight=sc.nextDouble();
				System.out.println("Enter Apple color: ");
				String color=sc.next();
				
			basket[counter++] =new Apple(name,weight,color);
			System.out.println("Apple added sucessfully");
			}
			break;
			
		}
		case 4:{
			for(fruit f:basket) {
				if(f!=null) {
					System.out.println(f.getName());
				}
			}
			break;
		}
		case 5:{
			for(fruit f:basket) {
				if(f!=null && f.Isfresh()) {
					System.out.println(f.getName()+" "+f.getColor()+" "+f.getWeight()+" "+f.taste());
				}
			}
			break;
		}
		case 6:{
			for(fruit f:basket) {
				if(f!=null && f.Isfresh()==false) {
					System.out.println(f.taste());
				}
				else 
					System.out.println("all fruits are fresh");
			}
			break;
			
		}
		case 7:{
			
			System.out.println("Enter the fruit index to mark stale:");
			basket[sc.nextInt()].Isfresh(false);
			break;
		}
		case 8:{
			for(fruit f:basket) {
				if(f!=null && f.taste()=="sour" ) {
					f.Isfresh(false);
				}
				else
					System.out.println("no sour fruits in your basket");
			}
			
		}
		}
		} 
		
	
		
		
		
		
		
		
	}
//	0. Exit 
//	1. Add Mango 
//	      boundary checking      
//	      basket [counter++]=new  
//	        Mango(nm, weight, color); break; 
//
//	 
//
//	2. Add Orange 
//
//	 
//
//	3. Add Apple 
//	  NOTE: You will be adding a fresh fruit in the basket, in all of above options. 
//
//	 
//
//	4. Display names of all fruits in the basket. eg : for-each --- null checking --getName() 
//	5. Display name, color, weight, taste of all fresh fruits, in the basket. eg : for-each , null 
//	checking --toString , taste, isFresh: getter 
//
//	 
//
//	6. Display tastes of all stale (not fresh) fruits in the basket. 
//	7. Mark a fruit as stale i/p : index 
//	       Eg: setter : isFresh : false 
//	       O/P: error message (in case of invalid index) or mark it stale. 
//
//	 
//
//	8. Mark all sour fruits stale (optional) eg : for-each , taste --equals(String) 

}

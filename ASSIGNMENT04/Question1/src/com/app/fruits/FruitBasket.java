package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	Fruits[] basket;
	int count=0;
	Scanner sc=new Scanner(System.in);
    
    FruitBasket(int n){
    	basket=new Fruits[n];
    }
    void add(Fruits f) {
    	System.out.print("Enter the fruits name: ");
    	String name=sc.next();
    	f.setName(name);
    	System.out.print("Enter the fruits weight: ");
    	double weight=sc.nextDouble();
    	f.setWeight(weight);
    	System.out.print("Enter the fruits color: ");
    	String color=sc.next();
    	f.setColor(color);
    	
    	if(f instanceof Mango) {
    		
    		basket[count]=new Mango(f.getName(),f.getWeight(),f.getColor());
    		basket[count].setFresh(true);
    		count++;
    	}
        if(f instanceof Orange) {
    		
    		basket[count]=new Orange(f.getName(),f.getWeight(),f.getColor());
    		basket[count].setFresh(true);
    		count++;
    	}
        if(f instanceof Apple) {
    		
    		basket[count]=new Apple(f.getName(),f.getWeight(),f.getColor());
    		basket[count].setFresh(true);
    		count++;
    	}  
    			
    }
    
    void display() {
    	for(int i=0;i<basket.length;i++) {
    		if(basket!=null) {
    		System.out.println(basket[i].getName());}
    	}
    }
    void Alldisplay() {
    	for(int i=0;i<basket.length;i++) {
    		if(basket!=null) {
    		System.out.println(basket[i].toString());
    		basket[i].Taste();
    		if(basket[i].getFresh())
    		  System.out.println("fresh food");
    		else
    			System.out.println("Not fresh food");
    		}
    	}
    }
    void staleDisplay() {
    	for(int i=0;i<basket.length;i++) {
    		if(!basket[i].getFresh())
    		  basket[i].Taste(); 
    		else 
    			System.out.println("All are fresh food");
    		}
    }
    
    void markStale() {
    	System.out.println("Enter the index of fruits: ");
    	int ch=sc.nextInt();
    	for(int i=0;i<basket.length;i++) {
    		if(ch==i)
    		   basket[i].setFresh(false);
    		else
    			System.out.println("Invalid index:");
    	}
    }
    	
    int menu() {
    	int choice;
    	System.out.println("0. Exit");
    	System.out.println("1. Add Mango");
    	System.out.println("2. Add Orange");
    	System.out.println("3. Add Apple");
    	System.out.println("4. Display names of all fruits in the basket.");
    	System.out.println("5.  Display name, color, weight, taste of all fresh fruits, in the basket.");
    	System.out.println("6. Display tastes of all stale (not fresh) fruits in the basket.");
    	System.out.println("7. Mark a fruit");
    	System.out.println("8.  Mark all sour fruits stale");
    	choice =sc.nextInt();
    	return choice;
    }
	

	public static void main(String[] args) {
		System.out.println("Enter the basket size: ");
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	FruitBasket fb=new FruitBasket(n);
    	int choice=-1;
    	int count=0;
    	
    	
    	while(choice!=0) {
    		choice=fb.menu();
    		Fruits f;
    		switch (choice) {
    		case 0:
    			System.out.println("Exit");
    			break;
    			
    		case 1:
    			f=new Mango("",0,"");
    			Mango m=(Mango)f;
    			fb.add(m);
    			break;
    			
    		
    		case 2:
    			f=new Orange("",0,"");
    			Orange o=(Orange)f;
    			fb.add(o);
    			break;
    			
    		case 3:
    			f=new Apple("",0,"");
    			Apple a=(Apple)f;
    			fb.add(a);
    			break;
    			
    		case 4:
    			fb.display();
    			break;
    			
    		case 5:
    			fb.Alldisplay();
    			break;
    			
    		case 6:
    			fb.staleDisplay();
    			break;
    			
    		case 7:
    			fb.markStale();
    			break;
    		}
    		
    	}
		
		
		

	}

}



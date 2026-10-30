package com.app.geometry;
import java.util.Scanner;
import java.lang.Math;

public class Point2D {
	Scanner sc=new Scanner(System.in);
 double x;
 double y;
 
 public Point2D(double x,double y){
	 this.x=x;
	 this.y=y;
 }
 public Point2D(){
	 
 }
 public double getx() {
	 return this.x;
 }
 public double gety() {
	 return this.y;
 }
 public void setx(double x) {
	 this.x=x;
 }
 public void sety(double y) {
	 this.y=y;
 }
 @Override
 public String toString() {
	 return "("+this.x+" ,"+this.y+")";
 }
 //void getCoord() {
	// System.out.println("("+this.x+" ,"+this.y+")");
 //}
 public String getDetails() {
	return toString(); 
 }
 public boolean isEqual(Point2D p2) {
	 if((this.x==p2.x && this.y==p2.y)) 
		 return true;
		 else 
			 return false;
		 
	 
	 
 }
 //public claculateDistance()
 public void acceptRec() {
	 System.out.println("Enter x coordinate :");
	 setx(sc.nextDouble());
	 System.out.println("Enter y coordinate :");
	 sety(sc.nextDouble());
 }
 public double distance(Point2D p1,Point2D p2) {
	 
	 return(Math.sqrt(Math.pow((p1.x-p2.x),2)+Math.pow((p1.y-p2.y),2)));
 }
 public static void main(String[] args) {
	 Point2D p1=new Point2D();
	 Point2D p2=new Point2D();
	 p1.acceptRec();
	 p2.acceptRec();
	 System.out.println(p1.getDetails());
	 //p2.acceptRec();
	 System.out.println(p2.getDetails());
	 boolean b=p1.isEqual(p2);
	 System.out.println("b = " + b);
	 if(b) 
		 System.out.println("both points are same !");
	 else 
			 System.out.println("distance between points are :"+p1.distance(p1,p2));
			 //System.out.println("both points are different !");
	 
	 
		 
	 
	 
	 
	 
	 
	 
	 
 }
}

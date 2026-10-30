package tester;
import com.app.geometry.Point2D;

public class TestPoint {
	public static void main(String[] args) {
		 Point2D p1=new Point2D();
		 Point2D p2=new Point2D();
		 p1.acceptRec();
		 p2.acceptRec();
		 System.out.println(p1.getDetails());
		 //p2.acceptRec();
		 System.out.println(p2.getDetails());
		 if(p1.isEqual(p1,p2)) 
			 System.out.println("both points are same !");
			 else 
				 System.out.println("distance between points is :"+p1.distance(p1,p2));
	}

}

import java.util.Scanner;
public class ass2_1 {
	Scanner sc= new Scanner(System.in);
	String partNum;
	String partDes;
	int quantity;
	double price;
	
	public ass2_1() {
		
	}
	public ass2_1(String partNum, String partDes, int quantity, double price) {
		super();
		this.partNum = partNum;
		this.partDes = partDes;
		if(quantity<0)
			setQuantity(0);
		else	
		    this.quantity = quantity;
		if(price<0)
			setPrice(0.0);
		else
		    this.price = price;
	}

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPartDes() {
		return partDes;
	}

	public void setPartDes(String partDes) {
		this.partDes = partDes;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void acceptRec() {
		System.out.println("enter the partnumber: ");
		setPartNum(sc.next());
		System.out.println("enter the part description: ");
		setPartDes(sc.next());
		System.out.println("enter the quantity: ");
		int q=sc.nextInt();
		if(q<0) 
			setQuantity(0);
		else
		setQuantity(q);
		System.out.println("enter the price: ");
		double p=sc.nextDouble();
		if(p<0) 
			setPrice(0.0);
		else 
			setPrice(p);
		
	
	}
	public void displayRec() {
		System.out.println("partnumber: "+getPartNum());
		System.out.println("part desc: "+getPartDes());
		System.out.println("quantity: "+getQuantity());
		System.out.println("partnumber: "+getPartNum());
		System.out.println("invoice : "+invoice(getQuantity(),getPrice()));
		
		
	}
	public double invoice(int qty,double price) {
		return qty*price;
	}

	public static void main(String[] args) {
		ass2_1 a = new ass2_1();
		a.acceptRec();
		a.displayRec( );
		
		
		
	}
	

}

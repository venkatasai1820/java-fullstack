

import java.util.Scanner;

public class HotelBilling {
	String roomtype;
	double roomprice;
	int noofdays;
	double foodcharges;

	
	HotelBilling(){
		this("delux",0);
		System.out.println();
	}
	HotelBilling(String roomtype,double roomprice){
		this(roomtype,roomprice,0);
		System.out.println();
	}
	HotelBilling(String roomtype,double roomprice,int noofdays){
		this( roomtype, roomprice, noofdays,0);
		System.out.println();
	}
	HotelBilling(String roomtype,double roomprice,int noofdays,double foodcharges){
		this.foodcharges = foodcharges;
		this.noofdays = noofdays;
		this.roomprice =roomprice;
		this.roomtype =roomtype;
		double roomcost = roomprice * noofdays;
		double finallbill = roomcost + foodcharges;
		System.out.println("Room Cost =" + roomcost);
		System.out.println("Finall Bill = " + finallbill);
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Room Type :" );
		String roomtype = sc.next();
		
		System.out.println("Enter Room price :");
		double roomprice = sc.nextDouble();
		
		System.out.println("Enter Number Of days :");
		int noofdays = sc.nextInt();
		
		System.out.println("Enter Food Charges :");
		double foodcharges =sc.nextDouble();
		
		HotelBilling h = new HotelBilling(roomtype,roomprice,noofdays,foodcharges);
		
		
		
		
		
	}

}

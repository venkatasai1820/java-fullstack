

public class RailwayTicketBooking {
	
	String passengerName;
	int age;
	String source;
	String destination;
	
	public RailwayTicketBooking(String passengerName,int age,String source,String destination) {
		this.passengerName = passengerName;
		this.age = age;
		this.source = source;
		this.destination = destination;
	}

     public RailwayTicketBooking(int noofTickets, double price) {
		double Ticketprice = noofTickets * price;
		System.out.println("Ticket Price =" + Ticketprice);
	}

	 class Ticket extends RailwayTicketBooking{
    	 int noofTickets;
    	 double price;
    	 Ticket(){
    		 this(4,500);
    	 }
    	
		Ticket(int noofTickets,double price){
			super(noofTickets,price);
			this.noofTickets = noofTickets;
			this.price = price;
		}
	 }
	
	public static void main(String[] args) {
		
       RailwayTicketBooking r = new RailwayTicketBooking("sai",21,"hyderbad","chennai");
       
       Ticket t = r.new Ticket();
       System.out.println("Passenger Name :" + r.passengerName);
       System.out.println("Passenger Age :" + r.age);
       System.out.println("Starting From :" + r.source);
       System.out.println("Going To :" + r.destination);
       System.out.println("No Of Tickets :" + t.noofTickets);
       System.out.println("Price of Ticket :" + t.price);
		
	}

}

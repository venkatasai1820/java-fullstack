

public class RentalCars {
	
	int days;
	String getcompany() {
		return "ZOOM RENTALS";
	}
	
	int rentalrateperday() {
		return 1500;
	}
	
	int Baseamount() {
	    return (rentalrateperday()*days);
		
	}
	 
	int insurance() {
		return 500;
	}
	
	int calculatetotalcost() {
		return(Baseamount() + insurance());
	}
	
	String welcomemessage(){
		return "WLCOME TO ZOOM RENTALS";
		
	}
	public static void main(String[] args) {
		RentalCars R = new RentalCars();
		R.days = 4;		
		System.out.println("******************************");
		System.out.println("COMPANY NAME :" + R.getcompany());
		System.out.println("RentalRatePerDay :" + R.rentalrateperday());
		System.out.println("Baseamount :" + R.Baseamount());
		System.out.println("Insurance :" + R.insurance());
		System.out.println("TotalCost :" + R.calculatetotalcost());
		System.out.println("Welcommessage :" + R.welcomemessage());

		RentalCars c = new RentalCars();
		c.days = 2;		
		System.out.println("****************************");
		System.out.println("COMPANY NAME :" + c.getcompany());
		System.out.println("RentalRatePerDay :" + c.rentalrateperday());
		System.out.println("Baseamount :" + c.Baseamount());
		System.out.println("Insurance :" + c.insurance());
		System.out.println("TotalCost :" + c.calculatetotalcost());
		System.out.println("Welcommessage :" + c.welcomemessage());
	}

}



import java.util.Scanner;

public class HotelBilling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("========Hotel Billing========");

		System.out.println("Select Room Type:");
		System.out.println("1.Deluxe Room - $2500 per day");
		System.out.println("2.Standard Room - $1800 per day");
		System.out.println("3.Suite room - $4000 per day");

		System.out.println("Enter your choice:");
		int choice = sc.nextInt();

		System.out.println("Enter no of days:");
		int days = sc.nextInt();

		double roomPrice = 0;
		String roomType = "";

		switch (choice) {

		case 1:
			roomType = "Deluxe Room";
			roomPrice = 2500;
			break;

		case 2:
			roomType = "Standard Room";
			roomPrice = 1800;
			break;

		case 3:
			roomType = "suite";
			roomPrice = 4000;
			break;

		default:
			System.out.println("Invalid Room Choice");
			sc.close();
			return;

		}

		System.out.println("Enter food Charges:");
		double foodCharges = sc.nextDouble();

		double roomCost = roomPrice * days;
		double totalBill = roomCost + foodCharges;

		System.out.println("\n=====Hotel Bill======");
		System.out.println("Room Type :" + roomType);
		System.out.println("Number Of Days :" + days);
		System.out.println("Room Cost :" + roomCost);
		System.out.println("Food Chrages :" + foodCharges);
		System.out.println("Total Bill:" + totalBill);
		sc.close();

	}

}

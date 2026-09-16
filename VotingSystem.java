

import java.util.Scanner;

public class VotingSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age :");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("Your Eligible For Vote");
		}
		System.out.println("Enter Your Gender");
		String gender = sc.next();

		if (gender.equals("M") || gender.equals("F")) {
			System.out.println("Move to next step");
			System.out.println("Enter VoterId :");
			int VoterId = sc.nextInt();

			System.out.println("****Candidate Name ****");
			System.out.println("1.CBN FOR TDP \n");
			System.out.println("2.PAWALA FOR JSP \n");
			System.out.println("3.MODI FOR BJP \n");
			System.out.println("4.Y S JAGAN MOHAN REDDY  YCP \n");
			System.out.println("choose any option");

			int can = sc.nextInt();
			if (can == 1) {
				System.out.println("vote captured for CBN FOR TDP");
			} else if (can == 2) {
				System.out.println("vote captured for PAWALA FOR JSP");
			} else if (can == 3) {
				System.out.println("vote captured for MODI FOR BJP");
			} else if (can == 4) {
				System.out.println("vote captured for Y S JAGAN MOHAN REDDY FOR YCP");
			} else {
				System.out.println("voted for NOTA");
			}
		}

	}

}



import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();

		boolean status = PerfectNumber(n) ;
		if (status) {
			System.out.println("N is a perfect number");
		} else {
			System.out.println("N is not perfect number");
		}

	}

	

static  boolean PerfectNumber(int n) {
	boolean status = false;
	int sum = 0;
	for(int i = 1; i < n/2; i++) {
		if(n%i==0) {
			
		}
		if(sum==n) {
			sum = sum +i;
		}
	}
	return status;
}
}

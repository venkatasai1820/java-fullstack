

public class Arithmetic {

	void addition() {
		int a=10,b=20;
	    int c=a+b;
		System.out.println("addition :" + c);
	}
	
	void subtraction() {
		int a=30,b=3;
		int c=a-b;
		System.out.println("subtraction : " + c);
	}
	void multiplication() {
		int a=4,b=4;
		int c=a*b;
		System.out.println("multiplication : " +c);
	}
	void division() {
		int a=10,b=5;
		int c=a/b;
		System.out.println("division :" + c);
	}
	public static void main(String[] args) {
		Arithmetic a = new Arithmetic();
		a.addition();
		a.subtraction();
		a.multiplication();
		a.division();

	}

}

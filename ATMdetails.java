

public class ATMdetails {
	
	static String BankName = "Telangana Grameena";
	
	Long AccountNumber;
	double Balance;
	
	void deposite(double amount) {
		Balance = Balance + amount;
	
		System.out.println("deposited amount is :" + amount);
	}
	 void withdraw(double amount) {
		 Balance = Balance - amount;
		 System.out.println("withdrawnamount is :" + amount);
	 }
	 
	 void checkBalance() {
		 System.out.println("AccountNumber is :" + AccountNumber);
		 System.out.println("Blance is :" + Balance);
	 }

	public static void main(String[] args) {
		ATMdetails a = new ATMdetails();
		System.out.println("******account details********");
		a.AccountNumber =110234674900l;
        a.Balance = 40000.00;
        
        a.deposite(20000);
        a.withdraw(50000);
        a.checkBalance();
        
    	ATMdetails a1 = new ATMdetails();
    	System.out.println("******account details********");
    	a1.AccountNumber =110234674900l;
        a1.Balance = 40000.00;
        a1.deposite(30000);
        a1.withdraw(10000);
        a1.checkBalance();
       
	}

}

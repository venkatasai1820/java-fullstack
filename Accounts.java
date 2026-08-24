

public class Accounts {
	 String accounthlodername;
	 int balance;
	 String accountstatus;
	 
	 static int accountno = 401;
	 void display() {
		 System.out.println(" ******accountno :" + accountno + "******" );
		 System.out.println("accounthlodername : " +  accounthlodername);
		 System.out.println("accountno :" + accountno);
		 System.out.println("balance :" + balance);
		 System.out.println("accountstatus :" +  accountstatus);
		 accountno++;
		 
	 }

	public static void main(String[] args) {
		Accounts a1 = new Accounts();
		a1.accounthlodername = "sai";
		a1.balance = 20000;
		a1.accountstatus = "active";
		a1.display();
	
		Accounts a2 = new Accounts();
		a2.accounthlodername = " venkatsai";
		a2.balance = 0;
		a2.accountstatus = "inactive";
		a2.display();
		
		Accounts a3 = new Accounts();
		a3.accounthlodername = "prashanth";
		a3.balance = 10000;
		a3.accountstatus = "active";
		a3.display();
		
		Accounts a4 = new Accounts();
		a4.accounthlodername = "tharunsurya";
		a4.balance = 40;
		a4.accountstatus = "inactive";
		a4.display();
	}

}

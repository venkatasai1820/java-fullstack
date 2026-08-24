

public class Employeedetails {
	
	int employeeid;
	String employeename;
	int empsalary;
	String empexperience;
	String empgrade;
	String emppremanentstatus;
	
	void display() {
		System.out.println("******Employeedetails*******");
		System.out.println("employeeid = " + employeeid);
		System.out.println("employeename = " + employeename);
		System.out.println("empsalary = " + empsalary);
		System.out.println("empexperience = " + empexperience);
		System.out.println("empgrade = " + empgrade);
		System.out.println("emppremanentstatus = " + emppremanentstatus);
	}
	

	public static void main(String[] args) {
		Employeedetails e1 = new Employeedetails();
		e1.employeeid = 101;
		e1.employeename = "sai";
		e1.empsalary = 20000;
		e1.empexperience = "4 years";
		e1.empgrade = "A";
		e1.emppremanentstatus = "permanent";
		
	    e1.display();
		 
	    Employeedetails e2 = new Employeedetails();
		e2.employeeid = 103;
		e2.employeename = "kiransai";
		e2.empsalary = 30000;
		e2.empexperience = "3 years";
		e2.empgrade = "C";
		e2.emppremanentstatus = "permanent";
		
	    e2.display();
		
	    Employeedetails e3 = new Employeedetails();
		e3.employeeid = 103;
		e3.employeename = "venkatsai";
		e3.empsalary = 40000;
		e3.empexperience = " 2years";
		e3.empgrade = "B";
		e3.emppremanentstatus = "permanent";
		
	    e3.display();
		

	}

}



public class LoanManagement {
	String CustomerName;
	double LoanAmount;
	double IntrestRate;
	int LoantenureYears;
	double simpleintrest;
	double intrest1;
	double MonthlyEMI;
		
    double Intrest(double LoanAmount,double IntrestRate,int Loantenureyears) {
    	 simpleintrest = (LoanAmount * IntrestRate * Loantenureyears) / 100;
		return simpleintrest;
	}

	double TotalAmount(double intrest) {
		intrest1 = LoanAmount + intrest;
		return intrest1;
	}

	double MonthlyEMI(double Totalamount, double Loantenureyears) {
		MonthlyEMI =Totalamount/ (Loantenureyears * 12) ;
		return MonthlyEMI;

	}

	void dislayloandeatils(double LoanAmount, double IntrestRate, int Loantenureyears) {
		System.out.println("*******LoanDetails******");
		System.out.println("customername : " + CustomerName);
		System.out.println("IntrestRate : " + IntrestRate + '%');
		System.out.println("LoanAmount : " + LoanAmount);
		System.out.println("LoanTenureYears : " + Loantenureyears + "years");
		System.out.println("simpleintrest :" + simpleintrest);
		System.out.println("intrest :" + intrest1);
		System.out.println("MonthlyEMI : " + MonthlyEMI);
		System.out.println("********print*********");

	}

	public static void main(String[] args) {
		LoanManagement L = new LoanManagement();

		L.CustomerName = "sai";
		L.IntrestRate = 2.00;
		L.LoanAmount = 100000;
		L.LoantenureYears = 4;
		L.Intrest(L.LoanAmount, L.IntrestRate, L.LoantenureYears);
	    L.TotalAmount(L.simpleintrest);
	    L.MonthlyEMI(L.intrest1, L.LoantenureYears);
	    L.dislayloandeatils(L.LoanAmount, L.IntrestRate, L.LoantenureYears);

	    LoanManagement L1 = new LoanManagement();

		L1.CustomerName = "prashanth";
		L1.IntrestRate = 1.50;
		L1.LoanAmount = 50000;
		L1.LoantenureYears = 2;
		L1.Intrest(L.LoanAmount, L.IntrestRate, L.LoantenureYears);
	    L1.TotalAmount(L.simpleintrest);
	    L1.MonthlyEMI(L.intrest1, L.LoantenureYears);
	    L1.dislayloandeatils(L.LoanAmount, L.IntrestRate, L.LoantenureYears);
	}

}

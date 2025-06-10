package Bank;

import java.util.Scanner;

public class AccntVerify extends Deposit  {
	static int total;
	static int balance;
	static int accntnumber;
	static String username;
	public void verify() {
		AccntVerify a2=new AccntVerify();
		AccntDetails a1= new AccntDetails();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the account number to verify.......");
		int accnt=sc.nextInt();
		System.out.println("*************************************************");
		setData(1234567891, 4500, "kannan");
		if (getaccntNo()==accnt) {
			System.out.println("the entered account number is verified");
			System.out.println("Username and the balance amount is");
			System.out.println("username: " +getuserName());
			System.out.println("Account balance: " +getaccntBalance());
			System.out.println("***********************************************");
			balance=getaccntBalance();
			accntnumber=getaccntNo();
			username=getuserName();
		}
		else 
		{
			System.out.println("enter valid account number");
		}	
	}
	public static void main(String[]args) throws InterruptedException {
		AccntVerify a2=new AccntVerify();
		Withdrawals w=new Withdrawals();
		a2.verify();
		a2.Deposit();
		a2.set_data();
		
		 w.withdrawals();
		 w.newdetails();
	  
	} 
}


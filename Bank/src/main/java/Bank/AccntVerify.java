package Bank;

import java.util.Scanner;

public class AccntVerify extends Deposit  {
	static int total;
	
	public static void main(String[]args) {
		AccntVerify a2=new AccntVerify();
		AccntDetails a1= new AccntDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the account number to verify.......");
		int accnt=sc.nextInt();
		System.out.println("*************************************************");
		a1.setData(1234567891, 4500, "kannan");
		if (a1.getaccntNo()==accnt) {
			System.out.println("the entered account number is verified");
			System.out.println("Username and the balance amount is");
			System.out.println("username: " +a1.getuserName());
			System.out.println("Account balance: " +a1.getaccntBalance());
			System.out.println("***********************************************");
	    total=a1.getaccntBalance()+a2.Deposit();
			
			System.out.println("deposit amount is " +total);

		}else {
			System.out.println("enter valid account number");
		}
	}

}


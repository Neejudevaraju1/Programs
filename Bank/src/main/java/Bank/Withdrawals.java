package Bank;

import java.util.Scanner;

public class Withdrawals {
	
	static String value;
	static int withdraw;
	static int remainingBalance;
	public void withdrawals() throws InterruptedException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawed !!!!!! ");
		withdraw= s.nextInt();
		System.out.println("The amount to be withdrawed is :" +withdraw);
	    takeAmount();
	    Balance();
	}
    public void takeAmount() throws InterruptedException {
    	System.out.println("Enter 'YES' if the entered amount is correct");
    	Scanner Y=new Scanner(System.in);
    	 value=Y.next();
    	if(value.equals("YES")) {
    		System.out.println("Processing........");
    		Thread.sleep(3000);
    		System.out.println("success");
    	}else {
    		System.out.println("Enter valid amount!!!!");
    	}
    }
    public void Balance() throws InterruptedException {
    	Thread.sleep(4000);
        remainingBalance=(Deposit.total-withdraw);
    	System.out.println("Account balance is ............"+remainingBalance);
    	
    }
    public void newdetails() {
    	AccntDetails a1=new AccntDetails();
    	a1.setData(AccntVerify.accntnumber, remainingBalance, AccntVerify.username);
    	System.out.println(a1.getaccntNo());
        System.out.println(a1.getaccntBalance());
        System.out.println(a1.getuserName());
    }
  
    }



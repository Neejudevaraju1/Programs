package Bank;

import java.util.Scanner;

public class Deposit extends AccntDetails  {
static int total;
	

public void Deposit() {
	
	Scanner s1=new Scanner(System.in);
	System.out.println("Amount to be deposited");
	int dep=s1.nextInt();
	System.out.println("*********************************************************");
	if(dep>=0) {
	total=(dep+AccntVerify.balance);
	System.out.println("Deposit success of amount " +total);
	}else {
		System.out.println("enter a valid amount");
	}
	
}
public void set_data() {
	AccntDetails a=new AccntDetails();
	setData(AccntVerify.accntnumber, total, AccntVerify.username);
	System.out.println("New balance is " +getaccntBalance());
}
}

package Bank;

import java.util.Scanner;

public class Deposit  {
int deposit;
int balance;	

public int Deposit() {
	
	Scanner s1=new Scanner(System.in);
	System.out.println("Amount to be deposited");
	int dep=s1.nextInt();
	System.out.println("*********************************************************");
	if(dep>=0) {
	deposit=(deposit+dep);
	}else {
		System.out.println("enter a valid amount");
	}
	return deposit;
}
}

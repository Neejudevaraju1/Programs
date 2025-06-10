package Assignment5;

import java.util.Scanner;

public class ClassPayDetails {
	int BasicPay;
	int Deduction;
	int Bonus;
public void basicPay() {
	System.out.println("Enter the basic pay");
	Scanner s= new Scanner(System.in);
	BasicPay=s.nextInt();
}
public void deductionInPay() {
	System.out.println("enter deduction amount");
	Scanner s1= new Scanner(System.in);
	Deduction=s1.nextInt();

}
public void bonus() {
	System.out.println("enter bonus amount");
	Scanner s2= new Scanner(System.in);
	Bonus=s2.nextInt();
}
}

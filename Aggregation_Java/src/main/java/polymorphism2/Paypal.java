package polymorphism2;

public class Paypal extends Payment {
String email;
Paypal(double amount,String email){
	super(amount);
	this.email=email;
}
void processPayment() {
	System.out.println("payment of amount "+amount +" is paid from email "+ email);
}
}

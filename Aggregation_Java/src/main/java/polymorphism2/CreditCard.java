package polymorphism2;

public class CreditCard extends Payment {
	String creditCard;
CreditCard(double amount,String cardno){
		super(amount);
		this.creditCard=cardno;	
	}
void processPayment() {
	System.out.println("payment of amount "+amount +" is paid from credit card no: "+creditCard);
}
}

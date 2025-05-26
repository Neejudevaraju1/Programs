package polymorphism2;

public class DebitCard extends Payment {
String debitcard;
DebitCard(double amount,String cardno){
	super(amount);
	this.debitcard=cardno;
}
void processPayment() {
	System.out.println("payment od amount "+amount +" is done from debit card no : "+debitcard);
}
}

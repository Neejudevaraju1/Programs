package polymorphism2;

public class Payment_main {

	public static void main(String[] args) {
		CreditCard cred = new CreditCard(25000,"4528-4589-2546-8759");
		Paypal pay =new Paypal(7500,"jason@gmail.com");
		DebitCard debit = new DebitCard(75000,"4569-5254-7462-5698");
		cred.processPayment();
		pay.processPayment();
		debit.processPayment();
	}

}

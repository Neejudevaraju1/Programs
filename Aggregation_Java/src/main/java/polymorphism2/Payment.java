package polymorphism2;

public abstract class Payment {
	double amount;
	Payment(double amount){
		this.amount=amount;
	}
	abstract void processPayment();

}

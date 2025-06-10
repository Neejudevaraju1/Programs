package Assignment4;

public class Factorial {

	int factorial=1;
	
	public void calculate(int num) {
		for (int i=num;i>=1;i--) {
			factorial=factorial*i;
		}
		print();
	}
	 public void print() {
		 System.out.println(factorial);
	 }
	
	
	public static void main(String[] args) {
	Factorial fact = new Factorial();
	fact.calculate(5);

	}

}

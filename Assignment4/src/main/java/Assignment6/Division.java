package Assignment6;

public class Division extends Addition{
	int result;
	public int Calculation() {
		super.Calculation();
		result= Total/10;
		System.out.println("The sum of two numbers is ==> "+Total);
		System.out.println("The result is ==>" +result);
		if(result>=1) {
			System.out.println("sum of the numbers is divisible by 10");
		}else {
			System.out.println("Sum of the numbers is not divisble by 10");
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		
		Division div = new Division();
	
		div.Calculation();

	}

}

package Assignment5;

public class Class_hra_pf extends ClassPayDetails{
	 int hra;
	 int pf;
	public void hraCalculation() {
		hra=BasicPay*5/100;
	}
   public void pfCalculation() {
	   pf=BasicPay*20/100;
   }
}

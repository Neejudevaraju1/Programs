package Assignment5;

public class TotalSalary extends Class_hra_pf{
int totalSalary;

public void totalSalary() {
	
	totalSalary=(BasicPay+hra-pf-Deduction+Bonus);
	
}
public void printPaySlip() {
	System.out.println("Basic pay :" +BasicPay);
	System.out.println("Deductions :" +Deduction);
	System.out.println("hra :" +hra);
	System.out.println("pf : " +pf);
	System.out.println("Bonus :" +Bonus);
	System.out.println("Total Salary : "+totalSalary);
}
	public static void main(String[] args) {
		TotalSalary salary= new TotalSalary();
		salary.basicPay();
		salary.bonus();
		salary.deductionInPay();
		salary.hraCalculation();
		salary.pfCalculation();
		salary.totalSalary();
		salary.printPaySlip();

	}

}


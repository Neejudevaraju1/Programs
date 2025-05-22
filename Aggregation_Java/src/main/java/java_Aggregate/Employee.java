package java_Aggregate;
//Aggregation using parameterized method
public class Employee {
	String EmpName;
	Company  comp;
	public void display(String name,Company c) {
		this.EmpName=name;
		this.comp=c;
		System.out.println(EmpName);
		System.out.println(comp.CompanyName);
		System.out.println(comp.Est_year);
	}

	public static void main(String[] args) {
		Company com=new Company();
		com.company("KRAN Consulting", 1994);
Employee em=new Employee();
em.display("SAI KRISHNA", com);
Employee em2 = new Employee();
System.out.println();
em2.display("KEERTHANA P", com);
	}

}

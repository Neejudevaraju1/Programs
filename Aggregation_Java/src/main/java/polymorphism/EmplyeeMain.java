package polymorphism;

public class EmplyeeMain {

	public static void main(String[] args) {
		FullTimeEmployee e1=new FullTimeEmployee("Rahul",15000);
PartTimeEmployee e2 = new PartTimeEmployee("jishnu",2000,90);
e1.display();
e2.display();
	}

}

package polymorphism;

public class PartTimeEmployee extends Employee{
 double hourlyrate;
 double workhr;
 PartTimeEmployee(String name,double rate,double hr){
	 super(name);
	 this.hourlyrate=rate;
	 this.workhr=hr;
 }
 double calculateSalary() {
	 return hourlyrate*workhr;
 }
}

package polymorphism;

public class FullTimeEmployee extends Employee {
double monthlySalary;
FullTimeEmployee(String name,double salary) {
	super(name);
	this.monthlySalary=salary;
}
double calculateSalary() {
	return monthlySalary;
}
}

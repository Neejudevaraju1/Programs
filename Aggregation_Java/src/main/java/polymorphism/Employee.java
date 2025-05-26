package polymorphism;

public abstract class Employee {
String name;
Employee(String name){
	this.name=name;
}
abstract double calculateSalary();
void display() {
	System.out.println("name of the emploee: "+name);
	System.out.println("salary of the employee: "+calculateSalary());
}
}

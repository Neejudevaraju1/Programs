package java_Aggregate;

public class Student {
String Sname;
int Rollno;
College college;
Department department;
Student(String name,int roll,Department department,College college){
	this.Sname=name;
	this.Rollno=roll;
	this.department=department;
	this.college=college;
}
void display() {
System.out.println("Name of the student is: "+Sname);	
System.out.println("Roll no of the student is: "+Rollno);
System.out.println("Department of the student is : "+department.Department);
System.out.println("Department id is: "+department.Dpt_ID);
System.out.println("HOD of the department is: "+department.HOD);
System.out.println("college name is : "+college.Cname);
System.out.println(college.Place);	
}
}

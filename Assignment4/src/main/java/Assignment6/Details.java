package Assignment6;

public class Details {
String name;
int rollNo;
public void setData(String name,int rollno) {
	this.name=name;
	this.rollNo=rollno;
}

public void getData() {
	System.out.println(name);
	System.out.println(rollNo);
}
}

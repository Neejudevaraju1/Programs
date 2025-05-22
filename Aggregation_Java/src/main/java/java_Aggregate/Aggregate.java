package java_Aggregate;

public class Aggregate {

	public static void main(String[] args) {
		College cg = new College("BARTON HILL","TRIVANDRUM");
		Department dp=new Department("MECHANICAL",465,"JOSEPH");
        Student s= new Student("henry",26,dp,cg);
        s.display();//first student
        System.out.println();
       Student s1=new Student("James",01,dp,cg);//object to call second student data
       s1.display();
       System.out.println();
       Department dp1=new Department("Civil engineering",466,"REKHA");//object for a different department
       Student s3=new Student("POOJA",03,dp1,cg);
       s3.display();
	}

}

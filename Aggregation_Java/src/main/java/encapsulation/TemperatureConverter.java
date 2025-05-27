package encapsulation;

public class TemperatureConverter {
private double celsius;
public void setdata(double celsius) {
	this.celsius=celsius;
}
public double getdata() {
	System.out.println("The temperature i celsius is : "+celsius);
	System.out.println("******************************************************");
	return celsius;
}
private double convertTemp() {
	System.out.println("Converting the temperature in celsius to farenheit");
	return(celsius*9/5)+32;
}
public void toFarenheit() {
	double Frenheit=convertTemp();
	System.out.println("******************************************************");
	System.out.println("The converted temperature is :" +Frenheit);
}
}

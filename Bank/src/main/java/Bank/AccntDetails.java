package Bank;

public class AccntDetails {
private int accntNum;
private int accntBalance;
private String userName;
public void setData(int accntno,int accntbalance,String name) {
	this.accntBalance=accntbalance;
	this.accntNum= accntno;
	this.userName=name;
}
public int getaccntNo() {
	return accntNum;
}
public int getaccntBalance() {
	return accntBalance;
}
public String getuserName() {
	return userName;
}
}

package Assignment6;

public class Address extends Details {
	
	String Address;
	public void setData(String address) {
		this.Address=address;
		
	}
	public void getData() {
		super.getData();
		System.out.println(Address);
	}
	

	public static void main(String[] args) {
		Address a=new Address();
		a.setData("Jason", 18);
		a.setData("House No:215, panampally nagar,ernakulam");
		a.getData();

	}

}

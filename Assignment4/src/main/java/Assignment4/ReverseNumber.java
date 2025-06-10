package Assignment4;

public class ReverseNumber {
int num;
int revNum;
ReverseNumber(int num){
	this.num=num;
	revNum=0;
    while(num!=0) {
    	revNum=revNum*10+(num%10);
    	num=num/10;
    }
   
}
ReverseNumber(){
	this(12335);
	 System.out.println(revNum);
}
public static void main(String[ ]args) {
	ReverseNumber r= new ReverseNumber();
	
}
}

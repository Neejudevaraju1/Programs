package Assignment4;

public class Palindrome {

	public void checkPalindrome(String str) {
		char[]arr= str.toCharArray();
		
		String revstring="";
		for(int i=arr.length-1;i>=0;i--) {
			revstring= revstring +arr[i];
		}
		if(revstring.equalsIgnoreCase(str)) {
			System.out.println("The entered string "+str+ " is palindrome");
		}else
		{
			System.out.println("The entered string " +str+ " is not palindrome");
		}
	}
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		Palindrome p1 = new Palindrome();
		p.checkPalindrome("malayalam");
		System.out.println();
        p1.checkPalindrome("java");
	}

}



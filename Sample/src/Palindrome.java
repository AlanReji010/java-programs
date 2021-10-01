import java.util.Scanner;
public class Palindrome {
	static void isPalindrome(String org) {
		String rev="";
		int length=org.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		if(org.equals(rev)) {
			System.out.println(org+" is a palindrome");
		}
		else {
			System.out.println(org+" is not a palindrome");
		}
	}
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any string or number:");
			String org=sc.nextLine();
			isPalindrome(org);
	    }
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

import java.util.Scanner;
public class Factorial {
	static int fact(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return (n*fact(n-1));
		}
	}
	public static void main(String[] args) {
	try {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int n=sc.nextInt();
		int f=fact(n);	
		System.out.println(f);
	
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
	
}

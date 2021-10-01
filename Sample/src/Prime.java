import java.util.Scanner;
public class Prime {
	
	static void isPrime(int n) {
		int i,m,flag=0;
		m=n/2;
		if(n==0||n==1) {
			System.out.println(n+"is not a prime number.");
		}
		else {
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n+" is not a prime number.");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n+" is a prime number.");
			}
		}
	}	
	public static void main(String[] args) {
		try {
			Scanner ob=new Scanner(System.in);
			System.out.println("Enter any number :");
			int n=ob.nextInt();
			isPrime(n);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
}
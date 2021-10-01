//Program to print all armstrong numbers in the given limit.
import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
	static boolean isArmstrong(int n) {
		int digits=0,sum=0,last=0,temp;
		temp=n;
		while(temp>0) {          //To find the count of digits in the number
			temp=temp/10;
			digits++;
		}
		
		temp=n;
		while(temp>0) {
			last=temp%10;
			sum+=(Math.pow(last,digits));
			temp=temp/10;
		}
		if(n==sum) 
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit upto which "
				+ "armstrong numbers should be printed");
		int num=sc.nextInt();
		System.out.println("The armstrong numbers upto "+num+" are :");
		for(int i=1;i<num;i++) {
			if (isArmstrong(i)) {
				System.out.print(i+",");
			}
			
				
		}
	}
}

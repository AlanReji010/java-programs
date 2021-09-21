import java.util.Scanner;
public class Right_triangle {
	public static void main(String[] args) {
		try {
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int size=sc.nextInt();
		
		for(i=0;i<size;i++) {
			for(j=i+1;j<size;j++) {
				System.out.print(" ");
			}
			for(k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}

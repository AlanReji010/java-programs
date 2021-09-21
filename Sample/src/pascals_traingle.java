import java.util.Scanner;

public class pascals_traingle {
	public static void main(String args[]) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any number: ");
			int size=sc.nextInt();
			int i,j;
			for(i=0;i<size;i++) {
				for(j=0;j<=i;j++) {
					System.out.print("*"+" ");
				}
				System.out.println();
			}
			for(i=size-1;i>0;i--) {
				for(j=i;j>0;j--) {
					System.out.print("*"+" ");
				}
				System.out.println();
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

import java.util.Scanner;
public class Pyramid {
	public static void main(String args[]) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any number: ");
			int size=sc.nextInt();
			int i,j,k;
			for(i=0;i<size;i++) {
				for(j=i;j<size;j++) {
					System.out.print(" ");
				}
				for(k=0;k<=i;k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

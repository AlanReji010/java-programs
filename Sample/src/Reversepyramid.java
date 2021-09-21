import java.util.Scanner;

public class Reversepyramid {
	public static void main(String args[]) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any number: ");
			int size=sc.nextInt();
			int i,j,k;
			for(i=0;i<size;i++) {
				for(j=i;j>0;j--) {
					System.out.print(" ");
				}
				for(k=i;k<size;k++) {
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

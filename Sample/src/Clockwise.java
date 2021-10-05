import java.util.Scanner;
public class Clockwise {
		static int[] returnarr(int nums[],int n,int k) {
			if (k>n) {
				k=k%n;
			}
			int ans[]=new int[n];
			
			for(int i=0;i<k;i++) {
				ans[i]=nums[n - k + i];
			}
			
			int index=0;
			for(int i=k;i<n;i++) {
				ans[i]=nums[index++];
			}
			
			return ans;
		}
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter value of N");;
			int N=sc.nextInt();
			int NUMS[]=new int[N];
			System.out.println("Enter the elements of n");
			for(int i=0;i<N;i++) {
				NUMS[i]=sc.nextInt();
			}
			System.out.println("Enter the value of K");
			int K=sc.nextInt();
			int ANS[]=returnarr(NUMS,N,K);
			for(int i=0;i<N;i++) {
				System.out.print(ANS[i]+" ");
			}
		}
}

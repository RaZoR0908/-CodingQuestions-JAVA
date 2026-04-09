package DSA;
import java.util.*;
public class AppearsOnce {
	public static int appear(int n,int[]arr) {
		Arrays.sort(arr);
		int result=0;
		for(int i=0;i<n;i++) {
			result^=arr[i];
			}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(appear(n, arr));
		sc.close();
	}

}

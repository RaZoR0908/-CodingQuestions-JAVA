package DSA;
import java.util.*;
public class MissingNumber {
	public static int missing(int n,int[]arr) {
		int sum=n*(n+1)/2;
		int actualsum=0;
		for(int i=0;i<arr.length;i++) {
			actualsum+=arr[i];
		}
		int missingNumber=sum-actualsum;
		return missingNumber;
	}
	 public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n-1];
		for(int i=0;i<arr.length;i++)
			arr[i]=scanner.nextInt();
		System.out.println(missing(n,arr));
		scanner.close();
	}

}

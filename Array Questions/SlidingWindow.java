//Sliding window array problem contiguous elements of array
import java.util.*;
public class SlidingWindow
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		int k=sc.nextInt();
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		
		for(int i=0;i<=n-k;i++){
			
		    int max=arr[i];
		    for(int j=i;j<i+k;j++){
		        if(arr[j]>max){
		            max=arr[j];
		        }
		    }
		    System.out.print(max+" ");
		}
		
		
		
		
		
	}
}

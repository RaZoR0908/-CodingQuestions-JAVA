/*Given an array of integers nums and a number target,
find all contiguous subarrays whose sum equals the target.
*/
import java.util.*;
public class SubArraySummationTarget
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int n=sc.nextInt();
	    int[]arr=new int[n];
	    for(int i=0;i<n;i++)
	    arr[i]=sc.nextInt();
	    int target=sc.nextInt();
	    
	    for(int i=0;i<n;i++){
	        int sum=0;
	        for(int j=i;j<n;j++){
	            sum+=arr[j];
	            if(sum==target){
	                for(int k=i;k<=j;k++){
	                    System.out.print(arr[k]+" ");
	                }
	                System.out.println();
	            }
	        }
	    }
		
	}
}

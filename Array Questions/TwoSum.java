package DSA;
import java.util.*;
/*	Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 */

public class TwoSum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int target=sc.nextInt();
	int n=sc.nextInt();
	
	int[]arr=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
	for(int i=0;i<n;i++) {
		int compliment =target-arr[i];
		if(map.containsKey(compliment)){
			System.out.println(map.get(compliment)+""+i);
		}
		else {
			map.put(arr[i],i);
		}
	
		}
	}

}


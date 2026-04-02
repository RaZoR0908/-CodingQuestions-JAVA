package SortingAlgorithms;
import java.util.*;
/*
 Pseudo code Bubble sort
 for(i=0 to i=n-2) This is for pass count 
    for(j=0 to j=n-2-i) This is responsible for swaps 
       if (arr[j]>arr[j+1]) 
         do swappp
 */
public class BubbleSort {
	public static int[] sort(int[]arr,int n) {
		for(int i=0;i<=n-2;i++) {
			for(int j=0;j<=n-2-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			       }
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int result []=sort(arr, n);
		for(int i=0;i<n;i++) {
			System.out.print(result[i]+" ");
		}
		
		sc.close();
	}
	

}

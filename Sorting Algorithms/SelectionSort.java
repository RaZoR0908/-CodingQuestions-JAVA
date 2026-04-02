package SortingAlgorithms;
import java.util.*;
/*
 Pseudo Code for Selection Sort
 for(i=0 to n-2) controls outer loop for the passes 
 for(j=i to n-1) here we find the smallest number from given range 
 swap that with the arr[i]
 */
public class SelectionSort {
	public static int[] sort(int arr[], int n) {
		for(int i=0;i<=n-2;i++) {
			int minIndex=i;
			for(int j=i;j<=n-1;j++) {
				if(arr[j]<arr[minIndex]){
					minIndex=j;
					}
				}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int [n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	    int [] result=sort(arr, n);
	    for(int i=0;i<n;i++) {
	    	System.out.print(result[i]+" ");
	    }
		sc.close();
	}


}

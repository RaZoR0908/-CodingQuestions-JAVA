package SortingAlgorithms;

import java.util.*;
/*
 Pseudo code 
 for(i=1 to i=n-1):
 key=arr[i]
 j=i-1
    while(j>=0 && arr[j]>key):
    arr[j+1]=arr[j]
 arr[j+1]=key
  */
public class InsertionSort {
	public static int[] sort(int[] arr, int n) {
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scanner.nextInt();
		int[] result=sort(arr, n);
		for(int i=0;i<n;i++) {
			System.out.print(result[i]+" ");
		}
	}

}

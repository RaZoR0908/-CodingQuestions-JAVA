import java.util.*;

public class SegregateEvenOdd {
	public static int [] evenOdd(int arr[]) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			//left even 
			if(arr[i]%2==0) {
				i++;
			}
            //right odd
			if(arr[j]%2!=0) {
				j--;
			}
            //swap if left odd and right even
			if(arr[i]%2!=0 && arr[j]%2==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			
			
			
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
		     arr[i]=sc.nextInt();
		}
		int[] result=evenOdd(arr);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
		
	}

}

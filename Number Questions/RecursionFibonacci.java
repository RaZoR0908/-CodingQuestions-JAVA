package DSA;
import java.util.*;

public class RecursionFibonacci {
	public static int Recur(int n) {
		//base cases 
		if(n==1) return 1;
		if(n==0) return 0;
		return Recur(n-1)+Recur(n-2);
	}
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n=sc.nextInt();
	 for(int i=0;i<n;i++) {
		System.out.print(Recur(i)+" ");
	 }
	 
	}

}

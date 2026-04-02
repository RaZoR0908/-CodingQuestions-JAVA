package DSA;
import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	     for(int i=0;i<n;i++) {
	    	System.out.print(a+" ");
	    	int next=a+b;
	    	a=b;
	    	b=next;
	    	}
	}

}

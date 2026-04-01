/*
 * Given two integers, a and b, your task is to determine the sum of the cubes of
all numbers in the range from a to b *
*/
import java.util.*;
public class CubeSum
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int cube=0;
	    for(int i=a;i<=b;i++){
	        cube+=i*i*i;
	        
	    }
	    System.out.println(cube);
		
	}
}

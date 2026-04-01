import java.util.*;
public class MoveZeros
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    int pos=0;
	    int n=sc.nextInt();
	    int[]arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	       }
	       for(int i=0;i<n;i++){
	           if(arr[i]!=0){
	               arr[pos]=arr[i];
	               pos++;
	           }
	           
	       }
	       for(int i=pos;i<n;i++){
	           arr[i]=0;
	       }
	       for(int i=0;i<n;i++){
	           System.out.println(arr[i]);
	       }

	           
	       }
	       
	       
	   }
	       



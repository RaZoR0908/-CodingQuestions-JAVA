import java.util.*;
public class CountPosNegZero
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int [n];
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}
	int countPos=0;
	int countNeg=0;
	int countZeo=0;
	for(int i=0;i<n;i++){
	    if(arr[i]>0){
	        countPos++;
	    }
	    else if (arr[i]<0){
	        countNeg++;
	    }
	    else if(arr[i]==0){
	        countZeo++;
	    }
	}
	System.out.println(countPos+" "+countNeg+" "+countZeo);
	}
}


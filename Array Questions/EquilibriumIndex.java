
import java.util.*;
public class EquilibriumIndex
{
    public static int equilibrium(int[]arr,int n ){
        for(int i=0;i<n;i++){
            int leftSum=0;
            int rightSum=0;
            
            for(int j=0;j<i;j++){
                leftSum+=arr[j];
            }
            for(int j=i+1;j<n;j++){
                rightSum+=arr[j];
            }
            if(leftSum==rightSum){
                return i;
            }
           
        }
        return -1;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int n=sc.nextInt();
	    int []arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	        
	    }
	    System.out.println(equilibrium(arr,n));
		
	}
}

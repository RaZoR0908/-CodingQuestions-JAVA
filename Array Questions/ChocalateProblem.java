import java.util.*;
public class ChocalateProblem
{
    public static int [] chocalate(int[]arr,int n){
        int pos=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[pos]=arr[i];
                pos++;
            }
           
        }
        for(int i=pos;pos<n;pos++){
            arr[i]=0;
        }
        return arr;
    }
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    int n=sc.nextInt();
	    int[]arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int result[]=chocalate(arr,n);
	    for(int i=0;i<n;i++){
	        System.out.print(result[i]+" ");
	    }
		
	}
}

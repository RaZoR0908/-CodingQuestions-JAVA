import java.util.*;
public class DistinctArray
{
    public static int[] distinct(int[] arr1,int[]arr2,int n,int m){
        int[]result=new int[n+m];
        int k=0;
        for(int i=0;i<n;i++){
            result[k]=arr1[i];
            k++;
         }
        for(int j=0;j<m;j++){
            boolean found=false;
            for(int i=0;i<k;i++){
                if(arr2[j]==result[i]){
                    found=true;
                    break;
                }
            }
                if(!found){
                    result[k]=arr2[j];
                    k++;
                }
           
        }
        Arrays.sort(result,0,k);
        return result;
    
        
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int[]arr1=new int[n];
	    int[]arr2=new int[m];
	    
	    for(int i=0;i<n;i++){
	        arr1[i]=sc.nextInt();
	    }
	    for(int j=0;j<m;j++){
	        arr2[j]=sc.nextInt();
	    }
	    
	  int arr3[]=  distinct(arr1,arr2,n,m);
	  for(int i=0;i<arr3.length;i++){
	      if(arr3[i]!=0)
	      System.out.print(arr3[i]+" ");
	  }
	    
	    
	
	}
}

import java.util.*;

public class RankReplace
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner (System.in);
	    int n=sc.nextInt();
	    int[]arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int temp[]=arr.clone();
	    Arrays.sort(temp);
	    HashMap<Integer,Integer> map=new HashMap<>();
	    int rank=1;
	    
	   for(int i=0;i<n;i++){
	       if(!map.containsKey(temp[i])){
	           map.put(temp[i],rank);
	           rank++;
	       }
	       
	   }
	   for(int i=0;i<n;i++){
	       System.out.print(map.get(arr[i])+" ");
	   }
	}
}

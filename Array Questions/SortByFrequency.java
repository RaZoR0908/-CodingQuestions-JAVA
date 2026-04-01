import java.util.*;

public class SortByFrequency
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int[]arr=new int[n];

		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}

		HashMap<Integer,Integer> map=new HashMap<>();

		for(int i=0;i<n;i++){
		    if(map.containsKey(arr[i])){
		        map.put(arr[i],map.get(arr[i])+1);
		    }
		    else{
		        map.put(arr[i],1);
		    }
		}

		while(!map.isEmpty()){

		    int maxFreq=0;
		    int maxKey=0;

		    for(Integer key : map.keySet()){
		        if(map.get(key)>maxFreq){
		            maxFreq=map.get(key);
		            maxKey=key;
		        }
		    }

		    for(int i=0;i<maxFreq;i++){
		        System.out.print(maxKey+" ");
		    }

		    map.remove(maxKey);
		}
	}
}
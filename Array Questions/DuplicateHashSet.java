package DSA;
import java.util.*;
public class DuplicateHashSet {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
	     arr[i]=sc.nextInt();
	HashSet<Integer> original = new HashSet<Integer>();
	HashSet<Integer> duplicate =new HashSet<Integer>();
	for(int i=0;i<n;i++) {
		if(original.contains(arr[i])) {
			duplicate.add(arr[i]);
		}
		else {
			original.add(arr[i]);
		}
	}
	System.out.print(duplicate);
		
	}
    

}

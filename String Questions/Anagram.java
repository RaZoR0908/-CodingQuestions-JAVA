package StringsQue;
//Check if two strings are anagram of each other
import java.util.*;
public class Anagram {
	public static boolean ana(String s1,String s2) {
		s1=s1.toLowerCase().replace(" ", "");
		s2=s2.toLowerCase().replace(" ", "");
		if(s1.length()!=s2.length()) {
			return false;
			}
		char array1[]=s1.toCharArray();
		char array2[]=s2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		if(Arrays.equals(array1, array2)) {
			return true;
		}
		return false;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean result= ana(s1, s2);
		if(result) {
			System.out.println("Aanagram");
			}
		else {
			System.out.println("not anagram");
		}
		}
}

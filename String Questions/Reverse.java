
package StringsQue;
import java.util.*;
//Check if a given string is palindrome or not


public class Reverse {
	public static boolean palindrome(String s) {
		String sc="";
		for(int i=s.length()-1;i>=0;i--) {
			sc=sc+s.charAt(i);
			}
		if(s.equals(sc)) {
			return true;
		}
		return false;
		}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		boolean result =palindrome(s);
		if(result) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		sc.close();
		
	}
	

}

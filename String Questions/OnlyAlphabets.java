package StringsQue;
//Remove characters from a string except alphabets
import java.util.*;

public class OnlyAlphabets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		StringBuilder result =new  StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z')) {
				result.append(ch);
			}
		}
		System.out.println(result);
	}

}

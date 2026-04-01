package StringsQue;
//Count number of vowels, consonants, spaces in String
import java.util.*;
public class CountCharacters {
	public static void main(String[] args) {
		int vowelcount=0;
		int consonantcount=0;
		int spacecount=0;
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelcount++;
            }
            else if(ch >= 'a' && ch <= 'z') {
                consonantcount++;
            }
            else if(ch == ' ') {
                spacecount++;
            }
       }
		System.out.println(vowelcount+" "+consonantcount+" "+spacecount);
	}

}

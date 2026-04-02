package StringsQue;
import java.util.*;
public class WordReverse {
	public static String[] reverse(String s) {
		return s.split(" ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] s2=reverse(s);
		
		for(int i=s2.length-1;i>=0;i--) {
			System.out.print(s2[i]+" ");
		}
	}

}

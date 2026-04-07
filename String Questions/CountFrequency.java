package StringsQue;
import java.util.*;
public class CountFrequency { 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<Character,Integer > map=new HashMap<Character, Integer>();
		String str =sc.nextLine();
		//str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
				}
			else {
				map.put(ch,1);
			}
			}
		while(!map.isEmpty()) {
			int maxfreq=0;
			char maxchar=' ';
			for(Character ch2 : map.keySet()) {
				if(maxfreq<map.get(ch2)) {
					maxfreq=map.get(ch2);
					maxchar=ch2;
					}
				}
			for(int i=0;i<maxfreq;i++) {
				System.out.print(maxchar+" ");
				}
			map.remove(maxchar);
			}
		}
	}

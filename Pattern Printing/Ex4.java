package Patterns;
/*
A
AB
ABC
ABCD
 */

public class Ex4 {
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
				}
			System.out.println();
			}
	}

}

package Patterns;
/*
****
***
**
*
 */
public class Ex2 {
public static void main(String[] args) {
	int i=4;
	int j=4;
	for(i=1;i<=4;i++) {
		for(j=4;j>=i;j--) {
			System.out.print("*");
		}
		System.out.println();
		}
	}
}

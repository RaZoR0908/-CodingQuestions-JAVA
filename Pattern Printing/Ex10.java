package Patterns;
/*
*******
 *****
  ***
   * 
   inverted pyramid  space=i-1 && star=2*(n-i)+1
 */
public class Ex10 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*(4-i)+1;j++) {
				System.out.print("*");
			}
		System.out.println();	
		}
		
		}
	}



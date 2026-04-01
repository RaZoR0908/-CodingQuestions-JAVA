package Patterns;
/*
A
BB
CCC
DDDD
 */
public class Ex12 {
  public static void main(String[] args) {
	  char ch='A';
	  for(int i=1;i<=4;i++) {
		  
		  for(int j=1;j<=i;j++) {
			  System.out.print(ch);
		  }
		  System.out.println();
		  ch++;
		  }
}

}

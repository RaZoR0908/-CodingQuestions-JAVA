import java.util.*;

public class TechNumber {
	
	static boolean myNum(int num ) {
		int original = num;
        int count =0;
        while(num>0)
{
    count++;
    num=num/10;
}
if (count%2!=0){
    return false;

}
int count2=count/2;
int power = (int ) Math.pow(10, count2);
int firstHalf = original/power;
int secondHalf = original%power;
int sum = firstHalf + secondHalf;
int square = sum*sum;

		if(square == original) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main (String[] args ) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println(myNum(num));
	}
}
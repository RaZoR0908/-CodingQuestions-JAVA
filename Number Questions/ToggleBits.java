import java.util.*;
public class ToggleBits
{
    public static int toggle(int num){
        int power=1;
        while(power<=num){
            power*=2;
        }
        int result=(power-1)-num;
        return result;
    }
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num=sc.nextInt();
	        System.out.println(toggle(num));
	    
		
	}
}

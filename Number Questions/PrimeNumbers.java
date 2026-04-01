import java.util.*;
public class PrimeNumbers
{   public static boolean prime(int num){
    boolean isPrime=true;
    if(num<=1){
        isPrime=false;
      
    }
    for(int i=2;i<=num/2;i++){
        if(num%i==0){
            isPrime=false;
            break;
        }
    }
    return isPrime;
}
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++){
		    if(prime(i)){
		        System.out.print(i+" ");
		    }
		    
	}

}
}
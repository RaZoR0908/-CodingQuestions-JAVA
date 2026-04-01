import java.util.*;
public class DigitToWords
{
	public static String words(int num){
	     String[] ones ={"","one","two","three","four","five","six","seven","eight","nine"
	};
	 String[]teens={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    String[]tens={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    if(num==0){
        return "zero";
    }
    String word="";
    //logic for 1000 and above
    if(num>=1000){
        word+=ones[num/1000]+ " thousand ";
        num=num%1000;
        
    }
    //logic for 100 and above
    if(num>=100){
        word+=ones[num/100]+" hundred ";
        num=num%100;
    }
    //logic for 20 to 90
    if(num>=20){
        word+=tens[num/10]+" ";
        num=num%10;
    }
    //logic for 10 and below 19
    if(num>=10 && num<=19){
        word+=teens[num-10]+" ";
        num=0;
    }
    //logic for 1 to 9
    if(num>0){
        word+=ones[num]+" ";
        
    }
    return word.trim();
	
	}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num = sc.nextInt();
	    int original=num;
	    int count=0;
	    while(num>0){
	        count++;
	        num=num/10;
	        
	    }
	    num=original;
	    if(count>4){
	        System.out.println("INVAILD");
	    }
	    else{
	        System.out.println(words(num));
	    }
	    
	
	}

}
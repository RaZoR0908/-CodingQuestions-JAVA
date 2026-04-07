import java.util.*;

public class LongestCommonPrefix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

        String arr[] = new String[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.next();
        }

        String prefix = "";

        for(int i = 0; i < arr[0].length(); i++)
        {
            char ch = arr[0].charAt(i);
            boolean match = true;

            for(int j = 1; j < n; j++)
            {
                if(i >= arr[j].length() || arr[j].charAt(i) != ch)
                {
                    match = false;
                    break;
                }
            }

            if(match)
                prefix += ch;
            else
                break;
        }

        if(prefix.length() == 0)
            System.out.println(-1);
        else
            System.out.println(prefix);
    }
}
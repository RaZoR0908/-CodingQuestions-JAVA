import java.util.*;

public class StringCount
{
    public static int starHash(String s)
    {
        int star = 0;
        int hash = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '*')
            {
                star++;
            }
            else if(s.charAt(i) == '#')
            {
                hash++;
            }
        }

        return star - hash;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(starHash(s));
    }
}
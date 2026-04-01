import java.util.*;

public class CountSundays
{
    public static int sunday(String day, int n)
    {
        int currentDay = 0;

        if(day.equals("mon")) currentDay = 1;
        else if(day.equals("tue")) currentDay = 2;
        else if(day.equals("wed")) currentDay = 3;
        else if(day.equals("thu")) currentDay = 4;
        else if(day.equals("fri")) currentDay = 5;
        else if(day.equals("sat")) currentDay = 6;
        else if(day.equals("sun")) currentDay = 7;

        int daysToSunday = 7 - currentDay;

        // If first Sunday not within n days
        if(daysToSunday >= n)
            return 0;

        int count = 1 + (n - daysToSunday - 1) / 7;

        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String day = sc.next();
        int n = sc.nextInt();

        System.out.println(sunday(day, n));
    }
}
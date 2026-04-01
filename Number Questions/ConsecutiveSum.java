import java.util.*;

public class ConsecutiveSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i < num; i++) {
            int sum = 0;

            for (int j = i; j < num; j++) {
                sum += j;

                if (sum == num) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(k + " ");
                    }
                    System.out.println(); // print only when sequence found
                    break;
                }

                if (sum > num) {
                    break; // optimization
                }
            }
        }
    }
}
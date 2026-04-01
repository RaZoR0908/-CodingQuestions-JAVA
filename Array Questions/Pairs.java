import java.util.*;

public class Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of pairs
        int[][] arr = new int[n][2];

        // Input pairs
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("Symmetric Pairs:");

        for (int i = 0; i < n; i++) {
            int a = arr[i][0];
            int b = arr[i][1];

            // Check reverse pair
            if (map.containsKey(b) && map.get(b) == a) {
                System.out.println("(" + b + ", " + a + ")");
            } else {
                map.put(a, b);
            }
        }
    }
}
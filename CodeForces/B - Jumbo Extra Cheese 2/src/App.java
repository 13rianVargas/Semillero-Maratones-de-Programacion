
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            long bases = 0;
            long max = 0;
            for (int j = 0; j < n; j++) {
                long x = sc.nextLong();
                long y = sc.nextLong();
                long small = Math.min(x, y);
                long big = Math.max(x, y);

                bases += small * 2;
                if (max < big)
                    max = big;// hmm

            }
            System.out.println(bases + max * 2);
        }
        sc.close();
    }
}
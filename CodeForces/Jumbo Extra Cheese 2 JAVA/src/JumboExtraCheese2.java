
import java.util.*;

public class JumboExtraCheese2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        for (int i = 0; i < tests; i++) {
            int cheeseSlices = sc.nextInt();

            long bases = 0;
            long max = 0;
            for (int j = 0; j < cheeseSlices; j++) {
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
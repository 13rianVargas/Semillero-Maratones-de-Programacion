import java.util.Scanner;

public class XD {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int sum = array[0];
        int sumMax = array[0];

        for (int i = 1; i < n; i++) {
            sum = Math.max(sum + array[i], array[i]);
            sumMax = Math.max(sumMax, sum);
        }

        System.out.println(sumMax);

        sc.close();
    }
}

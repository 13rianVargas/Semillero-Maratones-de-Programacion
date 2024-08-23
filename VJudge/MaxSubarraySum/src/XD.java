import java.util.Scanner;

public class XD {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array[] = new int[n];
        int sum = 0;
        int sumMax = 0;

        for (int i = 0; i < n; i++) {

            array[i] = sc.nextInt();
            sum += array[i];

            if (sumMax < sum) {
                sumMax = sum;
            } // todo bein

        }

        System.out.println(sumMax);

        sc.close();
    }
}

import java.util.Scanner;

public class MaxSubarraySum {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long x[] = new long[(int)n];

        for (int i = 0; i < n; i++) {
            x[i]= sc.nextLong();
        }

        long sum = x[0];
        long max = x[0];

        for (int i = 1; i < n; i++) {
            sum += x[i];
            if (x[i] > sum) {
                sum = x[i];
            }
            if(sum > max){
                max = sum;
            }
        }

        System.out.println(max);

        sc.close();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long array[] = new long[(int)n];

        for (int i = 0; i < n; i++) {
            array[i]= sc.nextLong();
        }

        long sum = array[0];
        long max = array[0];

        for (int i = 1; i < n; i++) {
            sum += array[i];
            if (array[i] > sum) {
                sum = array[i];
            }
            if(sum > max){
                max = sum;
            }
        }

        System.out.println(max);

        sc.close();
    }
}

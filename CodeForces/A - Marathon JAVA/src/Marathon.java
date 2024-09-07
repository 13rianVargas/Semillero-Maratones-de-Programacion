import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a, b, c, d;

            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();

            int cont = 0;

            if (b > a) {
                cont++;
            }
            if (c > a) {
                cont++;
            }
            if (d > a) {
                cont++;
            }
            System.out.println(cont);
        }
        sc.close();
    }
}

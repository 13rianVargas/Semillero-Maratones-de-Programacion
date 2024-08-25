import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String arr[] = new String[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.next();
            }
            String sol = resolver(n, m, arr);
            System.out.println(sol);
        }
        sc.close();
    }

    public static String resolver(int n, int m, String[] arr) {
        int x = m, y = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i].charAt(j) == 'R') {
                    if (j < x) {
                        x = j;
                    }
                    if (i < y) {
                        y = i;
                    }
                }
            }
        }
        if (arr[y].charAt(x) == 'R') {
            return "YES";
        } else {
            return "NO";
        }
    }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ent = new Scanner(System.in);

        int n = ent.nextInt();
        ent.nextLine();
        int X = 0;

        for (int i = 0; i < n; i++) {
            String d = ent.nextLine();

            char d1 = d.charAt(0);
            char d3 = d.charAt(2);

            if (d1 == '+' || d3 == '+') {
                X++;
            } else if (d1 == '-' || d3 == '-') {
                X--;
            }
        }

        System.out.println(X);

        ent.close();
    }
}
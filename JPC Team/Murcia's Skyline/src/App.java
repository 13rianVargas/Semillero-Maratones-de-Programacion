import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        int edif = sc.nextInt();

        int[] Largo = null;

        for (int i = 0; i < edif; i++) {
            Largo[i] = sc.nextInt();
        }

        int[] Ancho = null;

        for (int i = 0; i < edif; i++) {
            Ancho[i] = sc.nextInt();
        }

        sc.close();
    }

}
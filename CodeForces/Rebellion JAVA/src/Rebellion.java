import java.util.*;

public class Rebellion {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            Integer[] array = new Integer[l];
            for (int j = 0; j < l; j++) {
                array[j] = sc.nextInt();
            }

            int cont = 0;
            int p = 0;
            int u = l - 1;

            while (p < u) {
                if (array[p] == 1) {
                    if (array[u] == 0) {
                        p += 1;
                        u -= 1;
                        cont++;
                    } else {
                        u -= 1;
                    }
                } else {
                    p += 1;
                }
            } // cierra while

            System.out.println(cont);
        } // cierra for
        sc.close();
    }// cierra main
}// cierra class
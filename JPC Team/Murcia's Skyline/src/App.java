import java.util.*;

public class App {

    static Scanner sc = new Scanner(System.in);
    static int edificios;
    static int h[] = new int[edificios];
    static int w[] = new int[edificios];
    static int sumh = 0;
    static int sumw = 0;
    static int sumhMax = 0;
    static int sumwMax = 0;
    
    public static void main(String[] args) {

        int casos = sc.nextInt();
        testCases(casos);

        String incre = "";
        String decre = "";

        for (int i = 0; i < edificios; i++) {
            
        }

        

        sc.close();
    }

    public static void testCases (int casos) {
        if (casos  != 0) {
            edificios =  sc.nextInt();
            for (int i = 0; i < edificios; i++) {
                h[i] = sc.nextInt();
            }
            for (int i = 0; i < edificios; i++) {
                w[i] = sc.nextInt();
            }
        }else if (casos == 0) {

            for (int i = 0; i < edificios; i++) {
                sumh += h[i];
                if (sumhMax  < sumh) {
                    sumhMax = sumh;
                }
            }
            for (int i = 0; i < edificios; i++) {
                sumw += w[i];
                if (sumwMax  < sumw) {
                    sumwMax = sumw;
                }
            }
        }
        casos -= 1;
        testCases(casos);
    }


}
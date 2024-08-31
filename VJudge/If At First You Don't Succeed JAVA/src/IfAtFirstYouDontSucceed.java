import java.util.*;
public class IfAtFirstYouDontSucceed {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int N = sc.nextInt();

        if (C>A || C>B || (A+B-C)>=N) {
            System.out.println(-1);
        }else{
            int enCasa = N - (A+B-C);
            if (enCasa >= 1) {
                System.out.println(enCasa);
            }else{
                System.out.println(-1);
            }
        }
        sc.close();
    }
}

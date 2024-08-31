import java.util.*;

public class AClassicBinarySearch2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int Q = sc.nextInt();

        int array[] = new int[N];

        for(int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> dicc = new HashMap<>();

        for (int i = 0; i < N; i++) {
            if (!dicc.containsKey(array[i])) {
                dicc.put(array[i], i);
            }
        }
        
        for (int i = 0; i < Q; i++) {
            int target = sc.nextInt();
            if (dicc.containsKey(target)) {
                System.out.println(dicc.get(target));
            } else {
                System.out.println(-1);
            }
        }

        sc.close();
    }

}

import java.util.*;

public class AClassicBinarySearch1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int Q = sc.nextInt();

        int array[] = new int[N];

        for(int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            int target = sc.nextInt();
            int result = busqueda(array, target, N);
            System.out.println(result);
        }

        sc.close();
    }

    public static int busqueda(int array[], int target, int N){
        
        int min = 0;
        int max = N-1;
        int result = -1;

        while (min <= max) {
            int mid = min + (max - min) / 2;
            
            if (array[mid] == target) {
                result = mid;
                max = mid - 1;
            } else if (array[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }

        }
        
        return result;
    }
}

import java.util.*;

public class Editor {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        
        for (int t = 0; t < T; t++) {
        	
            String letras = sc.nextLine();
            int result = buscarRepetido(letras);
            System.out.println(result);
        	
        }

        sc.close();
    }
    
    private static boolean tieneRepetido(String letras, int len) {
    	
        int n = letras.length();
		HashSet<String> principal = new HashSet<>();
		
        for (int i = 0; i <= n - len; i++) {
        	
            String actual = letras.substring(i, i + len);
            
            if (principal.contains(actual)) {
                return true;
            }
            
            principal.add(actual);
        }
        
        return false;
    }

    private static int buscarRepetido(String letras) {
        int left = 1;
        int right = letras.length();
        int result = 0;

        while (left <= right) {
        	
            int mid = (left + right) / 2;
            
            if (tieneRepetido(letras, mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
		   
        }
        return result;
    }
}

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long cont = 1;
		while(true){
		
			int n = sc.nextInt();
			long m = sc.nextLong();
			long c = sc.nextLong();

			if (n == 0 &&  m == 0 && c == 0) {
				break;
			}
			
			// 
			
			long[] disp = new long[n];
			boolean[] onOff = new boolean[n];
			for (int i = 0; i < n; i++) {
				disp[i]=sc.nextLong();
				onOff[i]=false;
			}

			long sumParcial = 0;
			long sumMaxima = 0;
			boolean fail = false;
			for (int i = 0; i < n; i++) {
				
				int x = sc.nextInt();
				x--;
				if (!fail) {
					if (onOff[x]) {
						sumParcial -= disp[x];
						onOff[x] = false;
					}else{
						sumParcial += disp[x];
						onOff[x] = true;
						if (sumParcial > c) {
							fail = true;
						}
						if  (sumParcial > sumMaxima) {
							sumMaxima = sumParcial;
						}
					}
				}
			}

			//*/

			/*/
			HashMap<Integer, Integer> disp = new HashMap<>();
			for(int i = 1; i <= n ; i++){
				int x = sc.nextInt();
				disp.put(i,x);
			}
			
			ArrayList<Integer> oper = new ArrayList<>();
			int sumParcial=0;
			int sumMaxima=0;
			for(int i = 1; i <= m ; i++){
				int x = sc.nextInt();
				if(oper.contains(x)){
					sumParcial += disp.get(x);
					disp.put(x, (disp.get(x)*(-1)));
					if (sumParcial > c) {
						sumMaxima = sumParcial;
						break;
					}
					if (sumParcial > sumMaxima) {
						sumMaxima = sumParcial;
					}
				} else{
					oper.add(x);
					sumParcial += disp.get(x);
					disp.put(x, (disp.get(x)*(-1)));
					if (sumParcial > c) {
						sumMaxima = sumParcial;
						break;
					}
					if (sumParcial > sumMaxima) {
						sumMaxima = sumParcial;
					}
				}
			}
			//*/
			
			System.out.println("Sequence " + cont);

			if (fail/*/sumMaxima > c/**/) {
				System.out.println("Fuse was blown.");
			} else  /*/if(sumMaxima <= c)/**/{
				System.out.println("Fuse was not blown.");
				System.out.println("Maximal power consumption was " + sumMaxima + " amperes.");
			}
			System.out.println();
			cont-=-1;
		}
		sc.close();
	}
}
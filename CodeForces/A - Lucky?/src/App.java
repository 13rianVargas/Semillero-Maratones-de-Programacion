import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int t = ent.nextInt();
        for (int i = 0; i < t; i++) {
            String ticket = ent.next();
            int parte1 = (int) ticket.charAt(0) + (int) ticket.charAt(1) + (int) ticket.charAt(2);
            int parte2 = (int) ticket.charAt(3) + (int) ticket.charAt(4) + (int) ticket.charAt(5);
            String respuesta = (parte1 == parte2) ? "YES" : "NO";
            System.out.println(respuesta);
        }
        ent.close();
    }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Nova msg: " + variaMsgTexto());
        // int x = 2 + 3;
        // System.out.println(x);
    }

    public static String variaMsgTexto() {
        Scanner scan = new Scanner(System.in) ;
        System.out.println("Msg: ");
        String msg =  scan.nextLine(); // Lê um input de String
        return msg;
    }
}

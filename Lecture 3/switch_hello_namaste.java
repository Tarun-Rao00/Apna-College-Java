import java.util.Scanner;

public class switch_hello_namaste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Hello World!");
                break;
            case 2:
                System.out.println("Namaste World!");
                break;
            case 3:
                System.out.println("Bonjour World!");
                break;

            default:
                System.out.println("INVALID INPUT!");
                break;
        }
        sc.close();
    }
}

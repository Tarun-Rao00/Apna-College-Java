import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = num.nextInt();
        System.out.print("Enter second number: ");
        int b = num.nextInt();
        System.out.print("Enter operater: ");

        char c = num.next().charAt(0);

        switch (c) {
            case '+':
                System.out.println(a + b);

                break;

            case '-':
                System.out.println(a - b);

                break;
            case '*':
                System.out.println(a * b);

                break;
            case '/':
                System.out.println(a / b);

                break;

            default:
                System.out.println("INVALID INPUT!");
                break;
        }
        num.close();

    }
}

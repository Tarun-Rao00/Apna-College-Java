import java.util.Scanner;

public class which_one_is_greater {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(b + " is greater then " + a);

        } else if (a == b) {
            System.out.println(a + " is equal to " + b);
        }
        input.close();

    }

}

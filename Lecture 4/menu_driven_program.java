import java.util.Scanner;

public class menu_driven_program {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter your marks (Out of 100): ");
            int marks = num.nextInt();

            if (marks >= 90) {
                System.out.println("This is Good!");
            } else if (marks <= 89 && marks >= 60) {
                System.out.println("This is also Good!");
            } else if (marks >= 0 && marks <= 59) {
                System.out.println("This is good as well!");
            } else {
                System.out.println("INVALID INPUT!");
            }

            System.out.print("Enter 1(if you want to continue) or 0(if you want to stop): ");
            n = num.nextInt();

        } while (n == 1);
        num.close();
    }
}

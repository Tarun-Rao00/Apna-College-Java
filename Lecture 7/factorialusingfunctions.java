import java.util.Scanner;

public class factorialusingfunctions {
    public static int calculateFactorial(int n) {

        int fac = 1;

        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }

        return fac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        System.out.println("Factorial of " + x + " is " + calculateFactorial(x));

        sc.close();
    }
}

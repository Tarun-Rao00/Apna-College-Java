import java.util.Scanner;

public class pascal_triangle {
    public static int calculateFactorial(int n) {

        int fac = 1;

        if (n == 0) {
            fac = 1;
        } else {

            for (int i = 1; i <= n; i++) {
                fac = fac * i;
            }
        }

        return fac;
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Height: ");
        int h = num.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                int x = calculateFactorial(i) / (calculateFactorial(i - j) * calculateFactorial(j));
                System.out.print(x + " ");
            }

            System.out.println();
        }

        num.close();
    }
}

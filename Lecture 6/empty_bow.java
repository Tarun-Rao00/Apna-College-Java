import java.util.Scanner;

public class empty_bow {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Height: ");
        int h = num.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h * 2; j++) {
                if (j == 1 || j == i || j == i || j == h * 2 || j == h * 2 - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = h; i >= 1; i--) {
            for (int j = 1; j <= h * 2; j++) {
                if (j == 1 || j == i || j == i || j == h * 2 || j == h * 2 - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        num.close();
    }
}

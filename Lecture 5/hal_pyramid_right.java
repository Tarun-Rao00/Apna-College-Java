import java.util.Scanner;

public class hal_pyramid_right {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Height: ");
        int h = num.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int k = h-i; k >= 1; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        num.close();
    }
}

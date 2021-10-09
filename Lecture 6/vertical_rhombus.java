import java.util.Scanner;

public class vertical_rhombus {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Height: ");
        int h = num.nextInt();

        for (int i = 1; i <= h; i++) {


            for (int j = 1; j <= h - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int x =h;

        for (int i = 1; i <= h; i++) {

            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= h - i +1; j++) {
                System.out.print("* ");
            }
            for (int j = x-1; j >=1; j--) {
                System.out.print("* ");
            }
            x--;
            System.out.println();
        }

        num.close();
    }
}

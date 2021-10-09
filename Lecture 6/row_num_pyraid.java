import java.util.Scanner;

public class row_num_pyraid {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Height: ");
        int h = num.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        num.close();
    }
}

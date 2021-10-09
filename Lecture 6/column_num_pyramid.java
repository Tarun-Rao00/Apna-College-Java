import java.util.Scanner;

public class column_num_pyramid {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Height: ");
        int h = num.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }

        num.close();
    }
}

import java.util.Scanner;

public class num_pyramid_counting {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Height: ");
        int h = num.nextInt();

        int k = 1;

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(k + " ");
                k++;
            }

            System.out.println();
        }

        num.close();
    }
}

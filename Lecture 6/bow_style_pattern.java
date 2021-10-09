import java.util.Scanner;

public class bow_style_pattern {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Height: ");
        int h = num.nextInt();
        int m = h/2;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // for (int j = k; j >=0; j= j-2) {
            //     System.out.print("  ");
            // }

            for(int j=1; j<=h-2; j++){
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
            h=h-2;
        }
        int k = 0;
        for (int i = m; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            // for (int j = k; j >=0; j= j-2) {
            //     System.out.print("  ");
            // }

            for(int j=1; j<=k; j++){
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print("* ");

            }
            System.out.println();
            k=k+2;
        }

        num.close();
    }
}

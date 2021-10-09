import java.util.Scanner;

public class rohmbus {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Height: ");
        int h = num.nextInt();

        for(int i=1; i<=h; i++){
            for(int j=1; j<=h-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=h; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        num.close();
    }
}

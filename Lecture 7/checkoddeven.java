import java.util.Scanner;

public class checkoddeven {
    public static void checkEvenOdd(int n) {

        if (n % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        checkEvenOdd(x);

        sc.close();
    }

}

import java.util.Scanner;

public class que2 {
    public static int oddSum(int n){
        int sum = 0;

        for(int i=1; i<=n; i=i+2){
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = num.nextInt();

        System.out.println("Odd Number's sum till " + x + " is " + oddSum(x));

        num.close();
    }
}

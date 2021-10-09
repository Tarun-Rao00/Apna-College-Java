import java.util.Scanner;

public class sum_of_first_n_numbers {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number:");

        int n = num.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println(sum);

        num.close();
    }
}

import java.util.Scanner;

public class table_of_input_num {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = num.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(n + " x " + i + " = " + n * i);

        }
        num.close();
    }
}
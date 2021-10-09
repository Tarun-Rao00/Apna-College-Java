import java.util.Scanner;

public class multiplyusingfunctions {
    public static int calculateProduct(int a, int b){
        int mul = a*b;
        return mul;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int mul = calculateProduct(a, b);

        System.out.println("Product of above two numbers is: " + mul);

        sc.close();
    }
}

import java.util.Scanner;

public class que1 {
    public static int getAverage(int a, int b, int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = num.nextInt();
        System.out.print("Enter number2: ");
        int y = num.nextInt();
        System.out.print("Enter number3: ");
        int z = num.nextInt();

        System.out.println("Average of these three numbers is --: " + getAverage(x, y, z));

        num.close();
    }
}

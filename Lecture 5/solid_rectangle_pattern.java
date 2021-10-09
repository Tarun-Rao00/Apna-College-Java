import java.util.Scanner;

public class solid_rectangle_pattern {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Height: ");
        int h = num.nextInt();
        System.out.print("Enter Breadth: ");
        int b = num.nextInt();

        for(int i = 0; i<h; i++){
            for(int j = 0; j<b; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        num.close();
    }
}

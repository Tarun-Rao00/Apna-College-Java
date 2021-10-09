import java.util.Scanner;

public class num_pyramid_left_1n0 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Height: ");
        int h = num.nextInt();



        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2==0){
                System.out.print(1 + " ");
                }else {
                    System.out.print(0 + " ");
                }
            }

            System.out.println();
        }

        num.close();
    }
}

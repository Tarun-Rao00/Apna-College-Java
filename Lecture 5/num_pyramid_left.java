import java.util.Scanner;

public class num_pyramid_left {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Height: ");
        int h = num.nextInt();
        
        for(int i=1; i<=h; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        num.close();
    }
}

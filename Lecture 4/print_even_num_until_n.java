import java.util.Scanner;

public class print_even_num_until_n {
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = num.nextInt();


        for(int i = 0; i <= n; i++){
            if(i%2==0){
                System.out.print(i + ", " );
            }
        }

        num.close();
    }
}

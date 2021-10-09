import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("You entered an EVEN number!");

        }else{
            System.out.println("You entered an ODD number!");
        }

        sc.close();

    }
    
}

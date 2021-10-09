import java.util.Scanner;

public class checkprimeusingfunctions {
    public static void checkPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                System.out.println("NOT A PRIME!");
                break;
            }
            if(n%i!=0){
                System.out.println("PRIME");
                break;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        checkPrime(x);

        sc.close();
    }
}
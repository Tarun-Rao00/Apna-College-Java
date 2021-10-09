import java.util.Scanner;

public class ifandelse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You are an adult.");
        }
        else{
            System.out.println("You are NOT an adult.");
        }

        sc.close();

    }
    
}

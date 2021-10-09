import java.util.Scanner;

public class namearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String names[] = new String[5];

        for(int i =0; i<5; i++){
            
            System.out.print("Enter name " + (i+1) + " : ");
            names[i] = sc.next();
        }

        System.out.println("Entered names are:");

        for(int i =0; i<5;i++){
            System.out.println(names[i]);
        }

        sc.close();
    }
}

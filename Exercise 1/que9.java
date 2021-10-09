import java.util.Scanner;

public class que9 {
    // public static int commonDivisor(int a, int b) {

    // int cd = 0;

    // if(a>b){
    // for(int i =1; i<=b; i++){
    // if(b%i==0){
    // return i;
    // }
    // }
    // }else{
    // for(int i =1; i<=a; i++){
    // if(a%i==0){
    // return i;
    // }}
    // cd = i;
    // return cd;

    // }

    // public static void main(String[] args) {
    // Scanner num = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // int x = num.nextInt();
    // System.out.print("Enter number2: ");
    // int y = num.nextInt();

    // int u = commonDivisor(x, y);

    // System.out.println("The greatest common divisor is: " + u);

    // num.close();
    // }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : " + n2);

        sc.close();

    }
}
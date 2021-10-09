import java.util.*;

public class variables {
    public static void main(String[] args) {

        // String name = "Tony Stark";
        // int age = 48;
        // double price = 25.25;
        // int a = 25;
        // int b = 10;

        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(price);
        // System.out.println(a);
        // System.out.println(b);

        String name = "Tarun";
        int age = 18;
        byte pocket_money = 50;
        short budget = 5000;
        long num_of_hairs = 1000000000000000l;
        float version = 2.0f;
        double version2 = 2.03055503;


        System.out.println(name);
        System.out.println(age);
        System.out.println(pocket_money);
        System.out.println(budget);
        System.out.println(num_of_hairs);
        System.out.println(version);
        System.out.println(version2);


        //==========================================================================================================================================================


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        int r = sc.nextInt();

        double pi = 3.1415926535897;
        
        double ar = pi*r*r;

        double pr = 2*pi*r;
        
        System.out.println("Area of the circle is:" +ar);
        System.out.println("Perimeter of the circle is:" +pr);

        //===========================================================================================================================================================

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc1.nextInt();

        System.out.println(num +" x 1 = " +(num*1));
        System.out.println(num +" x 2 = " +(num*2));
        System.out.println(num +" x 3 = " +(num*3));
        System.out.println(num +" x 4 = " +(num*4));
        System.out.println(num +" x 5 = " +(num*5));
        System.out.println(num +" x 6 = " +(num*6));
        System.out.println(num +" x 7 = " +(num*7));
        System.out.println(num +" x 8 = " +(num*8));
        System.out.println(num +" x 9 = " +(num*9));
        System.out.println(num +" x 10= " +(num*10));

        sc1.close();
        sc.close();
    }
    
}
  
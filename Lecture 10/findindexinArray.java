import java.util.Scanner;

public class findindexinArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Now enter " + size + " numbers.");

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number you want to search for: ");
        int x = sc.nextInt();

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                System.out.println(x + " found at the index: " + i);
            }
        }

        sc.close();
    }
}

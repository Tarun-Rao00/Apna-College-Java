import java.util.Scanner;

public class checkarraysorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("----Enter 5 numbers----");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (i + 1 == arr.length) {
                System.out.println("The array is sorted in ascending order");
                break;
            }
            if (arr[i] < arr[i + 1]) {
                continue;
            } else {
                System.out.println("The array is not sorted in ascending order");
                break;
            }
        }
        sc.close();
    }
}

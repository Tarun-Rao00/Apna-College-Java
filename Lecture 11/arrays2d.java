import java.util.Scanner;

public class arrays2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        System.out.println("=====Enter the values=====");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the value for index (" + i + "," + j + "): ");
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();
    }
}
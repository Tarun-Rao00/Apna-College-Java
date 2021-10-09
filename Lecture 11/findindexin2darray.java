import java.util.Scanner;

public class findindexin2darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][4];

        for(int i = 0; i<3; i++){
            for(int j=0; j<4; j++){
                arr[i][j] = sc.nextInt();

            }
        }

        System.out.print("Enter the value of which index you want to find: ");
        int x = sc.nextInt();

        for(int i = 0; i<3; i++){
            for(int j=0;j<4;j++){
                if(arr[i][j]==x){
                    System.out.println(x + " is present at index (" + i + "," + j +")");
                }
            }
        }
        sc.close();
    }
}

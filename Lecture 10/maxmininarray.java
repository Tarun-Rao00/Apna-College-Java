import java.util.Arrays;

public class maxmininarray {
    public static void main(String[] args) {
        int arr[] = {1,5,34,8,3,745,3,6,0,677,54};

        Arrays.sort(arr);

        System.out.println("The samllest number in array is: " + arr[0]);
        System.out.println("The greatest number in array is: " + arr[arr.length-1]);


    }
}

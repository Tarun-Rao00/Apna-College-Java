import java.util.Scanner;

public class hollow_rohmbus {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Height: ");
        int h = num.nextInt();

        for(int i=1; i<=h; i++){
            for(int j=1; j<=h*2-1; j++){
               if(j+i==2*h || j==h-i+1 || (i==1&&j>h) || (i==h&&j<h)){
                System.out.print("* ");
            }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            }
            
            
            num.close();
        }

    }



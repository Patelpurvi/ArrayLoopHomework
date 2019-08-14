

//21.	Display right angle triangle of @ using nested for loops
import java.util.Scanner;

public class RightAngleTriangle {

    public static void main(String[]args){
        int i;
        int j;
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of Rows : ");
            n = scanner.nextInt();

            for (i= 1; i<= n; i++){

                System.out.printf("\n");


                for (j = 1; j<=i; j++)
                    System.out.printf("@");

                System.out.printf("\n ");}




            }


    }






//12.	WAP to enter any String and count how many total number of words
// and total number of spaces in that sentence
import java.util.Scanner;
public class ArmstrongNumberOrNot {
    public static void main(String [] args){


        int i=1,a;
        int arm = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scanner.nextInt();
        int number = n;

            while (n > 0) {
                a = n % 10;
                n = n / 10;
                arm= arm + (a * a * a);
            }
            if (number == arm)
                System.out.printf("\n It is a Armstrong number : " );
            else{
                System.out.println(" It is not a Armstrong number : " );
            }




        }
     }












//14.	WAP to input any five digit number then count total no of odd and even digit and find sum of them

import java.util.Scanner;

public class OddEvenAndSum {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int number, i, evensum = 0, oddsum = 0;


        System.out.println(" Please Enter any Number : ");
        number = scanner.nextInt();

        for(i = 1; i <= number; i++)
        { if(i % 2 == 0)
            { evensum = evensum + i; }
            else
            { oddsum = oddsum + i; }
        }
        System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evensum);
        System.out.println("\n The Sum of Odd Numbers upto " + number + "  =  " + oddsum);


    }
}

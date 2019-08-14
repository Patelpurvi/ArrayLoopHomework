
//15.	WAP to input any five digit number and then reverse the number

import java.util.Scanner;
public class ReverseNumber {
    public static void main (String [] args){
        int num = 0;
        int reverse = 0;


        System.out.printf("Enter the Five Number Digit for Reverse\n");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        while(num!= 0){
            reverse = reverse*10;
            reverse =reverse + num%10;
            num = num/10;}
        System.out.printf("Reverse of Entered number is = %d\n", reverse);


        }




    }


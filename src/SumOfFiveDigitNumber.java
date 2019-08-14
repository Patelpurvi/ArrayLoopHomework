
//13.	WAP to input any five digit number and then find sum of each digit

import java.util.Scanner;

public class SumOfFiveDigitNumber {


    static int allsum(int n) {

        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;}
            return sum;
        }
        public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five Digit number");
        int n = scanner.nextInt();

        System.out.println("Sum of the All number: " +" "+ allsum(n));


        }
    }


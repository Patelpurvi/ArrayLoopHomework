
//17.	WAP to input any number and check if it is Palindrome or not
import java.util.Scanner;

public class PalindromeOrNot {

    public  static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a Number:");
    int n = scanner.nextInt();
    int sum = 0;
    int r;
    int temp = n;
    while(n>0){
        r = n % 10;
        sum = (sum*10)+r;
        n = n/10;}
    if (temp == sum)
        System.out.println("It is a Palindrome number");
        else
            System.out.println("Not a Palindrome number");

    }
}


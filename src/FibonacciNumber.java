
//20.	Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) – limitation is n

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String [] args){
        int n1=0,n2 = 1, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many Fibonacci number you want : ");
        int a = scanner.nextInt();
        System.out.print(n1+" "+n2);
        for(int i=0; i < a; ++i)
        {
           b =n1+n2;
            System.out.print(" "+b);
            n1=n2;
            n2=b;
        }
    }
}

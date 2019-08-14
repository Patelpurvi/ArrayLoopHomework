
//2.	Write a Java program to sum values of an array.
import java.util.Scanner;

public class SumValueOfArray {
   public static void main(String[] args) {


       //int a[] = {50, 60, 70, 80, 55, 65}//int  b = 0;
       //for (int i : a){
       //b += i;
      // System.out.println("The Sum is:" +  b);}

      Scanner scanner = new Scanner(System.in);

       System.out.println("Enter the value for array length:");
       int b = scanner.nextInt();

       //array
       int a[] = new int[b];
       int sum = 0;

       for (int i = 0; i <a.length ; i++) {
           System.out.println("Enter  the value");
            a[i] = scanner.nextInt();
           sum= sum + a[i];
           // z = a[i];
           // sum= sum+ a[i];

       }
       System.out.println("Total sum is:" + sum);

   }}




      //  }

        //int a[] = {50, 60, 70, 80, 55, 65};
        //int sum = 0;
        //for (int i : a)
        //  sum += i;
        //System.out.println("The Sum is:" + sum);

    ///}}


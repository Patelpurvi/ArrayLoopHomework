
//3.	Write a Java program to test if an array contains a specific value.
import java.util.Scanner;

public class SpecificValue {
    public static void main(String []args) {
        int[] a = { 50, 60, 70, 80, 55, 65};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  the value");
        int c = scanner.nextInt();
       int i;
        for ( i = 0; i <a.length; i++ ) {
            if (a[i] == c) {
                System.out.println("Value of Array and position of index"+ " " +  i);
            }
        }
        if(i!= c)
        { System.out.println("Invalid Value Of Array");
    }}
       // int a[] = {100, 60, 70, 80, 55, 65};
        //int b = a[5];
        //for (int i = 0; i <=5; i++)

          //  if (b == a[i])
              //  System.out.println("the value of the Array" + "  " + a[i]);

    }









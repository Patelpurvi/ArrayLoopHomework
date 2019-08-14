
//4.	Write a Java program to find the index of an array element.


import java.util.Scanner;

public class IndexOfElement {
    public static void main(String[] args) {
        int c = 0;
        int[] a = { 40,30,80,90,70,100};

        Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the Elements from the Array list");
         c = scanner.nextInt();
         for (int i = 0; i <=5 ; ++i)
             if (c == a[i] ){

                 System.out.println("The position of element " + c + " is at Index "  +   i  );}
             }



    }






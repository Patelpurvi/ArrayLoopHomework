
//19.	Write a program in Java to display n limit of natural numbers and their sum.
//Expected Output :
//The first n natural numbers are : 1 2 3 4 5 6 7
//The Sum of Natural Number upto n limit : 28

import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main (String [] args){
int sum = 0;
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter Natural Number : ");
        int a = scanner.nextInt();
        System.out.println("Input the number : " +a);

//
      for(int i = 1; i <=a; i++ ) {

          System.out.println(i);
          sum = sum+i;}

          System.out.println("Total of natural numbers : " +sum);


      }


    }




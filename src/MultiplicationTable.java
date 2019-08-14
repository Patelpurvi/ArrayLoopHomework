
//22.	Write a program in Java to display the multiplication table of a given integer.
  //      For eg:
    //    Input the number (Table to be calculated) : Input number of terms : 5 Expected Output :
      //  5 X 0 = 0
        //5 X 1 = 5
        //5 X 2 = 10
        //5 X 3 = 15
        //5 X 4 = 20
        //5 X 5 = 25


import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String [] args){


        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number for Multiplication: ");
        { System.out.print("Input number : ");
            int j = scanner.nextInt();
            System.out.println("\n");
            for (int i = 0; i <= j; i++) {
                System.out.println(j + " X " + i + " = " + j * i);
            }
        }

        



    }


}

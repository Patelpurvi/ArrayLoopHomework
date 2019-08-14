
//10.	Write a 2-D array .. and WAP to transpose a matrix.. (row value should be transposed to column and column value
// should be printed in row) 
import java.util.Scanner;

public class TransposeMatrix {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the number of Row (1-10):");
        //int row = scanner.nextInt();
        //System.out.println("Enter the number of Column (1-10):");
        //int column = scanner.nextInt();
        //int [] [] matrix = new int[row][column];
        //for (row = 0; row<matrix.length; row++);
        // for (column = 0; column<matrix.length; column++);
        //System.out.println("\noriginal matrix:");

        int i;
        int j;

        int[][] matrix = {{10 , 20 , 30 } , { 50 , 60 , 70 } , { 90 , 100 , 101 }};
        for (i = 0; i <3; i++) {

            for (j = 0; j <3; j++)

                 System.out.print( matrix [i]  [j] ) ;


                System.out.println("    ");}

        }

    }








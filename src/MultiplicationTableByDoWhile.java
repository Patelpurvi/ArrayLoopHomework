
//18.	Printing multiplication table using do while loop
//1 2 3
//2 4 6
//3 6 9

import java.util.Scanner;

public class MultiplicationTableByDoWhile {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
                System.out.println("please enter upto which you want to print multiplication table of ");
                int n= scanner.nextInt();
                System.out.println("please enter upto where you want to muliply to");
                int t = scanner.nextInt();
                int i=1;
                int k=1;
                do
                {
                    do
                    {
                        System.out.print((k*i)+" ");
                        k++;
                    }while(k<=t);
                    k=1;
                    System.out.println();
                    i++;
                }while(i<=n);
            }
        }






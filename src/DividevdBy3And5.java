
//23.	WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately

import java.util.Scanner;

public class DividevdBy3And5 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Input any number between 1 to 100 which Divided By 3 :");
        int i = scanner.nextInt();
        for( i = 1; i<100; i++){
            if (i % 3 == 0){
                System.out.print(i+",");}}
        System.out.println("\n\nInput any number between 1 to 100 which Divided By 5 :");
         i = scanner.nextInt();
                for(i = 1; i<=100; i++){
                if( i % 5 == 0){
                    System.out.print (i+",");}
                }


        }

    }


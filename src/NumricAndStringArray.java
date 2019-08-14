
//1.	Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class NumricAndStringArray {

    public static void main(String[] args){
        //Creating  String array

        String[] surname = {"Patel","Shah","Barot","Kothari","Rabari"};

        System.out.println("Original String Array"+Arrays.toString(surname));
        //after the sorting string
        Arrays.sort(surname);
        System.out.println("Sorted String Array"+Arrays.toString(surname));


        //Creating numeric array
        int[] a = {15,98,65,5,23};

        System.out.println("Original Numeric Array"+Arrays.toString(a));
        //after the sorting numeric
        Arrays.sort(a);
        System.out.println("Sorted Numeric Array"+ Arrays.toString(a));



    }
}

//7.	Write a Java program to find the duplicate values of an array of integer values

public class DuplicateValue {
    public static void main (String [] args){

        int a [] = {25,63,25,9,58,7,9,63,57};
        for(int i = 0; i<a.length; i++ )
            for( int j = 0; j < a.length; j++)

                if((a[i] == a[j]) && (i != j)){
                    System.out.println("Duplicate Elements :"+ " " + a[j]);}

            }
        }






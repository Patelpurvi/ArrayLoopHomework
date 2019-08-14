
//9.	Write a Java program to test the equality of two arrays. 
import java.util.Arrays;

public class TestOfEquility {
    public static void main(String[] args) {


        int arr[] = {10, 20, 30, 40, 50};
        int arr1[] = {60, 70, 80, 90, 100};
       int arr2[] = {10, 20, 30, 40, 50};

        boolean equalOrNot = true;
       if(arr.length == arr1.length){
           for( int i =0; i < arr.length; i++)
               if(arr[i] != arr1[i]){
                   equalOrNot = false;}
           else {equalOrNot = false;}

           if(equalOrNot) {
               System.out.println("Array Looks Equal");
           }
                  else System.out.println("Arrays Not Equal");

           if(arr.length == arr2.length){
               for( int i =0; i < arr.length; i++)
                   if(arr[i] != arr2[i]){
                       equalOrNot = true;}
                   else {equalOrNot = true;}


               if(equalOrNot) {
                   System.out.println("Array Looks Equal");
               }
               else System.out.println("Arrays Not Equal");

               }


       }
    }}







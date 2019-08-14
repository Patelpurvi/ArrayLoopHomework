
//6.	Write a Java program to reverse an array of integer values. 
import java.util.Arrays;

public class IntegerValue {
    public static void main(String [] args){

        int a[] = {10,20,30,40,50,60,70,80,90};
        System.out.println("Original Array : "+ Arrays.toString(a));
        for (int i = 0; i<a.length /2; i++) {

            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
            System.out.println("Reverse value : " + Arrays.toString(a));

        }



    }
}

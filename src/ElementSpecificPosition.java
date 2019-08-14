
//5.	Write a Java program to insert an element (specific position) into an array.
import java.util.Arrays;

public class ElementSpecificPosition {

    public static void main(String[] args) {
        int[] a = {50, 60, 70, 80, 55, 65};
        int b = 3;
        int c = 15;
        System.out.println("Original Array Value" + " " + Arrays.toString(a));

        for (int i = a.length - 1; i > b; i--)
            a[i] = a[i - 1];
        a[b] = c;
        System.out.println("New Array" + " " + Arrays.toString(a));
    }





    }


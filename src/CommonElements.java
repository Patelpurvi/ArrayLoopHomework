

//8.	Write a Java program to find the common elements between two arrays (string values) 
public class CommonElements {

    public static void main (String [] args) {

        String arr1[] = {"Ram", "Shyam", "Mohan", "Krishna"};
        String arr2[] = {"Krishna", "Ghanshyam", "Mohan", "Radhe"};

        for (int i = 0; i < arr1.length; i++) {
            for (int a = 0; a < arr2.length; a++)
                if (arr1[i].equals(arr2[a]))

                    System.out.println( arr1[i] );


        }
    }

    }



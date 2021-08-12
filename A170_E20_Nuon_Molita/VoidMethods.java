/* 
 *  (name header)
 */

import java.lang.*;
import java.util.Random;

public class VoidMethods
{
    public static void main(String[] args)
    {
        //***************** Initialize three arrays as test cases *****************
        // Note that each of three these arrays has a corresponding numOfElem variable.
        // Thus, we may consider them as "paritally-filled arrays" and we should use
        // the variables numOfElem1, numOfElem2, and numOfElem3 INSTEAD OF array1.length,
        // array2.length, and array3.length.

        int array1[] = {23,43,12,45,75,32,12};
        int numOfElem1 = array1.length;

        int array2[] = {34,54,23,34,98,45,76,98,42,48,61,44};
        int numOfElem2 = array2.length;

        // next array will have random numbers
        Random generator = new Random(19580427);
        int array3[] = new int[20];
        int numOfElem3 = 10;    // will insert 10 elements only
        for (int i = 0; i < numOfElem3; ++i)
        {
            array3[i] = generator.nextInt(90) + 10;
        }

        //***************** Your code goes in this section below *****************
        // Write your 13 method calls under the 13 comments below, respectively.

        // Call method printLargest for array1.
        print(array1, numOfElem1);
        printLargest(array1, numOfElem1); 

        // Call method printLargest for array2.
        print(array2, numOfElem2);
        printLargest(array2, numOfElem2);

        // Call method printLargest for array3.
        print(array3, numOfElem3);
        printLargest(array3, numOfElem3);

        System.out.println();

        // Call method printAllEvens for array1.
        print(array1, numOfElem1);
        printAllEvens(array1, numOfElem1);

        // Call method printAllEvens for array2.
        print(array2, numOfElem2);
        printAllEvens(array2, numOfElem2);

        // Call method printAllEvens for array3.
        print(array3, numOfElem3);
        printAllEvens(array3, numOfElem3);
        System.out.println();

        // Call method printSum for array1.
        print(array1, numOfElem1);
        printSum(array1, numOfElem1);

        // Call method printSum for array2.
        print(array2, numOfElem2);
        printSum(array2, numOfElem2);

        // Call method printSum for array3.
        print(array3, numOfElem3);
        printSum(array3, numOfElem3);

        System.out.println();

        // Call method search to search 100 in array1.
        print(array1, numOfElem1);
        search(array1, numOfElem1, 100);

        // Call method search to search 44 in array2.
        print(array2, numOfElem2);
        search(array2, numOfElem2, 44);

        // Call method search to search 78 in array3.
        print(array3, numOfElem3);
        search(array3, numOfElem3, 78);

        // Call method search to search 45 in array1.
        print(array1, numOfElem1);
        search(array1, numOfElem1, 45);
    }

    // Definition of method print
    // Your code here...
    public static void print(int [] a, int numOfElem)
    {
        System.out.print("Array: ");
        for (int i = 0; i < numOfElem; i++)
        {
            System.out.print(a[i] + " ");

        }

    }
    // Definition of method printLargest
    // Your code here...
    public static void printLargest(int [] a, int numOfElem)
    {
        int largest = 0;

        for (int i = 0; i < numOfElem; i++)
        {

            if (a[i] >= largest)
            {
                largest = a[i];
            }

        }
        System.out.println();
        System.out.println("Largest element: " + largest);
    }

    // Definition of method printAllEvens
    // Your code here...
    public static void printAllEvens(int [] a, int numOfElem)
    { 
        System.out.println();
        System.out.print("Even numbers: ");
        for (int i = 0; i < numOfElem; i++)
        {

            if (a[i] % 2 == 0)
            {
                System.out.print(a[i] + " ");
            }

        }
        System.out.println();
    }

    // Definition of method printSum
    // Your code here...
    public static void printSum(int [] a, int numOfElem)
    {
        int sum = 0;
        System.out.println();

        for (int i = 0; i < numOfElem; i++)
        {
            sum += a[i];
        }
        System.out.println("Sum: " + sum);
    }

    // Definition of method search
    // Your code here...
    public static void search(int [] a, int numOfElem, int b)
    {
        int i = 0,
        count = 0;
        System.out.println();

        while (i < numOfElem)
        {
            if (a[i] == b)
            {
                System.out.println("Number " + b + " is in the array.");
                count ++;
            }
            i++;
        }
        if (count == 0)
        {
            System.out.println("Number " + b + " is not in the array.");
        }

    }
}
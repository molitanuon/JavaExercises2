/*
 * (name header)
 */

import java.util.Scanner;

public class YourCode
{
    public static Scanner input = new Scanner(System.in);

    public YourCode(){}
    
    public void section_1(int a[], int numOfElem)
    {
        // Your code here...
        if (numOfElem > 0)
            for (int i = numOfElem - 1; i >= 0; i--)
                System.out.print(a[i] + " ");
        else
            System.out.print("The array is empty.");
    }
    
    public void section_2(int a[], int numOfElem)
    {
        // Your code here...
        for (int i = 0; i < numOfElem; i++)
            if (a[i] % 2 == 1)
                a[i] = 0;
    }
    
    public void section_3(int a[], int numOfElem)
    {
        // Your code here...
        int min = a[0];
        int minIndex = 0;
        for (int i = 1; i < numOfElem; i++)
            if (a[i] < min)
            {
                min = a[i];
                minIndex = i;
            }
        System.out.print(minIndex);
    }
    
    public void section_4(int a[], int numOfElem)
    {
        int count = 0;
        
        for (int i = 0; i < numOfElem; ++i)
        {
            // Your code here...
            if ((a[i] != 3) && (a[i] % 3 == 0))
                count++;
        }
        
        System.out.println(count);
    }
    
    public void section_5(int a[], int numOfElem)
    {
        // Your code here...
        int sum = 0;
        int i = 0;
        while (i < numOfElem)
        {
            sum += a[i];
            i += 2;
        }
        System.out.print(sum);
    }
    
    public void section_6(int a[], int b[])
    {
        // Your code here...
        for (int i = 0; i < a.length; i++)
            a[i] += b[i];
    }
    
    public void section_7(int a[], int numOfElem)
    {
        // Your code here...
        if (numOfElem <= 0)
            System.out.print("The array to copy from is empty.");
        else
        {
            int[] b = new int[numOfElem];
            int j = 0;
            for (int i = 0; i < numOfElem; i += 2)
            {
                b[j] = a[i];
                j++;
            }
            for (int i = 0; i < j; i++)
                System.out.print(b[i] + " ");
        }
         
    }
    
}
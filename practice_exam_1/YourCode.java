/*
 * Molita Nuon 
 * CS A170 
 * March 06, 2017
 * 
 * Exam #1
 */

import java.util.Scanner;

public class YourCode
{
    public static Scanner console = new Scanner(System.in);

    public YourCode(){}

    public static void sectionA()
    {
        // Declare int variables x and y.
        int x,y;

        // Initialize the int variable x to 10 and the int variable y to 2.
        x = 10;
        y = 2;

        // Declare and initialize a char variable ch to the letter B.

        char myChar = 'B'; 

        // Print out on the screen all three variables (x, y, and ch, in this order)
        // separated by a dash (-)

        System.out.println(x + "-" + y + "-" + myChar);

        // Update the value of the int variable x by adding 5 to it (use short form).

        x += 5;

        // Swap the contents of the int variables x and y. 
        // (Declare additional variables if necessary.)
        int z = y;
        y = x;
        x = z; 

        // Print out on the screen variables x and y separated by a space.

        System.out.println(x + " " + y);

    }
    public static void sectionB()
    {
        /*
         * Declare two double variables, sale and bonus, initialized to 0.
         * Ask the user to enter the sale amount and store it in the variable.
         * Write an IF/ELSE statement that assigns a value to bonus as follows: 
         * If sale is greater than $20,000, the value assigned to bonus 100; 
         * if instead sale is greater than $10,000 and less than or equal to $20,000, 
         * the value assigned to bonus is 50; otherwise, the value assigned to bonus is 0.
         * Print out the bonus.
         */

        double sale = 0,
        bonus = 0;
        System.out.println("Enter the sale amount:");
        sale = console.nextInt();

        if (sale > 1e4 && sale <= 2e4)
        {
            bonus = 50;
        }
        else
        {
            if (sale > 2e4)
            {
                bonus = 100;
            }
            else 
                bonus = 0;
        }

        System.out.println("Bonus : $" + bonus);
    }

    public static void sectionC()
    {
        /*
         * Ask the user to enter a score (5,4,3,2,1) and store it in an int variable
         * named score. Write a SWITCH statement that outputs "Successful!" when the scores
         * are 3, 4, and 5, "Unsuccessful." when the scores are 1 or 2, and "Invalid score."
         * when the given score is not in the range 1-5.
         */
        int score = 0;
        System.out.println("Enter a score (5,4,3,2,1)");
        score = console.nextInt();
        switch (score)
        {
            case 1:
            System.out.println("Unsuccessful.");
            break;
            case 2:
            System.out.println("Unsuccessful.");
            break;
            case 3:
            System.out.println("Successful!");
            break;
            case 4:
            System.out.println("Successful!");
            break;
            case 5:
            System.out.println("Successful!");
            break;
            default:
            System.out.println("Invalid score.");

        }

    }
    public static void sectionD()
    {
        /*
         * Using a DO/WHILE loop, write a code segment that keeps on asking the user to enter a 
         * positive integer from 1 to 10 and enter a negative integer to stop. If the user 
         * enters a negative integer stop the loop, and if the user enters a number that
         * is not in the range 1-10, output the message: "Input not in the range." and ask 
         * the user for a number again.
         */
        int num = 0;
        do
        {
            System.out.println("Enter a number in the range 1-10, or enter a negative number to stop:");
            num = console.nextInt();
            if (num == 0 || num > 10)
             {
                 System.out.println("Intput not in the range");
                 System.out.println("Enter a number in the range 1-10, or enter a negative number to stop:");
                 num = console.nextInt();
              } 
                
        } while (num > 0);
                
              

    }
    public static void sectionE()
    {       
        /*
         * Write a code segment that asks the user for an integer in the range 3-9.
         * Your code should output a pattern of numbers as shown below.
         * Use nested FOR loops.
         * If the user enters 5, the pattern is:
         *       1
         *       12
         *       123
         *       1234
         *       12345
         *       
         * If the user enters 7, the pattern is:
         *       1
         *       12
         *       123
         *       1234
         *       12345
         *       123456
         *       1234567
         */
        System.out.println("Enter a number in the range 3-9:");
        int num = console.nextInt();
        System.out.println();
        for ( int i = 1; i <= num; ++i)
        {
            for (int j = 1; j <= i; ++j)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }    
    public static void sectionF()
    {
        /*
         * Write a code segment that asks the user to enter two integers, where
         * the second number is larger than the first number.
         * Use a WHILE loop to count how many numbers between the first and the
         * second number inclusive are a multiple of 3 or a multiple of 5.
         * Print out this count.
         * 
         * For example, if the user enters 5 and 20, your program prints out 8
         * since 5, 6, 9, 10, 12, 15, 18, and 20 are the numbers in that range
         * which are multiples of 3 or 5.
         */
        int num_1 = 0,
            num_2 = 0,
            sum = 0;
        System.out.println("Enter two numbers, the second larger than the first:");
        num_1 = console.nextInt();
        num_2 = console.nextInt();
        while (num_1 <= num_2)
        {
            if (num_1 % 3 == 0 || num_1 % 5 == 0)
            {
                sum++;
            }  num_1++;    
        }
        System.out.println(sum);
    }
}

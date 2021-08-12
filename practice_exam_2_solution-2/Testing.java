/*
 * Class Testing
 * 
 * Do NOT modify this file.
 * 
 */

public class Testing
{    
    public static void main (String[] args)
    {
       testSection_1();
       testSection_2();
       testSection_3();
       testSection_4();
       testSection_5();
       testSection_6();
       testSection_7();
    }
    
    public static void testSection_1()
    {
        TestCases t = new TestCases();
        System.out.println("\n********** TEST section_1 **********\n");
        t.testSection_1_1(); // {1,2,3,4,5,6,7,8,9}
        t.testSection_1_2(); // {90,70,56,35,21}
        t.testSection_1_3(); // empty
    }
    
    public static void testSection_2()
    {
        TestCases t = new TestCases();
        System.out.println("\n\n********** TEST section_2 **********\n");
        t.testSection_2_1(); // {12,56,84,25,35,47,62,67}
        t.testSection_2_2(); // {10,88,48,62,34,10,98,64,24,68,16,20}
        t.testSection_2_3(); // {13,85,67,95,21,45,81,23,65,87}
        
    }
    
    public static void testSection_3()
    {
        TestCases t = new TestCases();
        System.out.println("\n\n********** TEST section_3 **********\n");
        t.testSection_3_1(); // {12,89,54,26,65,78,95,13}
        t.testSection_3_2(); // {83,62,35,10,98,64,88,47,24,68,16,21}
        t.testSection_3_3(); // {13,84,67,95,62,45,85,23,66,12}        
    }
    
    public static void testSection_4()
    {
        TestCases t = new TestCases();
        System.out.println("\n\n********** TEST section_4 **********\n");
        t.testSection_4_1(); // {12,89,54,26,65,78,95,13,3}
        t.testSection_4_2(); // {3,83,62,35,10,98,64,3,88,47,25,68,16,33}
        t.testSection_4_3(); // {13,84,67,3,3,3,24,85,23,66,12}        
    }
    
    public static void testSection_5()
    {
        TestCases t = new TestCases();
        System.out.println("\n\n********** TEST section_5 **********\n");
        t.testSection_5_1(); // {1,2,1,2,1,1,2,2,1,2,1}
        t.testSection_5_2(); // {2,1,2,1,1,1,2,1,2,1}
        t.testSection_5_3(); // {2,1,1,1,1,1,1,1,2,1,2,1,2,1,1}        
    }
    
    public static void testSection_6()
    {
        TestCases t = new TestCases();
        System.out.println("\n\n********** TEST section_6 **********\n");
        t.testSection_6_1(); // empty
        t.testSection_6_2(); // {1,2,1,2,1,1,2,2,1,2,1}
        t.testSection_6_3(); // {2,1,2,1,1,1,2,1,2,1}
        t.testSection_6_4(); // {2,1,1,1,1,1,1,1,2,1,2,1,2,1,1}        
    }
    
    public static void testSection_7()
    {
        TestCases t = new TestCases();
        System.out.println("\n\n********** TEST section_7 **********\n");
        t.testSection_7_1(); // empty
        t.testSection_7_2(); // {9,8,7,6,5,4,3,2,1}
        t.testSection_7_3(); // {45,84,76,95,32,14,58,75,15,41,21,25,51}
        t.testSection_7_4(); // {20,13,21,13,22,13,23,13,24,13,25}     
    }
}

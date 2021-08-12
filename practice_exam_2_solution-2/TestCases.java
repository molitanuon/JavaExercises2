/*
 * Class TestCases
 * 
 * Do NOT modify this file.
 * 
 */

public class TestCases
{    
    public TestCases(){}
    
    public void testSection_1_1()
    {   
        YourCode yc = new YourCode();
        int a1[] = {1,2,3,4,5,6,7,8,9};       
        System.out.print("Array is: ");
        print(a1,a1.length);
        System.out.println("\nEXPECTED:    9 8 7 6 5 4 3 2 1");
        System.out.print("YOUR OUTPUT: ");
        yc.section_1(a1,a1.length);  
    }
    
    public void testSection_1_2()
    {       
        YourCode yc = new YourCode();
        int a2[] = {90,70,56,35,21};     
        System.out.print("\n\nArray is: ");
        print(a2,a2.length);
        System.out.println("\nEXPECTED:    21 35 56 70 90");
        System.out.print("YOUR OUTPUT: ");
        yc.section_1(a2,a2.length);    
    }
    
    public void testSection_1_3()
    {        
        YourCode yc = new YourCode();
        int a3[] = new int[0];
        System.out.println("\n\n(array is empty)");
        System.out.println("EXPECTED:    The array is empty.");
        System.out.print("YOUR OUTPUT: ");
        yc.section_1(a3,a3.length);      
    }
     
    public void testSection_2_1()
    {
        YourCode yc = new YourCode();
        int a4[] = {12,56,84,25,35,47,62,67};
        System.out.print("Array is: ");
        print(a4,a4.length);
        yc.section_2(a4,a4.length);
        System.out.println("\nEXPECTED:    12 56 84 0 0 0 62 0");
        System.out.print("YOUR OUTPUT: ");
        print(a4,a4.length);
    }
    
    public void testSection_2_2()
    {
        YourCode yc = new YourCode();
        int a5[] = {10,88,48,62,34,10,98,64,24,68,16,20};
        System.out.print("\n\nArray is: ");
        print(a5,a5.length);
        yc.section_2(a5,a5.length);
        System.out.println("\nEXPECTED:    10 88 48 62 34 10 98 64 24 68 16 20");
        System.out.print("YOUR OUTPUT: ");
        print(a5,a5.length);
    }
    
    public void testSection_2_3()
    {
        YourCode yc = new YourCode();
        int a6[] = {13,85,67,95,21,45,81,23,65,87};   
        System.out.print("\n\nArray is: ");
        print(a6,a6.length);
        yc.section_2(a6,a6.length);
        System.out.println("\nEXPECTED:    0 0 0 0 0 0 0 0 0 0");
        System.out.print("YOUR OUTPUT: ");
        print(a6,a6.length);
    }
            
    public void testSection_3_1()
    {        
        YourCode yc = new YourCode();
        int a7[] = {12,89,54,26,65,78,95,13};        
        System.out.print("Array is: ");
        print(a7,a7.length);
        System.out.println("\nEXPECTED:    0");
        System.out.print("YOUR OUTPUT: ");
        yc.section_3(a7,a7.length);
    }    
    
    public void testSection_3_2()
    { 
        YourCode yc = new YourCode();
        int a8[] = {83,62,35,10,98,64,88,47,24,68,16,21};
        System.out.print("\nArray is: ");
        print(a8,a8.length);
        System.out.println("\nEXPECTED:    3");
        System.out.print("YOUR OUTPUT: ");
        yc.section_3(a8,a8.length);
    }    
    
    public void testSection_3_3()
    {  
        YourCode yc = new YourCode();
        int a9[] = {13,84,67,95,62,45,85,23,66,12};
        System.out.print("\nArray is: ");
        print(a9,a9.length);
        System.out.println("\nEXPECTED:    9");
        System.out.print("YOUR OUTPUT: ");
        yc.section_3(a9,a9.length);
    }    
    
    public void testSection_4_1()
    {
        YourCode yc = new YourCode();
        int a10[] = {12,89,54,26,65,78,95,13,3};       
        System.out.print("Array is: ");
        print(a10,a10.length);
        System.out.println("\nEXPECTED:    3");
        System.out.print("YOUR OUTPUT: ");
        yc.section_4(a10,a10.length);
    }
    
    public void testSection_4_2()
    {
        YourCode yc = new YourCode();
        int a11[] = {3,83,62,35,10,98,64,3,88,47,25,68,16,33};
        System.out.print("\nArray is: ");
        print(a11,a11.length);
        System.out.println("\nEXPECTED:    1");
        System.out.print("YOUR OUTPUT: ");
        yc.section_4(a11,a11.length);
    }
    
    public void testSection_4_3()
    {
        YourCode yc = new YourCode();
        int a12[] = {13,84,67,3,3,3,24,85,23,66,12};
        System.out.print("\nArray is: ");
        print(a12,a12.length);
        System.out.println("\nEXPECTED:    4");
        System.out.print("YOUR OUTPUT: ");
        yc.section_4(a12,a12.length);
    }
    
    public void testSection_5_1()
    {
        YourCode yc = new YourCode();
        int a13[] = {1,2,1,2,1,1,2,2,1,2,1};       
        System.out.print("Array is: ");
        print(a13,a13.length);
        System.out.println("\nEXPECTED:    7");
        System.out.print("YOUR OUTPUT: ");
        yc.section_5(a13,a13.length); 
    }
    
    public void testSection_5_2()
    {
        YourCode yc = new YourCode();
        int a14[] = {2,1,2,1,1,1,2,1,2,1};        
        System.out.print("\nArray is: ");
        print(a14,a14.length);
        System.out.println("\nEXPECTED:    9");
        System.out.print("YOUR OUTPUT: ");
        yc.section_5(a14,a14.length);
    }
    
    public void testSection_5_3()
    {
        YourCode yc = new YourCode();
        int a15[] = {2,1,1,1,1,1,1,1,2,1,2,1,2,1,1};        
        System.out.print("\nArray is: ");
        print(a15,a15.length);
        System.out.println("\nEXPECTED:    12");
        System.out.print("YOUR OUTPUT: ");
        yc.section_5(a15,a15.length);   
    }
       
    public void testSection_6_1()
    {        
        YourCode yc = new YourCode();
        int a0[] = {1,2,3,4,5};
        int a1[] = {1,2,3,4,5};
        System.out.print("Array a is: ");  print(a0,a0.length);
        System.out.print("\nArray b is: ");  print(a1,a1.length);
        yc.section_6(a0,a1);
        System.out.println("\nEXPECTED:    2 4 6 8 10");
        System.out.print("YOUR OUTPUT: ");   print(a0,a0.length);
        System.out.println();
    }     
    
    public void testSection_6_2()
    {   
        YourCode yc = new YourCode();
        int a16[] = {3,2,1,4,5,6};
        int a17[] = {7,5,4,6,2,5};
        System.out.print("\nArray a is: ");  print(a16,a16.length);
        System.out.print("\nArray b is: ");  print(a17,a17.length);
        yc.section_6(a16,a17);
        System.out.println("\nEXPECTED:    10 7 5 10 7 11");
        System.out.print("YOUR OUTPUT: ");   print(a16,a16.length);
        System.out.println();
    }     
    
    public void testSection_6_3()
    {   
        YourCode yc = new YourCode();
        int a16[] = {4,4,4,4,4,4};
        int a17[] = {3,2,1,0,-1,-2};
        System.out.print("\nArray a is: ");  print(a16,a16.length);
        System.out.print("\nArray b is: ");  print(a17,a17.length);
        yc.section_6(a16,a17);
        System.out.println("\nEXPECTED:    7 6 5 4 3 2");
        System.out.print("YOUR OUTPUT: ");   print(a16,a16.length);
        System.out.println();
    }     
    
    public void testSection_6_4()
    {   
        YourCode yc = new YourCode();
        int a16[] = {-2,-1,0,-3,-2,1,2,1,2};
        int a17[] = {5,6,2,4,2,8,8,9,9};
        System.out.print("\nArray a is: ");  print(a16,a16.length);
        System.out.print("\nArray b is: ");  print(a17,a17.length);
        yc.section_6(a16,a17);
        System.out.println("\nEXPECTED:    3 5 2 1 0 9 10 10 11");
        System.out.print("YOUR OUTPUT: ");   print(a16,a16.length);
        System.out.println();
    }     
      
    public void testSection_7_1()
    {
        YourCode yc = new YourCode();
        int a00[] = new int [30];        
        System.out.println("(array is empty)");
        System.out.println("EXPECTED:    The array to copy from is empty.");
        System.out.print("YOUR OUTPUT: ");
        yc.section_7(a00,0);
    }
    
    public void testSection_7_2()
    {
        YourCode yc = new YourCode();
        int a19[] = {9,8,7,6,5,4,3,2,1};                
        System.out.print("\n\nArray is: ");
        print(a19,a19.length);
        System.out.println("\nEXPECTED:    9 7 5 3 1");
        System.out.print("YOUR OUTPUT: ");
        yc.section_7(a19,a19.length);
    }
    
    public void testSection_7_3()
    {
        YourCode yc = new YourCode();
        int a20[] = {45,84,76,95,32,14,58,75,15,41,21,25,51};                
        System.out.print("\n\nArray is: ");
        print(a20,a20.length);
        System.out.println("\nEXPECTED:    45 76 32 58 15 21 51");
        System.out.print("YOUR OUTPUT: ");
        yc.section_7(a20,a20.length);
    }
    
    public void testSection_7_4()
    {
        YourCode yc = new YourCode();
        int a21[] = {20,13,21,13,22,13,23,13,24,13,25};                
        System.out.print("\n\nArray is: ");
        print(a21,a21.length);
        System.out.println("\nEXPECTED:    20 21 22 23 24 25");
        System.out.print("YOUR OUTPUT: ");
        yc.section_7(a21,a21.length);
        System.out.println();        
    }
    
    public void print(int a[], int numOfElem)
    {
        if (numOfElem == 0)
            System.out.println("The array is empty.");
        else
        {
            for (int i = 0; i < numOfElem; ++i)
                System.out.print(a[i] + " ");
        }
    }
}

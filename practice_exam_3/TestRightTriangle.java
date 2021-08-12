/*
 * Test program for RightTriangle class
 * 
 * (name header)
 */

public class TestRightTriangle
{

    public static void main( String args[] ) 
    {
        // Declare a RightTriangle object called triangle1 using the default constructor:
        RightTriangle triangle1 = new RightTriangle();


        // Set the legs of triangle1 to 6.0 and 3.5 respectively:
        triangle1.setLegA(6.0);
        triangle1.setLegB(3.5);


        System.out.print("triangle1 dimensions: ");
        // Use the printDimensions method to show the dimensions of triangle1:
        triangle1.printDimensions();


        System.out.print("triangle1 area: ");
        // Print out the area of triangle1:
        System.out.println(triangle1.calculateArea());
        

        // Declare a RightTriangle object called triangle2 using the overloaded constructor
        // initialize it's legs to 3.0 and 4.0 respectively:
        RightTriangle triangle2 = new RightTriangle();
       triangle2.setLegA(3.0);
       triangle2.setLegB(4.0);

        System.out.print("triangle2 dimensions: ");
        // Use the printDimensions method to show the dimensions of triangle2:
        triangle2.printDimensions();


        System.out.print("triangle2 area: ");
        // Print out the area of triangle2:
        System.out.println(triangle2.calculateArea());
        

        // Triple the size of triangle1 by calling its scale() method:
        triangle1.scale(2,3);


        // Increase the size of triangle2 in both legs by 2.5 by calling its scale() method:
        triangle2.scale(1,2.5);


        System.out.print("triangle1 dimensions: ");
        // Use the printDimensions method to show the dimensions of triangle1:
        
        triangle1.printDimensions();

        System.out.print("triangle2 dimensions: ");
        // Use the printDimensions method to show the dimensions of triangle2:
        
       triangle2.printDimensions();

        // Quarter the size of triangle1 by calling its scale() method:
        
        triangle1.scale(2,0.25);

        System.out.print("triangle1 dimensions: ");
        // Use the printDimensions method to show the dimensions of triangle1:
        
        triangle1.printDimensions();

        // Call the invert() method for triangle1:
        
        triangle1.invert();

        System.out.print("triangle1 dimensions after invert: ");
        // Use the printDimensions method to show the dimensions of triangle1:
        
       triangle1.printDimensions();


    }
}
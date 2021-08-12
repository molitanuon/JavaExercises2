
/*
 * Molita Nuon
 * CS A170
 * April 19, 2017
 * 
 * Exercise #24
*/ 

public class RectangleTest
{
    // main method begins execution of Java application
    public static void main( String args[] ) 
    {
        // Create an object of the Student class using the default constructor
        // and initialize the object by using the set methods.
        Rectangle r1 = new Rectangle();
        r1.setWidth(3.0);
        r1.setLength(5.2);

        // Print the object.
        r1.printDimenisons();

        System.out.println();

        // Create another object of the Student class using the overloaded constructor.
        Rectangle r2 = new Rectangle();
        r2.setWidth(2.6);
        r2.setLength(5.4);

        // Print the object by using the get methods.
        System.out.printf("Width: %.2f", r2.getWidth());
        System.out.println();
        System.out.printf("Length: %.2f", r2.getLength());
        System.out.println();
        System.out.println();
        System.out.printf("R1 Area: %.2f", r1.calculateArea());
        System.out.println();
        System.out.printf("R1 Perimeter: %.2f", r1.calculatePerimeter());
        System.out.println();
        System.out.printf("R2 Area: %.2f", r2.calculateArea());
        System.out.println();
        System.out.printf("R2 Perimeter: %.2f", r2.calculatePerimeter());
        System.out.println();
        System.out.println();
        
    } 

} 






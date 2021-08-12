/*
 * Molita Nuon
 * CS A170
 * April 19, 2017
 * 
 * Exercise #24
*/

public class Rectangle
{   
   // instance variables
   private double width;
   private double length;
   
   // default constructor
   // initializes all instance fields
   public void Rectangle()
   {
       width = 0.00;
       length = 0.00;
    }
    
    // overloaded constructor
    public void Rectangle(double newWidth, double newLength)
    {
        width = newWidth;
        length = newLength;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public void setWidth(double newWidth)
    {
        width = newWidth;
    }
    
    public void setLength(double newLength)
    {
        length = newLength;
    }
    
    public double calculateArea()
    {
        double area = width * length;
        return area;
    }
    
    public double calculatePerimeter()
    {
        double perimeter = 2*width + 2*length;
        return perimeter;
    }
    
    public void printDimenisons()
    {
        System.out.printf("Width: %.2f", width);
        System.out.println();
        System.out.printf("Length: %.2f", length);
        System.out.println();
    }
}


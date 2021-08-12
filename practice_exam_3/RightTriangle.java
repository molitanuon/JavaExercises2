/*
 * RightTriangle class
 * 
 * (name header)
 */

public class RightTriangle
{
    // Declare two data fields of type double, legA and legB:
    private double legA;
    private double legB;

    // Implement the default constructor. Initialize all data fields to 0.0:
    public RightTriangle()
    {
        legA = 0.0;
        legB = 0.0;
    }
    
    
    // Implement an overloaded constructor which sets both data fields to the passed values.:
    public RightTriangle(double leg1, double leg2)
    {
        legA = leg1;
        legB = leg2;
    }
    
    // Implement a set method setLegA() which sets the value of legA:
    public void setLegA(double LegA)
    {
        legA = LegA;
    }
    
    // Implement a set method setLegB() which sets the value of legB:
     public void setLegB(double LegB)
    {
        legB = LegB;
    }

    // Implement the body of the method calculateArea() to calculate and return the area.
    // The area of a right triangle is half the product of its two legs:
    public double calculateArea()
    {
        return (legA * legB)/2;
    }


    // Implement the body of the method scale() which changes the size of the triangle.
    // There are 2 different modes:
    //   Mode 1: add the factor amount to both legs
    //   Mode 2: scale (multiply) both legs by the factor amount
    // For example
    //   With mode 1 and factor 3.0, add 3.0 to both leg lengths.
    //   With mode 2 and factor 0.5, multiply both leg lengths by 0.5 (which effectively halves the size of the triangle)
    public void scale(int mode, double factor)
    {
        if (mode == 1)
        {
            legA += factor;
            legB += factor;
        }
        else
        {
        
          legA *= factor;
          legB *= factor;
       }
    }

    // Implement the body of the method invert() which swaps the lengths of the two legs.
    public void invert()
    {
        double a = legA;
        legA = legB;
        legB = a;
    }

    
    // Implement the body of the method printDimensions which prints the
    // values of the two legs on the same line separated by a space and then
    // goes to the next line (newline).:
    public void printDimensions()
    {
        System.out.print(legA + " " + legB);
        System.out.println();
    }
}

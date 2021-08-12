/*
 * DigiPet class - digital pet
 * 
 * Molita Nuon 
 * CS A170
 * April 26, 2017
 * 
 * Exercise 26
 */

public class DigiPet
{
    // instance variables (representing the attributes/state of a DigiPet)
    private String name;
    private int lifespan;   // max age (in cycles)
    private int age;        // current age (in cycles, each action performed causes a cycle to pass)
    private int mood;       // (2 = joyful, 1 = happy, 0 = neutral, -1 = sad, -2 = angry)
    private int size;

    // Default constructor
    public DigiPet()
    {
        name = "(noname)";
        lifespan = 12;
        age = 0;
        size = 1;
        mood = 0;
    }

    // Overloaded constructor
    public DigiPet(String newName, int newLifespan)
    {
        // Initialize all five fields as appropriate:
        // Your code here:
        name = newName;
        lifespan = newLifespan;
        age = 0;
        size = 1;
        mood = 0;
    }

    // Makes a pet one cylcle older and checks if the pet is at the end of its life
    private void makeOlder()
    {
        age++;
        if (age >= lifespan)
        {
            name = "Zombie " + name;
        }
    }

    // Accessor method for age
    public int getAge()
    {
        return age;
    }

    // Accessor method for lifespan
    public int getLifespan()
    {
        return lifespan;
    }

    public void poke()
    {
        // Your code here
      
        if(mood > -2)       
        {
           mood--;
        }
        makeOlder();
    }

    public void pet()
    {
        // Your code here
        if (mood < 2)
        {
             mood++;
        }
        makeOlder();
    }

    public void feed(int amount)
    {
        // Your code here
        size += amount;
        makeOlder();
    }

    public void exercise(int amount)
    {
        // Your code here
        size -= amount;
        if (size < 1)
        {
            System.out.println("No more energy!");
            size = 1;
        }
        makeOlder();
    }

    // Modify this method to customize your pet's "appearance"
    public void showPet()
    {
        System.out.println(name + " (" + age + "/" + lifespan + ")");
        System.out.print(" _ ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(" ");  
        }
        System.out.println("  _");
        System.out.print("( )");
        for (int i = 0; i < size; i++)
        {
            System.out.print(" ");  
        }
        System.out.println(" ( )");
        System.out.print("( ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(" ");  
        }
        System.out.print("*");
        for (int i = 0; i < size; i++)
        {
            System.out.print(" ");  
        }
        System.out.print(" ~ ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(" "); 
        }
        System.out.println("* )\n"); 
        for (int i = 0; i < size; i++)
        {
            System.out.print(" ");  
        }
        System.out.print("(");
        for (int i = 0; i < size; i++)
        {
            System.out.print(" ");  
        }
        System.out.print("     )");
        System.out.print(" --(i'm so ");
        switch (mood)
        {
            case 2: System.out.print("joyful!"); break;
            case 1: System.out.print("happy"); break;
            case -1: System.out.print("sad"); break;
            case -2: System.out.print("angry!"); break;
            default: System.out.print("meh");
        }
        System.out.println(")");
    }
}

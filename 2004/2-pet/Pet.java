
/**
 * Write a description of class Pet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Pet
{
    // instance variables - replace the example below with your own
    private String myName;
    
    /**
     * Constructor for objects of class Pet
     */
    public Pet(String name)
    {
        myName = name;
    }

    /**
     * Returns myName
     *
     * @return myName
     */
    public String getName()
    {
        return myName;
    }
    
    public abstract String speak();
}

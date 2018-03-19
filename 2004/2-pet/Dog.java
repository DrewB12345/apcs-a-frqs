
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Pet
{
    /**
     * Constructor for objects of class Dog
     */
    public Dog(String name)
    {
        super(name);
    }

    /**
     * The dog barks
     *
     * @return The word "bark"
     */
    public String speak()
    {
        return "bark";
    }
}

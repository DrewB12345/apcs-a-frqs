
/**
 * Write a description of class LoudDog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoudDog extends Dog
{
    /**
     * Constructor for objects of class LoudDog
     */
    public LoudDog(String name)
    {
        super(name);
    }

    /**
     * The loud dog makes the dog's sound twice
     *
     * @return The dog's speak function but twice
     */
    public String speak()
    {
        return super.speak() + " " + super.speak();
    }
}

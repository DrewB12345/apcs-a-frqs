
/**
 * Write a description of class Kennel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Kennel
{
    // instance variables - replace the example below with your own
    private ArrayList<Pet> petList;

    /**
     * Constructor for objects of class Kennel
     */
    public Kennel(ArrayList<Pet> petList)
    {
        this.petList = petList;
    }

    /**
     * Every pet in the kennel does its speak function. The name of the pet is listed next to the
     * result of the speak funcion.
     */
    public void allSpeak()
    {
        for (Pet p : petList) {
            System.out.println(p.getName() + " says " + p.speak());
        }
    }
}

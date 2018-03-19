
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Tester
{
    public static void main(String[] args) {
        Dog d1 = new Dog("oof");
        Dog d2 = new Dog("oooof");
        Cat c1 = new Cat("caaaaaat");
        LoudDog d3 = new LoudDog("annoying dog");
        System.out.println(d1.speak());
        System.out.println(c1.speak());
        System.out.println(d3.speak());
        ArrayList<Pet> kennel1 = new ArrayList<Pet>();
        kennel1.add(d1);
        kennel1.add(d2);
        kennel1.add(c1);
        kennel1.add(d3);
        Kennel k1 = new Kennel(kennel1);
        k1.allSpeak();
    }
}

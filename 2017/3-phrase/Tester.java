
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester {
    public static void main(String[] args) {
        Phrase p1 = new Phrase("A cat ate late.");
        Phrase p2 = new Phrase("A cat ate late.");
        Phrase p3 = new Phrase("A cat ate late.");
        
        System.out.println(p3.findNthOccurrence("at", 2));
        System.out.println(p3.findNthOccurrence("ar", 2));
        System.out.println(p3.findNthOccurrence("at", 4));
        p1.replaceNthOccurrence("at", 2, "ar");
        p2.replaceNthOccurrence("at", 4, "ar");
        System.out.println(p1.getString());
        System.out.println(p2.getString());
        System.out.println(p3.findLastOccurrence("at"));
        System.out.println(p3.findLastOccurrence("ar"));
    }
}


/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester {
    public static void main(String[] args) {
        HiddenWord p1 = new HiddenWord("word");
        System.out.println(p1.getHint("wood"));
        System.out.println(p1.getHint("word"));
        System.out.println(p1.getHint("wwww"));
        System.out.println(p1.getHint("aaaa"));
    }
}


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
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("cat");
        list1.add("mouse");
        list1.add("frog");
        list1.add("dog");
        list1.add("dog");
        
        WordList l1 = new WordList(list1);
        l1.printWordList();
        System.out.println(l1.numWordsOfLength(3));
        System.out.println(l1.numWordsOfLength(4));
        System.out.println();
        l1.removeWordsOfLength(4);
        l1.printWordList();
        l1.removeWordsOfLength(3);
        l1.printWordList();
        l1.removeWordsOfLength(2);
        l1.printWordList();
    }
}

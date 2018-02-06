
/**
 * Write a description of class WordList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class WordList
{
    private ArrayList<String> myList;

    /**
     * Constructor for objects of class WordList
     */
    public WordList(ArrayList<String> a)
    {
        myList = a;
    }

    /**
     * Finds the amount of words in the array list that have the given amount of characters
     *
     * @param len The desired length to search for
     * @return The amount of words in the array list that have the given amount of characters
     */
    public int numWordsOfLength(int len)
    {
        int count = 0;
        for (String str: myList) if (str.length() == len) count++;
        return count;
    }
    
    /**
     * Removes words from the array list that have the given amount of characters
     *
     * @param len The desired length to search for
     */
    public void removeWordsOfLength(int len)
    {
        for (int i=myList.size()-1; i>=0; i--) if (myList.get(i).length()==len) myList.remove(i);
    }
    
    /**
     * Prints the word list
     */
    public void printWordList() {
        for (String w: myList) System.out.println(w);
        System.out.println();
    }
}

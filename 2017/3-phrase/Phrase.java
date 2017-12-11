
/**
 * Write a description of class Phrase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Phrase {
    private String currentPhrase;

    /**
     * Constructor for objects of class Phrase
     */
    public Phrase(String p) {
        currentPhrase = p;
    }
    
    /**
     * Returns the phrase
     */
    public String getString() {
        return currentPhrase;
    }
    
    /**
     * Finds the index of the nth occurrence of the given string in the phrase, but returns -1 if the
     * string is not found or if the string does not occur n times in the phrase
     *
     * @param str The string that will be found in the phrase
     * @param n The nth time the string occurs
     * @return The index of the nth occurrence
     */
    public int findNthOccurrence(String str, int n) {
        int count = 0;
        for (int i = 0; i <= currentPhrase.length() - str.length(); i++) {
            if (currentPhrase.substring(i,i+str.length()).equals(str)) {
                count++;
                if (count == n) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    /**
     * Replaces the string at its nth occurence with a given string
     * 
     * @param str The string that will be replaced
     * @param n The nth time the string occurs
     * @param repl The string that will replace the original string
     * @return The new phrase
     */
    public void replaceNthOccurrence(String str, int n, String repl) {
        if (findNthOccurrence(str,n) != -1) {
            String result = "";
            result += currentPhrase.substring(0,findNthOccurrence(str,n));
            result += repl;
            result += currentPhrase.substring(findNthOccurrence(str,n) + str.length(), currentPhrase.length());
            currentPhrase = result;
        }
    }
    
    /**
     * Finds the index of the last time a string is present within the phrase
     * 
     * @param str The string that will be found
     * @return The index of the last occurrence of the given string
     */
    public int findLastOccurrence(String str) {
        int count = 0;
        for (int i = 0; i <= currentPhrase.length() - str.length(); i++) {
            if (currentPhrase.substring(i,i+str.length()).equals(str)) {
                count++;
            }
        }
        
        if (count == 0) {
            return -1;
        }
        
        return findNthOccurrence(str,count);
    }
}

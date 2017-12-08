
/**
 * Write a description of class HiddenWord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HiddenWord {
    private String str;
    /**
     * The constructor
     */
    public HiddenWord(String str) {
        this.str = str;
    }
    
    /**
     * Shows how accurate the guess is; if the letter in the guess is at the same location as it is in
     * the answer, the letter is shown in the result. If the letter is in the answer but is in the wrong
     * location, the wrong location shows up as a plus sign. If the letter is completely wrong, it shows
     * as a star.
     * 
     * @param guess The guess
     * @return The hint
     */
    public String getHint (String guess) {
        String result = "";
        for (int i = 0; i <= guess.length()-1; i++) {
            if (str.substring(i,i+1).equals(guess.substring(i,i+1))) {
                result += str.substring(i,i+1);
            }
            else if (str.contains(guess.substring(i,i+1))) {
                result += "+";
            }
            else {
                result += "*";
            }
        }
        return result;
    }
}

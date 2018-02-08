
/**
 * Write a description of class StudentAnswerSheet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class StudentAnswerSheet
{
    // instance variables - replace the example below with your own
    private ArrayList<String> answers;
    private String name;
    
    /**
     * Constructor for objects of class StudentAnswerSheet
     */
    public StudentAnswerSheet(ArrayList<String> answers, String name)
    {
        this.answers = answers;
        this.name = name;
    }

    /**
     * Finds the student's score; correct answers count as one point, incorrect answers count as
     * -0.25 points, and unchecked answers (marked as "?") are not counted
     *
     * @param key The answer key
     * @return The student's score
     */
    public double getScore(ArrayList<String> key)
    {
        double correct = 0.0;
        double incorrect = 0.0;
        for (int i=0; i<key.size(); i++) {
            String ans = answers.get(i);
            String keyans = key.get(i);
            if (!ans.equals("?")) {
                if (ans.equals(keyans)) correct++;
                else incorrect += 0.25;
            }
        }
        return correct - incorrect;
    }
    
    /**
     * Finds the student's name
     * 
     * @return The student's name
     */
    public String getName() {
        return name;
    }
}

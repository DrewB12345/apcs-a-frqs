
/**
 * Write a description of class TestResults here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class TestResults
{
    // instance variables - replace the example below with your own
    private ArrayList<StudentAnswerSheet> sheets;

    /**
     * Constructor for objects of class TestResults
     */
    public TestResults(ArrayList<StudentAnswerSheet> sheets)
    {
        this.sheets = sheets;
    }

    /**
     * Finds the student who got the highest score
     *
     * @param key The answer key
     * @return The name of the student with the highest score
     */
    public String highestScoringStudent(ArrayList<String> key)
    {
        String name = sheets.get(0).getName();
        double best = sheets.get(0).getScore(key);
        for (StudentAnswerSheet s: sheets) {
            if (s.getScore(key) > best) {
                name = s.getName();
                best = s.getScore(key);
            }
        }
        return name;
    }
}

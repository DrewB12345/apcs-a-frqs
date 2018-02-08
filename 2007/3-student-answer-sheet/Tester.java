
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
        ArrayList<String> key = new ArrayList<String>();
        key.add("A");
        key.add("C");
        key.add("D");
        key.add("E");
        key.add("B");
        key.add("C");
        key.add("E");
        key.add("B");
        key.add("B");
        key.add("C");

        ArrayList<String> answers1 = new ArrayList<String>();
        answers1.add("A");
        answers1.add("B");
        answers1.add("D");
        answers1.add("E");
        answers1.add("A");
        answers1.add("C");
        answers1.add("?");
        answers1.add("B");
        answers1.add("D");
        answers1.add("C");
        
        ArrayList<String> answers2 = new ArrayList<String>();
        answers2.add("A");
        answers2.add("C");
        answers2.add("D");
        answers2.add("?");
        answers2.add("B");
        answers2.add("C");
        answers2.add("E");
        answers2.add("A");
        answers2.add("B");
        answers2.add("E");

        StudentAnswerSheet s1 = new StudentAnswerSheet(answers1, "Student A");
        StudentAnswerSheet s2 = new StudentAnswerSheet(answers2, "Student B");
        
        System.out.println(s1.getScore(key));
        System.out.println(s2.getScore(key));
        
        ArrayList<StudentAnswerSheet> results1 = new ArrayList<StudentAnswerSheet>();
        results1.add(s1);
        results1.add(s2);
        
        TestResults r1 = new TestResults(results1);
        
        System.out.println(r1.highestScoringStudent(key));
    }
}

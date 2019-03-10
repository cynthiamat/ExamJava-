import java.util.Scanner;

/**
 * This program demonstrate the essay class, which inherits from the GradedActivity class
 * and also determines the grade for thw essay
 */

public class Essay extends GradedActivity {
    /**
     * makingthe atributes final so that they cannot be changed by anyone else
     * als, making them satic can make me access them along the way
     */
    private static final int grammarMaxPoints = 30;
    private static final int spellingMaxPoints = 20;
    private static final int correctLengthMaxPoints = 20;
    private static final int contentMaxPoints = 30;


    private int grammarPoints;   // number of points in grammar
    private int spellingPoints;  // number of points in spelling
    private int correctLength;    // how many words in the essay
    private int content;           // number of points for the content
    private int grades;

    public Essay() {

        this.grammarPoints = 0;
        this.spellingPoints = 0;
        this.correctLength = 0;
        this.content = 0;
    }

    /**
     * constructor
     * @param grammarPoints
     * @param spellingPoints
     * @param correctLength
     * @param content
     */
    public Essay(int grammarPoints, int spellingPoints, int correctLength, int content) {


        this.setGrammarPoints(grammarPoints);
        this.setSpellingPoints(spellingPoints);
        this.setCorrectLength(correctLength);
        this.setContent(content);
        setScore(getTotal());
    }

    public int getGrammarPoints()
    {
        return this.grammarPoints;
    }

    public static int getGrammarMaxPoints()
    {
        return grammarMaxPoints;
    }
    public void setGrammarPoints(int grammarPoints)
    {
        if(grammarPoints<=this.grammarMaxPoints){
            this.grammarPoints = grammarPoints;
        }else{
            //invalid entry
            this.grammarPoints=0;
        }

    }

    public int getSpellingPoints()
    {
        return spellingPoints;
    }
    public static int getSpellingMaxPoints()
    {
        return spellingMaxPoints;
    }
    public void setSpellingPoints(int spellingPoints)
    {
        if(spellingPoints<=this.spellingMaxPoints){
            this.spellingPoints = spellingPoints;
        }else{
            //invalid  entry
            this.spellingPoints = 0;
        }
    }

    public int getCorrectLength()
    {
        return this.correctLength;
    }

    public static int getCorrectLengthMaxPoints()
    {
        return correctLengthMaxPoints;
    }

    public void setCorrectLength(int correctLength)
    {
        if(correctLength<=this.correctLengthMaxPoints){
            this.correctLength = correctLength;
        }else{
            // invalid  entry
            this.correctLength=0;
        }


    }

    public int getContent()
    {
        return this.content;
    }
    public static int getContentMaxPoints()
    {
        return contentMaxPoints;
    }
    public void setContent(int content)
    {
        if(content<=this.contentMaxPoints){
            this.content = content;
        }else{
            //invalid entry
            this.content = 0;
        }

    }

    // method to return the total points for the essay
    int getTotal()
    {
        return this.grammarPoints + this.spellingPoints + this.correctLength + this.content;
    }

}

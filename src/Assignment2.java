import java.util.Scanner;

/**
 * Demonstrate your CourseGrades class here.
 *
 * @author Cynthia
 */

public class Assignment2 {
    public static void main(String[] args) {

        String strMissedQuestions = "Enter number of questions you missed:";
        //create objects & get the scores
        GradedActivity lab = getLab();
        Essay essay = getEssay();
        PassFailExam passFailExam= getPassFailExam(strMissedQuestions);
        FinalExam finalExam= getFinalExam(strMissedQuestions);

        //create course grades object
        CourseGrades grades = new CourseGrades();
        grades.setEssay(essay);
        grades.setFinalExam(finalExam);
        grades.setLab(lab);
        grades.setPassFailExam(passFailExam);

        //display grades
        System.out.println(grades.toString());

    }

    /**
     * method that takes a string to prompt user then
     * gets input and validates it and returns a
     * PassFailExam object
     * @param missString
     * @return
     */
    public static PassFailExam getPassFailExam(String missString)
    {
        System.out.println("Pass Fail Exam Score:\n10 questions total:");
        int quest = 10;
        int miss = validateInput(missString, 0, quest);
        double min = 70;
        return new PassFailExam(quest, miss, min);
    }
    /**
     * this is the  method that takes a string to prompt user then
     * gets input and validates it and returns a
     * FinalExam object
     * @param missString
     * @return
     */
    public static FinalExam getFinalExam(String missString)
    {
        //get final exam scores
        System.out.println("Final Exam Score:\n50 questions total:");
        int fquest = 50;
        int fmiss = validateInput(missString, 0, fquest);
        return new FinalExam(fquest,fmiss);
    }
    /**
     * this is the method that gets input from user and
     * validates it then returns an Essay object
     * @return
     */
    public static Essay getEssay()
    {
        //get essay scores
        System.out.println("Essay Score:");
        int gram = validateInput("Enter Grammar points: (0-"+Essay.getGrammarMaxPoints()+")", 0, Essay.getGrammarMaxPoints()); //grammar
        int spell = validateInput("Enter Spelling points: (0-"+Essay.getSpellingMaxPoints()+")", 0, Essay.getSpellingMaxPoints());  //spelling
        int len = validateInput("Enter Correct Length points: (0-"+Essay.getCorrectLengthMaxPoints()+")", 0, Essay.getCorrectLengthMaxPoints());  //length
        int cont = validateInput("Enter Content points: (0-"+Essay.getContentMaxPoints()+")", 0, Essay.getContentMaxPoints());  //content
        return new Essay(gram, spell, len, cont);
    }

    /**
     * this is the method that gets input from user and
     * validates it then returns an Lab object
     * @return
     */
    public static GradedActivity getLab()
    {
        //get lab scores
        GradedActivity Lab = new GradedActivity();
        Lab.setScore(validateInput("Enter score for lab activity: (0-100)", 0, 100));
        return Lab;
    }

    /**
     * this is my method that prints string passed in then
     * gets input from the user
     * @param stringIn
     * @return
     */
    public static int getIntInput(String stringIn)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(stringIn);
        return keyboard.nextInt();
    }

    /**
     * this is my method that prints string passed in then
     * gets input from the user
     * @param stringIn
     * @return
     */
    public static double getDblInput(String stringIn)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(stringIn);
        return keyboard.nextDouble();
    }
    /**
     * this is my method that prints string passed in then
     * gets input from the user
     * @param stringIn
     * @return
     */
    public static String getStringInput(String stringIn)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(stringIn);
        return keyboard.next();
    }

    /**
     * here, this method is used to validate input from the user,
     * gets passed a string for user prompt also
     * a minimum value and a maximum value
     * to check against for validation
     * if input is out of range it will continue
     * to prompt user for correct input then returns
     * the input only after it passes validation
     * @param stringIn
     * @param min
     * @param max
     * @return
     */
    public static int validateInput(String stringIn, int min, int max)
    {
        int objVar = getIntInput(stringIn);
        while(objVar > max || objVar < min)
        {
            System.out.println("Invalid Entry!\nTry Again:");
            objVar = getIntInput(stringIn);
        }
        return objVar;
    }
}

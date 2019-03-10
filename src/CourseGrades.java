/**
 * this class implements the interface called Analyzable
 */
public class CourseGrades implements Analyzable {
    private GradedActivity[] grades = new GradedActivity[4];

    @Override

    // this is to get the average
    public double getAverage() {
        double totalScore = 0;
        for (GradedActivity grade : grades) {
            totalScore += grade.getScore();
        }

        return totalScore / this.grades.length;
    }

    @Override

    // this is to get the highest grade
    public GradedActivity getHighest() {
        double maxValue = 0;
        GradedActivity result = null;

        for (GradedActivity grade : grades) {
            if (grade.getScore() > maxValue) {
                result = grade;
                maxValue = grade.getScore();
            }
        }

        return result;
    }

    @Override

    // this is to get the lowest grade
    public GradedActivity getLowest() {
        double minValue = 0;
        GradedActivity result = null;

        for (GradedActivity grade : grades) {
            if (grade.getScore() < minValue) {
                result = grade;
                minValue = grade.getScore();
            }
        }

        return result;
    }
    /**
     * setters
     *
     */
    void setLab(GradedActivity lab) {
        this.grades[0] = lab;
    }

    void setPassFailExam(PassFailExam failedExam) {
        this.grades[1] = failedExam;
    }

    void setEssay(Essay essay) {
        this.grades[2] = essay;
    }

    void setFinalExam(FinalExam finalExam) {
        this.grades[3] = finalExam;
    }


    /**
     * to string method
     * @return
     */
    public String toString() {
        String result = "";

        for (int index = 0; index < this.grades.length; index++) {
            result += "Assigmnment " + (index + 1)+": " +
                    "score " + this.grades[index].getScore() +
                    ", grade " + this.grades[index].getGrade();
            result += "\n";
        }
        return result;

    }
}


/** ***************************************************************************
 *
 * FILE:           Student.java
 * DATE:           Nov 17, 2021
 * AUTHOR:         Nathan Grabowski
 * VERSION:        1.0
 * PURPOSE:
 *
 ***************************************************************************** */
public class Student {
    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    //---------------- S T A T I C V A R I A B L E S ---------------
    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

    public static double totalPointsAllStu = 0;
    public static double totalQuizzesAllStu = 0;

//----------------------------------------------------------------
//------ I N S T A N C E V A R I A B L E S / F I E L D S --------
//----------------------------------------------------------------
    private String name;
    private double totalquiz;
    private double totalpoints;

//////////////////////////////////////////////////////////////////
/////////////// C O N S T R U C T O R S ///////////////
//////////////////////////////////////////////////////////////////
    public Student(String nm) {
        name = nm;
    }

    public void studentName(String s) {
        name = s;
    }
//MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
//MMMMMMMMMMMMMMM M U T A T O R S MMMMMMMMMMMMMMMMMMMMMMMM
//MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM

    public void addQuiz(int score) {
        totalquiz++;
        totalpoints = totalpoints + score;
         totalPointsAllStu +=score;
        totalQuizzesAllStu +=1;
    }

    public void clear() {
        totalpoints = 0;
        totalquiz = 0;
        name = "";
    }
    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//AAAAAAAAAAAAAAAAAAAA A C C E S S O R S AAAAAAAAAAAAAAAAAAAAAAA
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

    public String setName() {
        name = "";
        return name;
    }

    public String getName() {
        return name;
    }

    public double getTotalPoints() {
        return totalpoints;
    }

    public double getAverageScore() {
        if (totalquiz == 0) {
            return -1;
        }
        double averagescore = (totalpoints / totalquiz);
        averagescore = Math.round(averagescore);
        return averagescore;
       
    }

    public double getTotalPAllStu() {
        return totalPointsAllStu;
    }

    public double getTotalQAllStu() {
        return totalQuizzesAllStu;
    }

    public String toString() {
        return "Name: " + name + "\nTotal Points: " + totalpoints + "\nTotal Quizzes: " + totalquiz + "\nAverage Score " + totalpoints / totalquiz;
    }

}

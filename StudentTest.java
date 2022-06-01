
/** ***************************************************************************
 *
 * FILE:           StudentTest.java
 * DATE:           Nov 17, 2021
 * AUTHOR:         Nathan Grabowski
 * VERSION:        1.0
 * PURPOSE:
 *
 ***************************************************************************** */
import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        Student s = new Student("Billy");
        s.addQuiz(70);
        s.addQuiz(84);
        s.addQuiz(100);
        System.out.println(s.toString());
       // System.out.println(s.getTotalPAllStu());
        //  System.out.println(s.getTotalQAllStu());
      //  System.out.println(s.getTotalPoints()); //prints 254
       // System.out.println(s.getAverageScore()); //prints 85
        s.clear();
       // System.out.println(s.getTotalPoints()); //prints 0
       // System.out.println(s.getAverageScore()); //returns -1 so client can print NO QUIZZES OR SOME OTHER MESSAGE!!
        

    }
}
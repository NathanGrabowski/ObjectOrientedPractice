
/** ***************************************************************************
 *
 * FILE:           PlanetTest.java
 * DATE:           Nov 29, 2021
 * AUTHOR:         Nathan Grabowski
 * VERSION:        1.0
 * PURPOSE:
 *
 ***************************************************************************** */
import java.util.Scanner;

public class PlanetTest {

    public static void main(String[] args) {
        Planet p1 = new Planet("Earth", 365.26);
        Planet p2 = new Planet("Mars", 686.98);
        p1.addDays(500);
        p2.addDays(500);
        System.out.println(p1.toString());

       // System.out.println("Earth Progress " + p1.getNumOrbits() + " orbits " + p1.getDaysTowardNext() + " days towards next orbit");
        //System.out.println("Mars Progress " + p2.getNumOrbits() + " orbits " + p2.getDaysTowardNext() + " days towards next orbit");
    }
}
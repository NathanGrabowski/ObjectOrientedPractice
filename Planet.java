
/** ***************************************************************************
 *
 * FILE:           Planet.java
 * DATE:           Nov 29, 2021
 * AUTHOR:         Nathan Grabowski
 * VERSION:        1.0
 * PURPOSE:
 *
 ***************************************************************************** */
import java.util.Scanner;

public class Planet {
//----------------------------------------------------------------
//------ I N S T A N C E V A R I A B L E S / F I E L D S --------
//----------------------------------------------------------------

    private String name;
    private int orbits;
    private double years;
    private double days;

    public Planet() {

    }

    //////////////////////////////////////////////////////////////////
/////////////// C O N S T R U C T O R S ///////////////
//////////////////////////////////////////////////////////////////
    public Planet(String na, double f) {
        name = na;
        years = f;
    }
//MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
//MMMMMMMMMMMMMMM M U T A T O R S MMMMMMMMMMMMMMMMMMMMMMMM
//MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM

    public void addDays(double da) {
        days = days + da;
    }

    public void numOrbits(int o) {
        orbits = o;
    }

    public void carName(String n) {
        name = n;
    }

    public String setName(String str) {
        name = str;
        return name;
    }
    //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//AAAAAAAAAAAAAAAAAAAA A C C E S S O R S AAAAAAAAAAAAAAAAAAAAAAA
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

    public double getNumOrbits() {
        if (years > days) {
            orbits = 0;
        } else {
            while (days >= years) {
                days = days - years;
                orbits++;
            }
        }
        return orbits;

    }

    public double getDaysTowardNext() {
        return days;

    }
 
   public String ToString() {
        return "Name: " + name + "Number of Orbits: " + orbits + "Days until orbit: " + days;
    }

}
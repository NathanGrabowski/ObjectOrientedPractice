
/** ***************************************************************************
 *
 * FILE:           Car.java
 * DATE:           Nov 15, 2021
 * AUTHOR:         Nathan Grabowski
 * VERSION:        1.0
 * PURPOSE:
 *
 ***************************************************************************** */

public class Car {
   
 //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 //---------------- S T A T I C V A R I A B L E S ---------------
 //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
  
    public static double milesdriven=0;
    
//----------------------------------------------------------------
//------ I N S T A N C E V A R I A B L E S / F I E L D S --------
//----------------------------------------------------------------

    private double mpg;
    private String name;
    private double gas;
    private double miles;


    public Car(){
        
    }
//////////////////////////////////////////////////////////////////
/////////////// C O N S T R U C T O R S ///////////////
//////////////////////////////////////////////////////////////////
    public Car(int f) {
        mpg = gas = 0;
        name = "";
        mpg = f;
    }
//<M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M>
//<M><M><M><M><M><M> M U T A T O R S <M><M><M><M><M><M>
//<M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M><M>
    public void addGas(int g) {
        gas = gas + g;
    }

    public void fuelEfficency(int f) {
        mpg = f;
    }

    public void carName(String n) {
        name = n;
    }

    public String setName(String str){
        name = str;
        return name;
    }
        public void drive(double d){
        miles = d;
        gas = gas -(miles / mpg);
        milesdriven=+miles;
    }
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//AAAAAAAAAAAAAAAAAAAA A C C E S S O R S AAAAAAAAAAAAAAAAAAAAAAA
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
public String toString(){
    return "Name: "+name+ "\tMPG: "+mpg+ "\tGas: "+gas;
}
public double getTotal(){
    return milesdriven;
}
        public String getName(){
        return name;
    }
        public double getGas(){
        return gas;
    }
}


/** ***************************************************************************
 *
 * FILE:           CarTest.java
 * DATE:           Nov 15, 2021
 * AUTHOR:         Nathan Grabowski
 * VERSION:        1.0
 * PURPOSE:
 *
 ***************************************************************************** */
import java.util.Scanner;

public class CarTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car myBeemer = new Car(29);
        myBeemer.setName("Corvette");
        //System.out.println("Car Name: "+ myBeemer.getName());
        myBeemer.addGas(20);
        myBeemer.drive(100);
    //    System.out.println("Gas after drive: "+ myBeemer.getGas());
        System.out.println("Total Miles Driven: " +myBeemer.getTotal());
        System.out.println(myBeemer.toString());
    }
}
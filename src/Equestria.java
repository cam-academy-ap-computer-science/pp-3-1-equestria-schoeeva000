/* PSUDOCODE
 *
 *
 * main:
 * call a method to do distance, and send the first city's x and y, and the second city's x and y
 * save the value returned from the method in a variable
 * print that variable with some text around it
 * do this same thing for the other pairs of cities
 *
 *
 * calculate distance method:
 * convert city coordinates to x1, y1, x2, y2
 * do the difference calculations and save them in variables
 * do the square calculations and save them in variables
 * add the two together and to the square root
 *
 */

public class Equestria {


// CLASS CONSTANTS FOR COORDINATES
public static final int BALTIMORE_X = 31;
public static final int BALTIMORE_Y = 15;

public static final int MANHATTAN_X = 35;
public static final int MANHATTAN_Y = 9;

public static final int LOS_PEGASUS_X = 6;
public static final int LOS_PEGASUS_Y = 20;

public static final int NIAGRA_FALLS_X = 24;
public static final int NIAGRA_FALLS_Y = 7;

public static final int BADLANDS_X = 28;
public static final int BADLANDS_Y = 22;

public static final int PONYVILLE_X = 16;
public static final int PONYVILLE_Y = 13;


public static void main(String[] args) {

// call the methods and save their return values in variables
double baltimoreToManhattan = calculateDistance(BALTIMORE_X, BALTIMORE_Y, MANHATTAN_X, MANHATTAN_Y);
double losPegasusToNiagraFalls = calculateDistance(LOS_PEGASUS_X, LOS_PEGASUS_Y, NIAGRA_FALLS_X, NIAGRA_FALLS_Y);
double badlandsToPonyville = calculateDistance(BADLANDS_X, BADLANDS_Y, PONYVILLE_X, PONYVILLE_Y);

// print out the distances
System.out.println("The distance from Baltimare to Manehattan is " + baltimoreToManhattan);
System.out.println("The distance from Los Pegasus to Neighagra Falls is " + losPegasusToNiagraFalls);
System.out.println("The distance from Badlands to Ponyville is " + badlandsToPonyville);

}

public static double calculateDistance(int x1, int y1, int x2, int y2) {
// do the first step, calculate differences
double xDifference = x2 - x1;
double yDifference = y2 - y1;

// square both the differences
double xSquare = Math.pow(xDifference, 2);
double ySquare = Math.pow(yDifference, 2);

// do the square root
double distance = Math.sqrt(xSquare + ySquare);

return distance;

}

}


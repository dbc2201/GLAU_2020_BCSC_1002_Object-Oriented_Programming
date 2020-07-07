/*  Created by IntelliJ IDEA.
 *   Author: Divyansh Bhardwaj (dbc2201)
 *   Date: 07/07/20
 *   Time: 9:22 AM
 */

package acceptingEndUserInput;

//  Step 1: import the Scanner class from the java.util package.

import java.util.Scanner;

public class InputSteps {
    public static void main(String[] args) {
        // Step 2: create an object of the Scanner class
        // use this formula to create an object of any class in Java
        // <ClassName> <objectName> = new <ClassName>();
        Scanner scanner = new Scanner(System.in);
        // note carefully, where the capital S is used in Scanner,
        // it means the class is used. The scanner with small s is the object.

        // Step 3: take input from the end-user and store it in a variable
        // first, print a message on the console to let the end-user know
        // what kind of input value the program is expecting
        System.out.println("Please enter an integer value: ");
        int number = scanner.nextInt(); // step 3
        // Here, we are using the methods of the Scanner class, with the object (scanner)
        // of the Scanner class.
        // There are methods for all data types except 1 (character)
        // byte: nextByte()
        // short: nextShort()
        // int: nextInt()
        // long: nextLong()
        // float: nextFloat()
        // double: nextDouble()
        // boolean: nextBoolean()
    }
}

/*  Created by IntelliJ IDEA.
 *   Author: Divyansh Bhardwaj (dbc2201)
 *   Date: 05/07/20
 *   Time: 1:51 PM
 */

package javaPrimitiveDataTypes;

public class JavaPrimitiveDataTypes {
    public static void main(String[] args) {
        /*
         * There are 8 Primitive Data Types in Java
         * data type name           class name
         * 1. byte                  Byte
         * 2. char                  Character
         * 3. short                 Short
         * 4. int                   Integer
         * 5. long                  Long
         * 6. float                 Float
         * 7. double                Double
         * 8. boolean               Boolean
         * */

        // Now, we will examine the range of each and every data type programmatically.
        // Every numerical primitive data type in Java has a minimum number and a maximum number in its range.
        // We can access the number by using
        // Minimum Value: <data type class name>.MIN_VALUE
        // Maximum Value: <data type class name>.MAX_VALUE

        // range for byte
        System.out.println("Range of byte is from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        // range for char
        System.out.println("Range of char is from '" + Character.MIN_VALUE + "' to '" + Character.MAX_VALUE + "'");

        // range for short
        System.out.println("Range for short is from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);

        // range for int
        System.out.println("Range of int is from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        // range for long
        System.out.println("Range of long is from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        // range for float
        System.out.println("Range of float is from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);

        // range for double
        System.out.println("Range of double is from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        // The boolean data type is not a numerical data type in Java as opposed to C.
        // The Java Virtual Machine interprets the boolean true and false values as is and NOT as 0 or 1.
        System.out.println("The boolean data type has the '" + Boolean.TRUE + "' and '" + Boolean.FALSE + "' values.");
    }
}

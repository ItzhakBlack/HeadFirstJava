/**
 * @author: Itzhak Black
 * @version: 1.0
 * @since: April 8th, 2023
 */

public class Exercise1b_c {
    
    //The 'while' loop coude must be inside a method.
    //It can't just be hanging out inside the class.
    //It was missing end curly brace. (line 13)
    public static void main(String[] args) {
        int x = 5;
        while ( x > 1) {
            x = x - 1;
            if ( x < 3) {
                System.out.println("small x");
            }
        }
    }
}

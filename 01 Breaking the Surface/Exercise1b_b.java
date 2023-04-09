/**
 * @author: Itzhak Black
 * @version: 1.0
 * @since: April 8th, 2023
 */

public class Exercise1b_b { 

    //This file won't compile without a class declaration, (line 1)
    //and don't forget the matching curly brace.
    
    public static void main(String[] args) {
        int x = 5;
        while ( x > 1 ) {
            x = x -1;
            if ( x < 3 ) {
                System.out.println("small x");
            }
        }
    }
}

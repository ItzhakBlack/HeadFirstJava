/**
 * @author: Itzhak Black
 * @version: 1.0
 * @since: April 8th, 2023
 */

public class MixedMessageTest {
    
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while ( x < 5 ){

            //Candidate 1 | Output: 00 11 21 32 42
            //y = x - y;

            //Candidate 2 | Output: 00 11 23 36 410
            // y = y + x;

            // Candidate 3 | Output: 02 14 25 36 47
            // y = y + 2;
            // if ( y > 4 ) {
                // y = y -1;
            // }

            //Candidate 4 | Output: 11 34 59
            // x = x + 1;
            // y = y + x;

            //Candidate 5 | Output: 02 14 36 48
            // if ( y < 5 ){
                // x = x + 1;
                // if ( y < 3 ){
                    // x = x - 1;
                // }
            // }
            // y = y + 2;
            
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}

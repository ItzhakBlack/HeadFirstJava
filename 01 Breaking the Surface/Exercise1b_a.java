/**
 * @author: Itzhak Black
 * @version: 1.0
 * @since: April 8th, 2023
 */

 public class Exercise1b_a {
    
    //This will compile and run (no output), but without
    //a line added to the program, it would run forever
    //in an inifinite 'while' loop. (line 9)
    public static void main(String[] args) {
        int x = 1;
        while ( x < 10) {
            x = x + 1;  
            if (x > 3) {
                System.out.println("big x");
            }
        }
    }
}

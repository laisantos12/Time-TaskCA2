import java.util.Scanner;
import java.io.InputStreamReader;

/**
 *
 * @author Eric Mabe 
 */
public class TimeTaskCA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner address = new Scanner(System.in);
        String str;
        System.out.println("Please enter your address here:");
        str = address.nextLine();
        
        System.out.println("Please enter your number here:");
        int number = address.nextInt();
         System.out.println(" your Address is " + number +  str);
        
        if ( number < 0) {
            
                //must be a negative number
                System.out.println("Woah!!! That is a negative number!");
        
        address.close();    
        
            
    }
    
}

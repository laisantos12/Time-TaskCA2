# Time-TaskCA2
CA2
package inpage;

import java.util.Scanner;

public class InpAge {


    public static void main(String[] args) {
         
       /** 
       *
       * @author Almira
       */

       Scanner myName = new Scanner(System.in);
       System.out.println("Enter, your name, please.");

     
       String yourName = myName.nextLine();
       System.out.println("Thank you " + yourName);
         
         
         /**
         *
         * @author Lais Ferreira dos Santos
         * 2020311
         */
        Scanner inpAge = new Scanner(System.in);
        int age; 

        System.out.println("Please enter your age: ");

        try{
            age = inpAge.nextInt(); //reads the next int from the scanner


            if (age <= 0) {
             System.out.println("Sorry! This is not a valid age.");
            }
            else if (age >= 1 && age <= 100){
             System.out.println("Thank you! Your age was submited successfully!");
            }
            else if (age >100){

                System.out.println("Sorry! This is not a valid age.");
            }

        }
        catch (Exception e){
            //input error - typed something else but integer
            System.out.println("This is not a valid age");

        }
    }

}
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


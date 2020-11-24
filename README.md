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


package groupwork;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GroupWork {

    public static void main(String[] args) {
 /** 
 *
 * @author Almira
 */
        Scanner myName = new Scanner(System.in);
        System.out.println("Enter your name please.");
         String yourName = myName.nextLine();
             
/**
 *
 * @author Lais Ferreira dos Santos
 * 2020311
 */
        Scanner inpAge = new Scanner(System.in);
        int age; 
        
        System.out.println("Please enter your age: ");
        
        try{
            age = inpAge.nextInt(); // It reads the next int from the scanner
            
            
            if (age <= 0) {
             System.out.println("Sorry! This is not a valid age.");
            }
            else if (age >= 1 && age <= 100){
         
            }
            else if (age >100){
            
                System.out.println("Sorry! This is not a valid age.");
            } 
            // Daniel Ferreira
            // This code asks the user for the job title
                         
        BufferedReader myKB= new BufferedReader(new InputStreamReader(System.in));
            
        System.out.println("Enter Your Job Title:");
        
          
        String input = myKB.readLine();
         
 /**
 *
 * @author Eric K. Mabe
 * 2020366
 */
            
            
        Scanner address = new Scanner(System.in);
        String str;
        System.out.println("Please enter your address here:");
        str = address.nextLine();
        
        System.out.println("Please enter your number here:");
        int number = address.nextInt();
       
  /**             
  * @author Ahmed Saleem
  *2020340
  */
        Scanner scan = new Scanner(System.in);
            // import scanner into system to read from user
        
                      System.out.println("What is the name of your college:  "); 
            //print the message 
        
         String college = scan.nextLine(); 
            // store in String
       
       
           // The whole group made this part together.  
          // Output messages  
        System.out.println("Name: " + yourName);
        System.out.println("Age: " + age);
        System.out.println("Job Title: " + input);
        System.out.println("Address: " + str + " Num: " + number );
        System.out.println("You're in : " + college);
       
          //input error - typed something else but integer         
        }catch (Exception e){
        System.out.println("This is not a valid age");
          
          
        }    
            
        }       
            
        }
    
      


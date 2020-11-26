
package inpage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        // System.out.println("Thank you " + yourName);       
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
           //  System.out.println("Thank you! Your age was submited successfully!");
            }
            else if (age >100){
            
                System.out.println("Sorry! This is not a valid age.");
            } 
            // This code asks the user for the job title
                         
        BufferedReader myKB= new BufferedReader(new InputStreamReader(System.in));
            
        System.out.println("Enter Your Job Title:");
        
          
        String input = myKB.readLine();
         // System.out.println("Oh, that is a very good Job: " + input + "!!!!");
        
            
            
            
        Scanner address = new Scanner(System.in);
        String str;
        System.out.println("Please enter your address here:");
        str = address.nextLine();
        
        System.out.println("Please enter your number here:");
        int number = address.nextInt();
        // System.out.println(" your Address is " + number +  str);
        System.out.println("Name: " + yourName);
        System.out.println("Age: " + age);
        System.out.println("Job Title: " + input);
        System.out.println("Address: " + str + " Num: " + number );
       
       
          //input error - typed something else but integer         
        }catch (Exception e){
        System.out.println("This is not a valid age");
          
          
        }    
            
        }       
            
        }
    
      


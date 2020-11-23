# Time-TaskCA2
CA2

package odd.even;

import java.util.Scanner;

/**
 *
 * @author laissantos
 */
public class OddEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    int num;  //only numbers 
     System.out.println("Please, enter an integer number: ");
     //The input provided by user is stored in num
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    //if number is divisible by 2, it's an even number
    //else odd number

    if(num%2==0)
      System.out.println("You entered a even number.");
    else
      System.out.println("You entered a odd number."); 
  
    }   
}


package tt.ca2;
 

import java.util.Scanner;


/** 
 *
 * @author Almira
 */
public class TTCA2 {

    
    public static void main(String[] args) {
      Scanner myName = new Scanner(System.in);
        System.out.println("Enter, your name, please.");
    
     {
         String yourName = myName.nextLine();
         System.out.println("Your name is:" + yourName);
    if(yourName.matches("[a-zA-Z ]+")){
          
      } else{System.out.println("ERROR!The name you have entered for "+yourName+" is not valid.");      
         
       
            
    } 
         
    
}
      }}
    

        

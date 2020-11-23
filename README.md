# Time-TaskCA2
CA2



package homework2ex1;
import java.util.Scanner;

/**
 *
 * @author Almira
 */
public class integer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        
        int number1;
        int number2;
        
        System.out.print("Input first integer:");
        number1 = input.nextInt();
        
        System.out.print("Input second integer:");
        number2 = input.nextInt();
        
        if(number1 < number2) {
        System.out.printf("The first integer (%d) is less than the second number integer(%d)", number1, number2);
    }
        else if(number1 > number2){
        
        System.out.printf("The first integer(%d) is grater than the second integer(%d)", number1, number2);
        
        
        }
    }
}

     package simplefilewrite;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author Daniel F Ferreira
 */
public class SimpleFileWrite {

    /**
     * A simple program to demonstrate how to write to a file
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String filename = "output.txt"; //this is to store the name of my file rather than having to re-type it several times
        
        //Step 1 -- you need a BufferedWriter and FileWriter
        
        try {
            
        
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(filename, false));
            //true = append to the file
            //false = overwrite the file
            
            myWriter.write("Hello world!"); //the write method will  write a STRING to the file
            
            int someNumber = 42;
            
            // how can I write a number??
            
            myWriter.newLine();
            
            myWriter.write(Integer.toString(someNumber));  //I use Integer.toString() to convert it to a String!
            
            
            myWriter.close(); //IMPORTANT -- this saves changes  to the file
        }
        catch(Exception e){
            
            System.out.println("Error writing to file " +  filename);
        }
        
       
    }
    
}   

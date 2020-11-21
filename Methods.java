/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author Eric Mabe 
 */
public class Methods {
    static void ericMethods (){
        /**
         * author Eric Mabe 
         */
        System.out.println("this is Eric s Code");
        System.out.println("this is ny main program");
    }
    static void laisMethods (){
        /**
         * Lais 
         */
        System.out.println("this is paul s code");
        System.out.println("this is my main program");
    } 

    
    static int laisMethods( int x, int y ){
        /**
         * @author lais 
         */
        return x +y ;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ericMethods();
        laisMethods();
        
        int sum = ericMethods(11,45);
        System.out.println("sum ="+ sum);
        
    }
    
}

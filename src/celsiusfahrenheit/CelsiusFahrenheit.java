/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsiusfahrenheit;

public class CelsiusFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int c;
       double f;
       
       c=10;
       
       while (c<=100)
       {
       f = (9*c + 160)/5;
       System.out.print( c + " - " + f + " \n ");
       c= c + 10;
       }
    }
    
}

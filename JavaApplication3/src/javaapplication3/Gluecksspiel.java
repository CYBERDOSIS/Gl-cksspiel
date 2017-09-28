
package javaapplication3;

import b7i.random.*;
import java.util.Scanner;


public class Gluecksspiel {


    public static void main(String[] args) {
        double guthaben = 10.00;
        B7IRandom randomNumberGenerator = new B7IRandom();
        System.out.println("Willkommen bei Lucky Dice!");
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Möchten Sie Würfeln? Ja oder Nein");
        String start = myScanner.nextLine();
        while (start.equals("Ja")) {
            System.out.println("Wie viel Geld wollen Sie setzen mind. 0.50€");
            System.out.println("Sie verfügen über " + guthaben + "€ Guthaben.");
            String wetteinsatz = myScanner.nextLine();
            double einsatz = Integer.parseInt (wetteinsatz);
            
            
            
            
        }
        
                
       
    }
    
}

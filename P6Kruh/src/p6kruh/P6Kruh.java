/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6kruh;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class P6Kruh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej polomer");
        double r = sc.nextDouble();
        double obsah, obvod;
        
        obsah = Math.PI*Math.pow(r, 2);
        obvod = 2*Math.PI*r;
                
        System.out.println("obvod kruhu kde r = "+r+" je "+obvod);
        System.out.println("obsah kruhu kde r = "+r+" je "+obsah);
        System.out.format("Obvod kruhu kde r = %.2f je %.2f.%n", r, obvod);
        System.out.format("Obsah kruhu kde r = %.2f je %.2f.%n", r, obsah);
    }
    
}

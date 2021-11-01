/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_branching;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class ul3P14rok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej pozadovany rok:");        
        int rok = sc.nextInt();
        boolean prestup = rok % 4 == 0 | rok % 100 == 0 && rok % 400 == 0; //mmust do log operatory a ternarny operator
        System.out.println((prestup)?("Rok " +rok+ " je prestupny(366 dni)"):("Rok " +rok+ " neni prestupny(365 dni)"));
    }
    
}

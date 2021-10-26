/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03.integers;

/**
 *
 * @author norbert.roland.kny
 */
public class P1TimeToSeconds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //vstup
        int h = 2;
        int m = 37;
        int s = 15;
        final int PREVOD_HS = 3600;
        final int PREVOD_MS = 60;
        //vypocet
        int celkemsekund = (h*PREVOD_HS)+(m*PREVOD_MS)+s;
        //vystup
        System.out.println("Celkovy cas v sekundach je " + celkemsekund + "s.");
    }
    
}

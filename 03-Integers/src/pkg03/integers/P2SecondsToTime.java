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
public class P2SecondsToTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //vstup
        int s = 3661;
        final int PREVOD_HS = 3600;
        final int PREVOD_MS = 60;
        //vypocet
        int hodiny = (s/PREVOD_HS);
        int zbhod = s%PREVOD_HS;
        int minuty = (zbhod/PREVOD_MS);
        int zbsec = zbhod%PREVOD_MS;
        //vystup
        System.out.println("Celkovy cas je " + hodiny + " hod " + minuty + " min " + zbsec + " s. ");
        System.out.println("0" + hodiny + ":0" + minuty + ":0" + zbsec);
    }
    
}

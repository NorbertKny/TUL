/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p9rychlost;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class P9Rychlost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int MIN_IN_HOUR = 60;
        final int SEK_IN_HOUR = 3600;
        Scanner sc = new Scanner(System.in);
        System.out.println("Maximalni povolena rychlost");
        int top = sc.nextInt();
        System.out.println("Delka useku");
        int road = sc.nextInt();
        System.out.println("Zadej cas v hodinach na zacatku");
        double hod = sc.nextInt();
        System.out.println("Zadej cas v minutach na zacatku");
        double min = sc.nextInt();
        System.out.println("Zadej cas v sekundach na zacatku");
        double sek = sc.nextInt();
        System.out.println("Zadej cas v hodinach na konci");
        double hod2 = sc.nextInt();
        System.out.println("Zadej cas v minutach na konci");
        double min2 = sc.nextInt();
        System.out.println("Zadej cas v sekundach na konci");
        double sek2 = sc.nextInt();
        
        casHod = hod2 - hod;
        casMin = min2 - min;
        casSek = sek2 - sek;
        
        rychlost = km/(casHod+((double)casMin/MIN_IN_HOUR)+((double)casSek/SEK_IN_HOUR));
        
        System.out.printf("Prumerna rychlost je %.2f km/h %n", rychlost);
        double prekroceni = rychlost - maxRachlost;
        boolean bylaPrekrocena = prekroceni > 0;
        System.out.printf("Max rachlost %s prekrcena %n", (bylaPrekrocena)? "byla":"nebyla");
        System.out.println("");
    }
    
}

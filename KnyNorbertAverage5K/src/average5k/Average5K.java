/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average5k;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class Average5K {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //prumer = soucet/pocet
        double cas;
        double cas_petina;
        double cas_final = 0;
        int pocet = 0;
        double vysledek;
        do{
            System.out.println("Zadej tvůj čas v minutách, ukoči pomocí 0 nebo záporné hodnoty");
            cas = sc.nextDouble();
            cas_petina = cas/5;
            cas_final = cas_final+cas_petina;
            pocet = pocet+1;
        }while(cas > 0);
        vysledek = cas_final/(pocet-1);
        System.out.println("tvuj prumerny cas na ubehnuti 1km je: "+vysledek);
        
    }
    
}

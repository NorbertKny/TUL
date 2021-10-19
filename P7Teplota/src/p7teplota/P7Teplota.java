/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7teplota;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class P7Teplota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej hodnotu v 6 hod");
        double rano = sc.nextDouble();
        System.out.println("Zadej hodnotu v 12 hod");
        double poledne = sc.nextDouble();
        System.out.println("Zadej hodnotu v 18 hod");
        double vecer = sc.nextDouble();
        
        double prumer = (double)(rano+poledne+(vecer*2))/4;
        System.out.format("Prumerna denni teplota je %2.f%n",prumer);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p13alkohol;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class P13Alkohol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej m pokud jsi muz a z pokud jsi zena");
        String sx = sc.next();
        System.out.println("Zadej objem vypitého nápoje v ml");
        double Q = sc.nextDouble();
        System.out.println("Zadej podíl alkoholu ve vypitém nápoji v %");
        double p = sc.nextDouble();
        System.out.println("Zadej telesnou hmotnost konzumenta v kg");
        double mK = sc.nextDouble();
        
        final double rho = 0.8;
        final double rM = 0.7;
        final double rZ = 0.6;
        final double betaM = 0.1;
        final double betaZ = 0.085;
        
        double mET = (Q*p*rho)/100;
        double promM = mET/(mK*rM);
        double promZ = mET/(mK*rZ);
        double uETm = mK*betaM;
        double uETz = mK*betaZ;
        
        switch (sx){
            case "m":
                double vysledekM = mET/uETm;
                System.out.printf("Máte %.2f ‰ promile, úplně vystřízlivíte za %.1f hodin",promM,vysledekM);
                break;
            case "z":
                double vysledekZ = mET/uETz;
                System.out.printf("Máte %.2f ‰ promile, úplně vystřízlivíte za %.1f hodin",promZ,vysledekZ);
                break;
        }
        
    }
    
}

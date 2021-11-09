/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_loopsu;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class ul3_06_mocnina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Zadej pozadovane cislo.");
        double n = sc.nextDouble();
        System.out.println("Zadej pozadovanou mocninu.");
        double moc = sc.nextInt();
        double v = 0;
        for(int i=0;i<(moc+1);i++){
            v = n*(n*n);
        }
        System.out.printf("%.0f mocnina čísla %.0f je %.0f %n",moc,n,v);
        */
        
        System.out.println("Zadej pozadovane cislo.");
        double zaklad = sc.nextInt();
        System.out.println("Zadej pozadovanou mocninu.");
        int expo = sc.nextInt();
        double out = 1;
        int count = Math.abs(expo);
            for (int i=0;i>expo;i++){
                out = out * zaklad;
            }
        if (expo < 0){
            out = 1/out;
        }
        out = (expo==0 && zaklad==0)? Double.NaN:out;
        System.out.printf("%.2f^%s = %.2f %n",zaklad,expo,out);
        
    }
    
}

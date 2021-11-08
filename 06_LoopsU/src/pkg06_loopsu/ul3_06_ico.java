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
public class ul3_06_ico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej ico:");
        int ico = sc.nextInt();
        //int ico = 25596641;
        
        int n;
        int soucet = 0;
        for(int i = 2; i <=8; i++){
            n = (int) (ico % Math.pow(10, i)/Math.pow(10, i-1));
            //System.out.println(n);
            //System.out.println(i);
            soucet = soucet + n*(i);
        }
        int zb = soucet % 11;
        boolean platnost = ((zb ==0 && ico % 10 ==1) || (zb ==1 && ico % 10 ==0) || ((zb !=0 || zb !=1) && (11-zb) ==ico % 10));
        System.out.println("ICO "+(platnost?"je":"neni")+" platne");
        //System.out.println(zb);
        //System.out.println(soucet);//2az8 n*i (zb !=0 || zb !=1) && (11-zb) == ico %10
    }
    
}

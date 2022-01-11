/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ualg1kny;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class AppArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int delka;
        do{
        System.out.println("Zadej delku posloupnosti / pro ukonceni zadej nulovou nebo zapornou hodnotu");
        delka = sc.nextInt();
        if(delka<=0){
            break;
        }
        System.out.println("Zadej posloupnost");
        int[]a = new int[delka];
        for (int i = 0; i < delka-1; i++) {
            a[i] = sc.nextInt();
        }
        Tools.createPalindrom(a);
        }while(delka>0);
    }
}

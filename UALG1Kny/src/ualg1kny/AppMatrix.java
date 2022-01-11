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
public class AppMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int velikost;
        System.out.println("Zadej velikost matice");
        velikost = sc.nextInt();
        System.out.println("Zadej hodnoty");
        //nacteni hodnot do 2D pole
        System.out.format("Suma = %.2f",Tools.sumSecondDiagonal(a));
    }    
}

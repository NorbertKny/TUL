/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_branching;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class ul3P3kruzniceabod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej 1. souradnici bodu:");        
        double bodX = sc.nextDouble();
        System.out.println("Zadej 2. souradnici bodu:");        
        double bodY = sc.nextDouble();
        System.out.println("Zadej 1. souradnici stredu kruznice:");        
        double stredX = sc.nextDouble();
        System.out.println("Zadej 2. souradnici stredu kruznice:");        
        double stredY = sc.nextDouble();
        System.out.println("Zadej polomer kruznice:");
        double polomer = sc.nextDouble();
        //double bodX = 2;
        //double bodY = 3;
        //double stredX = 5;
        //double stredY = 7;
        //double polomer = 5.001;
        final double presnost = 0.0001;
        final int ON = 0;
        final int OUTSIDE = 1;
        final int INSIDE = 2;
        int position;
        
        double delka_PS = Math.sqrt(Math.pow(bodX - stredX,2) + Math.pow(bodY - stredY,2));
        
        if (Math.abs(delka_PS - polomer) < presnost){
            position = ON;
        }else{
            if (delka_PS < polomer){
                position = INSIDE;  
            }else{
                position = OUTSIDE;
            }
        }
        
        /* */
        if (position == ON){
            System.out.println("bod lezi na kruznici");
        }else{
            if (position == INSIDE){
                System.out.println("bod lezi uvnitr");  
            }else{
                System.out.println("bod lezi mimo");
            }
        }               
    }  
}

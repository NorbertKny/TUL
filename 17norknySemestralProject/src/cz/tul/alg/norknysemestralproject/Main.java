/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.tul.alg.norknysemestralproject;

import java.util.Scanner;

/**
 *
 * @author Norbik
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    static Scanner sc = new Scanner(System.in);
    static int min = 1;
    static int max = 100;
    public static void main(String[] args) {
        // TODO code application logic here
        boolean end = false; 
        do{
            displayMenu();
            int choice = sc.nextInt();
            switch(choice){
                case 1: 
                    ChessMatrices.main();
                    break;
                case 2: 
                    Vanocni_Uloha.main();
                    break;
                case 0: 
                    end = true;
                    break;
                default: System.out.println("Neplatna volba");
            }
        }while(!end);
    }

    private static void displayMenu() {
        System.out.println("1. Semestralni prace");
        System.out.println("2. Vanocni uloha");
        System.out.println("0. Konec");
    }   
}

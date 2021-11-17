/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_guessingnumberu;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
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
                    Variants.userGuesses();
                    break;
                case 2: 
                    Variants.computerGuesses();
                    break;
                case 0: 
                    end =true;
                    break;
                default: System.out.println("Neplatna volba");
            }
        }while(!end);
    }

    private static void displayMenu() {
        System.out.println("1. Hada uzivatel");
        System.out.println("2. Hada pocitac");
        System.out.println("0. Konec");
    }
    
}

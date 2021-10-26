/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03.integers;

/**
 *
 * @author norbert.roland.kny
 */
public class Integers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //vstupy
        int num1; //deklarace promenne
        num1 = 5; //inicializace promenne
        int num2 = 11;
        
        //vypocet, processing
        int division = num2/num1; //celociselne deleni
        int remainder = num2%num1;
        
        //vypis, vystup
        System.out.println("num1 je "+ num1); //spojovani (konkatenace)
        System.out.println("Suma " + num1 + " a " + num2 + " je " + (num1+num2));
        System.out.println("Podil je " + division + " Zbytek po deleni " + remainder);
    }
    
}

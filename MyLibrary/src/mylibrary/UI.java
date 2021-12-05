/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylibrary;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class UI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo:");
        int number = sc.nextInt();
        boolean prime = NumberTools.isPrime(number);
        System.out.println("Cislo "+number+(prime? " je ":" neni ")+ "prvocislo.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_sequence;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class SequencePrimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej pocet");
        int n = sc.nextInt();
        System.out.println("Zadej "+n+" cisel");
        
        int number;
        int countPrimes = 0;
        for (int i=0; i<n; i++){
            number = sc.nextInt();
            if(isPrime(number)){
                countPrimes++;
            }
        }
        System.out.println("Pocet prvocisel je "+countPrimes);
    }

    private static boolean isPrime(int number) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(number<=1){
            return false;
        }
        for(int i=2; i<=number/2; i++){
            if(number % i ==0){
                return false;
            }
        }
        return true;
    }
    
    private static boolean isPrime1(int number) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        boolean prime = true;
        if(number<=1){
            prime = false;
        }else {
            for(int i=2; i<=number/2; i++){
                if(number % i ==0){
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
    
}

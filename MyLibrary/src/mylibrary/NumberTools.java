/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylibrary;

/**
 *
 * @author norbert.roland.kny
 */
public class NumberTools {
    /**
     * Check whether the given number is prime
     * @param number - given number, can be also negative
     * @return true if the given number is prime, false otherwise
     */
    public static boolean isPrime(int number){
        if (number < 2){ //osetreni limitniho stavu
            return false;
        }
        int upperBound = (int)(Math.sqrt(number));
            for (int i=2; i<=upperBound; i++){
                if (number % i ==0){
                return false;
                }
            }
        return true;
    }
    
        public static boolean isPrime1(int number){
        boolean prime = true;
        if (number < 2){ //osetreni limitniho stavu
            prime = false;
        }
        int upperBound = (int)(Math.sqrt(number));
            for (int i=2; prime && i<=upperBound; i++){
                if (number % i ==0){
                prime = false;
                }
            }
        return prime;
    }
    
        public static int generateRandom(int min, int max){
            return (int)(Math.random()*(max-min+1)+min);
    }
        
        public static double cosinus(double x, double eps){
            int n = 2;
            double part = 1;
            double cos = part;
            
            while (Math.abs(part) >= eps){
                part = (-1) * part * Math.pow(x,2)/((n-1)*n);
                cos = cos +part;
                n+=2;
            }
            return cos;
    }
    //testing
    public static void main(String[] args) {
        System.out.println(isPrime(21));
        System.out.println(cosinus(3.14,0.0001));
        System.out.println(Math.cos(3.14));
        System.out.println(generateRandom(10,20));
    }
    
}

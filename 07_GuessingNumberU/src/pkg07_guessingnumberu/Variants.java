/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_guessingnumberu;

/**
 *
 * @author norbert.roland.kny
 */
public class Variants {
    static void userGuesses() {
            //System.out.println("Tady kod pro Hada uzivatel");
            //generovani nahodneho cisla
        //opakovat dokus number != guess
            //nacist od uzivatele guess
            //porovna number a guess
            //vypise vysledek
            int guess;
            boolean win = false;
            int number = generateNumber(Main.min, Main.max);
            do{
                System.out.println("Hadej");
                guess = Main.sc.nextInt();
                if(number > guess){
                    System.out.println("Pocitac si mysli vetsi cislo");
                }else if (number < guess){
                    System.out.println("Pocitac si mysli mensi cislo");
                }else{
                    System.out.println("Uhodl jsi");
                    win = true;
                }
            }while(!win);
    }

    static void computerGuesses() {
        System.out.println("Tady kod pro Hada pocitac");
    }

    private static int generateNumber(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);    
    }
    
    public static void main(String[] args) {
        //userGuesses();
        System.out.println(generateNumber(0,10));
    }
}

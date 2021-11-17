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
                    System.out.println("");
                    win = true;
                }
            }while(!win);
    }

    static void computerGuesses() {
            //System.out.println("Tady kod pro Hada pocitac");
            //lowLimit
            //highLimit
            //guess = lowLimit + highLimit/2
            //if number > guess lowLimit = guess+1
            //if number < guess highLimit = guess-1
            //if number => || lowLimit > highLimit
            int guess;
            //boolean win = false;
            int lowLimit = Main.min;
            int highLimit = Main.max;
            char answer;
            do{
                guess = (lowLimit + highLimit) / 2;
                System.out.println("Hadam ze to je cislo ");
                System.out.println(guess);
                System.out.println("Je tvoje cislo vetsi nebo mensi v/m nez "+guess+", napis x pro ukonceni");
                answer = Main.sc.next().charAt(0);
                if (answer == 'v'){
                    lowLimit = guess + 1;
                }
                if (answer == 'm'){
                    highLimit = guess - 1;
                }
                if (lowLimit > highLimit){
                    System.out.println("Ty mizero,ty podvadis! Uz si s tebou nechci hrat!");
                    System.out.println("");
                    break;
                }
                if (answer == 'x'){
                    System.out.println("Jupi, uhadl jsem tve cislo");
                    System.out.println("");
                }
            }while(answer != 'x');
    }

    private static int generateNumber(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);    
    }
    
    public static void main(String[] args) {
        //userGuesses();
        System.out.println(generateNumber(0,10));
    }
}

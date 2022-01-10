/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.tul.alg.norknysemestralproject;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class Vanocni_Uloha {

    /**
     * @param args the command line arguments
     */
    public static void main() {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int Vmaxi=30 ,Vmini=21;
        int Smaxi=20 ,Smini=11;
        int Mmaxi=10 ,Mmini=5;
        int x=0,y=0;
        System.out.println("Jak moc jsi byl/a tento rok hodny/a? ([v]elmi, [s]tredne,[m]alo)");
        char answer = sc.next().charAt(0);
        if (answer == 'v'){
            x = (int)(Math.random()*(Vmaxi-Vmini))+Vmini;
            y=x;
        }else if(answer == 's'){
            x = (int)(Math.random()*(Smaxi-Smini))+Smini;
            y=x;
        }else if(answer == 'm'){
            x = (int)(Math.random()*(Mmaxi-Mmini))+Mmini;
            y=x;
        }

        int rndmin = 0;
        int rndmax = 10;
    
    String RED_BACKGROUND = "\033[41m";    // RED
    String GREEN_BACKGROUND = "\033[42m";  // GREEN
    String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    String BLUE_BACKGROUND = "\033[44m";   // BLUE
    String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    String CYAN_BACKGROUND = "\033[46m";   // CYAN
    String WHITE_BACKGROUND = "\033[47m";  // WHITE    
    String RESET = "\033[0m";  // Text Reset    
//******************************************************************************
        int rnd = (int)(Math.random()*(rndmax-rndmin))+rndmin;
        for (int i = 1; i < x-1; i++){
                if (i == x/2){ //vodorovna stuha
                    for (int k = 0; k < x; k++){
                    System.out.print(RED_BACKGROUND+" "+RESET);
                    }
                    System.out.println("");
                }
            for(int j = 1; j < y-1; j++){

                if (j == y/2){ //svisla stuha
                    System.out.print(RED_BACKGROUND+"  "+RESET);
                }
                if(rnd == 0){
                    System.out.print(GREEN_BACKGROUND+" "+RESET);
                }else if(rnd == 1){
                    System.out.print(BLUE_BACKGROUND+" "+RESET);
                }else if(rnd == 2){
                    System.out.print(CYAN_BACKGROUND+" "+RESET);
                }else if(rnd == 3){
                    System.out.print(YELLOW_BACKGROUND+" "+RESET);
                }else if(rnd == 4){
                    System.out.print(PURPLE_BACKGROUND+" "+RESET);
                }else if(rnd == 5){
                    System.out.print(YELLOW_BACKGROUND+" "+RESET);
                }else if(rnd == 6){
                    System.out.print(CYAN_BACKGROUND+" "+RESET);
                }else if(rnd == 7){
                    System.out.print(GREEN_BACKGROUND+" "+RESET);
                }else if(rnd == 8){
                    System.out.print(BLUE_BACKGROUND+" "+RESET);
                }else if(rnd == 9){
                    System.out.print(PURPLE_BACKGROUND+" "+RESET);
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
//******************************************************************************        
        }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg.norknysemestralproject;

import java.util.Scanner;

/**
 *
 * @author Norbik
 */
public class ChessMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main() {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int radky,sloupce,blok;
        do{
            System.out.println("Pocet radku");
                radky = sc.nextInt();
                if (radky<=0){
                    break;
                }
            System.out.println("Pocet sloupcu");
                sloupce = sc.nextInt();
                if (sloupce<=0){
                    System.out.println("Spatna velikost sloupce");
                    System.exit(0);
                }
            System.out.println("Velikost bloku");
                blok = sc.nextInt();
                if (blok<=0){
                    System.out.println("Spatna velikost bloku");
                    System.exit(0);
                }
            System.out.println("Vysledna matice");    
        
            String nula = "0 ";
            String jedna = "1 ";
        
            int radkyblok = radky/blok;
            int sloupceblok = sloupce/blok;
        
            for (int i = 0; i < radkyblok; i=i+2) {
            
                for(int x = 0; x < blok; x++){
                    for (int j = 0; j < sloupceblok; j=j+2) {
                            System.out.print( nula.repeat(blok) );
                            System.out.print( jedna.repeat(blok) );

                    }
                    System.out.println("");
                }
                
                for (int y = 0; y < blok; y++){
                    for (int j = 0; j < sloupceblok; j=j+2) {
                            System.out.print( jedna.repeat(blok) );
                            System.out.print( nula.repeat(blok) );
                    }
                    System.out.println("");
                }
            }
            System.out.println("");
        }while(radky > 0);
        System.out.println("");
    }   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_loopsu;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class ul3_06_prvocislo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean prvocislo;
        boolean pokracovat = true; //deklarace mimo cyklus
        int num;
        while (pokracovat){
        prvocislo = true; //nova inicializace
        System.out.println("Zadej cislo vetsi nez 1:");
        num = sc.nextInt();
        //int num = 15;
        if (num < 2){ //osetreni limitniho stavu
            prvocislo = false;
        }else{
            for (int i=2; prvocislo && i<=num/2; i++){
                if (num % i ==0){ //optimalizace kde staci konec cyklu
                prvocislo = false;
            //break; //muzu nekdy z cyklu vyskocit driv
                }
            }
        }
        System.out.printf("Cislo %s prvocislo.\n", (prvocislo)?"je":"neni");
        
        System.out.println("Checete pokracovat? y/n");
        
        pokracovat = Character.toLowerCase(sc.next().charAt(0))=='y';
        sc.next().toLowerCase().charAt(0);
        
        }
    } 
}

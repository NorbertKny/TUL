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
public class ul3_06_VypisJakoSoucinPrvocisel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num =128;
        String vysledek = " ";
        
        if (num >2){
            for (int i=2; i<=num; i++){
                while (num % i ==0){
                    num =num /i;
                    vysledek = vysledek + i + ".";
                }
            }
        }
        if(vysledek.equals("")){ //porovnani stringu
            System.out.println("");
        }else{
        System.out.println(vysledek.substring(0,vysledek.length()-1));
        }
        
        /*Scanner sc = new Scanner(System.in);
        boolean prvocislo;
        boolean pokracovat = true; //deklarace mimo cyklus
        int num;
        int cislo;
            prvocislo = true; //nova inicializace
            //System.out.println("Zadej cislo vetsi nez 1:");
            //num = sc.nextInt();
            cislo = 12;
            for (int j = 2; j <= cislo/2; j++) {
                num = cislo / j;
                prvocislo = true;
                //num = 12;
                if (j < 2) { //osetreni limitniho stavu
                    prvocislo = false;
                } else {
                    for (int i = 2; prvocislo && i < j; i++) {
                        if (j % i == 0) { //optimalizace kde staci konec cyklu
                            prvocislo = false;
                            //break; //muzu nekdy z cyklu vyskocit driv
                        }
                    }
                }
                if ((prvocislo == true) && cislo % j ==0) {
                    System.out.print(j + "*");
                    //j = j*j;
                    //System.out.println(j);
                }
            }*/
            //System.out.printf("Cislo %s prvocislo.\n", (prvocislo)?"je":"neni");

            //System.out.println("Checete pokracovat? y/n");

        }
    }


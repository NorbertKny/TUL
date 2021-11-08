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
public class ul3_06_dokonalecislo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Zadej kladne cislo");
        double c =  sc.nextDouble();
        int v = 0;
        for (int delitel = 1; delitel <(c-1); delitel++){
                if (c % delitel ==0){
                    int pamet = delitel;
                    v = v+pamet;
                }
        }
        if (v == c){
            System.out.println("Cislo "+c+" je dokonale");
        }else{
            System.out.println("Cislo "+c+" neni dokonale");
        }*/
     
        char answer;
        long a;
        long suma;  //nulovani promenych
        boolean dokonaly;
        do{
        System.out.println("Zadej cislo:");
        a = sc.nextLong();
        suma = 0;
        for (long i = 1; i <= a/2; i++){
            if (a % i == 0){
                suma += i;
            }
        }
        dokonaly = (suma == a);
        System.out.println("Cislo "+a+(dokonaly?" je":" neni") + " dokonale.");
        
        System.out.println("Chces pokracovat? a/n");
        answer = sc.next().charAt(0);
        }while(answer == 'a');
    }
    
}

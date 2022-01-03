/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Diag;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Norbik
 */
public class SequenceAritmGeom1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num, d;
        double q;
        boolean isAritm = true;
        boolean isGeom = true;
        
        do{                                                                     //cykly pokud user input <=0
        System.out.println("Zadej delku posloupnosti [pocet cisel ktery je vetsi nez nula] (smysl to ma pro 3 a vice cisel)");
            while (!sc.hasNextInt()) {                                          //pokud dalsi user input(num) neni cislo,
                System.out.println("To neni cislo!");                           //napis zpravu
                System.out.println("Zadej delku posloupnosti [pocet cisel ktery je vetsi nez nula] (smysl to ma pro 3 a vice cisel)");
                sc.next();                                                      //a ptej se na novy input (pote co num scanner nebylo cislo,
            }                                                                   // sc.next pozada o user input a pokud splnuje parametry
        num = sc.nextInt();                                                     // vrati input z aktivniho scanneru
        
        //chybovy stav
        if (num == 1){                                                          //pokud user nezada posloupnost, ukonci program
            System.out.println("Toto neni posloupnost!");
        }
        
        if (num == 2){                                                          //pokud user zada posloupnost 2, ukonci program
            System.out.println("Toto je posloupnost, ale NELZE z ni urcit zda je Aritmeticka nebo Geometricka");
            System.out.println("[diference a kvocient dvou cisel neni s cim porovnat!]");
            System.out.println(" ");
        }
        
        }while (num <= 2);                                                      // v tomto pripade num scanneru a vrati input do num)
        
        int array[] = new int[num];                                             //pole o velikosti num
        
        System.out.println("Zadej " + num + " cisel.");
        System.out.println("HINT: pokud jsi napsal spatnou delku posloupnosti, muzes program ukoncit napsanim '000'");
        for (int i = 0 ; i < array.length; i++ ) {
           if (sc.hasNext("000")){
                System.out.println("Program ukoncen!");
                System.exit(0);
           }  
           if (!sc.hasNextInt()){                                               //pokud je v posloupnosti neco jineho nez cislo, ukonci program
                System.out.println("Toto neni posloupnost!");
                System.exit(0);
           } 
           array[i] = sc.nextInt();
        }
        
        ///**aritm posloupnost**************************************************
        //skok (diference)
        d = array[1] - array[0];
        //overeni skoku (diference) u vsech prvku
        for (int i = 1; i < array.length; i++) {
            if ((array[i] - (array[i-1])) != d) {
                isAritm = false;
            }
        }
        
        System.out.println((isAritm)?("Posloupnost je aritmeticka"):("Posloupnost neni aritmeticka"));
        ///*********************************************************************
        
        ///**geom posloupnost***************************************************
        //nasobek (kvocient)
        q = array[1] / (double)(array[0]);
        //overeni nasobku (kvocientu) u vsech prvku
        for (int j = 1; j < array.length; j++) {
            if ((array[j] / (double)(array[j-1])) != q) {
                isGeom = false;
            }
        }
        System.out.println((isGeom)?("Posloupnost je geometricka"):("Posloupnost neni geometricka"));
        ///*********************************************************************
        
        ///**min/max************************************************************
        int[] arraysort = Arrays.copyOf(array, num);                            //kopie pole s posloupnosti do noveho pole
        Arrays.sort(arraysort);                                                 //sort noveho pole
        System.out.println("minimum je "+arraysort[0]);                         //vypsani minima
        System.out.println("maximum je "+arraysort[arraysort.length-1]);        //vypsani maxima
        ///*********************************************************************
    }
}

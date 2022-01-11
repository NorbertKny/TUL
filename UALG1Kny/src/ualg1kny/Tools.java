/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ualg1kny;

import java.util.Random;

/**
 *
 * @author norbert.roland.kny
 */
public class Tools {
    
public static int[] randomArray(int delka,int min, int max){
    int[]a = new int[delka];
    for (int i = 0; i < a.length; i++) {
        a[i] = Random rand()*((max-min)+min);
    }
    return a;
}

public static int[] createPalindrom(int[]a){
    int[]b = new int[a.length];
    for (int i = a.length-2; i >= 0; i--) {
        b[i] = a[i];        
    }
    int[]c = new int[a.length*2];
    for (int i = 0; i < c.length; i++) {
        if(i<a.length){
            c[i] = a[i];
        }else{
            c[i] = b[i];
        }
    }
    return c;
}

public static int[][] fillEven(int[][]a){
    int sude = 2;
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            a[i][j] = sude;
            sude = sude * 2;
        }
    }
    return a;
}

public static boolean isOpposite(int[][]a,int[][]b){
    boolean opposite = false;
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            if(a[i][j] == ( (b[i][j])*(-1) )){
                opposite = true;  
            }
        }
    }
return opposite;    
}

public static double sumSecondDiagonal(int[][]a){
    double sum = 0;
    for (int i = 0; i < a.length; i++) { //neco podobneho ale pouze pro sekundarni diagonalu
        for (int j = 0; j < a[i].length; j++) { //neco podobneho ale pouze pro sekundarni diagonalu
            sum += a[i][j];
        }
    }
    return sum;
}
    public static void main(String[] args) {
        //testovaci main
        //int[] q = {1,5,8};
        //createPalindrom(q);
    }
}

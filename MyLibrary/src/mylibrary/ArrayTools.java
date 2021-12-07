/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylibrary;

import java.util.Arrays;

/**
 *
 * @author norbert.roland.kny
 */
public class ArrayTools {
    
    public static String toString(int[] a){
        String s = "";
        for (int i = 0; i < a.length; i++) {
            s = s + a[i] + " ";
            
        }
        return s;
    }
    
    public static void fill(int[] a, int number){
        for (int i = 0; i < a.length; i++) {
            a[i] = number;
            
        }
    }
    
    public static void fillIncrese(int[] a){
        //int number = 1;
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
            //a[i] = number;
            //number++;
            
        }
    }
    
    public static void fillIncreseFrom(int[] a, int number){
        for (int i = 0; i < a.length; i++) {
            a[i] = number;
            number++;
        }
    }
    
    public static void fillRandom(int[] a, int min, int max){
        for (int i = 0; i < a.length; i++) {
            a[i] = NumberTools.generateRandom(min, max);
            
        }
    }
    
        public static boolean isAritm(int[] a){
        boolean Aritm = true;
        if (a.length == 0){
            System.out.print("Prazdne pole: ");
            Aritm = false;
            System.out.print("aritmeticka posloupnost: ");
            return Aritm;
        }
        int d = a[1] - a[0];
        for (int i = 1; i < a.length; i++) {
            if ((a[i] - (a[i-1])) != d) {
                Aritm = false;
            }
        }
        if (a.length <= 2){
            System.out.print("Neni posloupnost: ");
            Aritm = false;
        }
        System.out.print("aritmeticka posloupnost: ");
        return Aritm;
    }
    
        public static boolean isGeom(int[] a){
        boolean Geom = true;
        if (a.length == 0){
            System.out.print("Prazdne pole: ");
            Geom = false;
            System.out.print("geometricka posloupnost: ");
            return Geom;
        }
        double q = a[1] / (double)(a[0]);
        for (int j = 1; j < a.length; j++) {
            if ((a[j] / (double)(a[j-1])) != q) {
                Geom = false;
            }
        }
        if (a.length <= 2){
            System.out.print("Neni posloupnost: ");
            Geom = false;
        }
        System.out.print("geometricka posloupnost: ");
        return Geom;
    }    
    
        public static String findMin(int[] a){
        if (a.length == 0){
            System.out.print("Prazdne pole: ");
            return "minimum neexistuje";
        }
        int[] arraysort = Arrays.copyOf(a, a.length);                   
        Arrays.sort(arraysort);                                                 
        String x = "minimum je "+arraysort[0];                         
        return x;        
    }    
    
        public static String findMax(int[] a){
        if (a.length == 0){
            System.out.print("Prazdne pole: ");
            return "maximum neexistuje";
        }    
        int[] arraysort = Arrays.copyOf(a, a.length);                   
        Arrays.sort(arraysort);                                                                         
        String x = "maximum je "+arraysort[arraysort.length-1];
        return x;        
    }    
    
        public static boolean isSorted(int[] a){
        boolean sorted = true;    
        int i;
        for (i = 0; i < a.length-1; i++) {
            if (a[i] > a[i+1]){
                sorted = false;
            } 
        }
        System.out.print("je sorted: ");
        return sorted;
    }
        
        public static int indexOfF(int[]a,int number){
        int first_index = -1;

        for (int i = 0; i < a.length; i++) {
            if (number == a[i]){
                first_index = i;
                System.out.print("prvy vyskyt: index ");
                return first_index;
            }
        }
        System.out.print("prvy vyskyt: index ");
        return -1;
    }    
    
        public static int indexOfL(int[]a,int number){
        int last_index = -1;


        for (int i = a.length-1; i >= 0; i--) {
            if (number == a[i]){
                System.out.print("posledny vyskyt: index ");
                return i;
            }
        }
        System.out.print("posledny vyskyt: index ");
        return -1;

    }
    
    /*public static int indexOf(int[]a,int number){
        int[] indexes = {-1,-1};

        for (int i = 0; i >= 0; i--) {
            if (number == a[i]){
                System.out.print("posledny vyskyt: index ");
                return i;
            }
        }
        System.out.print("posledny vyskyt: index ");
        return -1;

    }*/
    
        public static int[] inverseArr(int[]a){
        int[]b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i]=a[a.length-1-i];
        }
        return b;
    }
    
        public static void inverseArr1(int[]a){

        for (int i = 0; i < a.length/2; i++) {
            int temp;
            temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
    }     
    public static void main(String[] args) {
        int[] b = {1,2,3,4,5};
        int[] b1 = {1,2,3,2,5};
        ArrayToolsUI.show(b);
        System.out.println(" ");
        System.out.println(toString(b));
        fill(b, 1);
        ArrayToolsUI.show(b);
        System.out.println(" ");
        fillIncrese(b);
        ArrayToolsUI.show(b);
        System.out.println(" ");
        fillIncreseFrom(b,20);
        ArrayToolsUI.show(b);
        System.out.println(" ");
        fillRandom(b,10,20);
        ArrayToolsUI.show(b);
        System.out.println(" ");
        System.out.println(isAritm(b));
        System.out.println(isGeom(b));
        System.out.println(findMin(b));
        System.out.println(findMax(b));
        System.out.println(isSorted(b));
        System.out.println(indexOfF(b1,4));
        System.out.println(indexOfL(b1,4));
        int[]c = inverseArr(b1);
        ArrayToolsUI.show(c);
        inverseArr1(b1);
        System.out.println(" ");
        ArrayToolsUI.show(b1);
        System.out.println(" ");
        
    }
}

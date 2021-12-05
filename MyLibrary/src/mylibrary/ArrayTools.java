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
        int d = a[1] - a[0];
        for (int i = 1; i < a.length; i++) {
            if ((a[i] - (a[i-1])) != d) {
                Aritm = false;
            }
        }
        return Aritm;
    }
    
        public static boolean isGeom(int[] a){
        boolean Geom = true;
        double q = a[1] / (double)(a[0]);
        for (int j = 1; j < a.length; j++) {
            if ((a[j] / (double)(a[j-1])) != q) {
                Geom = false;
            }
        }
        return Geom;
    }    
    
        public static String Min(int[] a){
        int[] arraysort = Arrays.copyOf(a, a.length);                   
        Arrays.sort(arraysort);                                                 
        String x = "minimum je "+arraysort[0];                         
        return x;        
    }    
    
        public static String Max(int[] a){
        int[] arraysort = Arrays.copyOf(a, a.length);                   
        Arrays.sort(arraysort);                                                                         
        String x = "maximum je "+arraysort[arraysort.length-1];
        return x;        
    }    
        
    public static void main(String[] args) {
        int[] b = {1,2,3,4,5};
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
        System.out.println("aritmeticka posloupnost: "+isAritm(b));
        System.out.println("geometricka posloupnost: "+isGeom(b));
        System.out.println(Min(b));
        System.out.println(Max(b));
        
    }
}

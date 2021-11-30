/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylibrary;

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
    }
}

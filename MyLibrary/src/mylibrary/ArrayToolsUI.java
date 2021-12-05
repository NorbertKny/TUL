/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylibrary;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class ArrayToolsUI {
    static Scanner sc = new Scanner(System.in);
    
    public static void show (int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    
    public static void load(int[] a){
        System.out.println("Zadej prvky pole");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }
    
    public static int[] load(int n){
        int[] a = new int[n];
        System.out.println("Zadej prvky pole");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
    
    public static void main(String[] args) {
        int[] b = new int[5]; 
        load(b);
        show(b);
    }
}

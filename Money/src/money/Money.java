/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package money;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class Money {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej penize: ");
        int in = sc.nextInt();
        int[]p = {5000,2000,1000,500,200,100,50,20,10,5,2,1};
        int[]out = new int[p.length];
        int tmp = in;
        for (int i = 0; i < p.length; i++) {
            out[i] = tmp/p[i];
            tmp = tmp%p[i];
            if (out[i] != 0){
                System.out.println(p[i]+" "+out[i]);
            }
            
        }
    }
    
}

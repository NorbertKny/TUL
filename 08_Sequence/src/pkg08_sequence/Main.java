/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_sequence;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int number;
        boolean sorted = true;
        int previous = Integer.MIN_VALUE;
        
        while((number = sc.nextInt())>0){
            if(previous >= number){
            sorted = false;
            }
            previous = number;
        }
    }
    
}

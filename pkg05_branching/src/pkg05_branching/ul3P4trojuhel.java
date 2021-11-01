/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_branching;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class ul3P4trojuhel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej stranu a:");        
        double a = sc.nextDouble();
        System.out.println("Zadej stranu b:");        
        double b = sc.nextDouble();
        System.out.println("Zadej stranu c:");        
        double c = sc.nextDouble();

        double absolute = Math.abs(a - b);
        boolean existence = ((a + b) > c) && (absolute < c); //boolean existence = (a+b)>c && (a+c)>b && (b+c)>a;
        System.out.println((existence)?("Trojuhelnik "+a+","+b+","+c+" lze sestrojit"):("Trojuhelnik "+a+","+b+","+c+" nelze sestrojit"));
        //if (existence = true){
           //System.out.printf("Trojuhelnik %.2f %.2f %.2f lze sestrojit %n",a,b,c);
        //}else{
           //System.out.printf("Trojuhelnik %.2f %.2f %.2f nelze sestrojit %n",a,b,c);
           //}
        }
    }

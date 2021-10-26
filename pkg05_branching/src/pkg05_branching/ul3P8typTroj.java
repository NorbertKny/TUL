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
public class ul3P8typTroj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej delku usecky a:");        
        double a = sc.nextDouble();
        System.out.println("Zadej delku usecky b:");        
        double b = sc.nextDouble();
        System.out.println("Zadej delku usecky c:");        
        double c = sc.nextDouble();

        double absolute = Math.abs(a - b);
        boolean existence = ((a + b) > c) && (absolute < c); //boolean existence = (a+b)>c && (a+c)>b && (b+c)>a;
        
        boolean rovnostran = (existence) && (a == b && b == c && c == a) ;
        boolean rovnoramen = (existence) && (a == b && c != a && c != b) || (a == c && b != a && b != c) || (c == b && a != b && a != c);// b == c && c == a) ;;
        boolean rovnoramenpravo = (existence) && (a == b && c != a && c != b) || (a == c && b != a && b != c) || (c == b && a != b && a != c) && (Math.pow(c,2)) == (Math.pow(a,2)) + (Math.pow(b,2)); 
        boolean pravouhly = (existence) && (Math.pow(c,2)) == (Math.pow(a,2)) + (Math.pow(b,2)); //c2 = a2 + b2 
        boolean obecny = (existence) && (a != b && b != c && c != a) ;;
        System.out.println((existence)?("Trojuhelnik "+a+","+b+","+c+" lze sestrojit"):("Trojuhelnik "+a+","+b+","+c+" nelze sestrojit"));
        System.out.println((rovnostran)?("Trojuhelnik "+a+","+b+","+c+" je rovnostranny"):("Trojuhelnik "+a+","+b+","+c+" neni rovnostranny"));
        System.out.println((rovnoramen)?("Trojuhelnik "+a+","+b+","+c+" je rovnoramenny"):("Trojuhelnik "+a+","+b+","+c+" neni rovnoramenny"));
        System.out.println((rovnoramenpravo)?("Trojuhelnik "+a+","+b+","+c+" je rovnoramenny pravouhly"):("Trojuhelnik "+a+","+b+","+c+" neni rovnoramenny pravouhly"));
        System.out.println((pravouhly)?("Trojuhelnik "+a+","+b+","+c+" je pravouhly"):("Trojuhelnik "+a+","+b+","+c+" neni pravouhlyy"));
        System.out.println((obecny)?("Trojuhelnik "+a+","+b+","+c+" je obecny"):("Trojuhelnik "+a+","+b+","+c+" neni obecny"));
    }
    
}

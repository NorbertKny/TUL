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
        System.out.println("Zadej delku usecky a(cm):");        
        double a = sc.nextDouble();
        System.out.println("Zadej delku usecky b(cm):");        
        double b = sc.nextDouble();
        System.out.println("Zadej delku usecky c(cm):");        
        double c = sc.nextDouble();

        double absolute = Math.abs(a - b);
        boolean existence = ((a + b) > c) && (absolute < c); //boolean existence = (a+b)>c && (a+c)>b && (b+c)>a;
        
        boolean rovnostran = (existence) && (a == b && b == c && c == a) ;
        boolean rovnoramen = (existence) && (a == b && c != a && c != b) || (a == c && b != a && b != c) || (c == b && a != b && a != c);// b == c && c == a) ;;
        boolean rovnoramenpravo = (existence) && ((a == b && c != a && c != b) || (a == c && b != a && b != c) || (c == b && a != b && a != c)) && (Math.pow(c,2)) == (Math.pow(a,2)) + (Math.pow(b,2)); 
        boolean pravouhly = (existence) && (Math.pow(c,2)) == (Math.pow(a,2)) + (Math.pow(b,2)); //c2 = a2 + b2 
        boolean obecny = (existence) && (a != b && b != c && c != a);;
        boolean obvod = (existence);
        boolean obsah = (existence);
        boolean tezniceA = (existence);
        boolean tezniceB = (existence);
        boolean tezniceC = (existence);
        
        double o = a+b+c; //obvod
        double S = (Math.sqrt((o/2)*((o/2)-a)*((o/2)-b)*((o/2)-c))); //obsah
        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);
        double tezA = (Math.sqrt(2*((b2) + (c2)) - (a2)))*0.5;
        double tezB = (Math.sqrt(2*((a2) + (c2)) - (b2)))*0.5;
        double tezC = (Math.sqrt(2*((a2) + (b2)) - (c2)))*0.5;
        
        System.out.println((existence)?("Trojuhelnik "+a+","+b+","+c+" lze sestrojit"):("Trojuhelnik "+a+","+b+","+c+" nelze sestrojit"));
        System.out.println((rovnostran)?("Trojuhelnik "+a+","+b+","+c+" je rovnostranny"):("Trojuhelnik "+a+","+b+","+c+" neni rovnostranny"));
        System.out.println((rovnoramen)?("Trojuhelnik "+a+","+b+","+c+" je rovnoramenny"):("Trojuhelnik "+a+","+b+","+c+" neni rovnoramenny"));
        System.out.println((rovnoramenpravo)?("Trojuhelnik "+a+","+b+","+c+" je rovnoramenny pravouhly"):("Trojuhelnik "+a+","+b+","+c+" neni rovnoramenny pravouhly"));
        System.out.println((pravouhly)?("Trojuhelnik "+a+","+b+","+c+" je pravouhly"):("Trojuhelnik "+a+","+b+","+c+" neni pravouhly"));
        System.out.println((obecny)?("Trojuhelnik "+a+","+b+","+c+" je obecny"):("Trojuhelnik "+a+","+b+","+c+" neni obecny"));
        System.out.println((obvod)?("Obvod trojuhelniku "+a+","+b+","+c+" je "+o+" cm"):("Obvod trojuhelniku "+a+","+b+","+c+" neexistuje"));
        System.out.println((obsah)?("Obsah trojuhelniku "+a+","+b+","+c+" je "+S+" cm^2"):("Obsah trojuhelniku "+a+","+b+","+c+" neexistuje"));
        System.out.println((tezniceA)?("Delka teznice ta, trojuhelniku "+a+","+b+","+c+" je "+tezA+" cm"):("Delka teznice ta, trojuhelniku trojuhelniku "+a+","+b+","+c+" neexistuje"));
        System.out.println((tezniceB)?("Delka teznice tb, trojuhelniku "+a+","+b+","+c+" je "+tezB+" cm"):("Delka teznice tb, trojuhelniku trojuhelniku "+a+","+b+","+c+" neexistuje"));
        System.out.println((tezniceC)?("Delka teznice tc, trojuhelniku "+a+","+b+","+c+" je "+tezC+" cm"):("Delka teznice tc, trojuhelniku trojuhelniku "+a+","+b+","+c+" neexistuje"));

    }
    
}

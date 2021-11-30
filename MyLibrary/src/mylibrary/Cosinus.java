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
public class Cosinus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //not finished
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej uhel (ve stupnich):");
        double uhelDeg = sc.nextDouble();
        double uhelRad = Math.toRadians(uhelDeg);
        System.out.println("Zadej presnost (kladne cislo mensi nez 1 a vetsi ne 0)");
        double eps = sc.nextDouble();
        
        if (uhelDeg < 0){
            System.out.println("Spatna velikost uhlu");
            System.exit(0);
        }
        
        if (eps < 0 || eps == 0 || eps >= 1){
            System.out.println("Spatna presnost");
            System.exit(0);
        }
        for(double i = 2; i < 1000;){
        double xd = (Math.pow(uhelRad,i));
        i = i+2;
       
        }
        System.out.println(uhelRad);
        System.out.println(eps);
    }
    
}

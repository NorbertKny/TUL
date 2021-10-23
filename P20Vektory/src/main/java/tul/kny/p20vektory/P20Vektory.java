/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tul.kny.p20vektory;

import java.util.Scanner;

/**
 *
 * @author Norbik
 */
public class P20Vektory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej 1 hodnotu vektoru u");
        double ux = sc.nextDouble();
        System.out.println("Zadej 2 hodnotu vektoru u");
        double uy = sc.nextDouble();
        System.out.println("Zadej 3 hodnotu vektoru u");
        double uz = sc.nextDouble();
        
        System.out.println("Zadej 1 hodnotu vektoru v");
        double vx = sc.nextDouble();
        System.out.println("Zadej 2 hodnotu vektoru v");
        double vy = sc.nextDouble();
        System.out.println("Zadej 3 hodnotu vektoru v");
        double vz = sc.nextDouble();

        double ud = Math.pow(ux,2)+Math.pow(uy,2)+Math.pow(uz,2);
        double u_delka = Math.sqrt(ud);
    
        double vd = Math.pow(vx,2)+Math.pow(vy,2)+Math.pow(vz,2);
        double v_delka = Math.sqrt(vd);
        
        double scalar_uv = (ux*vx)+(uy*vy)+(uz*vz);
        
        double vektor_soucin_wx = (uy*vz) - (uz*vy);
        double vektor_soucin_wy = (uz*vx) - (ux*vz);
        double vektor_soucin_wz = (ux*vy) - (uy*vx);
        
        double uhel_uv = (scalar_uv)/(u_delka*v_delka);
        double uhel_acos = Math.acos(uhel_uv);
        double uhel_deg = Math.toDegrees(uhel_acos);
        
        System.out.printf("Skalární součin vektorů u(%.3f , %.3f , %.3f) a v(%.3f , %.3f , %.3f) je: %.3f%n",ux,uy,uz,vx,vy,vz,scalar_uv);
        System.out.printf("Vektorový součin vektorů u(%.3f , %.3f , %.3f) a v(%.3f , %.3f , %.3f) je: w = (%.3f , %.3f , %.3f)%n",ux,uy,uz,vx,vy,vz,vektor_soucin_wx,vektor_soucin_wy,vektor_soucin_wz);
        System.out.printf("Úhel vektorů u(%.3f , %.3f , %.3f) a v(%.3f , %.3f , %.3f) je: %.2f °stupňů",ux,uy,uz,vx,vy,vz,uhel_deg);
    }
    
}

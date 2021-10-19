/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p17trojuhelnik;

/**
 *
 * @author norbert.roland.kny
 */
public class P17Trojuhelnik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double ax = 0;
        double ay = 0;
        double bx = 3;
        double by = 0;
        double cx = 3;
        double cy = 4;
        
        double c = Math.sqrt(Math.pow(ax-bx,2) + Math.pow(ay-by,2));
        double a = Math.sqrt(Math.pow(cx-bx,2) + Math.pow(cy-by,2));
        double b = Math.sqrt(Math.pow(cx-ax,2) + Math.pow(cy-ay,2));
        
        double obvod = a + b + c;
        double s = obvod/2;
        double obsah = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.println(obvod);
        System.out.println(obsah);
    }
    
}

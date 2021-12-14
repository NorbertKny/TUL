/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_matrixtools;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        boolean end = false;
        do{
            displayMenu();
            int choice = sc.nextInt();
            switch(choice){
                case 1: soucetMatic();
                break;
                case 2: soucinMatic();
                break;
                case 3: normovaniMatic();
                break;
                case 0: end = true;
                break;
                default: System.out.println("neplatna volba");
            }
            
        }while(!end);
    }
    
    public static void displayMenu(){
        System.out.println("1. Soucet matic");
        System.out.println("2. Soucin matic");
        System.out.println("3. Normovani matice");
        System.out.println("0. Konec");
        
    }
    
    public static void soucetMatic(){
        double[][] a = loadMatrix();
        double[][] b = loadMatrix();
        double[][] c = MatrixTools.sum(a,b);
        print(c);
        
    }
    
    public static double[][] loadMatrix(){
        System.out.println("Zadej rozmery matice: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        double[][] matrix = new double[m][n];
        System.out.println("Zadej hodnoty matice po radcich");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextDouble();
                
            }
            
        }
        return matrix;
    }
    public static void print(double[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.format("%6.2f ",a[i][j]);
            }
            System.out.println("");        
        }
    }
    
}

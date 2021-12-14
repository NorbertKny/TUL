/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_matrixtools;

/**
 *
 * @author norbert.roland.kny
 */
public class MatrixTools {
    public static void print(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.format("%4d ",a[i][j]);
            }
            System.out.println("");        
        }
    }
    public static void print(double[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.format("%6.2f ",a[i][j]);
            }
            System.out.println("");        
        }
    }
    public static double[][] sum(double[][] a, double[][] b){
        if(!(a.length == b.length && a[0].length == b[0].length)){
            throw new IllegalArgumentException("Nevhodne velikosti matic");
        }
        double [][] sum = new double[a.length][a[0].length];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
            
        }
        return sum;
    }
    public static double[][] multiply(double[][] a, double[][] b){
        if(a[0].length != b.length){
            throw new IllegalArgumentException("Nevhodne velikosti matic");
        }
        double sum;
        double[][] multi = new double[a.length][b[0].length];
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                sum = 0;
                for (int k = 0; k < b.length; k++) {
                    sum += a[i][k] * b[k][j];
                }
                multi[i][j] = sum;
            }
        }
        return multi;
    }
    public static void normMatrix(double[][] a){
        double normi = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(Math.abs(a[i][j]) > normi){
                    normi = Math.abs(a[i][j]);
                }
            }       
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = a[i][j]/normi;
            }
        }    
    }
    
    public  static boolean isSymetricHorizontal(int[][] a){
        boolean sym = true;
        for (int i = 0; i < a.length/2; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]!=a[a.length-1-i][j]){
                    sym = false;
                }
                
            }
            
        }
        return sym;
    }
    
    public  static boolean isSymetricVertical(int[][] a){
        boolean sym = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length/2; j++) {
                if(a[i][j]!=a[i][a[i].length-1-j]){
                    sym = false;
                }
                
            }
            
        }
        return sym;
    }
    
        public  static boolean isSymetricMainDiag(int[][] a){
        boolean sym = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if(a[i][j]!=a[j][i]){
                    sym = false;
                }
                
            }
            
        }
        return sym;
    }
    
    public  static boolean isSymetricSideDiag(int[][] a){
        boolean sym = true;
        //int size = a.length;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a[i].length-1-i; j++) {
                if(a[i][j]!=a[a.length-1-j][a[i].length-1-i]){
                    sym = false;
                }
                
            }
            
        }
        return sym;
    }
    
    public static void main(String[] args) {
        double[][] b = {{4,8,3},
                     {2,1,11},
                     {5,8,7},
                     {4,8,3}};
        double[][] c = {{1,1,1},
                     {1,1,1},
                     {1,1,1},
                     {1,1,1}};
        int[][] e = {{1,2},
                     {1,1}};
        print(b);
        System.out.println("");
        double[][] sum = sum(b,c);
        print(sum);
        System.out.println("");
        double[][] d = {{4,8},
                     {2,1,},
                     {5,8}};
        //double[][] multi = multiply(b,d);
        //multiply(b,d);
        System.out.println("");
        System.out.println(isSymetricHorizontal(e));
        System.out.println("");
        System.out.println(isSymetricVertical(e));
        System.out.println("");
        System.out.println(isSymetricMainDiag(e));
        System.out.println("");
        System.out.println(isSymetricSideDiag(e));
    }
}

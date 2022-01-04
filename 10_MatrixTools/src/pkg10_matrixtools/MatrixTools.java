/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_matrixtools;

import java.util.Random;

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
    
    public static boolean isSymetricHorizontal(int[][] a){
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
    
    public static boolean isSymetricVertical(int[][] a){
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
    
        public static boolean isSymetricMainDiag(int[][] a){
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
    
    public static boolean isSymetricSideDiag(int[][] a){
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
    
    public static boolean isStochastic(int r,int[][] a){
        boolean stoch = true;
        int suma=0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < r; j++) {
                if(a[i][j] < 0){
                    stoch=false;
                }
                suma += a[i][j];
                if(suma != 1){
                    stoch = false;
                }
                
            }
            
        }
        return stoch;
    }
    
    /*public static int[][] PexesoCards(int a){
        int min = 0;
        int max = a*a;
        int[][]cards = new int[a][a];
        for (int i = 0; i < cards.length; i++) {
            cards[i];//Math.random();
            for (int j = 0; j < cards.length; j++) {
                Math.random();     
            }  
        }
        return cards;
    }*/
    
    public static int[][] Pexeso(int vyska, int sirka){
        //predpoklad vyska * sirka = sude cislo
        int i,j,x,y;
        int max = vyska * sirka / 2;
        int[][]cisla = new int[vyska][sirka];
        
        Random rand = new Random();
        
        for (i = 1; i <= max; i++) {
            for (j = 0; j < 2; j++) {
                x = rand.nextInt(sirka);//index sloupce
                y = rand.nextInt(vyska);//index radku
                
                while (cisla[y][x] != 0){
                    x++;
                    if(x == sirka){ //moc vpravo
                        x = 0;
                        y++;
                    }
                    if(y == vyska) y = 0; //moc dole
                }
                cisla[y][x] = i;   
            } 
        }
        return cisla;
    }
    
    public static boolean checkPexeso(int[][] a){
        if(a.length != a[0].length){ //matice neni ctvercova
            return false;
        }
        if(a.length * a.length % 2 != 0){ //mpocet karet neni sudy
            return false;
        }
        int[]count = new int[(a.length * a.length)/2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                count[a[i][j]-1] += 1;
                
            } 
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i] != 2){
                return false;
            }
        }
        return true;
    }
        /*public static boolean isStochastic2(int[][] a){
            int soucet = 0;
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] < 0){
                    return false;
                }
                soucet += a[i][j];           
        }
        return stoch;
    }*/
    
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
        System.out.println("");
        System.out.println(isStochastic(2,e));
        System.out.println("");
        //print(PexesoCards(2));
    }
}

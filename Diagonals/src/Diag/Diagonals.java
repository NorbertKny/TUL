/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Diag;

/**
 *
 * @author Norbik
 */
public class Diagonals {
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
        int d;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a[i].length-1-i; j++) {
                d = a[i][j] - a[a.length-1-j][a[i].length-1-i];
                
                if(a[i][j] - a[a.length-1-j][a[i].length-1-i] != d){
                    sym = false;
                }
                
            }
            
        }
        return sym;
    }
    
            /*///**aritm posloupnost**************************************************
        //skok (diference)
        d = array[1] - array[0];
        //overeni skoku (diference) u vsech prvku
        for (int i = 1; i < array.length; i++) {
            if ((array[i] - (array[i-1])) != d) {
                isAritm = false;
            }
        }
        
        System.out.println((isAritm)?("Posloupnost je aritmeticka"):("Posloupnost neni aritmeticka"));
        ///*********************************************************************
        
                ///**geom posloupnost***************************************************
        //nasobek (kvocient)
        q = array[1] / (double)(array[0]);
        //overeni nasobku (kvocientu) u vsech prvku
        for (int j = 1; j < array.length; j++) {
            if ((array[j] / (double)(array[j-1])) != q) {
                isGeom = false;
            }
        }
        System.out.println((isGeom)?("Posloupnost je geometricka"):("Posloupnost neni geometricka"));
        ///*********************************************************************/
    
    public static void main(String[] args) {
        int[][] e = {{2,0,0},
                     {0,4,0},
                     {0,0,51}};

        System.out.println(isSymetricMainDiag(e));
        System.out.println("");
        System.out.println(isSymetricSideDiag(e));
    }
}

/*
class GFG {
    static int MAX = 100;
 
    // Function to print the Principal Diagonal
    static void printPrincipalDiagonal(int mat[][], int n)
    {
        System.out.print("Principal Diagonal: ");
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
 
                // Condition for principal diagonal
                if (i == j) {
                    System.out.print(mat[i][j] + ", ");
                }
            }
        }
        System.out.println("");
    }
 
    // Function to print the Secondary Diagonal
    static void printSecondaryDiagonal(int mat[][], int n)
    {
        System.out.print("Secondary Diagonal: ");
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
 
                // Condition for secondary diagonal
                if ((i + j) == (n - 1)) {
                    System.out.print(mat[i][j] + ", ");
                }
            }
        }
        System.out.println("");
    }
 
    // Driver code
    public static void main(String args[])
    {
        int n = 4;
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 } };
 
        printPrincipalDiagonal(a, n);
        printSecondaryDiagonal(a, n);
    }
}
*/

/*
// Java program to print matrix in diagonal order
class GFG {
    static final int MAX = 100;
 
    static void printMatrixDiagonal(int mat[][], int n)
    {
        // Initialize indexes of element to be printed next
        int i = 0, j = 0;
 
        // Direction is initially from down to up
        boolean isUp = true;
 
        // Traverse the matrix till all elements get traversed
        for (int k = 0; k < n * n;) {
            // If isUp = true then traverse from downward
            // to upward
            if (isUp) {
                for (; i >= 0 && j < n; j++, i--) {
                    System.out.print(mat[i][j] + " ");
                    k++;
                }
 
                // Set i and j according to direction
                if (i < 0 && j <= n - 1)
                    i = 0;
                if (j == n) {
                    i = i + 2;
                    j--;
                }
            }
 
            // If isUp = 0 then traverse up to down
            else {
                for (; j >= 0 && i < n; i++, j--) {
                    System.out.print(mat[i][j] + " ");
                    k++;
                }
 
                // Set i and j according to direction
                if (j < 0 && i <= n - 1)
                    j = 0;
                if (i == n) {
                    j = j + 2;
                    i--;
                }
            }
 
            // Revert the isUp to change the direction
            isUp = !isUp;
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int mat[][] = { { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 } };
 
        int n = 3;
        printMatrixDiagonal(mat, n);
    }
}
// This code is contributed by Anant Agarwal.
*/
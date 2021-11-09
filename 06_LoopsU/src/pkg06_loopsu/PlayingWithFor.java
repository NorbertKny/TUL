/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_loopsu;

/**
 *
 * @author norbert.roland.kny
 */
public class PlayingWithFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        int m = 3; //pocet sloupcu
        System.out.println("Line");
        for (int i = 1; i <= n; i++){ //i = 0; i < 5
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.println("Ctverec");
        for (int nRow = 1; nRow <= n; nRow++){
            for (int i = 1; i <= n; i++){ //i = 0; i < 5
            System.out.print("*  ");
        }
        System.out.println("");
        }
        System.out.println("Obdelnik");
        for (int nRow = 1; nRow <= n; nRow++){
            for (int i = 1; i <= m; i++){ //i = 0; i < 5
            System.out.print("*  ");
        }
        System.out.println("");
        }
        System.out.println("Trojuhelnik");
        for (int nRow = 1; nRow <= n; nRow++){
            for (int i = 1; i <= nRow; i++){ //i = 0; i < 5
            System.out.print("* ");
        }
        System.out.println("");
        }
        System.out.println("Trojuhelnik2");
        for (int nRow = 1; nRow <= n; nRow++){
            //vypis mezer
            for (int i = 1; i <= n - nRow ; i++){
                System.out.print(" ");
            }
            //vypis hvezdicky
            for (int i = 1; i <= nRow; i++){ //i = 0; i < 5
            System.out.print("* ");
        }
        System.out.println("");
        }
        System.out.println("CR 3ku6");
        int q = 1;
        int row = 1;
        for (row = 1; row <= q; row++){
            for (int i = 1; i <= row; i++){ //i = 0; i < 5
            System.out.print("* ");
            }
            for (int i = 1; i <= q+row; i++){ //i = 0; i < 5
            System.out.print("@ ");
            }
            System.out.println("");
        }    
        System.out.println("");
        /////////////////////////////////////////////////////////
        int n = 25;
        int m = = math.round(n*1.5f);
        System.out.println("cr");
        for(int nrow = 1; nRow <= n / 2; nRow++){
            for (int i = 1; i <= nrow; i++){
                System.out.print("* ");
            }
            for (int i = 1; i<=m - nRow; i++){
                System.out.print("@ ");
            }
            System.out.println("");
        }
        for (int i = 1; i <= m; i++){
            System.out.println("* ");
        }
        System.out.println("");
        for ( int nRowFromBottom = n / 2; nRowFromBottom >= 1; nRowFromBottom--){
            for (int i = 1; i<= nRowFromBottom; i++){
                System.out.println("* ");
            }
            for (int i = 1; i <= m - nRowFromBottom; i++){
                System.out.println("# ");
            }
            System.out.println("");
        }
        /////////////////////////////////////////////////////////
            //for (int i = 1; i <= row; i++){ //i = 0; i < 5
            //System.out.print("* * * ");
        //}
        }
    }   
//}

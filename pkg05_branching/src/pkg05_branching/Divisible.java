/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_branching;

/**
 *
 * @author norbert.roland.kny
 */
public class Divisible {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 4;
        
        boolean divisible = a % b == 0;
        //redudantna alternativa
        boolean divisible1 = (a % b == 0)? true: false;
        
        //redudantna alternativa
        boolean divisible2;
        if (a % b == 0){
            divisible2 = true;
        }else{
            divisible2 = false;
        }
    }
    
}

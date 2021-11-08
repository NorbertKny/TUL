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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        while(i < 6){
            System.out.println(i+ ". Ahoj");
            i++;
        }
        System.out.println("***********");
        i = 1;
        do{
            System.out.println(i+ ". Ahoj");
            i++;   
        }while(i < 6);
        System.out.println("***********");
        for(i = 1 ; i < 6 ; i++){
            System.out.println(i+ ". Ahoj");
        }
    }
    
}

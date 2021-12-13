/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transakce;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class Transakce {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int k scnextInt/bool[] = new bool k+1/fori i=2 i< i++/if j=i*i j<arr[i]+k0 j=j+1 /fori i=2 i=k+1 i++*/
        String date = "21.12.2020"; int money = 2200;
        
        String month = date.substring(3,5);
        System.out.println(date.substring(3,5));
        int monthnum = Integer.parseInt(month);
        int[] bilance = new int[13];
        
        if(monthnum == 1){
            bilance[1]=bilance[1]+money;
        }else if(monthnum == 2){
            bilance[2]=bilance[2]+money;
        }else if(monthnum == 3){
            bilance[3]=bilance[3]+money;
        }else if(monthnum == 4){
            bilance[4]=bilance[4]+money;
        }else if(monthnum == 5){
            bilance[5]=bilance[5]+money;
        }else if(monthnum == 6){
            bilance[6]=bilance[6]+money;
        }else if(monthnum == 7){
            bilance[7]=bilance[7]+money;
        }else if(monthnum == 8){
            bilance[8]=bilance[8]+money;
        }else if(monthnum == 9){
            bilance[9]=bilance[9]+money;
        }else if(monthnum == 10){
            bilance[10]=bilance[10]+money;
        }else if(monthnum == 11){
            bilance[11]=bilance[11]+money;
        }else if(monthnum == 12){
            bilance[12]=bilance[12]+money;
        }
        System.out.println(Arrays.toString(bilance));
        
        int[] monthBilance = new int[13];
        System.out.println("Zadej pocet plateb: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String datum = sc.next();
            int amount = sc.nextInt();
            int mesic = Integer.parseInt(datum.substring(3,5));
            monthBilance[mesic] = monthBilance[mesic]+amount;
        }
        
        int[]cumSum =new int[13];
        int sum = 0;
        for (int i = 0; i < monthBilance.length;i++){
            sum=sum+monthBilance[i];
            cumSum[i]=sum;
        }
        //Stem.out.println(Arrays.toString(bilance));    
    }
}

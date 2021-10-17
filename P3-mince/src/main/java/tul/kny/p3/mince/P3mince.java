/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tul.kny.p3.mince;

/**
 *
 * @author Norbik
 */
public class P3mince {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //vstupy
int money = 287;
int sto;
int pade;
int dvacet;
int deset; 
int pet; 
int dva;
int jedna;
int n1,n2,n3,n4,n5,n6;
final int kc100 = 100;
final int kc50 = 50;
final int kc20 = 20;
final int kc10 = 10;
final int kc5 = 5;
final int kc2 = 2;
final int kc1 = 1;

//vypocet
sto = money/kc100;
n1 = money%kc100;

pade = n1/kc50;
n2 = n1%kc50;

dvacet = n2/kc20;
n3 = n2%kc20;

deset = n3/kc10;
n4 = n3%kc10;

pet = n4/kc5;
n5 = n4%kc5;

dva = n5/kc2;
n6 = n5%kc2;

jedna = n6/kc1;

//vystup
System.out.println ("Bankomat vydá: "+sto+"x stokorun , "+pade+"x padesatikorun , "+dvacet+"x dvacetikorun , "+deset+" x desetikorun , "+pet+"x petikorun , "+dva+"x dvoukorun , "+jedna+"x korun.");
    }
    
}

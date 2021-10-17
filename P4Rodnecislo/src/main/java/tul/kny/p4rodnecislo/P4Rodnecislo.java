/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tul.kny.p4rodnecislo;

/**
 *
 * @author Norbik
 */
public class P4Rodnecislo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*int n = 1007152222;
        while (n >0){
            System.out.println(n %20);
            n = n/10;
        }*/
        
        /*int f = 1007152222;
        String[] split = (f+"").split("");
        for(int i=0; i<split.length; i++)
            System.out.println(split[i]);*/
        /*int d = 1007152222;
        String str = Integer.toString(d);
        for (int i = 0; i < str.length(); ++i){
            System.out.println(str.charAt(i));
        }*/
        
        /*int d = 1007152222;
        int d1 = d % 2;
        int d2 = (d/20)%20;
        int d3 = (d/100000000);
        System.out.println ("datum narození rok: " +d1+", mesic: "+d2+", den: " +d3);*/
        
        //vstup
//int cislo = 1007152222;
//String cisloString=String.valueOf(cislo);
//int year = cislo /10 % 10;
//int day = cislo /100 % 10  /100;
//int year = Integer.parseInt(cisloString.substring(0,2));
//int month = Integer.parseInt(cisloString.substring(2,4));
//int day = Integer.parseInt(cisloString.substring(4,6));
int year = 02;
String month = "01";
int day = 21;

switch(month){
        case"01":
        month = "leden";
        break;
        case"02":
        month = "unor";
        break;
        case"03":
        month = "brezen";
        break;
        case"04":
        month = "duben";
        break;
        case"05":
        month = "kveten";
        break;
        case"06":
        month = "cerven";
        break;
        case"07":
        month = "cervenec";
        break;
        case"08":
        month = "srpen";
        break;
        case"09":
        month = "zari";
        break;
        case"10":
        month = "rijen";
        break;
        case"11":
        month = "listopad";
        break;
        case"12":
        month = "prosinec";
        break;
}
//vystup
if (year >= 10) {
  System.out.println ("datum narození rok: " +year+", mesic: "+month+", den: " +day);
} else {
  System.out.println ("datum narození rok: 0" +year+", mesic: "+month+", den: " +day);
}
// System.out.println ("Prvni dvojcisli je rok, druhe dvocisli je mesic a treti dvojcisli je den 5head"
    }
    
}

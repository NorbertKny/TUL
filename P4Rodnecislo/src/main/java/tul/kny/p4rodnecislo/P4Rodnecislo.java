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
        //vstup
String rcislo = "1007152226";
String year = rcislo.substring(0,2);
String month = rcislo.substring(2,4);
String day = rcislo.substring(4,6);

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
switch(year){
        case"01":
        System.out.println ("datum narození rok: 0" +year+", mesic: "+month+", den: " +day);;
        break;
        case"02":
        System.out.println ("datum narození rok: 0" +year+", mesic: "+month+", den: " +day);;
        break;
        case"03":
        System.out.println ("datum narození rok: 0" +year+", mesic: "+month+", den: " +day);;
        break;
        case"04":
        System.out.println ("datum narození rok: 0" +year+", mesic: "+month+", den: " +day);;
        break;
        case"05":
        System.out.println ("datum narození rok: 0" +year+", mesic: "+month+", den: " +day);;
        break;
        case"06":
        System.out.println ("datum narození rok: 0" +year+", mesic: "+month+", den: " +day);;
        break;
        case"07":
        System.out.println ("datum narození rok: 0" +year+", mesic: "+month+", den: " +day);;
        break;
        case"08":
        System.out.println ("datum narození rok: 0" +year+", mesic: "+month+", den: " +day);;
        break;
        case"09":
        System.out.println ("datum narození rok: 0" +year+", mesic: "+month+", den: " +day);;
        break;
        default:
        System.out.println ("datum narození rok: " +year+", mesic: "+month+", den: " +day);
}           
    }
    
}

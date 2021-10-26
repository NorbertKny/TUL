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
public class ul3P15rodcislo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String part1 = "012312";
        String part2 = "3450";
        String rcString = part1 + part2;
        long rc = Long.parseLong(rcString);
        //int part1 = 780123;
        //int part2 = 3540;
        
        //long rc = (long)part1*10000 + part2;
        long nineDigits = rc/10;
        long remainder = nineDigits % 11;
        boolean platne = false;
        long lastDigit = rc % 10;
                
        if(remainder == 10){
            if (lastDigit == 0){
            platne = true;
            }
        }else if (lastDigit == remainder){
            platne = true;
        }

        //platne = (remainder == 10 && lastDigit == 0) || (lastDigit == remainder);
        System.out.println("Rodne cislo je "+(platne?"platne.":"neplatne."));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binomialtherorem;
import java.util.*;


/**
 *
 * @author Harshana Serasinghe
 */
public class BinomialTherorem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList coeff = new ArrayList();
       coeff = getCoefficients(8);
       System.out.println(coeff);
    }
    
   public static ArrayList<Integer> getCoefficients(int userVal){
       ArrayList rFactorials = new ArrayList();
       ArrayList coefficients = new ArrayList();
       int nFactorial = 1;
       int rFactorial = 1;
       int coefficient = 0;
       
       for (int nfIndex = 0; nfIndex<=userVal; nfIndex++){
           if (nfIndex != 0){
               nFactorial = nFactorial * nfIndex;
           }  
       }
       
       for (int rfIndex = 0; rfIndex<=userVal; rfIndex++){
           if (rfIndex != 0){
               rFactorial = rFactorial * rfIndex;
           }
           rFactorials.add(rFactorial);
       }
       
       for (int cfIndex=0; cfIndex<=userVal; cfIndex++){
           coefficient = nFactorial / ((int)rFactorials.get(cfIndex) * (int)rFactorials.get(userVal - cfIndex));
           coefficients.add(coefficient);
       }
       return coefficients;
   }
    
    
}

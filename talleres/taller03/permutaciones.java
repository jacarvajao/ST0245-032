/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

/**
 *
 * @author Windows
 */
public class permutaciones {
    public static void permutaciones(String cadena){
        permutacionesAux("",cadena);
    }
    private static void permutacionesAux(String loQueLlevo, String LoQueFalta){
      int n = LoQueFalta.length();  
        
      if (n == 0){
        System.out.println(loQueLlevo);
      } 
          
        else
           for (int i = 0 ; i < n ; i++){
             permutacionesAux(loQueLlevo + LoQueFalta.charAt(i), LoQueFalta.substring(0, i) + LoQueFalta.substring(i+1,n));
           }
    }
}
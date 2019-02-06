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
public class torresDeHannoi {
    public static void torresDeHannoi(int n) {
		torresDeHannoiAux(n, 1, 2, 3);
	}

	
	private static void torresDeHannoiAux(int n, int origen, int intermedio, int destino) {
    if(n==1){
      System.out.println("from "+ origen + " to "+ destino);
    }else{
      torresDeHannoiAux(n-1, origen, destino, intermedio);
        System.out.println("from "+origen+" to "+destino);
      torresDeHannoiAux(n-1, intermedio, origen, destino);
  
  }
        
    }}


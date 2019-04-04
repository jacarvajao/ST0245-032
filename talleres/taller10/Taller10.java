/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller10;
/**
 *
 * @author casa
 */
public class Taller10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
		arbol arb1 = new arbol();
		arb1.insertar(5);
		arb1.insertar(8);
		arb1.insertar(2);
		arb1.borrar(2);
                arb1.imprimir();
		System.out.println(arb1.buscar(2));
		System.out.println(arb1.buscar(5));
                
		
                


	
    }
    
}

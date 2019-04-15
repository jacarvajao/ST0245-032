/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

/**
 *
 * @author casa
 */
public class Taller11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   GrafoMatriz matriz = new GrafoMatriz(5);
        
        matriz.insertar(0, 1);
        matriz.insertar(0, 2);
        matriz.insertar(0, 2);
        matriz.insertar(0, 4);
        matriz.insertar(1, 0);
        matriz.insertar(1, 0);
        matriz.insertar(1, 4);
        matriz.insertar(1, 4);
        matriz.insertar(2, 0);
        matriz.insertar(2, 3);
        matriz.insertar(2, 4);
        matriz.insertar(3, 0);
        matriz.insertar(3, 2);
        matriz.insertar(4, 1);
        matriz.insertar(4, 2);
        matriz.insertar(4, 4);
        matriz.insertar(4, 4);
       
        matriz.eliminar(0, 2);
        
        matriz.imprimir();
    }
    
}

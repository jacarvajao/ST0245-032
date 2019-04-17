/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

/**
 *
 * @author casa
 */
public class Laboratorio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Arbol ab = new Arbol();
       ab.insertar(50);
        ab.insertar(30);
         ab.insertar(24);
          ab.insertar(5);
          ab.insertar(28);
          ab.insertar(45);
          ab.insertar(98);
          ab.insertar(52);
          ab.insertar(60);
          ab.postOrden(ab.raiz);
          
    }
    
}

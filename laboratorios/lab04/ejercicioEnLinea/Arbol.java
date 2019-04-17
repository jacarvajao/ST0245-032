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
public class Arbol {
   Nodo raiz;
    public Arbol() {
        raiz = null;
    }
    public void insertar(int dato){
        Nodo nuevo = new Nodo(dato); 
        if(raiz==null){
            raiz = nuevo;
        }else {
            Nodo aux = raiz; 
            Nodo padre; 
            while(true){ 
                padre = aux;
                if(dato<aux.dato){ 
                aux = aux.izq;
                    if(aux==null){
                        padre.izq=nuevo;
                        return;
                }
                }else{
                    aux = aux.der;
                    if(aux==null){
                        padre.der=nuevo;
                        return;
                    }
                }
            }
        }
    }
    public void postOrden(Nodo n){
        if(n!=null){
            postOrden(n.izq);
            postOrden(n.der);
            System.out.println(n.dato);
        }
    }
   
}

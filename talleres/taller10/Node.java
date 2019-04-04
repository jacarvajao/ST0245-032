package taller10;
public class Node {

    public Node getDerecha() {
        return derecha;
    }

    public Node getIzquierda() {
        return izquierda;
    }

    public int getDato() {
        return dato;
    }
	Node derecha;
	Node izquierda;
	int dato;
	
	Node(int dato){
		this.dato = dato;
                this.derecha=null;
                this.izquierda=null;
	}
        
	
}

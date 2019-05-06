
public class Nodo {
	 int dato;
	    Nodo izq;
	    Nodo der;

	    public Nodo(int dato) {
	        this.dato = dato;
	        this.izq = null;
	        this.der = null;
	    }

	    public void setDato(int dato) {
	        this.dato = dato;
	    }

	    public void setIzq(Nodo izq) {
	        this.izq = izq;
	    }

	    public void setDer(Nodo der) {
	        this.der = der;
	    }

	    public int getDato() {
	        return dato;
	    }

	    public Nodo getIzq() {
	        return izq;
	    }

	    public Nodo getDer() {
	        return der;
	    }
}

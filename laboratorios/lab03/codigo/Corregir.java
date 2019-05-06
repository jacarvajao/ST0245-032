import java.util.Arrays;
import java.lang.IndexOutOfBoundsException;
public class Corregir {
	private Nodo primero;
	private int tamaño;
	
	public Corregir() {
		tamaño = 0;
		primero = null;
	}
	private Nodo getNodo(int index)throws IndexOutOfBoundsException {
		if(tamaño==0||(index>=0 && index<tamaño)) {
			Nodo temp = primero;
			for(int i = 0;i<index;i++) {
				temp=temp.siguiente;
			}
			return temp;
		}else {
			throw new IndexOutOfBoundsException();
		}
	}
	public int tamaño() {
		return tamaño;
	}
	public String get(int index)throws IndexOutOfBoundsException  {
		Nodo temp = getNodo(index);
		return temp.valor;
	}
	
	public void add(String valor, int index) {
		Nodo n = getNodo(index-1);
		Nodo nuevo = new Nodo(valor);
		if(tamaño==0) {
			primero=nuevo;
		}else if(n.siguiente!=null) {
			Nodo aux = n.siguiente;
			n.siguiente=nuevo;
			nuevo.siguiente=aux;
		}else {
			n.siguiente=nuevo;
		}
		tamaño++;
	}
	public void remove(int index) {
		if(index==0) {
			primero=primero.siguiente;
		}else {
			Nodo anterior = getNodo(index-1);
			anterior.siguiente=anterior.siguiente.siguiente;
		}
		tamaño--;
	}
	public boolean buscar(String dato) {
		Nodo temp = primero;
		for(int i=0;i<tamaño;i++) {
			if(dato==temp.valor) {
				return true;
			}
			temp=temp.siguiente;
		}
		return false;
	}
}

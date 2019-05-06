import java.util.Arrays;
import java.lang.IndexOutOfBoundsException;
public class Corregir {
	private Nodo primero;
	private int tama�o;
	
	public Corregir() {
		tama�o = 0;
		primero = null;
	}
	private Nodo getNodo(int index)throws IndexOutOfBoundsException {
		if(tama�o==0||(index>=0 && index<tama�o)) {
			Nodo temp = primero;
			for(int i = 0;i<index;i++) {
				temp=temp.siguiente;
			}
			return temp;
		}else {
			throw new IndexOutOfBoundsException();
		}
	}
	public int tama�o() {
		return tama�o;
	}
	public String get(int index)throws IndexOutOfBoundsException  {
		Nodo temp = getNodo(index);
		return temp.valor;
	}
	
	public void add(String valor, int index) {
		Nodo n = getNodo(index-1);
		Nodo nuevo = new Nodo(valor);
		if(tama�o==0) {
			primero=nuevo;
		}else if(n.siguiente!=null) {
			Nodo aux = n.siguiente;
			n.siguiente=nuevo;
			nuevo.siguiente=aux;
		}else {
			n.siguiente=nuevo;
		}
		tama�o++;
	}
	public void remove(int index) {
		if(index==0) {
			primero=primero.siguiente;
		}else {
			Nodo anterior = getNodo(index-1);
			anterior.siguiente=anterior.siguiente.siguiente;
		}
		tama�o--;
	}
	public boolean buscar(String dato) {
		Nodo temp = primero;
		for(int i=0;i<tama�o;i++) {
			if(dato==temp.valor) {
				return true;
			}
			temp=temp.siguiente;
		}
		return false;
	}
}

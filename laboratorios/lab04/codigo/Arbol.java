
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
    public void Inorde(Nodo n) {
    	if(n!=null) {
    		postOrden(n.izq);
    		System.out.println(n.dato);
            postOrden(n.der);
            
    	}
    }
    public void preOrden(Nodo n) {
    	if(n!=null) {
    		System.out.println(n.dato);
    		postOrden(n.izq);
    		postOrden(n.der);
    	}
    }
}

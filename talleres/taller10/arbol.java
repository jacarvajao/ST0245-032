package taller10;
public class arbol {
	Node raiz;
	
	void insertar(int n) {
		if(raiz==null) {
			Node r = new Node(n);
			raiz = r;
		}else {
			 insertarAux(n,raiz);
		}

	}
	void borrar(int n) {
		borrarAux(n,raiz);
	}
	boolean buscar(int n) {
		return buscarAux(n,raiz);
	}
	void imprimir() {
           imprimirAux(raiz);
	}
	void insertarAux(int n, Node nodo) {
		if(n<nodo.dato && nodo.izquierda==null) {
			Node p = new Node(n);
			nodo.izquierda=p;
		}else if(n>nodo.dato && nodo.derecha==null){
			Node p = new Node(n);
			nodo.derecha = p;
		}
		
	}
	void borrarAux(int n, Node nodo){
		if(nodo==null) {
			
		}else {
			if(n==nodo.izquierda.dato) {
				System.out.println("Izquierda");
				nodo.izquierda= null;
			}else if(n==nodo.derecha.dato) {
				System.out.println("Derecha");
				nodo.derecha = null;
			}else {
				if(n<nodo.dato) {
					borrarAux(n,nodo.izquierda);
				}else if(n>nodo.dato) {
					borrarAux(n,nodo.derecha);
					
				}
			}
		}
		
	}
	boolean buscarAux(int n, Node nodo) {
		if(nodo==null) {
			System.out.println("Ingreso a la primera condicion");
			return false;
		}else {
			if(raiz.dato==n) {
				return true;
			}
			if(nodo.izquierda!=null) {
				if(n==nodo.izquierda.dato ) {
					return true;
				}
			}
			if(nodo.derecha!=null) {
				if(n==nodo.derecha.dato) {
					return true;
				}
			
			}
			if(n>nodo.dato) {
					borrarAux(n, nodo.derecha);
					System.out.println(nodo.derecha.dato);
				}else if(n<nodo.dato) {
					borrarAux(n,nodo.izquierda);
				}
			}
		
		return false;
	}
	void imprimirAux(Node nodo) {
            if(nodo!=null){
                System.out.println( "" +nodo.getDato());
            imprimirAux(nodo.getDerecha());
            imprimirAux(nodo.getIzquierda());
            
            
            }	
	}
            
}

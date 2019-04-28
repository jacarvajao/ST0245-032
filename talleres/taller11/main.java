
public class main {

	public static void main(String[] args) {
		
		GrafoMatriz matriz = new GrafoMatriz(5);
		Graph Grafo  = new Graph();
		/**
		 * Implementacion del grafo con matrices
		 * 
		 */
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
		
		
		
		
		/**
		 * Implementaciòn del grafo con listas
		 */
		
		Grafo.addVertice(18);
		Grafo.addVertice(9);
		Grafo.addVertice(3);
		Grafo.addVertice(1);
		Grafo.addVertice(2);
		Grafo.addArista(18, 18, 0);
		Grafo.addArista(9, 9, 0);
		Grafo.addArista(9, 18, 0);
		Grafo.addArista(3, 3, 0);
		Grafo.addArista(3, 9, 0);
		Grafo.addArista(3, 18, 0);
		Grafo.addArista(1, 1, 0);
		Grafo.addArista(1, 3, 0);
		Grafo.addArista(1, 18, 0);
		Grafo.addArista(1, 9, 0);
		Grafo.addArista(1, 2, 0);
		Grafo.addArista(2, 2, 0);
		Grafo.addArista(2, 18, 0);
		Grafo.impArista(1);
		Grafo.impArista(2);
		Grafo.impArista(3);
		Grafo.impArista(9);
		Grafo.impArista(18);

	}

}

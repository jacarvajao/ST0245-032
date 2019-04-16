
public class main {

	public static void main(String[] args) {
		int[] d = {1,2,3,4};
		Grafo f = new Grafo(d);
		GrafoDlistas grfdl = new GrafoDlistas(d);
		GrafoMatriz matriz = new GrafoMatriz(5);
		
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
		grfdl.setRelaciones(1, 2);
		grfdl.setRelaciones(1, 3);
		grfdl.setRelaciones(2, 4);
		grfdl.setRelaciones(3, 2);
		grfdl.setRelaciones(4, 3);
		
		grfdl.getRelaciones(1);	


	}

}

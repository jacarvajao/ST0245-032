
public class main {

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
	          System.out.println("PosOrden");
	          ab.postOrden(ab.raiz);
	          System.out.println("Inorden");
	          ab.Inorde(ab.raiz);
	          System.out.println("Preorden");
	          ab.preOrden(ab.raiz);
	          
	          
	}

}

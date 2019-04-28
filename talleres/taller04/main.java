
public class main {

	public static void main(String[] args) {
		
		//Implementaciòn del algoritmo que suma los elementos de un arreglo de forma recursiva
		int[] d = {78,45,67,1,34,3,4,6,34,90,23,89,875,12,345,3,3,34,76,12,90,4,5,3,44,67,6,78,5,6,67,1,2,3,4,2,1,2,1,8,1,56,345,23,78,345,234,23,4,234,23,45,23,45,23,95,23,12,23,45,12,34,12,34,45,23,23,34,2,1};
		 long TInicio, TFin, tiempo; 
		P1 p1 = new P1(d);
		TInicio = System.nanoTime(); 
		System.out.println(p1.sum(d.length-1));
		TFin = System.nanoTime();
		tiempo =  TFin-TInicio;
		System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
		System.out.println(d.length);
		
		//Implemenetacion del punto 2.
		
		P2 p2 = new P2(d);
		System.out.println("Este es el mayor"+p2.mayor(d.length-1));
		p2.subConjuntos(1,5);
		

	}

}

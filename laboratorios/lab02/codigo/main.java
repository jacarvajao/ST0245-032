
public class main {

	public static void main(String[] args) {
		int[] datos= {1,12,4,6,1,1,45,2,1,1,2,3,4,3,12,23,2,34,1,2,3,23
					 ,1,2,5,4,3,2,3,2,4,1,2,3,4,5,2,67,8,34,1,12,34,2,3,
					 65,1,2,4,5,1,2,34,32,56,54,1,1,1,2,23,1,2,3,4,5,2,3,34
				,1,23,1,2,3,4,2,1,23,6,12,98,12,34,1,2,3,2,12,7,54,67,1,2,
				3,4,23,23,12,2,45};/*,5,1,2,3,12,23,12,34,12,4,12,3,4,1,2,23,34,12,34,34,
				12,67,3,56,45,34,45,67,82,34,78,56,78,45,90,};*/
		//Implementaciòn del algoritmo InsertionSort
		InsertionSort primero = new InsertionSort(datos);
		long startTimeIsert = System.nanoTime();
		primero.organizar(0);
		long endTimeInsert = System.nanoTime() - startTimeIsert;
		System.out.println("El tiempo de ejecucion de InsertionSort con tamaño: "+datos.length+" es: "+endTimeInsert);
		
		
		//Implementacion del algoritmo MargeSort
		MargeSort h = new MargeSort(datos);
		long startTimeMarge = System.nanoTime();
		h.ordenar(datos.length);
		long endTimeMarge = System.nanoTime()- startTimeMarge;
		System.out.println("El tiempo de ejecucion de MargeSort con tamaño: "+datos.length+" es: "+endTimeMarge);


	}

}

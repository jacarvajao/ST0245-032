
public class InsertionSort {
	int[] datos;
	
	InsertionSort(int[] datos){
		this.datos=datos;
	}
	
	public void organizar(int n) {
		int aux1;
		int aux2;
		if(n<datos.length-1) {
			
			if(n!=datos.length) {
				if(datos[n]>datos[n+1]) {
					aux1=datos[n];
					aux2=datos[n+1];
					datos[n]=aux2;
					datos[n+1]=aux1;
					organizar(n-1);
						
					}
			}
			
			organizar(n+1);
		}
			}

	
	public void imprimir() {
		for(int n = 0;n<=datos.length-1;n++){
			System.out.print(datos[n]+",");
		}
	}
}

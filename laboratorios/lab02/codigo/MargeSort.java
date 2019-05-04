
public class MargeSort {
	int[] datos;
	
	MargeSort(int[] datos){
		this.datos=datos;
	}
	
	public void ordenar(int n) {
		int aux1;
		int aux2;
		if(n!=datos.length-1) {
		if(n>=2) {
			
			ordenar(n/2);
			
		}else {
			if(datos[n]<datos[n-1]) {
				aux1=datos[n];
				aux2=datos[n-1];
				datos[n]=aux2;
				datos[n-1]=aux1;
				ordenar(n+1);
				
			}
		}
		}
			
		
	
	}
	public void imprimir() {
		System.out.println("");
		for(int i =0;i<=datos.length-1;i++) {
			System.out.print(datos[i]+",");
		}
	}
	
}

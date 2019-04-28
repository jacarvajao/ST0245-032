/**
 * Algoritmo que me suma los elementos de un arreglo
 * de forma recursiva
 * @author jacarvajao
 *
 */
public class P1 {
	int[] Arre;
	int suma;
	P1(int[] Arre){
		this.Arre = Arre;
	}
	
	public int sum(int n) {
		if(n>=0) {
			int f = Arre[n];
			suma=suma+f;
			sum(n-1);
		}
		return suma;
	}
	
}

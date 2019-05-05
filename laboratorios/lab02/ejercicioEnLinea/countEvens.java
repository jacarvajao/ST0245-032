
public class countEvens {
	int[] datos;
	public  countEvens(int[] datos) {
		this.datos= datos;
	}
	public int countEvensm() {
		int var=0;
		for(int i =0;i<=datos.length-1;i++) {
			if(datos[i]%2==0) {
				var=var+1;
			}
		}
		return var;
	}
	
}

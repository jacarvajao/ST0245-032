
public class sum13 {
	int[] datos;
	sum13(int[] datos){
		this.datos=datos;
	}
	
	public int sum13m() {
		 int i;
		  int valor=0;
		  for( i = 0;i<=datos.length-1;i++){
		    if(datos[i]!=13){
		      valor=valor+datos[i];
		    }else{
		      i=i+1;
		    }
		    
		  }
		  return valor;
	}
}

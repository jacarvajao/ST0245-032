
public class lucky13 {
	int[] datos;
	
	lucky13(int[] datos){
		this.datos=datos;
	}
	public int lucky13m() {
		for(int i=0;i<=datos.length-1;i++){
		    if(datos[i]==3 || datos[i]==1){
		      return 0; 
		      
		    }
		   
		  }
		  return 1;
	}
}

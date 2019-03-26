import java.util.ArrayList;
import java.util.LinkedList;
public class hashMapme {
ArrayList<Integer>[] datos = new ArrayList[9];
	
	public void put(String nombre,int telefono) {
		  char fL = nombre.charAt(0);
		  int asciiCode = fL;
		  int mod = asciiCode%10;
		  if(datos[mod]!=null) {
			  datos[mod].add(telefono);
		  }else {
			  datos[mod]=new ArrayList();
			  datos[mod].add(telefono);
		  }
		
		 
	}
	public ArrayList<Integer> get(String nombre ) {
		char fL = nombre.charAt(0);
		int asciiCode = fL;
		int mod = asciiCode%10;
		return datos[mod];
	}
}

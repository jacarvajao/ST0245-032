import java.util.*;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class DAT1 {
	Hashtable<String, String> archivosM = new Hashtable<String, String>(); 
	 Hashtable<String, Integer> Datos = new Hashtable<String, Integer>(); 
	 String Materia1;
	 private static final String COMMA_DELIMITER = ",";
	
	DAT1(String Materia1){
	this.Materia1 = Materia1;
	
	}
	public static boolean isNumeric(String cadena) {

       boolean resultado;

       try {
           Integer.parseInt(cadena);
           resultado = true;
       } catch (NumberFormatException excepcion) {
           resultado = false;
       }

       return resultado;
   }
	
	
	public void AddMaterias(String nombre) {
		archivosM.put(nombre, Materia1);
		archivosM.put(Materia1,nombre);
	}
	public void addDatos(String Documento,String materia, int p) throws NumberFormatException, IOException {
		String n;
		System.out.println("_______"+materia+"__________");
		System.out.println("Nombre"+" | | "+"Nota");
		try (BufferedReader br = new BufferedReader(new FileReader(Documento))) {
		    String line;
		    int f=1;
		    while ((line = br.readLine()) != null) {
		    	if(f%2!=0) {
		    		
		    		 String[] values= line.split(COMMA_DELIMITER);
			    	 String ca="";
			    	
			    	 String h = values[values.length-1];
			    	 String m = values[0].substring(0);
			    	 if(m=="\"") {
			    		 n = values[0].substring(1,values[0].length());
			    	 }else {
			    		 n = values[0].substring(1,values[0].length());
			    	 }
			    	  
			    	
			    	for(int i=0;i<h.length()-1;i++) {
			    		if(isNumeric(h.substring(i,i+1))) {
			    			ca=ca+h.substring(i,i+1);
			    		}
			    	}
			    	
			    	if(isNumeric(ca)) {
			    		int d = Integer.parseInt(ca);
					    Datos.put(n, d);
					    if(p==1) {
					    	System.out.println(n+"_______"+d);
					    }
					    
			    	}else {
			    		Datos.put(values[0], 0);
			    	}
			    	 
		    	}
		    	f=f+1;
		    	
		    	
		    }
		    
		}
		

	}
	/*public void ConsultarPorMateria(String materia) {
		int f=0;
		Iterator<?> it = Datos.entrySet().iterator();
		  System.out.println("_________"+materia+"_______");
		  System.out.println("Estudiante____________Nota");
		while(it.hasNext()) {
			  Map.Entry e = (Map.Entry)it.next();
			  System.out.println(e.getKey() + "   |    " + e.getValue()+" "+f);
			  f=f+1;
		}
		
	}*/
	
	public String Alumno(String nombre) {
		return Datos.get(nombre)+"";
	}

}

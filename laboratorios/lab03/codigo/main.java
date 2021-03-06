import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	private static String DAT1a;
	private static String DAT2a;
	private static String FUPROa;
	private static FUPRO fupro;
	private static DAT1 dat1;
	private static DAT2 dat2;

	public static void main(String[] args) throws NumberFormatException, IOException {
		FUPROa = "\\Users\\aecheverri\\OneDrive - Universidad EAFIT\\semestre3\\Datos y algoritmos\\Laboratorios\\Laboratorio 3\\src\\FUPRO.csv";
		DAT1a = "\\Users\\aecheverri\\OneDrive - Universidad EAFIT\\semestre3\\Datos y algoritmos\\Laboratorios\\Laboratorio 3\\src\\DATS1.csv";
	    DAT2a = "\\Users\\aecheverri\\OneDrive - Universidad EAFIT\\semestre3\\Datos y algoritmos\\Laboratorios\\Laboratorio 3\\src\\DATS2.csv";
		fupro = new FUPRO(FUPROa);
		dat1 = new DAT1(DAT1a);
		dat2 = new DAT2(DAT2a);
		
		//El 0 indica que ingreso las materias con su informacion sin mostrar datos con 0
		ConsultarMateria("datos1",0);
		ConsultarMateria("datos12",0);
		ConsultarMateria("fundamentos",0);
		
		
		//El 1 indica que muestro datos de una materia en especifico 
		ConsultarMateria("fundamentos",1);
		ConsultarMateria("dato1",1);
		ConsultarMateria("datos",1);
		 
		//Implementaci�n de consulta por alumno
		 ConsultarEstudainte("Aureliano");
		 
		 System.out.println("Implementacion del punto 2.1 ____________________________");
		 System.out.println("Ingrese el texto");
		 //Implementacion del punto 2.1___________________________________
		 Corregir co = new Corregir();
			String cad = "";
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader (isr);
			String cadena = br.readLine();
			
			for(int i=0;i<=cadena.length()-1;i++) {
				
				co.add(cadena.substring(i,i+1), i);
			}
			
			for(int i=0;i<=co.tama�o()-1;i++) {
				
				char caracter = co.get(i).charAt(0);
				int d = (int)caracter;
				if(d!=91 && d!=93) {
					cad=cad+co.get(i);
				}
				
			}
			System.out.println(cad);
			//________________________________________________________________

		}
	
	
	
	/*
	 * Metodo que me ingresa o consulta por materia dependiendo si es 1 o 0
	 */
	
	public static void ConsultarMateria(String materia,int p) throws NumberFormatException, IOException {
		switch(materia) {
		case "datos1":
			dat1.AddMaterias(materia);
			dat1.addDatos(DAT1a,materia,p);
			break;
		case "datos2":
			dat2.AddMaterias(materia);
			dat2.addDatos(DAT2a,materia,p);
			break;
		case "fundamentos":
			fupro.AddMaterias(materia);
			fupro.addDatos(FUPROa, materia,p);
			break;
			
		}
	}
	/*
	 * Metodo que me muestra la informacion por materia del estudiante 
	 */
	public static void ConsultarEstudainte(String nombre) {
		System.out.println(nombre);
		System.out.println("Datos1 | Datos2 | Fundamentos");
		System.out.println(dat1.Alumno(nombre)+"     |   "+dat2.Alumno(nombre)+" |  "+fupro.Alumno(nombre));
	}
	

}

import java.util.ArrayList;
public class GrafoDlistas {
	
	
	ArrayList<int[]>[][] datos; 
	ArrayList<Integer[]> d;
	int[]dato;
	Integer[] s;
	GrafoDlistas(int[]dato){
		this.dato=dato;
		datos = new  ArrayList[dato.length][2];
		for(int i =0;i<=dato.length-1;i++) {
				datos[i][1] = new ArrayList<int[]>();
				datos[i][0] = new ArrayList<int[]>();
				datos[i][0].add(new int[1]);
				datos[i][0].get(0)[0]=dato[i];
				
				
			}
				
						
	
			}
	
	public void setRelaciones(int vertice,int direccion) {
		for(int i = 0;i<=datos.length-1;i++){
			if(datos[i][0].get(0)[0]==vertice) {
				datos[i][1].add(new int[2]);
				datos[i][1].get(datos[i][1].size()-1)[0]=direccion;
				break;
			}
			if(i==datos.length-1) {
				System.out.println("No se encontro el vertice");
			}
		}
		
	}
	
	
	public void getRelaciones(int vertice) {
		
		for(int i = 0;i<=datos.length-1;i++) {
			if(datos[i][0].get(0)[0]==vertice) {
				System.out.print(datos[i][0].get(0)[0]+"->");
				for(int j = 0; j<=datos[i][1].size()-1;j++) {
					System.out.print(datos[i][1].get(j)[0]+"->");
					
				}
				break;
			}
			if(i==dato.length-1) {
				System.out.println("No se encontro el vertice");
			}
		}
	}
		
		public void setPeso(int vertice, int peso) {
			for(int i = 0;i<=datos.length-1;i++) {
				if(datos[i][0].get(0)[0]==vertice) {
				for(int j = 0;j<=datos[i][1].size()-1;j++) {
					if(datos[i][1].get(j)[0]==vertice) {
						datos[i][1].get(j)[1]=peso;
					}
				}
			}
			
		}
		}
		
		public boolean existTwoPoint (int p1, int p2) {
			boolean p1l= false;
			boolean p2l= false;
			for(int i = 0;i<=datos.length-1;i++) {
				if(datos[i][0].get(0)[0]==p1 ) {
					p1l = true;
					break;
				}
			if(i==dato.length-1) {
				System.out.println("No se encontro el p1");
				break;
			}
			}
			for(int i = 0;i<=datos.length-1;i++) {
				if(datos[i][0].get(0)[0]==p2 && p1l ) {
					return true;
		
				}
				if(i==dato.length-1) {
					System.out.println("No se encontro el p2");
					return false;
				}	
				
			}
			return false;
			
		}
		
	
	

		
	
}
	
	


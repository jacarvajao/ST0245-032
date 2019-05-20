import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Encontrar {
	public static LinkedList<bee> grupo = new LinkedList<bee>();
	public static Noct raiz;
	int contador = 0;
	
	
	
	public void agBee(String archivo) {
		try {            
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String lineaActual = br.readLine();
            lineaActual = br.readLine(); // Descarta la primera linea
            int index = 0;
            String[] dato =  lineaActual.split(",");
            double cxMaxima = Double.parseDouble(dato[0]);
            double cxMinima = Double.parseDouble(dato[0]);
            double cyMaxima = Double.parseDouble(dato[1]);
            double cyMinima = Double.parseDouble(dato[1]);
            double czMaxima = Double.parseDouble(dato[2]);
            double czMinima = Double.parseDouble(dato[2]);
            while (lineaActual != null){ // Mientras no llegue al fin del archivo
            
                String [] cadenaParticionada = lineaActual.split(",");
                double c1 = Double.parseDouble(cadenaParticionada[0]);
                double c2 = Double.parseDouble(cadenaParticionada[1]);
                double c3 = Double.parseDouble(cadenaParticionada[2]);
                
                bee volando = new bee(c1,c2,c3,false);
                grupo.add(volando);
                if(c1>cxMaxima) {
                	cxMaxima = c1;
                	
                }else if(c1>cyMaxima) {
                	cyMaxima=c2;
                	
                }else if(c2>czMaxima) {
                	czMaxima = c3;
                	
                }else if(c1<cxMinima) {
                	cxMinima=c1;
                	
                }else if(c2<cyMinima) {
                	cyMinima = c2;
                	
                }else if(c3<czMinima) {
                	czMinima=c3;
                	
                }
                
                
                lineaActual = br.readLine();
            }
            raiz = new Noct(cxMaxima, cxMinima, cyMaxima, cyMinima, czMaxima, czMinima);
            raiz.a = grupo;
          }
          catch(IOException ioe) {
              System.out.println("Error leyendo el archivo de entrada");
          }
	}
		
		
		public void col() {
			auxCol(raiz);
		}
		
		public void auxCol( Noct f) {
			double valM = Math.sqrt(
					Math.pow(f.maximoX-f.maximoY, 2)+
					Math.pow(f.maximoY-f.minimoY, 2)+
					Math.pow(f.maximoZ-f.minimoZ, 2)
					);
			boolean visit = false;
			
			if(valM<=100 && valM!=0) {
				if(f.a.size()>=1) {
					for(bee d:f.raiz.a) {
						bee h = f.a.poll();
						if(h.visita==false) {
							h.visita=true;
						    f.a.add(h);
						    contador=contador+1;
						}else {
							  f.a.add(h);
						}
						
					
				}
			}else if(f.a.size()==1) {
					bee bebe = f.a.get(0);
					if(f.raiz!=null) {
						for(bee a:f.raiz.a) {
							double valN = Math.sqrt(
									Math.pow(bebe.cx-a.cx, 2)+
									Math.pow(bebe.cy-a.cx, 2)+
									Math.pow(bebe.cz-a.cz, 2)
									);
							if(valN<=100 && valN!=0) {
								System.out.println("Abeja robotica "+bebe.cx+" "+bebe.cy+" "+bebe.cz+" a punto de colisionar");
								System.out.println("JAiro");
								break;
							}
							
						}
				}
				
			}else {
			}
			visit = true;
			}else {
				double divX =  Math.abs(f.maximoX-f.minimoX)/2+f.minimoX;
				double divY = Math.abs(f.maximoY-f.minimoY)/2+f.minimoY;
				double divZ = Math.abs(f.maximoZ-f.minimoZ)/2+f.minimoZ;
				
				Noct cuadrant1 = new Noct(f.maximoX,divX,f.maximoY,divY,f.maximoZ,divZ );
				Noct cuadrant2 = new Noct(divX,f.minimoX,f.maximoY,divY,f.maximoZ,divZ );
				Noct cuadrant3 = new Noct(divX,f.minimoX,divY,f.minimoY,f.maximoZ,divZ );
				Noct cuadrant4 = new Noct(f.maximoX,divX,divY,f.minimoY,f.maximoZ,divZ );
				Noct cuadrant5 = new Noct(f.maximoX,divX,f.maximoY,divY,divZ,f.minimoZ );
				Noct cuadrant6 = new Noct(divX,f.minimoX,f.maximoY,divY,divZ,f.minimoZ);
				Noct cuadrant7 = new Noct(divX,f.minimoX,divY,f.minimoY,divZ,f.minimoZ );
				Noct cuadrant8 = new Noct(f.maximoX,divX,divY,f.minimoY,divZ,f.minimoZ );
				cuadrant1.raiz=f;
				cuadrant2.raiz=f;
				cuadrant3.raiz=f;
				cuadrant4.raiz=f;
				cuadrant5.raiz=f;
				cuadrant6.raiz=f;
				cuadrant7.raiz=f;
				cuadrant8.raiz=f;
				
				for(bee a:f.a) {
					double corx=a.cx;
					double cory=a.cy;
					double corz=a.cz;
					
					if(corx>divX &&  cory>divY && corz>divZ) {
						cuadrant1.a.add(a);
					}
					if(corx<divX && cory>divY && corz>divZ) {
						cuadrant2.a.add(a);
					}
					if(corx<divX && cory<divX && corz>divZ) {
						cuadrant3.a.add(a);
						
					}
					if(corx>divX && cory<divY && corz<divZ) {
						cuadrant4.a.add(a);
						
					}
					if(corx>divX && cory>divY && corz<divZ) {
						cuadrant5.a.add(a);
						
					}
					if(corx<divX && cory>divY && corz<divZ) {
						cuadrant6.a.add(a);
						
					}
					if(corx<divX && cory<divY && corz<divZ) {
						cuadrant7.a.add(a);
						
					}
					if(corx>divX && cory<divY && corz<divZ) {
						cuadrant8.a.add(a);
						
					}
				}
				auxCol(cuadrant1);
				auxCol(cuadrant2);
				auxCol(cuadrant3);
				auxCol(cuadrant4);
				auxCol(cuadrant5);
				auxCol(cuadrant6);
				auxCol(cuadrant7);
				auxCol(cuadrant8);
				


			}
			
			
		}
}
		
	

	



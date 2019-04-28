import java.util.ArrayList;
import java.util.LinkedList; 
import java.util.Queue;

public class Graph {
	ArrayList<OrderedPair<Integer,ArrayList<Nodo>, boolean[]>> graph = new ArrayList<>();
	int vertice;
	Nodo arista;
	private boolean[] v = {false};
	int pos;
	
	
	public void addVertice(int vertice) {
		ArrayList<Nodo> p = new ArrayList<>();
		OrderedPair<Integer,ArrayList<Nodo>,boolean[]> d = new OrderedPair<>(vertice,p,v);
		graph.add(d);
	}
	public boolean sVertice(int vertice) {
		for(int i =0;i<=graph.size()-1;i++) {
			if(graph.get(i).getKey()==vertice) {
				pos=i;
				return true;
			}
			
		}
		return false;
	}
	
	public void  addArista(int verticeI,int verticeF, int pesoVF) {
		ArrayList<Boolean>z = new ArrayList<>();
		z.add(false);
		if(sVertice(verticeI) && sVertice(verticeF)) {
			for(int i =0;i<=graph.size()-1;i++) {
			
				if(graph.get(i).getKey()==verticeI) {
					Nodo d = new Nodo(verticeF,pesoVF,z);
					graph.get(i).getValue().add(d);
					
					break;
				}
			}
				
			}else {
				System.out.println("No se encontro el vertice ");
			}
		
		 		
	
		}
		
	
	public void impArista(int vertice) {
		String t = "";
		
		if(sVertice(vertice)) {
			for(int i =0;i<=graph.size()-1;i++) {
				if(graph.get(i).getKey()==vertice) {
					for(int j=0;j<=graph.get(i).getValue().size()-1;j++) {
						t = t+graph.get(i).getValue().get(j).getVertice()+":"+graph.get(i).getValue().get(j).getPeso()+":"+graph.get(i).getValue().get(j).getVisit()+"->";
					}
					System.out.println("Estas son las aristas de: "+"|"+vertice+"|"+"->"+t);
					break;
				}
		}
	}
}
	
	
}

	
	



import java.util.ArrayList;

class Nodo {
	 OrderedPair<Integer,Integer, ArrayList<Boolean>> nodo;
	 int Vertice;
	 int peso;
	 ArrayList<Boolean> visit;
	Nodo(int vertice, int peso, ArrayList<Boolean> visit){
		this.Vertice = vertice;
		this.peso = peso;
		this.visit = visit;
		nodo = new OrderedPair<>(vertice,peso,visit);
		
	}
	
	public int getPeso() {
		return nodo.getValue();
	}
	
	public int getVertice() {
		return nodo.getKey();
	}
	public boolean getVisit() {
		return nodo.getVisit().get(0);
	}
	public void setVisit(boolean visit) {
		nodo.getVisit().add(0, visit);
	}
	
}

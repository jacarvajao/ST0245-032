
public class main {
	
	public static void main(String[] args) {
		MiArrayList mi = new MiArrayList();
		mi.add(1, 0);
		mi.add(2, 1);
		mi.add(3, 2);
		mi.add(4, 3);
		mi.add(5, 4);
		
		System.out.print(mi.buscar(4));
		mi.remove(3);
		System.out.print(mi.buscar(4));
	}
	

}

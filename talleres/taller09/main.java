import java.util.HashMap;

public class main {

	public static void main(String[] args) {
		
		
		//Implementaciòn del ejercio 1 que se llama hashMapme
		hashMapme t = new hashMapme();
		t.put("Carlos", 123);
		t.put("Wilder", 456);
		System.out.println(t.get("Carlos"));
		System.out.println(t.get("Wilder"));
		
		//Implementacion del ejercio 2 
		HashMap<String, String> empresas = new HashMap<String, String>();
		empresas.put("Google", "Estados Unidos");
		empresas.put("La locura", "Colombia");
		empresas.put("Nokia", "Filandia");
		empresas.put("Sony", "Japòn");
		
		System.out.println(empresas);

	}

}

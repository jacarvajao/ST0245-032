
public class main {

	public static void main(String[] args) {
		long  timiI = System.currentTimeMillis();
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		Encontrar gf = new Encontrar();
		gf.agBee("/home/jacarvajao/Escritorio/datos/ConjuntoDeDatosCon1500000abejas.txt");
		gf.col();
		long timiF=System.currentTimeMillis();
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		long timiT = timiF-timiI;
		long actualMemUsed=afterUsedMem-beforeUsedMem;
		System.out.println("Cantidad de abeja a colisionar: "+gf.contador);
		System.out.println("Tiempo de ejecución"+timiT);
		System.out.println("Gasto de memoria"+" "+actualMemUsed*0.000001);

	}

}

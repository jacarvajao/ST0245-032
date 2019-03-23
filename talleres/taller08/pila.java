import java.util.*;
public class pila {
	Stack<String> notp= new Stack<String>();
	String ecu;
	String ope = "";
	String df = "";
	pila(String ecu){
		this.ecu = ecu;
	}
	
	public void ingresar(){
		for(int i=0;i<=ecu.length()-1;i++) {
			char dato = ecu.charAt(i);
			char dato1;
			String d = dato+"";
			if(i==ecu.length()-1) {
				dato1 = ecu.charAt(i);
			}else {
				dato1 = ecu.charAt(i+1);
			}
			String d1 = dato1+"";
			if(Character.isDigit(dato) && Character.isDigit(dato1)) {
				double v = Double.parseDouble(d+d1);
				String f = v+"";
				notp.push(f);

			 i=i+2;
			}else if(Character.isDigit(dato) && dato1==',') {
				double v = Double.parseDouble(d);
				String f = v+"";
				notp.push(f);
				i=i+1;
			}else if(dato=='/' || dato=='+' || dato=='*' || dato=='-'){
				char dato2 = ecu.charAt(i);
				ope = ope+dato2; 
				
			}
		}
			for(int j = 0;j<=ope.length()-1;j++) {
				char datoo = ope.charAt(j);
				String doo = datoo+"";
				switch(doo) {
					case "/":
						System.out.println(sacar(1));
						break;
						
					case "+":
						System.out.println(sacar(2));
						break;
						
					case "*":
						System.out.println(sacar(3));
						break;
						
					case "-":
						System.out.println(sacar(4));
						break;
						
				}
			
				
			
			}
			
	}
	 double sacar(double op){
		String d1 = notp.pop();
		String d2 = notp.pop();
		double n1 = Double.parseDouble(d1);
		double n2 = Double.parseDouble(d2);
		if(op==1) {
			double div = n1/n2;
			String sol = div+"";
			notp.push(sol);
			return div;
		}else if(op==2) {
			double sum = n1+n2;
			String sol = sum+"";
			notp.push(sol);
			return sum;
		}else if(op==3) {
			double mult = n1*n2;
			String sol = mult+"";
			notp.push(sol);
			return mult;
		}else if(op==4) {
			double rest = n1-n2;
			String sol = rest+"";
			notp.push(sol);
			return rest;
		}
		return 0;
		
	}
}



			
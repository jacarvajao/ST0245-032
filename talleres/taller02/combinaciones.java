/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

/**
 *
 * @author casa
 */
public class combinaciones {
    public static void combinations(String s) { 
		combinationsAux("", s); 
	}

    	private static void combinationsAux(String prefix, String s) {
    if (s.length() == 0){ 
        System.out.println(prefix);

    }else{
    combinationsAux(prefix+s.substring(0,1), s.substring(1));
    combinationsAux(prefix, s.substring(1));
            
    }

}
}

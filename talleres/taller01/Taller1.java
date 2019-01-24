/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

/**
 *
 * @author casa
 */
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Punto punto = new Punto(1.0D, 2.0D);
     System.out.println("La coordenada en el punto x es: "+punto.x());
     System.out.println("La coordenada en el punto y es: "+punto.y());
     System.out.println("El radio en coordenadas polares es: "+punto.radioPolar());
     System.out.println("El ángulo en coordenadas polares es: "+punto.anguloPolar());
     System.out.println("La distancia euclidiana es: "+punto.distanciaEuclidiana());
     Fecha fecha=new Fecha(03,04,2005,18,05,2001);
     System.out.println(fecha.comparar());
     System.out.println(fecha.toString1());
     System.out.println(fecha.toString2());
    }
    
}

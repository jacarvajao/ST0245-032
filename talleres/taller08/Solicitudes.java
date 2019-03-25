/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller8;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author casa
 */
public class Solicitudes {
    private String Nombre;
    private int cantidad;
    
    public Solicitudes(String Nombre, int cantidad){
    this.Nombre=Nombre;
    this.cantidad=cantidad;
    }
    
    public void Mostrar(){
        System.out.println("Nombre: "+ Nombre+"\n Cantidad: "+
                cantidad);
    }
    public void Insertar(){
     Queue<Solicitudes>s= new LinkedList<Solicitudes>();
    Solicitudes solicitud1=new Solicitudes("Exito",2);
    Solicitudes solicitud2=new Solicitudes("Eafit",2);
    Solicitudes solicitud3=new Solicitudes("Olimpica",2);
     s.add(solicitud1);
     s.add(solicitud2);
     s.add(solicitud3);
    }
}

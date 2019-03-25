/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller8;

import java.util.Stack;

/**
 *
 * @author casa
 */
public class Neveras {
    private String marca;
    private int codigo,stock;
    
    public Neveras(String marca, int codigo){
    this.marca=marca;
    this.codigo=codigo;
    }
    public void Mostrar(){
        System.out.println("Marca: "+ marca+"\n Código: "+
                codigo);
    }
    public int getStock(){
    return stock;
    }
    public void Insertar(){
     Stack<Neveras>neveras= new Stack<Neveras>();
    Neveras nevera1=new Neveras("Haceb",1);
    Neveras nevera2=new Neveras("Lg",2);
    Neveras nevera3=new Neveras("Ibm",3);
    Neveras nevera4=new Neveras("Haceb",4);
    Neveras nevera5=new Neveras("Ibm",5);
    neveras.push(nevera1);
    neveras.push(nevera2);
    neveras.push(nevera3);
    neveras.push(nevera4);
    neveras.push(nevera5);
    }
}

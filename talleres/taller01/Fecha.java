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
public class Fecha {
     private final int dia1;
    private final int mes1;
    private final int anyo1;
    private final int dia2;
    private final int mes2;
    private final int anyo2;


    /**
     * Se inicializan las variables globales en el constructor de manera que no posean valores nulos o 0s.
     */
    public Fecha(int dia1,int mes1, int anyo1,int dia2,int mes2,int anyo2) {
     this.dia1=dia1;
     this.mes1=mes1;
     this.anyo1=anyo1;
     this.dia2=dia2;
     this.mes2=mes2;
     this.anyo2=anyo2;
    }

    /**
     * Método para obtener la variable global dia.
     *
     * @return el dia
     */
    public int dia1() {
        return dia1;
    }
     public int dia2() {
        return dia2;
    }

    /**
     * Método para obtener la variable global mes.
     *
     * @return el mes
     */
    public int mes1() {
        return mes1;
    }
    public int mes2() {
        return mes2;
    }

    /**
     * Método para obtener la variable global anio.
     *
     * @return el año
     */
    public int anyo1() {
        return anyo1;
    }
    public int anyo2() {
        return anyo2;
    }
    /**
    * @param otra representa la fecha con la culase va a comparar.
    *
    * El método comprar se encarga de devolvernos respuesta a tres posibilidades.
    * 1: si la fecha es menor que la otra retorna -1.
    * 2: si la fecha es igual que la otra retorna 0.
    * 3: si la fecha es mayor que la otra retorna 1.
    *
    * @return -1 sí es menor; 0 sí es igual; 1 sí es mayor.
    *
    */

    public int comparar() {
        int menor=-1;
        int mayor=1;
        int igual=0;
       if(anyo1!=anyo2){
          if(anyo1<anyo2){
              return menor;
          }else{
          return mayor;
          }
       }else if(mes1!=mes2){
       if(mes1<mes2){
           return menor;
       }else{
           return mayor;
       }
       }else if(dia1!=dia2){
       if(dia1<dia2){
           return menor;
       }else{
           return mayor;
       }
       }
       return igual;
    }


     /**
    * toString se encargará de convertir el tipo abstracto fecha en un tipo cadena
    * para su posterior visualización
    *
    * @return una cadena que contiene la fecha
    */
    public String toString1() {
       String dia01 = Integer.toString(dia1);
       String mes01 = Integer.toString(mes1);
       String anyo01=Integer.toString(anyo1);
       String fecha1= dia01+"/"+mes01+"/"+anyo01;  
       return fecha1;
    }
    public String toString2() {
       String dia02 = Integer.toString(dia2);
       String mes02 = Integer.toString(mes2);
       String anyo02=Integer.toString(anyo2);
       String fecha2= dia02+"/"+mes02+"/"+anyo02;  
       return fecha2;
    }
}

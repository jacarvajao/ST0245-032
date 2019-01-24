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
public class Punto {
     private double x;
  


  private double y;
  


  public Punto(double x, double y)
  {
    this.x = x;
    this.y = y;
  }
  


  public double x()
  {
    return x;
  }
  


  public double y()
  {
    return y;
  }
  



  public double radioPolar()
  {
    double radioP = Math.sqrt(x * x + y * y);
    return radioP;
  }
  



  public double anguloPolar()
  {
    double anguloP = Math.atan(y / x);
    return anguloP;
  }
  


  public double distanciaEuclidiana()
  {
    double x2 = 4.0D;
    double y2 = 4.0D;
    
    double dE = Math.sqrt(Math.pow(x2 - x, 2.0D) + Math.pow(y2 - y, 2.0D));
    return dE;
  }
}

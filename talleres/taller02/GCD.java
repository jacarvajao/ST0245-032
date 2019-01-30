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
public class GCD {
   
    public static int gcd(int p, int q) {
    if (q == 0) 
  return p;
else 
  return gcd(q, p%q);
  }
}

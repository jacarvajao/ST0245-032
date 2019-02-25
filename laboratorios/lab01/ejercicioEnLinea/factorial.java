/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

/**
 *
 * @author Windows
 */
public class factorial {
       public static int factorial(int n) {
  if(n<=1)
    return n;
    return n*factorial(n-1);
    //T(n)=T(n-1)+c
}
}

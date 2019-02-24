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
public class count7 {
  public static int count7(int n) {
  if(n==0){
    return 0;
  }
  if(n%10==7){
    return 1+count7(n/10);
  }
  return count7(n/10);
}
}

package laboratorio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows
 */
public class BunnyEars2 {
    public static int  bunnyEars2(int bunnies) {
  if(bunnies==0){
  return 0;
  }if(bunnies%2==1){
    return 2+bunnyEars2(bunnies-1);
  }
  return 3+bunnyEars2(bunnies-1);
}
}

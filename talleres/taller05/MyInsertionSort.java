package taller5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows
 */
public class MyInsertionSort {
      public static void doInsertionSort(){
          long start = System.nanoTime();
         int[] input={1,3,4,52,23,2};//C1
        int temp;//C2
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){//C3*n*n
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        //T(n)=C1+C2+C3*n*n
        //T(n)=O(n*n)
        long end = System.nanoTime();
        System.out.println(end-start);
          System.out.println(input);
    }

}

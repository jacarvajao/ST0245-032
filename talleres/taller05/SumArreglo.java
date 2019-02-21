/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller5;

/**
 *
 * @author Windows
 */
public class SumArreglo {
    public static void ciclo(){
        long start = System.nanoTime();
        int[]arr={1,3,4,3,2,1,3,4,3,2,1,3,47,15,30,41,3,40,13,3,45,1,30,44,33,2,1,3,54,1,10,83,43,37,2,1,93,44,63,2,3,1,3,488,33,2,40,33,25,3,2,38,2,1,39,45,33,2,1,3,94,32,23,33,42,1,3,4,3,2,3,2,1,3,4,3,2,1,3,4,1,3,4,3,2,3,2,3,2,1,1,3,4,3,2,3,4,3,2};
        int sum=0;//C1
        int n=arr.length;//C2
        for(int i=0;i<n;i++){//C3*n
        sum+=arr[i];//C4*n
        }
        long end = System.nanoTime();
           System.out.println(end-start);
        System.out.println(sum);//C5
        //T(n)=C1+C2+C3*n+C4*n+C5
        //T(N)=O(n)
    }
}

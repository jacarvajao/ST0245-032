/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

/**
 *
 * @author Windows
 */
public class seriesUp {
    public int[] seriesUp(int n) {
    int[] arr = new int[n*(n+1)/2];
    
    int index = 0;
        
    for(int i = 1; i <= n; i++) {
        for(int j = 0; j < i; j++) {
            arr[index + j] = j + 1;
        }
        index += i;
    }
                                
    return arr;
}
}

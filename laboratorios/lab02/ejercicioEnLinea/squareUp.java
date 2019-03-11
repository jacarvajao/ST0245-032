package laboratorio2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows
 */
public class squareUp {
    public int[] squareUp(int n) {
    int[] arr = new int[n*n];
    
    if(n == 0)
        return arr;
              
    for(int i = n - 1; i < arr.length; i += n) {
        for(int j = i; j >= i - i / n; j--)
            arr[j] = i - j + 1;
    }
                              
    return arr;
}
}

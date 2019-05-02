/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller13;

/**
 *
 * @author casa
 */
public class Heap {
   public void orden(int array[]) {
        int size = array.length;

       
        for (int i = size / 2 - 1; i >= 0; i--)
            apilar(array, size, i);
        for (int i=size-1; i>=0; i--) {
            int a = array[0];
            array[0] = array[i];
            array[i] = a;
            apilar(array, i, 0);
        }
    }

 
    void apilar(int array[], int heapSize, int i) {
        int grande = i;
        int hijo_izquierdo  = 2*i + 1; 
        int hijo_derecho  = 2*i + 2; 

        if (hijo_izquierdo  < heapSize && array[hijo_izquierdo ] > array[grande])
            grande = hijo_izquierdo ;

        if (hijo_derecho  < heapSize && array[hijo_derecho ] > array[grande])
            grande = hijo_derecho ;

        if (grande != i) {
            int swap = array[i];
            array[i] = array[grande];
            array[grande] = swap;

            apilar(array, heapSize, grande);
        }
    }
}

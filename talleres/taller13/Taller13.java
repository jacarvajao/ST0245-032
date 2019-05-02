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
import java.util.Arrays;
public class Taller13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int array [] = {9, 10, 5, 3, 1, 2, 6};

        Heap heap = new Heap();
        heap.orden(array);

        System.out.println(Arrays.toString(array));
    }
    
}

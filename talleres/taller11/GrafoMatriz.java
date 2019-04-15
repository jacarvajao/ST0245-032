/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

/**
 *
 * @author casa
 */
public class GrafoMatriz {
     private int n;
    private int[][] matriz;
 
    public GrafoMatriz(int n) {
        this.n = n;
        matriz = new int[this.n][this.n];
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                matriz[i][j] = 0;
            }            
        }
    }
    
    public void insertar(int i, int j){
        matriz[i][j] += 1;
    }
    
    public void eliminar(int i, int j){
        if(matriz[i][j]>0)
            matriz[i][j] -= 1;
    }
    
    public void imprimir(){
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                System.out.print( matriz[i][j] + "  " );        
            }
            System.out.println();
        }  
    }
}

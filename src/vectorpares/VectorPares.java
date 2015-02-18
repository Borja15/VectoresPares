/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorpares;

/**
 *
 * @author Borja Andrades
 */
public class VectorPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Longitud previamente definida
        final int LONGITUD = 10;
        int[] vector = new int[LONGITUD];
        int numero = 2;
        //Asignarle un 2,cada 2 para ser pares
        for(int i=0; i<LONGITUD; i++) {
            vector[i] = numero;
            numero++;
            numero++;
        }
        //Mostrar 10 numeros pares
        for(int i=0; i<LONGITUD; i++) {
        System.out.print(vector[i]+" ");
        }
    }
    
}

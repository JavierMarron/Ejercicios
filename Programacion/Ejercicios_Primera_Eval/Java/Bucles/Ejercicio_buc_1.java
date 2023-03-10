package com.politecnicomalaga.ejercicio_buc_1;

import java.util.Scanner;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class Ejercicio_buc_1 {

    public static void main(String[] args) {
        Scanner miescaner = new Scanner(System.in);
        int num = 0 , resultado = 1;
        
        System.out.println("Indica el número: ");
        num = miescaner.nextInt();
        
        System.out.println("Su resultado es ");
        for(int i = 0 ; i < 10 ; i++){
            resultado= i * num;
            System.out.println(resultado);
        }
    }
}
 
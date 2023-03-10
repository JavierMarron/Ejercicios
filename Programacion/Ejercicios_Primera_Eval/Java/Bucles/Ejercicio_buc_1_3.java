package com.politecnicomalaga.ejercicio_buc_1_3;

import java.util.Scanner;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class Ejercicio_buc_1_3 {

    public static void main(String[] args) {
        Scanner miescaner = new Scanner(System.in);
        int num = 0 , resultado = 1;
        int i = 0 ;
        
        System.out.println("Indica el número: ");
        num = miescaner.nextInt();
        
        System.out.println("Su resultado es ");
        do{
            resultado= i * num;
            System.out.println(resultado);
            i++;
        }while(i < 10 );
    }
}
/*
 do {
      System.out.println("DO-WHILE"); // Bucle infinito.
    } while(i != 0);
*/
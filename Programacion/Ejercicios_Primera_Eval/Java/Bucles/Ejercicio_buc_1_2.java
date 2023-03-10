package com.politecnicomalaga.ejercicio_buc_1_2;

import java.util.Scanner;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class Ejercicio_buc_1_2 {

    public static void main(String[] args) {
        Scanner miescaner = new Scanner(System.in);
        int num = 0 , resultado = 1;
        int i = 0 ;
        
        System.out.println("Indica el número: ");
        num = miescaner.nextInt();
        
        System.out.println("Su resultado es ");
        while(i < 10 ){
            resultado= i * num;
            System.out.println(resultado);
            i++;
        }
    }
}

package com.politecnicomalaga.ejercicio_var_1_6;

import java.util.Scanner;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class Ejercicio_var_1_6 {

    public static void main(String[] args) {
        float precio, resultado , preciofinal ;
        Scanner miescaner; 
        
        miescaner = new Scanner(System.in);
        System.out.println("¿Cual es el precio?: ");
        precio = miescaner.nextFloat();
        
        resultado = precio * 0.21f ;
        preciofinal = precio - resultado;
        System.out.println("Tu precio final es: "+preciofinal);
    }
}

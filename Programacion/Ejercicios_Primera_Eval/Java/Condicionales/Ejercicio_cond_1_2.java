package com.politecnicomalaga.ejercicio_cond_1_2;

import java.util.Scanner;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class Ejercicio_cond_1_2 {

    public static void main(String[] args) {
        Scanner miescaner;
        int numero;
        
        miescaner = new Scanner(System.in);
        
        System.out.println("Escribe un número del 1 al 7: ");
        numero = miescaner.nextInt();
        
        if (numero == 1)
            System.out.println("Lunes");
        else
            if (numero == 2)
                System.out.println("Martes");
        else
                if (numero == 3)
                    System.out.println("Miercoles");
                else 
                    if (numero == 4)
                        System.out.println("Jueves");
        else
                        if (numero == 5)
                            System.out.println("Viernes");
                        else 
                            if (numero == 6)
                                System.out.println("Sabado");
        else
                                if (numero == 7)
                                    System.out.println("Domingo");
                                else 
                                    if (numero >= 8)
                                        System.out.println("ERROR!");
        
    }
}

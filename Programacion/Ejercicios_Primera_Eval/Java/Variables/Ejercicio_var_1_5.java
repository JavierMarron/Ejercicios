package com.politecnicomalaga.ejercicio_var_1_5;

import java.util.Scanner;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class Ejercicio_var_1_5 {

    public static void main(String[] args) {
        Scanner miescaner;
        String Nombre, Direccion ;
        int Telefono;
        
        miescaner = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        Nombre = miescaner.nextLine();
        System.out.println("Escribe tu dirección: ");
        Direccion = miescaner.nextLine();
        System.out.println("Escribe tu telefono: ");
        Telefono = miescaner.nextInt();
        System.out.println("Hola, mi nombre es "+Nombre+"\nMi dirección es "+Direccion+"\nMi telefono es "+Telefono);
    }
}

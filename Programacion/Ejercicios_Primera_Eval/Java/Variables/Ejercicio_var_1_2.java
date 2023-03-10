package com.politecnicomalaga.ejercicio_var_1_2;

import java.util.Scanner;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class Ejercicio_var_1_2 {

    public static void main(String[] args) {
        int x , y , suma , resta , multiplicacion;
        float division;
        Scanner miescaner;
        
        miescaner = new Scanner(System.in);
        System.out.println("Escribe el valor de X:");
        x = miescaner.nextInt();
        System.out.println("Escribe el valor de Y:");
        y = miescaner.nextInt();
        suma = x + y;
        resta = x - y;
        multiplicacion = x * y;
        division = x / y;
        System.out.println("X es " + x +"\nY es "+ y + "\nLa suma es "+ suma + "\nLa resta es "+resta+ "\nLa multiplicación es "+multiplicacion+ "\nLa división es "+division );
    }
}

package com.politecnicomalaga.ejercicio_cond_1_3;

import java.util.Scanner;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class Ejercicio_cond_1_3 {

    public static void main(String[] args) {
        Scanner miescaner;
        int horas=0 , dinero=0;
        
        miescaner = new Scanner(System.in);
        
        System.out.println("Número de horas: ");
        horas = miescaner.nextInt();
        
        if (horas <= 40){ 
            dinero = horas * 15;
            System.out.println("Su cobro es de "+dinero);}
        else 
            if (horas >= 40){
                horas = horas - 40;
                dinero = horas * 20;
                dinero = dinero + 600;
                System.out.println("Su cobro es de "+dinero);
            }
            else {
                System.out.println("ERROR!");
            }
        
        
    }
}

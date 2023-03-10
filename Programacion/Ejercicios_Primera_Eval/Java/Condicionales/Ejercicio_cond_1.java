package com.politecnicomalaga.ejercicio_cond_1;

import java.util.Scanner;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class Ejercicio_cond_1 {

    public static void main(String[] args) {
        Scanner miescaner;
        int hora;
        
        miescaner = new Scanner(System.in);
        
        
        System.out.println("Dime la hora: ");
        hora = miescaner.nextInt();
        
        if (hora >= 6 && hora <= 12 )
            System.out.println("Buenos Días!");
         else
            if (hora >= 13 && hora <= 20)
                System.out.println("Buenas Tardes!");
            else 
                if (hora >= 21 && hora >= 24)
                    System.out.println("Buenas Noches!");
                else 
                    if (hora >=0 && hora <= 5)
                        System.out.println("Buenas Noches!");
                    
    
    }
}

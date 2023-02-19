/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.politecnicomalaga.ejercicio_f1;

import java.util.Scanner;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class Ejercicio_F1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String teclado;
        competicion f1= new competicion();
        boolean repetir = true , generado=false;
        int menu;
        
        
        System.out.println("Mini campeonato de F1");
        for(int i=1; i<7;i++){
            System.out.println("Introduce el nombre del piloto: ("+i+" de 6)");
            teclado = sc.nextLine();
            
            f1.addpilotos(teclado, i);
        }
        while(repetir){
            System.out.println("¿Que quieres hacer?\n 1.-Empezar competición\n 2.-Mostrar los tres mejores pilotos\n 3.-Mostrar los que no han conseguido puntos\n 4.-Salir (Cualquier tecla)");
            menu=sc.nextInt();
            
            if(menu == 1){ //Empezar competición
                if(generado){
                    System.out.println("El campeonato ya se a generado");
                }else{
                    f1.gencarrera();
                    generado = true;
                }
            }else
                if(menu==2){ //Mostrar los tres mejores pilotos
                    if(!generado){ //Para q si o si genere la carrera 
                        System.out.println("La competición no se ha generado, por favor pulsa 1.");
                    }else{
                        
                    }
                }else
                    if(menu==3){ //Mostrar los que no han conseguido puntos 
                        if(!generado){
                            System.out.println("La competición no se ha generado, por favor pulsa 1.");
                        }else{
                            
                        }
                    }else{ //Salir 
                        System.out.println("Saliendo...");
                        repetir = false;
                    }
        }        
    }
}

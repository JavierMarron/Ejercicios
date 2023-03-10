package com.politecnicomalaga.ejercicio_buc_1_7;

import java.util.Scanner;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class Ejercicio_buc_1_7 {

    public static void main(String[] args) {
        Scanner miescaner = new Scanner(System.in);
        //String contraseña ="0000" , entradateclado;
        int i = 0 , e=0, a=0, tecladomenu , intento = 1;
        String contraseña ="0000" , entradateclado;
        
        while(i<10){
         System.out.println("Menú: \n 1.Asignar nueva convinación \n 2. Abrir caja fuerte \n 3. Salir"); //Menú
         tecladomenu = miescaner.nextInt();
         
         if(tecladomenu == 1){ // cambiar clave
            do{System.out.println("Introduzca la contraseña actual:");
                 entradateclado = miescaner.next();
                 
                 if(entradateclado.equals(contraseña)){
                    System.out.println("Introduzca la nueva contraseña:");
                    contraseña = miescaner.next();
                    if(contraseña.length()!= 4){
                       System.out.println("ERROR!"); 
                    }
                    else{
                        System.out.println("Contraseña cambiada");
                         a=4;
                    }
                   
                 }
                 else{
                     System.out.println("ERROR!"); //error tres veces el programa termina
                     System.out.println("Intento"+intento+"de tres");
                     intento++;
                     a++;
                 }
                 
                 }while(a<3);
                 if(a==3){
                     i = 100;
                 } 
         }
         else
             if(tecladomenu == 2){ // abrir caja
                 do{System.out.println("Introduzca la contraseña:");
                 entradateclado = miescaner.nextLine();
                 
                 if(entradateclado == contraseña){
                    System.out.println("Caja abierta");
                    e=10;
                    i = 100;
                 }
                 else{
                     System.out.println("ERROR!"); //error tres veces el programa termina
                     e++;
                 }
                 }while(e<3);
                 if(e==3){
                     i = 100;
                 }
                }
             else 
                 if(tecladomenu == 3){ //Salir
                    i = 100; 
                 }
                 else {
                     System.out.println("ERROR!");
                 }
        }
    }
}

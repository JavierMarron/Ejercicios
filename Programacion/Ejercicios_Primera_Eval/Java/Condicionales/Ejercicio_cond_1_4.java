package com.politecnicomalaga.ejercicio_cond_1_4;

import java.util.Scanner;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class Ejercicio_cond_1_4 {

    public static void main(String[] args) {
        Scanner miescaner;
        float nota1 , nota2 , nota3 , suma;
        float notamedia;
        
        miescaner = new Scanner(System.in);
        
        System.out.println("Dime la primera nota: ");
        nota1 = miescaner.nextFloat();
        System.out.println("Dime la segunda nota: ");
        nota2 = miescaner.nextFloat();
        System.out.println("Dime la tercera nota: ");
        nota3 = miescaner.nextFloat();
        
        suma= nota1 + nota2 + nota3;
        notamedia = suma /3;
        
        if(notamedia <=4 && notamedia >= 0){
            System.out.println("Insuficiente!");
        }
        else
            if(notamedia >= 5 && notamedia < 6 ){
                System.out.println("Suficiente!");
            }
            else 
                if(notamedia >= 6 && notamedia < 7){
                    System.out.println("Bien!");
                }
        else
                    if(notamedia >= 7 && notamedia < 8.5){
                        System.out.println("Notable!");
                    }
        else
                        if(notamedia >= 8.5 && notamedia<=10){
                            System.out.println("Sobresaliente!");
                        }
                        else{
                            System.out.println("ERROR!");
                        }
        
    }
}
    
    

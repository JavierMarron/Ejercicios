package com.politecnicomalaga.ejercicio_cond_1_5;

import java.util.Scanner;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class Ejercicio_cond_1_5 {

    public static void main(String[] args) {
        int numa , numb , numc ; 
        Scanner miescaner;
        
        miescaner = new Scanner(System.in);
        
        System.out.println("Dime el primer numero: ");
        numa = miescaner.nextInt();
        
        System.out.println("Dime el segundo numero: ");
        numb = miescaner.nextInt();
        
        System.out.println("Dime el tercer numero: ");
        numc = miescaner.nextInt();
        
        if(numa <= numb && numa <= numc && numb <= numc){
            System.out.println( numa+","+numb+","+ numc);
        }
        else
            if(numa <= numc && numa <= numb && numc <= numb){
             System.out.println( numa+","+numc+","+ numb);
             }
        else
                if(numb <= numa && numb <= numc && numa <= numc){
                 System.out.println( numb+","+numa+","+ numc);
                 }
        else
                    if(numb <= numa && numb <= numc && numc <= numa){
                     System.out.println( numb+","+numc+","+ numa);
                     }
        else
                        if(numc <= numa && numc <= numb && numa <= numb){
                         System.out.println( numc+","+numa+","+ numb);
                         }
        else
                            if(numc <= numb && numc <= numa && numb <= numa){
                             System.out.println( numc+","+numb+","+ numa);
                             }
                            else{
                                System.out.println("ERROR!");
                            }
             
    }
}

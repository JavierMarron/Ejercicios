/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.politecnicomalaga.ej_prac_array;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class Ej_prac_array {

    public static void main(String[] args) {
        int num=0;
        Random rd= new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        num = rd.nextInt(30)+1;
        System.out.println("El tamaño del ArrayList es: "+ num); //El tamaño del ArrayList
        
        for(int i=0; i<num; i++){ //Para meter nums en la ArrayList
            int b = rd.nextInt(11);
            lista.add(b);
        }
        System.out.println("Dime que número se elimine: ");
        num=sc.nextInt();
        
        System.out.println("======================== \nLista actual: \n========================");
        for(int i=0; i< lista.size();i++){
            System.out.println(lista.get(i));
        }
        
        for(int i = lista.size() - 1; i >= 0; i--){
            if(lista.get(i)==num){
                lista.remove(i);
            }
        }
        
        System.out.println("======================== \nLista nueva: \n========================");
        for(int i=0; i< lista.size();i++){
            System.out.println(lista.get(i));
        }
    }
}

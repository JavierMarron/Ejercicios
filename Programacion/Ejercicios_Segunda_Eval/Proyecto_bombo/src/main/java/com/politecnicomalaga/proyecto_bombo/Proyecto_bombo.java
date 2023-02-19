/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.politecnicomalaga.proyecto_bombo;

import java.util.Scanner;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class Proyecto_bombo {

    public static void main(String[] args) {
        int max , min , numrand;
        Scanner sc = new Scanner(System.in);
        bombo loteria;
        
        System.out.println("Escribe el max:");
        max = sc.nextInt();
        System.out.println("Escribe el min:");
        min = sc.nextInt();
        
        loteria = new bombo(max , min);

        numrand = loteria.numrand();
        System.out.println(numrand);

        
    }
}

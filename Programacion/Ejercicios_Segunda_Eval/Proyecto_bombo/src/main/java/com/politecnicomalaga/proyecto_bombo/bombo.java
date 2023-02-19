/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.proyecto_bombo;

import java.util.Random;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class bombo {
    int max , min , tamaño , num;
    boolean[] lista;
    Random rand;
    boolean repetir = true;
    
    public bombo(int maximo ,int minimo){
        max = maximo;
        min = minimo;
        
        tamaño= (max - min)+1;
        lista = new boolean[tamaño];
        
        rand = new Random();
        
        for(int i=0 ; i< lista.length ; i++){
            lista[i] = false;
            }
    }
    
    public int numrand(){
        while(repetir){
            num = rand.nextInt(0 , (max-min));
            
            if(!lista[num]){
                repetir = false;
                lista[num]=true;
                
            }
        }
        num+=min;
        return num; 
    }
}

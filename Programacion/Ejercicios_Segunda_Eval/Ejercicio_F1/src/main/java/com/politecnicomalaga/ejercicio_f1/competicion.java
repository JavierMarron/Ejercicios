/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.ejercicio_f1;
import java.util.Random;
/**
 *
 * @author javiermarrondellanoramirez
 */
public class competicion {
    String[] Npilotos;
    int[][] tabla;
    Random rand;
    int nrand=0 , p0=0, p1=0, p2=0, p3=0, p4=0, p5=0;
    
    public competicion(){
        Npilotos = new String[6];
        tabla = new int[3][6];
        rand = new Random();
    }
    
    public void addpilotos(String nombre, int i ){
        i--;
        Npilotos[i]=nombre;
    }
    
    public void gencarrera(){
        int i=0 , o=0 , gan10=0 , gan8=0 ;
        while(o<3){ //o son el número de carrera solo hay tres: 0, 1 y 2
            
           while(i<3){ //i sirve para dar los 10 , 8 y 6 puntos 
            nrand = rand.nextInt(6);
            
            if(i==0){ //10P
                tabla[o][nrand]= 10;
                gan10=nrand;
                i++;
            }else
                if(i==1){ //8P
                    if(nrand!= gan10){ //Para q sea distinto del ganador 10
                        tabla[o][nrand]=8;
                        gan8=nrand;
                        i++;
                    }
                }else
                    if(i==2){ //6P
                        if(nrand!= gan10){
                            if(nrand!= gan8){
                                tabla[o][nrand]=6;
                                i++;
                            }
                        }
                    }
           }
           o++;
           gan10=0;
           gan8=0;
        }
    }
    
    public void sumapuntos(){
        for(int j=0 ; j>6 ; j++){
            for(int i=0 ; i>3 ; i++){
                
            }
        }
    }
}

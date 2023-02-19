/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.juego_del_6;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class Jugador {
    Dado d1 , d2;
    int numseis1 , resultado , suma1;
    
    public Jugador(){
        d1 = new Dado();
        d2 = new Dado();
        d1.tirardado();
        d2.tirardado();
    
    }
    
    public int getsuma(){
        suma1 = d1.getValor() + d2.getValor();
        return suma1;
    }
    
    public int getnumseis(){
        if(d1.getValor() == 6){
            numseis1++;
        }
        if(d2.getValor() == 6){
            numseis1++;
        }
        
        return numseis1;

    }
    
    public void getdados(){
        System.out.println("Dados: "+d1.getValor()+" "+d2.getValor());
    }
    
    public void comprobarseis(int numseis2){
        if(numseis1 > numseis2){ //Jugador uno gana 
            resultado= -1;
        }
        if(numseis1 == numseis2){ //Empate
            resultado =0;
        }
        if(numseis1 < numseis2){ //Jugador dos gana
            resultado= 1;
        }
    }
    
    public int getresultado(){
        return resultado;
    }
    
    public void comprobarsuma(int suma2){
        
        if(suma1>suma2){ //Jugador 1 gana
            resultado=-1;
        }
        if(suma1 == suma2){ //Empate
            resultado=0;
        }
        if(suma1<suma2){ //Jugador 2 gana
            resultado=1;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.politecnicomalaga.juego_del_6;

import java.util.Scanner;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class Juego_del_6 {

    public static void main(String[] args) {
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        boolean repetir = true;
        Scanner sc = new Scanner(System.in);
        String tmenu;
        int suma2 , numSeis2 , resultado;
        
        while(repetir){
            System.out.println("==================\n 1.Jugar\n 2.Salir\n==================");
            tmenu = sc.nextLine();
            if(tmenu.equals("1")){
                numSeis2 = j2.getnumseis();
                j1.comprobarseis(numSeis2);
                resultado = j1.getresultado();
                
                if(resultado==-1){ //Gana 1 con seis
                    System.out.println("Jugador 1 Gana!! \nJugador 1:");
                    j1.getdados();
                    System.out.println("Jugador 2:");
                    j2.getdados();
                }else
                    if(resultado == 0){ //Empate con seis
                        suma2 = j2.getsuma();
                        j1.comprobarsuma(suma2);
                        resultado=j1.getresultado();
                        
                        if(resultado==-1){ //Gana 1 con suma
                            System.out.println("Jugador 1 Gana!! \nJugador 1");
                            j1.getdados();
                            System.out.println("Jugador 2");
                            j2.getdados();
                        }else
                            if(resultado==0){ //Empate con suma
                                System.out.println("Empate!! \nJugador 1");
                                j1.getdados();
                                System.out.println("Jugador 2");
                                j2.getdados();
                            }else
                                if(resultado==1){ //Gana 2 con suma
                                    System.out.println("Jugador 2 Gana!! \nJugador 1");
                                    j1.getdados();
                                    System.out.println("Jugador 2");
                                    j2.getdados();
                                }
                    }else
                        if(resultado==1){ //Gana 2 con seis
                            System.out.println("Jugador 2 Gana!! \nJugador 1");
                            j1.getdados();
                            System.out.println("Jugador 2");
                            j2.getdados();
                        }
            }else{
                System.out.println("Saliendo...");
                repetir = false;
            }
        }
    }
}

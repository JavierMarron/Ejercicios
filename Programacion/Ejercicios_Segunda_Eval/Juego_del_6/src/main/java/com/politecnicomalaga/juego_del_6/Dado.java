/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.juego_del_6;

import java.util.Random;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class Dado {

    int valor = 0;
    Random rand = new Random();

    public Dado() {
    }

    public void tirardado() {
        valor = rand.nextInt(6) + 1;
    }

    public int getValor() {
        return valor;
    }
}

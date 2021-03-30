/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;

/**
 *
 * @author JOELBOLIVARGM
 */
public class Entradas {
    int x1, x2, x3, y1;
    public static ArrayList listaEntradas;
    
    String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    public int getX1() {
        return x1;
    }

    public static ArrayList getListaEntradas() {
        return listaEntradas;
    }

    public static void setListaEntradas(ArrayList listaEntradas) {
        Entradas.listaEntradas = listaEntradas;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }
}

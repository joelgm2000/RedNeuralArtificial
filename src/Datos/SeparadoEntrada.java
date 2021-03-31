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
public class SeparadoEntrada {
     int x1, x2;
    Integer x3;
    public static ArrayList listaEntradaSeparado;

    public int getX1() {
        return x1;
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

    public Integer getX3() {
        return x3;
    }

    public void setX3(Integer x3) {
        this.x3 = x3;
    }

    public static ArrayList getListaEntradaSeparado() {
        return listaEntradaSeparado;
    }

    public static void setListaEntradaSeparado(ArrayList listaEntradaSeparado) {
        SeparadoEntrada.listaEntradaSeparado = listaEntradaSeparado;
    }
    
}

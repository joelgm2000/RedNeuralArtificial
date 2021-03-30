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
public class Pesos {
       int w1, w2, w3;
       
        public static ArrayList listaPesos;

    public static ArrayList getListaPesos() {
        return listaPesos;
    }

    public static void setListaPesos(ArrayList listaPesos) {
        Pesos.listaPesos = listaPesos;
    }
    
   
    
    public int getW1() {
        return w1;
    }

    public void setW1(int w1) {
        this.w1 = w1;
    }

    public int getW2() {
        return w2;
    }

    public void setW2(int w2) {
        this.w2 = w2;
    }

    public int getW3() {
        return w3;
    }

    public void setW3(int w3) {
        this.w3 = w3;
    }
       
       
}

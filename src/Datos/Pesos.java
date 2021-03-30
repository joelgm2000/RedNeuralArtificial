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
       double w1, w2, w3;
       
        public static ArrayList listaPesos;

    public static ArrayList getListaPesos() {
        return listaPesos;
    }

    public static void setListaPesos(ArrayList listaPesos) {
        Pesos.listaPesos = listaPesos;
    }
    
   
    
    public double getW1() {
        return w1;
    }

    public void setW1(double w1) {
        this.w1 = w1;
    }

    public double getW2() {
        return w2;
    }

    public void setW2(double w2) {
        this.w2 = w2;
    }

    public double getW3() {
        return w3;
    }

    public void setW3(double w3) {
        this.w3 = w3;
    }
       
       
}

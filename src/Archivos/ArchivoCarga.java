/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Datos.Entradas;
import Datos.Pesos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author JOELBOLIVARGM
 */
public class ArchivoCarga {
    
        File archivo;
        private Scanner aLect;

    public ArchivoCarga() {
        this.archivo = null;
    }
    
       public boolean GuardarPesos(ArrayList<Pesos> p) throws IOException {
        
        if (this.archivo.exists()) {
           
            FileWriter  Fw = null;
            try {
                Fw = new FileWriter(this.archivo, true);
                PrintWriter pw = new PrintWriter( Fw);
               String NumW1, NumW2;
                for (Pesos listapesos: p) {
                   NumW1 = Double.toString(listapesos.getW1());
                   NumW2 = Double.toString(listapesos.getW2());
                    pw.println(NumW1 + ";;"+ NumW2);
                }
                return true;
            } catch (java.io.IOException IOE) {
                JOptionPane.showMessageDialog(null, "Error al Abrir el Archivo en modo eJOptionPanescritura, el sistema ha dicho: " + IOE.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (null !=  Fw) {
                         Fw.close();
                    }
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "Error al Escribir en el Archivo, el sistema ha dicho: " + e2.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Primero carga las entradas para digitar los pesos");
          return false;
        }
        return false;
    }
        
        
        
        
    public ArrayList<Entradas> leerArchivo() throws FileNotFoundException{
        
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        archivo = fc.getSelectedFile();
        System.out.println(this.archivo);
          
        this.aLect = new Scanner(this.archivo);
        
         ArrayList<Entradas> leerArray = new ArrayList();
         System.out.println(leerArray.size());
          Entradas entradas = new Entradas();
          
         while(this.aLect.hasNext()){
             String datos[] = this.aLect.nextLine().split(";;");
             entradas = new Entradas();

             entradas.setX1(Integer.parseInt(datos[0]));
             
             entradas.setX2(Integer.parseInt(datos[1]));
       
             try{
               entradas.setX3(Integer.parseInt(datos[2]));  
             }catch (Exception e2) {
               entradas.setX3(null);
        
             }
         
            
             
             System.out.println("Entradas " + entradas.getX1() + "  " + entradas.getX2()+ "  " + entradas.getX3());
            
             leerArray.add(entradas); 
              
            
             
         }
         
         this.aLect.close();
        
         for(int i = 0; i< leerArray.size(); i++){
         System.out.println(leerArray.get(i).getX1() + "" +  leerArray.get(i).getX2() + "" + leerArray.get(i).getX3());
         }  
        
         return leerArray;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package redneuronalartificialsof;
import Archivos.ArchivoCarga;
import Datos.Entradas;
import Datos.Pesos;
import Datos.SeparadoEntrada;
import Datos.SeparadoSalidas;
import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author JOELBOLIVARGM
 */
public class Principal extends javax.swing.JFrame {

    boolean verificar = false, verificar2 = false;
    public ArchivoCarga archivoCarga = new ArchivoCarga(); 

    DefaultTableModel model_Table,model_Table2;
    DefaultListModel model_Lista = new DefaultListModel();
    Scanner aLect;
    File archivo;
    Entradas entrada;
    Pesos pesos;
    ArrayList<Pesos> listaPesos = null;
    ArrayList<Entradas> listEntradas;
    ArrayList<SeparadoEntrada> SeparadoEntradaArray;
    ArrayList<SeparadoSalidas> SeparadoSalidaArray;
    
    public Principal() {
      initComponents();
         ComboBox();
          //Línea 1
        this.setSize(new Dimension(1100, 735));
        
        this.getContentPane().setBackground(Color.getHSBColor(114,272,101));
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonCargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEntradas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        textPesos = new javax.swing.JTextField();
        buttonAgregarPesos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePesos = new javax.swing.JTable();
        buttonSiguienteEntradas = new javax.swing.JButton();
        buttonVerErrorIteracion = new javax.swing.JButton();
        buttonYDvsYR = new javax.swing.JButton();
        buttonEntrada = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        comboFuncionActivacion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtFuncionSoma = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtYr = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtEli = new javax.swing.JTextField();
        txtWji1 = new javax.swing.JTextField();
        txtEp = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtWji2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtUi = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtWji3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtEntradas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSalidas = new javax.swing.JTextField();
        txtPatrones = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuGuardar = new javax.swing.JMenuItem();
        jMenuCargar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RNA");
        setBackground(new java.awt.Color(121, 181, 0));

        buttonCargar.setText("Cargar Entradas");
        buttonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCargarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(tableEntradas);

        jLabel1.setText("Agregar Pesos");

        buttonAgregarPesos.setText("Agregar Pesos de la entradas");
        buttonAgregarPesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarPesosActionPerformed(evt);
            }
        });

        tablePesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablePesos);

        buttonSiguienteEntradas.setText("Siguiente");

        buttonVerErrorIteracion.setText("Ver grafica del error de la iteracion");

        buttonYDvsYR.setText("Ver grafica de YD vs YR");

        buttonEntrada.setText("ENTRENAR");
        buttonEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntradaActionPerformed(evt);
            }
        });

        jLabel13.setText("Funcion de activacion");

        comboFuncionActivacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFuncionActivacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFuncionActivacionActionPerformed(evt);
            }
        });

        jLabel3.setText("Respuesta Funcion SOMA (S)");

        txtFuncionSoma.setEditable(false);

        jLabel4.setText("YRi=");

        txtYr.setEditable(false);

        jLabel14.setText("Eli=");

        txtEli.setEditable(false);

        txtWji1.setEditable(false);

        txtEp.setEditable(false);

        jLabel17.setText("Wji=");

        txtWji2.setEditable(false);

        jLabel16.setText("Wji=");

        jLabel15.setText("Ep=");

        txtUi.setEditable(false);

        jLabel18.setText("Wji=");

        jLabel19.setText("Ui=");

        txtWji3.setEditable(false);

        jPanel1.setBackground(new java.awt.Color(35, 105, 64));

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 582, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 389, Short.MAX_VALUE)
        );

        jLabel2.setText("Entradas:");

        txtEntradas.setEditable(false);

        jLabel5.setText("Salidas:");

        txtSalidas.setEditable(false);

        txtPatrones.setEditable(false);

        jLabel6.setText("Patrones:");

        jMenuInicio.setText("Inicio ");
        jMenuInicio.setName(""); // NOI18N

        jMenuGuardar.setText("Guardar");
        jMenuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGuardarActionPerformed(evt);
            }
        });
        jMenuInicio.add(jMenuGuardar);

        jMenuCargar.setText("Cargar");
        jMenuCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCargarActionPerformed(evt);
            }
        });
        jMenuInicio.add(jMenuCargar);

        jMenuBar1.add(jMenuInicio);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(31, 31, 31)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                            .add(buttonCargar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .add(layout.createSequentialGroup()
                                .add(jLabel1)
                                .add(18, 18, 18)
                                .add(textPesos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(buttonAgregarPesos))
                            .add(layout.createSequentialGroup()
                                .add(jLabel13)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(comboFuncionActivacion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(jLabel2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(txtEntradas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(44, 44, 44)
                                .add(jLabel5)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(txtSalidas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jLabel6)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(txtPatrones, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(35, 35, 35)
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(98, 98, 98)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel14)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(txtEli, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel4)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(txtYr, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel3)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(txtFuncionSoma, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                            .add(buttonEntrada, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 355, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(84, 84, 84)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                        .add(jLabel17)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(txtWji2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel16)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(txtWji1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel15)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(txtEp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(31, 31, 31)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel19)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(txtUi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                        .add(jLabel18)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(txtWji3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, buttonSiguienteEntradas)))
                            .add(layout.createSequentialGroup()
                                .add(16, 16, 16)
                                .add(buttonVerErrorIteracion)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(buttonYDvsYR, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 199, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(422, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(buttonVerErrorIteracion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(buttonYDvsYR, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(buttonEntrada, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(buttonCargar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 123, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(txtEntradas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(jLabel5)
                                .add(txtSalidas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel6)
                                    .add(txtPatrones, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(13, 13, 13)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel1)
                            .add(textPesos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(buttonAgregarPesos))
                        .add(25, 25, 25)
                        .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(26, 26, 26)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel13)
                            .add(comboFuncionActivacion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(51, 51, 51)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel3)
                            .add(txtFuncionSoma, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(25, 25, 25)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel4)
                            .add(txtYr, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(26, 26, 26)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtEli, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel14)))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(txtEp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel15)
                                    .add(jLabel18)
                                    .add(txtWji3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(25, 25, 25)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel16)
                                    .add(txtWji1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(txtUi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jLabel19)))
                        .add(25, 25, 25)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtWji2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel17)
                            .add(buttonSiguienteEntradas))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuGuardarActionPerformed

    private void jMenuCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCargarActionPerformed

    private void buttonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCargarActionPerformed
       listEntradas = new ArrayList();
       SeparadoEntradaArray = new ArrayList();
       SeparadoSalidaArray = new ArrayList();
       
        try {
            archivoCarga.cargarArchivo();
            
            listEntradas = archivoCarga.leerArchivo();
            SeparadoEntradaArray = SeparadoEntrada.getListaEntradaSeparado();
            SeparadoSalidaArray = SeparadoSalidas.getListaSalidas();

           
            String titulos[]={"X1","X2","X3","Y1"};
            model_Table = new DefaultTableModel();
            model_Table.setColumnIdentifiers(titulos);
       
        
            for(Entradas a: listEntradas){
             Object datos[]={a.getX1(), a.getX2(),a.getX3(),a.getY1()};
             model_Table.addRow(datos);
            }
            
            tableEntradas.setModel(model_Table);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            Cargar();  
        
    }//GEN-LAST:event_buttonCargarActionPerformed

    private void buttonAgregarPesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarPesosActionPerformed
      
        double parsePesos;
        
        parsePesos = Double.parseDouble(textPesos.getText());
                
        if(parsePesos >= -1 && parsePesos <= 1){
           
                 Agregar();
              
        }else{
             JOptionPane.showMessageDialog(this, "Rango -1 a 1");
        } 
               
        
    }//GEN-LAST:event_buttonAgregarPesosActionPerformed

    private void buttonEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntradaActionPerformed

    }//GEN-LAST:event_buttonEntradaActionPerformed

    public void soma(){
        
        
        
    }
    
    private void comboFuncionActivacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFuncionActivacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFuncionActivacionActionPerformed
     
    public void Agregar(){
      
        listaPesos = new ArrayList<>();
   
        String w1 = null, w2 = null, w3 = null;
        
        if(this.tablePesos.getRowCount() == 0 ){
            verificar = true;
            model_Table2 = new DefaultTableModel();
            String titulos[]={"W1"};
            
            model_Table2.setColumnIdentifiers(titulos);
            System.out.println("Entro 1,1");
            
           w1 = textPesos.getText().trim();
           
           try {
            pesos = new Pesos();
        
            double parseoW1;
          
            parseoW1=Double.parseDouble(w1);

            pesos.setW1(parseoW1);
;
            listaPesos.add(pesos);
            
            }catch (NumberFormatException Ex) {
                JOptionPane.showMessageDialog(this, "Letras en campos numéricos");
            }
           

            for(Pesos a: listaPesos){
             Object datos[]={a.getW1(), a.getW2()};
             model_Table2.addRow(datos);
            }
              
            tablePesos.setModel(model_Table2);
            System.out.println(verificar);
            
        }else if(verificar == true){
          
             String titulos[]={"W1", "W2"};
            
            model_Table2.setColumnIdentifiers(titulos);
            
            System.out.println("Entro 1,2");
             
           try {
          
             w2 = textPesos.getText().trim();
            
            double parseoW2;

            parseoW2=Double.parseDouble(w2);
         
            pesos.setW2(parseoW2);

            listaPesos.add(pesos);
            
           }catch (NumberFormatException Ex) {
                JOptionPane.showMessageDialog(this, "Letras en campos numéricos");
            }
            eliminarTablaPesos();
            
            for(Pesos a: listaPesos){
            
             Object datos[]={a.getW1() ,a.getW2()};
             model_Table2.addRow(datos);
            }

            tablePesos.setModel(model_Table2);
            verificar = false;
            System.out.println(verificar);
            
             verificar2 = true;
             
        }else if( verificar2 == true){
            
             String titulos[]={"W1", "W2", "W3"};
            
            model_Table2.setColumnIdentifiers(titulos);
            
            System.out.println("Entro 1,3");
             
           try {
          
             w3 = textPesos.getText().trim();
            
            double parseoW3;

            parseoW3=Double.parseDouble(w3);
         
            pesos.setW3(parseoW3);

            listaPesos.add(pesos);
            
           }catch (NumberFormatException Ex) {
                JOptionPane.showMessageDialog(this, "Letras en campos numéricos");
            }
            eliminarTablaPesos();
            
            for(Pesos a: listaPesos){
            
             Object datos[]={a.getW1() ,a.getW2(), a.getW3()};
             model_Table2.addRow(datos);
            }

            tablePesos.setModel(model_Table2);
            
            
            verificar2=false;
        }else{
            System.out.println("No puede entrar");
        }
                   
    
    }
  
    public void eliminarTablaPesos(){
         int filas = tablePesos.getRowCount()-1;
      
            for(int i = 0; i<=filas;i++){
                 model_Table2.removeRow(model_Table2.getRowCount()-1);
            }
    }
    
    public void ComboBox(){
       comboFuncionActivacion.removeAllItems();
       comboFuncionActivacion.addItem("Seleccion");
       comboFuncionActivacion.addItem("Escalon");
       comboFuncionActivacion.addItem("Lineal");
       comboFuncionActivacion.addItem("Sigmoide");
      
    }
    
    public void Cargar(){
        
        String textPatrones = String.valueOf(SeparadoEntradaArray.size());
        txtPatrones.setText(textPatrones);
        txtSalidas.setText("1");
      
        if(SeparadoEntradaArray.get(2).getX3()==null){
        txtEntradas.setText("2");
        }else{
        txtEntradas.setText("3"); 
        }
      
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgregarPesos;
    private javax.swing.JButton buttonCargar;
    private javax.swing.JButton buttonEntrada;
    private javax.swing.JButton buttonSiguienteEntradas;
    private javax.swing.JButton buttonVerErrorIteracion;
    private javax.swing.JButton buttonYDvsYR;
    private javax.swing.JComboBox<String> comboFuncionActivacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCargar;
    private javax.swing.JMenuItem jMenuGuardar;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableEntradas;
    private javax.swing.JTable tablePesos;
    private javax.swing.JTextField textPesos;
    private javax.swing.JTextField txtEli;
    private javax.swing.JTextField txtEntradas;
    private javax.swing.JTextField txtEp;
    private javax.swing.JTextField txtFuncionSoma;
    private javax.swing.JTextField txtPatrones;
    private javax.swing.JTextField txtSalidas;
    private javax.swing.JTextField txtUi;
    private javax.swing.JTextField txtWji1;
    private javax.swing.JTextField txtWji2;
    private javax.swing.JTextField txtWji3;
    private javax.swing.JTextField txtYr;
    // End of variables declaration//GEN-END:variables

}

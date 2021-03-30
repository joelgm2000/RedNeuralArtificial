/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package redneuronalartificialsof;
import Archivos.ArchivoCarga;
import Datos.Entradas;
import Datos.Pesos;
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

    public Principal() {
      initComponents();
         
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tableValoresEntradas = new javax.swing.JTable();
        buttonEntrada = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePesos = new javax.swing.JTable();
        buttonSiguienteEntradas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtFuncionSoma = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSalida = new javax.swing.JTextField();
        buttonVerErrorIteracion = new javax.swing.JButton();
        buttonYDvsYR = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablePesos2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtFuncionSoma1 = new javax.swing.JTextField();
        txtSalida1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableSalida = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuGuardar = new javax.swing.JMenuItem();
        jMenuCargar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RNA");

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

        jScrollPane2.setViewportView(tableValoresEntradas);

        buttonEntrada.setText("ENTRENAR");
        buttonEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntradaActionPerformed(evt);
            }
        });

        jLabel2.setText("Calculando estos valores de entradas");

        tablePesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablePesos);

        buttonSiguienteEntradas.setText("Siguiente");

        jLabel3.setText("Respuesta Funcion SOMA (S)");

        txtFuncionSoma.setEditable(false);

        jLabel4.setText("Respuesta de la salida");

        txtSalida.setEditable(false);

        buttonVerErrorIteracion.setText("Ver grafica del error de la iteracion");

        buttonYDvsYR.setText("Ver grafica de YD vs YR");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Regla Delta");

        jLabel6.setText("Nuevo Pesos");

        jScrollPane4.setViewportView(tablePesos2);

        jLabel7.setText("Respuesta Funcion SOMA (S)");

        txtFuncionSoma1.setEditable(false);

        txtSalida1.setEditable(false);

        jLabel8.setText("Respuesta de la salida");

        jScrollPane5.setViewportView(tableSalida);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("SALIDAS");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(277, 277, 277)
                        .add(jLabel5)
                        .add(154, 154, 154))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(21, 21, 21)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel6)
                                .add(0, 0, Short.MAX_VALUE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel9)
                                    .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 466, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 23, Short.MAX_VALUE)))))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(txtSalida1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel7)
                    .add(txtFuncionSoma1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel8))
                .add(18, 18, 18))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jScrollPane5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 600, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel7)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtFuncionSoma1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel8)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtSalida1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel6)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jScrollPane5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(31, 31, 31)
                        .add(jLabel9)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(buttonSiguienteEntradas)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .add(buttonCargar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(layout.createSequentialGroup()
                                    .add(jLabel1)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                    .add(textPesos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(18, 18, 18)
                                    .add(buttonAgregarPesos, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .add(buttonEntrada, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel3)
                                    .add(jLabel4))
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(txtSalida, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(txtFuncionSoma, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                    .add(jLabel2))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(73, 73, 73)
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, buttonVerErrorIteracion)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, buttonYDvsYR, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 199, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(buttonCargar)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(463, 463, 463)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel4)
                            .add(txtSalida, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(buttonVerErrorIteracion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 123, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel1)
                                    .add(textPesos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(buttonAgregarPesos))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(18, 18, 18)
                                .add(buttonYDvsYR, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(11, 11, 11)
                        .add(buttonEntrada)
                        .add(17, 17, 17)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jLabel2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(buttonSiguienteEntradas)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel3)
                                    .add(txtFuncionSoma, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        try {
            listEntradas = archivoCarga.leerArchivo();
                    
            
            String titulos[]={"X1","X2","X3"};
            model_Table = new DefaultTableModel();
            model_Table.setColumnIdentifiers(titulos);
       
        
            for(Entradas a: listEntradas){
             Object datos[]={a.getX1(), a.getX2(),a.getX3()};
             model_Table.addRow(datos);
            }
            
            tableEntradas.setModel(model_Table);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
              
        
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
    
    public void Soma(){
       
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCargar;
    private javax.swing.JMenuItem jMenuGuardar;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tableEntradas;
    private javax.swing.JTable tablePesos;
    private javax.swing.JTable tablePesos2;
    private javax.swing.JTable tableSalida;
    private javax.swing.JTable tableValoresEntradas;
    private javax.swing.JTextField textPesos;
    private javax.swing.JTextField txtFuncionSoma;
    private javax.swing.JTextField txtFuncionSoma1;
    private javax.swing.JTextField txtSalida;
    private javax.swing.JTextField txtSalida1;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Carrito.*;
import Cliente.*;
import Componente.*;
import Fabricante.*;
import Venta.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alex
 */
public class Aplicacion extends javax.swing.JFrame {

    /**
     * Creates new form Aplicacion
     */
    public Aplicacion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnVerCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIENDA ONLINE");
        setResizable(false);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnVerCliente.setText("Ver Cliente");
        btnVerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(432, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerCliente)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnVerCliente)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerClienteActionPerformed
       
    }//GEN-LAST:event_btnVerClienteActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion().setVisible(true);
            }
        });
    }
    
    static void print(Object a){
        System.out.println(a);
    }
    static void conexionFichero(){
    }
    static Carrito ejemploCarrito(){
        
       Fabricante F = new Fabricante(0, "Samgung", 935628130);
       Cliente C = new Cliente(0,"Alex","Caceres","4785 4455 6684 4566");
       ArrayList<Componente> Productos = new ArrayList<Componente>();

       Productos.add(new Componente(F,0,"Monitor 29'",250));
       Productos.add(new Componente(F,1,"Teclado Motospeed",80));
       Productos.add(new Componente(F,2,"NVIDIA GeForce GTX 2060",750));
       Productos.add(new Componente(F,3,"Memoria RAM Corsair 8GB",40));
       Productos.add(new Componente(F,4,"Raton inalambrico Razer",50));
       Productos.add(new Componente(F,5,"Cooler Razer CPU",60));
       Productos.add(new Componente(F,6,"Intel i7 9124 3.2GHz",350));
       Productos.add(new Componente(F,7,"Placa Base Asus G2345",120));
       Productos.add(new Componente(F,8,"Fuente de alimentación Corsair 750W",70));
       Productos.add(new Componente(F,9,"Tarjeta Wi-Fi StA",20)); 

       Carrito Carro = new Carrito(Productos, new Date(), C);
       return Carro;
    }
    static void etapa1(){
        print("\n\n\n\n");
        Carrito Carro = new Carrito();
        Carro = ejemploCarrito();
        print("Carrito:    " + new Date());
        print(Carro);
        print("Carrito: Eliminados productos 2,3,4,5    " + new Date());
        print(Carro.eliminarProducto(2));
        print(Carro.eliminarProducto(3));
        print(Carro.eliminarProducto(4));
        print(Carro.eliminarProducto(5));
        print(Carro);
        print("Carrito: Intentando eliminar producto 5 (que no se encuentra en el carrito)");
        print(Carro.eliminarProducto(5));
        print(Carro);
        print("Realizada Venta");
        Venta venta = new Venta();
        venta = Carro.comprar(new Date(),"Tarjeta de credito");
        print(venta);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

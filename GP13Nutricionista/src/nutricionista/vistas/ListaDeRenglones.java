/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package nutricionista.vistas;

<<<<<<< Updated upstream
import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nutricionista.accesoDatos.RenglonData;
import nutricionista.entidades.Comida;
import nutricionista.entidades.Renglon;

=======
>>>>>>> Stashed changes
/**
 *
 * @author Hernan
 */
public class ListaDeRenglones extends javax.swing.JInternalFrame {

<<<<<<< Updated upstream
    private List<Renglon> listaRenglones;
    private RenglonData renglonData;
    private DefaultTableModel modelo;

=======
>>>>>>> Stashed changes
    /**
     * Creates new form ListaDeRenglones
     */
    public ListaDeRenglones() {
        initComponents();
<<<<<<< Updated upstream
        modelo = new DefaultTableModel();
        renglonData = new RenglonData();
        listaRenglones = renglonData.traerRenglones();
        cabeceradeTabla();
        cargarTabla();
=======
>>>>>>> Stashed changes
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< Updated upstream
        ListaDeIngredientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtRenglon = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();

        ListaDeIngredientes.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        ListaDeIngredientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ListaDeIngredientes.setText("Lista de Renglones");

        jtRenglon.setModel(new javax.swing.table.DefaultTableModel(
=======
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Renglones");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
>>>>>>> Stashed changes
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
<<<<<<< Updated upstream
        jScrollPane1.setViewportView(jtRenglon);

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
=======
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("jButton1");

        jButton2.setText("Modificar");

        jButton3.setText("Salir");

        jButton4.setText("Nuevo");
>>>>>>> Stashed changes

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< Updated upstream
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ListaDeIngredientes, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbNuevo)
                        .addGap(377, 377, 377)
                        .addComponent(jbSalir)))
=======
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(187, 187, 187)
                .addComponent(jButton1)
>>>>>>> Stashed changes
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
<<<<<<< Updated upstream
                .addComponent(ListaDeIngredientes)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbNuevo))
=======
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
>>>>>>> Stashed changes
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< Updated upstream
    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        FormularioRenglon formularioRenglon = new FormularioRenglon();
        menuPrincipal.jDesktopPane1.add(formularioRenglon);
        formularioRenglon.moveToFront();
        formularioRenglon.setVisible(true);
        formularioRenglon.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void cabeceradeTabla() {
        ArrayList<Object> cabecera = new ArrayList<>();
        cabecera.add("ID");
        cabecera.add("Comida");
        cabecera.add("Cantidad de gramos");
        cabecera.add("Subtotal de calorias");
        for (Object it : cabecera) {
            modelo.addColumn(it);
        }
        jtRenglon.setModel(modelo);
    }

    private void cargarTabla() {
        for (Renglon i : listaRenglones) {
            modelo.addRow(new Object[]{i.getNumRenglon(), i.getComida(), i.getCantGrm(), i.getSubTotalCalorias()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ListaDeIngredientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtRenglon;
=======

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
>>>>>>> Stashed changes
    // End of variables declaration//GEN-END:variables
}

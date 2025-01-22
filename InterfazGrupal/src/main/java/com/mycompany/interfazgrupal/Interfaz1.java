/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfazgrupal;

/**
 *
 * @author Usuario
 */
public class Interfaz1 extends javax.swing.JFrame {

    String[] datosUsuario = new String[4];

    /**
     * Creates new form Interfaz1
     */
    public Interfaz1() {
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

        bttTurnos = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        bttRegistarParticipante = new javax.swing.JButton();
        bttMostarRegistro = new javax.swing.JButton();
        lblTexto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaMostrario = new javax.swing.JTextArea();
        lblIngreseNombre = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblSeleccioneCategoria = new javax.swing.JLabel();
        ckbAlmuerzo = new javax.swing.JCheckBox();
        ckbTransporte = new javax.swing.JCheckBox();
        ckbMaterialApoyo = new javax.swing.JCheckBox();
        cbxCategorias = new javax.swing.JComboBox<>();
        rdbManana = new javax.swing.JRadioButton();
        rdbTarde = new javax.swing.JRadioButton();
        lblServicios = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        lblTitulo.setText("Registro de estudiantes");

        bttRegistarParticipante.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        bttRegistarParticipante.setText("REGISTRAR PARTICIPANTE");
        bttRegistarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttRegistarParticipanteActionPerformed(evt);
            }
        });

        bttMostarRegistro.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        bttMostarRegistro.setText("MOSTRAR REGISTRO");
        bttMostarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttMostarRegistroActionPerformed(evt);
            }
        });

        lblTexto.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        lblTexto.setForeground(new java.awt.Color(255, 0, 0));
        lblTexto.setText("Asegurate de haber presionado \"REGISTAR PARTICIPANTE\" para mostar el registro");

        txtaMostrario.setColumns(20);
        txtaMostrario.setRows(5);
        jScrollPane1.setViewportView(txtaMostrario);

        lblIngreseNombre.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        lblIngreseNombre.setText("Ingrese su nombre:");

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        lblSeleccioneCategoria.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        lblSeleccioneCategoria.setText("Seleccione una categoria:");

        ckbAlmuerzo.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        ckbAlmuerzo.setText("Almuerzo");
        ckbAlmuerzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbAlmuerzoActionPerformed(evt);
            }
        });

        ckbTransporte.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        ckbTransporte.setText("Transporte");
        ckbTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbTransporteActionPerformed(evt);
            }
        });

        ckbMaterialApoyo.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        ckbMaterialApoyo.setText("Material de apoyo");
        ckbMaterialApoyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbMaterialApoyoActionPerformed(evt);
            }
        });

        cbxCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTUDIANTE", "PROFESIONAL", "INVITADO ESPECIAL" }));
        cbxCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriasActionPerformed(evt);
            }
        });

        bttTurnos.add(rdbManana);
        rdbManana.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        rdbManana.setText("Mañana");
        rdbManana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMananaActionPerformed(evt);
            }
        });

        bttTurnos.add(rdbTarde);
        rdbTarde.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        rdbTarde.setText("Tarde");
        rdbTarde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbTardeActionPerformed(evt);
            }
        });

        lblServicios.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        lblServicios.setForeground(new java.awt.Color(0, 51, 255));
        lblServicios.setText("Servicios:");

        jLabel6.setFont(new java.awt.Font("Sitka Display", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Turnos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblIngreseNombre)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSeleccioneCategoria)
                                .addGap(18, 18, 18)
                                .addComponent(cbxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblServicios)
                                            .addComponent(jLabel6))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ckbAlmuerzo)
                                            .addComponent(rdbManana))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ckbTransporte)
                                                .addGap(18, 18, 18)
                                                .addComponent(ckbMaterialApoyo))
                                            .addComponent(rdbTarde)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bttMostarRegistro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(bttRegistarParticipante))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(lblTitulo)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngreseNombre)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeleccioneCategoria)
                    .addComponent(cbxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServicios)
                    .addComponent(ckbAlmuerzo)
                    .addComponent(ckbTransporte)
                    .addComponent(ckbMaterialApoyo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(rdbManana))
                    .addComponent(rdbTarde))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttRegistarParticipante)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttMostarRegistro)
                        .addGap(167, 167, 167))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ckbMaterialApoyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbMaterialApoyoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbMaterialApoyoActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void cbxCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCategoriasActionPerformed

    private void ckbAlmuerzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbAlmuerzoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbAlmuerzoActionPerformed

    private void ckbTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbTransporteActionPerformed

    private void rdbMananaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMananaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbMananaActionPerformed

    private void rdbTardeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbTardeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbTardeActionPerformed

    private void bttMostarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttMostarRegistroActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_bttMostarRegistroActionPerformed

    private void bttRegistarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttRegistarParticipanteActionPerformed
        // TODO add your handling code here:
        String nombre = txtNombres.getText();
        String categoria = (String) cbxCategorias.getSelectedItem();
        boolean mañana = rdbManana.isSelected();
        boolean tarde = rdbTarde.isSelected();

        
        String servicios = "";
        if (ckbAlmuerzo.isSelected()) {
            servicios = servicios + "ALMUERZO";
        }
        if (ckbTransporte.isSelected()) {
            servicios = servicios + ","+"TRANSPORTE";
        }
        if (ckbMaterialApoyo.isSelected()) {
            servicios = servicios + ","+"MATERIAL DE APOYO";
        }


       
    }//GEN-LAST:event_bttRegistarParticipanteActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttMostarRegistro;
    private javax.swing.JButton bttRegistarParticipante;
    private javax.swing.ButtonGroup bttTurnos;
    private javax.swing.JComboBox<String> cbxCategorias;
    private javax.swing.JCheckBox ckbAlmuerzo;
    private javax.swing.JCheckBox ckbMaterialApoyo;
    private javax.swing.JCheckBox ckbTransporte;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIngreseNombre;
    private javax.swing.JLabel lblSeleccioneCategoria;
    private javax.swing.JLabel lblServicios;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rdbManana;
    private javax.swing.JRadioButton rdbTarde;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextArea txtaMostrario;
    // End of variables declaration//GEN-END:variables
}

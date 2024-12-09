/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Cauã
 */
public class InclusaoProdutoView extends javax.swing.JPanel {

    /**
     * Creates new form InclusaoProdutoView
     */
    public InclusaoProdutoView() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblPrecoCusto = new javax.swing.JLabel();
        lblPercentualLucro = new javax.swing.JLabel();
        txtPercentualLucro = new javax.swing.JTextField();
        lblPrecoVenda = new javax.swing.JLabel();
        txtPrecoVenda = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();
        txtPrecoCusto = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setToolTipText("");
        setName("Inclusão de Produtos"); // NOI18N

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblPrecoCusto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPrecoCusto.setText("Preço Custo:");

        lblPercentualLucro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPercentualLucro.setText("Percentual Lucro:");

        txtPercentualLucro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblPrecoVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPrecoVenda.setText("Preço Venda:");

        txtPrecoVenda.setEditable(false);
        txtPrecoVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnIncluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnIncluir.setText("Incluir");

        txtPrecoCusto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPercentualLucro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPercentualLucro))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPrecoCusto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecoCusto))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPrecoVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecoVenda)))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnIncluir)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecoCusto)
                    .addComponent(txtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPercentualLucro)
                    .addComponent(txtPercentualLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecoVenda)
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnIncluir))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getTxtNome() {
        return txtNome;
    }
    
    public JTextField getTxtPrecoCusto() {
        return txtPrecoCusto;
    }

    public JTextField getTxtPercentualLucro() {
        return txtPercentualLucro;
    }
    
    public void setTxtPrecoVenda(double valor) { 
       txtPrecoVenda.setText(String.valueOf(valor));
    }
    
    public JButton getBtnIncluir() {
        return btnIncluir;
    }
    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPercentualLucro;
    private javax.swing.JLabel lblPrecoCusto;
    private javax.swing.JLabel lblPrecoVenda;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPercentualLucro;
    private javax.swing.JTextField txtPrecoCusto;
    private javax.swing.JTextField txtPrecoVenda;
    // End of variables declaration//GEN-END:variables
}

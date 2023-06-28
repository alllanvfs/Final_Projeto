//allan vinicios ferraz santos 2465272

package com.mycompany.projectmotos;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RelatorioGeralTouring extends javax.swing.JFrame {

  private static RelatorioGeralTouring relGerTouring;
  
  public RelatorioGeralTouring() {
    initComponents();
    this.setLocationRelativeTo(null);
  }
  
  public static RelatorioGeralTouring getRelGerTouring(){
    if(relGerTouring == null){
      relGerTouring = new RelatorioGeralTouring();
    }
    return relGerTouring;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    lblTituloTouring = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tbTouring = new javax.swing.JTable();
    jMenuBar1 = new javax.swing.JMenuBar();
    mbEsportiva = new javax.swing.JMenu();
    miCadEsportiva = new javax.swing.JMenuItem();
    miRelatorioGeral = new javax.swing.JMenuItem();
    mbTouring = new javax.swing.JMenu();
    miCadTouring = new javax.swing.JMenuItem();
    mbOffroad = new javax.swing.JMenu();
    miCadOffroad = new javax.swing.JMenuItem();
    miRelatorioGera = new javax.swing.JMenuItem();
    mbVoltar = new javax.swing.JMenu();
    miMenuInicial = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowActivated(java.awt.event.WindowEvent evt) {
        formWindowActivated(evt);
      }
    });

    lblTituloTouring.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    lblTituloTouring.setText("Registro Geral - Moto Touring");

    tbTouring.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null, null, null, null}
      },
      new String [] {
        "NOME", "CPF", "IDADE", "PLACA", "MARCA", "MODELO", "COR", "PESO", "VALOR", "CILINDRADA", "CAPACIDADE DO TANQUE", "MALAS", "CONFORTO"
      }
    ));
    tbTouring.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tbTouringMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tbTouring);

    mbEsportiva.setText("Esportiva");

    miCadEsportiva.setText("Cadastro...");
    miCadEsportiva.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        miCadEsportivaActionPerformed(evt);
      }
    });
    mbEsportiva.add(miCadEsportiva);

    miRelatorioGeral.setText("Relatorio Geral...");
    miRelatorioGeral.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        miRelatorioGeralActionPerformed(evt);
      }
    });
    mbEsportiva.add(miRelatorioGeral);

    jMenuBar1.add(mbEsportiva);

    mbTouring.setText("Touring");

    miCadTouring.setText("Cadastro...");
    miCadTouring.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        miCadTouringActionPerformed(evt);
      }
    });
    mbTouring.add(miCadTouring);

    jMenuBar1.add(mbTouring);

    mbOffroad.setText("Offroad");

    miCadOffroad.setText("Cadastro...");
    miCadOffroad.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        miCadOffroadActionPerformed(evt);
      }
    });
    mbOffroad.add(miCadOffroad);

    miRelatorioGera.setText("Relatorio Geral...");
    miRelatorioGera.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        miRelatorioGeraActionPerformed(evt);
      }
    });
    mbOffroad.add(miRelatorioGera);

    jMenuBar1.add(mbOffroad);

    mbVoltar.setText("Voltar");

    miMenuInicial.setText("Menu Inicial...");
    miMenuInicial.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        miMenuInicialActionPerformed(evt);
      }
    });
    mbVoltar.add(miMenuInicial);

    jMenuBar1.add(mbVoltar);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
        .addContainerGap())
      .addGroup(layout.createSequentialGroup()
        .addGap(381, 381, 381)
        .addComponent(lblTituloTouring)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lblTituloTouring)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void miCadEsportivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadEsportivaActionPerformed
    CadEsportiva.getCadEsportiva().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_miCadEsportivaActionPerformed

  private void miRelatorioGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioGeralActionPerformed
    RelatorioGeralEsportiva.getRelGerEsportiva().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_miRelatorioGeralActionPerformed

  private void miCadTouringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadTouringActionPerformed
    CadTouring.getCadTouring().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_miCadTouringActionPerformed

  private void miCadOffroadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadOffroadActionPerformed
    CadOffroad.getCadOffroad().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_miCadOffroadActionPerformed

  private void miRelatorioGeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioGeraActionPerformed
    RelatorioGeralOffroad.getRelGerOffroad().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_miRelatorioGeraActionPerformed

  private void miMenuInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMenuInicialActionPerformed
    TelaInicial.getTelaInicial().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_miMenuInicialActionPerformed

  private void tbTouringMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTouringMouseClicked
    selectTab();
  }//GEN-LAST:event_tbTouringMouseClicked

  private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    listarTab();
  }//GEN-LAST:event_formWindowActivated

  public void selectTab(){
        String valLin = "";
        int posLin = tbTouring.getSelectedRow();
        
        for(int col = 0; col < tbTouring.getComponentCount(); col++){
            valLin += tbTouring.getModel().getValueAt(posLin, col).toString();
            
            if(col+1 < tbTouring.getColumnCount()){
                valLin += " - ";
            }
        }
        
        JOptionPane.showMessageDialog(null, "Valor capturado: ", "Captura de Dados da Tabela", 1);
    }
  
  public void listarTab(){
        DefaultTableModel tabModel = (DefaultTableModel) tbTouring.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Touring t : Banco.getBancoMotors().getBdTouring()){
            tabModel.insertRow(posLin, new Object[]{t.getNome(), t.getCpf(), t.getIdade(), t.getPlaca(), t.getMarca(), t.getModelo(), t.getCor(), t.getPeso(), t.getValor(), t.getCilindradas(), t.getCapacidade_tanque(), t.getMalas(), t.getConforto()});
            posLin++;
        }
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblTituloTouring;
  private javax.swing.JMenu mbEsportiva;
  private javax.swing.JMenu mbOffroad;
  private javax.swing.JMenu mbTouring;
  private javax.swing.JMenu mbVoltar;
  private javax.swing.JMenuItem miCadEsportiva;
  private javax.swing.JMenuItem miCadOffroad;
  private javax.swing.JMenuItem miCadTouring;
  private javax.swing.JMenuItem miMenuInicial;
  private javax.swing.JMenuItem miRelatorioGera;
  private javax.swing.JMenuItem miRelatorioGeral;
  private javax.swing.JTable tbTouring;
  // End of variables declaration//GEN-END:variables
}

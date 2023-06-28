//ALLAN VINICIOS FERRAZ SANTOS 2465272

package com.mycompany.projectmotos;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatorioGeralOffroad extends javax.swing.JFrame {
  
  private static RelatorioGeralOffroad relGerOffroad;
  
  public RelatorioGeralOffroad() {
    initComponents();
    this.setLocationRelativeTo(null);
  }
  
  public static RelatorioGeralOffroad getRelGerOffroad(){
    if(relGerOffroad == null){
      relGerOffroad = new RelatorioGeralOffroad();
    }
    return relGerOffroad;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    lblTituloOffroad = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tbOffroad = new javax.swing.JTable();
    jMenuBar1 = new javax.swing.JMenuBar();
    mbEsportiva = new javax.swing.JMenu();
    miCadEsportiva = new javax.swing.JMenuItem();
    miRelatorioGeral = new javax.swing.JMenuItem();
    mbTouring = new javax.swing.JMenu();
    miCadTouring = new javax.swing.JMenuItem();
    miRelatorio = new javax.swing.JMenuItem();
    mbOffroad = new javax.swing.JMenu();
    miCadOffroad = new javax.swing.JMenuItem();
    mbVoltar = new javax.swing.JMenu();
    miMenuInicial = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowActivated(java.awt.event.WindowEvent evt) {
        formWindowActivated(evt);
      }
    });

    lblTituloOffroad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    lblTituloOffroad.setText("Relatorio Geral - Moto Offroad");

    tbOffroad.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null, null, null, null}
      },
      new String [] {
        "NOME", "CPF", "IDADE", "PLACA", "MARCA", "MODELO", "COR", "PESO", "VALOR", "CILINDRADA", "ALT MIN SOLO", "TIPO PNEU", "PROTECAO"
      }
    ));
    tbOffroad.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tbOffroadMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tbOffroad);

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

    miRelatorio.setText("Relatorio Geral...");
    miRelatorio.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        miRelatorioActionPerformed(evt);
      }
    });
    mbTouring.add(miRelatorio);

    jMenuBar1.add(mbTouring);

    mbOffroad.setText("Offroad");

    miCadOffroad.setText("Cadastro...");
    miCadOffroad.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        miCadOffroadActionPerformed(evt);
      }
    });
    mbOffroad.add(miCadOffroad);

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
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1)
        .addContainerGap())
      .addGroup(layout.createSequentialGroup()
        .addGap(376, 376, 376)
        .addComponent(lblTituloOffroad)
        .addContainerGap(379, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lblTituloOffroad)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
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

  private void miRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioActionPerformed
    RelatorioGeralTouring.getRelGerTouring().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_miRelatorioActionPerformed

  private void miCadOffroadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadOffroadActionPerformed
    CadOffroad.getCadOffroad().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_miCadOffroadActionPerformed

  private void miMenuInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMenuInicialActionPerformed
    TelaInicial.getTelaInicial().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_miMenuInicialActionPerformed

  private void tbOffroadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbOffroadMouseClicked
    selectTab();
  }//GEN-LAST:event_tbOffroadMouseClicked

  private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    listarTab();
  }//GEN-LAST:event_formWindowActivated

  
  
  public void selectTab(){
        String valLin = "";
        int posLin = tbOffroad.getSelectedRow();
        
        for(int col = 0; col < tbOffroad.getComponentCount(); col++){
            valLin += tbOffroad.getModel().getValueAt(posLin, col).toString();
            
            if(col+1 < tbOffroad.getColumnCount()){
                valLin += " - ";
            }
        }
        
        JOptionPane.showMessageDialog(null, "Valor capturado: ", "Captura de Dados da Tabela", 1);
    }
  
  public void listarTab(){
        DefaultTableModel tabModel = (DefaultTableModel) tbOffroad.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Offroad o : Banco.getBancoMotors().getBdOffroad()){
            tabModel.insertRow(posLin, new Object[]{o.getNome(), o.getCpf(), o.getIdade(), o.getPlaca(), o.getMarca(), o.getModelo(), o.getCor(), o.getPeso(), o.getValor(), o.getCilindradas(), o.getsAltura_minima_solo(), o.getsPneus(), o.getsprotecao()});
            posLin++;
        }
    }
  

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblTituloOffroad;
  private javax.swing.JMenu mbEsportiva;
  private javax.swing.JMenu mbOffroad;
  private javax.swing.JMenu mbTouring;
  private javax.swing.JMenu mbVoltar;
  private javax.swing.JMenuItem miCadEsportiva;
  private javax.swing.JMenuItem miCadOffroad;
  private javax.swing.JMenuItem miCadTouring;
  private javax.swing.JMenuItem miMenuInicial;
  private javax.swing.JMenuItem miRelatorio;
  private javax.swing.JMenuItem miRelatorioGeral;
  private javax.swing.JTable tbOffroad;
  // End of variables declaration//GEN-END:variables
}
package com.mycompany.projectmotos;
//ALLAN VINICIOS FERRAZ SANTOS 2465272

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadTouring extends javax.swing.JFrame {
  
  private static CadTouring cadTouringUnico;
  private Touring t = new Touring();
  
  public CadTouring() {
    initComponents();
    this.setLocationRelativeTo(null);
  }
  
  public static CadTouring getCadTouring(){
    if(cadTouringUnico == null){
      cadTouringUnico = new CadTouring();
    }
    
    return cadTouringUnico;
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel3 = new javax.swing.JLabel();
    tfIdade = new javax.swing.JTextField();
    lblDadosPessoa = new javax.swing.JLabel();
    lblDadosGerais = new javax.swing.JLabel();
    tfPlaca = new javax.swing.JTextField();
    tfMarca = new javax.swing.JTextField();
    tfModelo = new javax.swing.JTextField();
    tfCor = new javax.swing.JTextField();
    lblPlaca = new javax.swing.JLabel();
    lblMarca = new javax.swing.JLabel();
    lblModelo = new javax.swing.JLabel();
    lblCor = new javax.swing.JLabel();
    lblPeso = new javax.swing.JLabel();
    lblValor = new javax.swing.JLabel();
    lblCilindrada = new javax.swing.JLabel();
    lblDadosEspecificosMoto = new javax.swing.JLabel();
    tfPeso = new javax.swing.JTextField();
    lblCadastrodeMotoTouring = new javax.swing.JLabel();
    tfValor = new javax.swing.JTextField();
    lblNome = new javax.swing.JLabel();
    tfCilindrada = new javax.swing.JTextField();
    tfNome = new javax.swing.JTextField();
    lblCpf = new javax.swing.JLabel();
    lblIdade = new javax.swing.JLabel();
    tfCpf = new javax.swing.JTextField();
    lblCapacidadeTanque = new javax.swing.JLabel();
    lblMalas = new javax.swing.JLabel();
    lblConforto = new javax.swing.JLabel();
    tfCapacidadeTanque = new javax.swing.JTextField();
    lblMalasUm = new javax.swing.JLabel();
    lblMalasDois = new javax.swing.JLabel();
    lblMalasTres = new javax.swing.JLabel();
    lblConfortoum = new javax.swing.JLabel();
    lblConfortoDois = new javax.swing.JLabel();
    lblConfortoTres = new javax.swing.JLabel();
    tfMalas = new javax.swing.JTextField();
    tfConforto = new javax.swing.JTextField();
    btnInserir = new javax.swing.JButton();
    btnConsultar = new javax.swing.JButton();
    btnAlterar = new javax.swing.JButton();
    btnExcluir = new javax.swing.JButton();
    btnLimpar = new javax.swing.JButton();
    btnSair = new javax.swing.JButton();
    mbMenu = new javax.swing.JMenuBar();
    mbEsportiva = new javax.swing.JMenu();
    miCadEsportiva = new javax.swing.JMenuItem();
    miRelatorioGeral = new javax.swing.JMenuItem();
    mbTouring = new javax.swing.JMenu();
    miRelatorio = new javax.swing.JMenuItem();
    mbOffroad = new javax.swing.JMenu();
    miCadOffroad = new javax.swing.JMenuItem();
    miRegistroGera = new javax.swing.JMenuItem();
    mbVoltar = new javax.swing.JMenu();
    miMenuInicial = new javax.swing.JMenuItem();

    jLabel3.setText("jLabel3");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    lblDadosPessoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    lblDadosPessoa.setText("Dados Pessoa");

    lblDadosGerais.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    lblDadosGerais.setText("Dados Gerais Moto");

    lblPlaca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lblPlaca.setText("Placa:");

    lblMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lblMarca.setText("Marca:");

    lblModelo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lblModelo.setText("Modelo:");

    lblCor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lblCor.setText("Cor:");

    lblPeso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lblPeso.setText("Peso:");

    lblValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lblValor.setText("Valor:");

    lblCilindrada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lblCilindrada.setText("Cilindrada:");

    lblDadosEspecificosMoto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    lblDadosEspecificosMoto.setText("Dados Especificos Moto");

    lblCadastrodeMotoTouring.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    lblCadastrodeMotoTouring.setText("Cadastro de Moto Touring");

    lblNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lblNome.setText("Nome:");

    tfNome.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tfNomeActionPerformed(evt);
      }
    });

    lblCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lblCpf.setText("Cpf:");

    lblIdade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lblIdade.setText("Idade:");

    lblCapacidadeTanque.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lblCapacidadeTanque.setText("Capacidade do Tanque:");

    lblMalas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lblMalas.setText("Malas:");

    lblConforto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lblConforto.setText("Nivel de Conforto:");

    lblMalasUm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    lblMalasUm.setText("1 - Malas Laterais");

    lblMalasDois.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    lblMalasDois.setText("2 - Bau Traseiro");

    lblMalasTres.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    lblMalasTres.setText("3 - Malas Laterais e Bau Traseiro");

    lblConfortoum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    lblConfortoum.setText("1 - Otimo");

    lblConfortoDois.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    lblConfortoDois.setText("2 - Mediano");

    lblConfortoTres.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    lblConfortoTres.setText("3 - Ruim");

    btnInserir.setText("Inserir");
    btnInserir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnInserirActionPerformed(evt);
      }
    });

    btnConsultar.setText("Consultar");
    btnConsultar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnConsultarActionPerformed(evt);
      }
    });

    btnAlterar.setText("Alterar");
    btnAlterar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAlterarActionPerformed(evt);
      }
    });

    btnExcluir.setText("Excluir");
    btnExcluir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnExcluirActionPerformed(evt);
      }
    });

    btnLimpar.setText("Limpar");
    btnLimpar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLimparActionPerformed(evt);
      }
    });

    btnSair.setText("Sair");
    btnSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSairActionPerformed(evt);
      }
    });

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

    mbMenu.add(mbEsportiva);

    mbTouring.setText("Touring");

    miRelatorio.setText("Registro Geral...");
    miRelatorio.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        miRelatorioActionPerformed(evt);
      }
    });
    mbTouring.add(miRelatorio);

    mbMenu.add(mbTouring);

    mbOffroad.setText("Offroad");

    miCadOffroad.setText("Cadastro...");
    miCadOffroad.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        miCadOffroadActionPerformed(evt);
      }
    });
    mbOffroad.add(miCadOffroad);

    miRegistroGera.setText("Registro Geral...");
    miRegistroGera.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        miRegistroGeraActionPerformed(evt);
      }
    });
    mbOffroad.add(miRegistroGera);

    mbMenu.add(mbOffroad);

    mbVoltar.setText("Voltar");

    miMenuInicial.setText("Menu Inicial...");
    miMenuInicial.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        miMenuInicialActionPerformed(evt);
      }
    });
    mbVoltar.add(miMenuInicial);

    mbMenu.add(mbVoltar);

    setJMenuBar(mbMenu);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblCpf)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblNome)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(lblDadosPessoa)
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblIdade)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(lblDadosGerais)
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblPlaca)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblMarca)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblCor)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tfCor, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblPeso)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblValor)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(lblDadosEspecificosMoto)
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblMalas)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tfMalas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblConforto)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tfConforto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblCapacidadeTanque)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tfCapacidadeTanque, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblCilindrada)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tfCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(lblCadastrodeMotoTouring)
            .addGroup(layout.createSequentialGroup()
              .addComponent(lblModelo)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lblMalasDois)
              .addComponent(lblMalasUm)
              .addComponent(lblMalasTres)
              .addComponent(lblConfortoDois)
              .addComponent(lblConfortoum)
              .addComponent(lblConfortoTres)))
          .addGroup(layout.createSequentialGroup()
            .addGap(53, 53, 53)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(28, 28, 28)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addContainerGap(57, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(30, 30, 30)
        .addComponent(lblCadastrodeMotoTouring)
        .addGap(18, 18, 18)
        .addComponent(lblDadosPessoa)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblNome)
          .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblCpf)
          .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblIdade)
          .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(lblDadosGerais)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblPlaca)
          .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblMarca)
          .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblModelo)
          .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblCor)
          .addComponent(tfCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblPeso)
          .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblValor)
          .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblCilindrada)
          .addComponent(tfCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(lblDadosEspecificosMoto)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblCapacidadeTanque)
          .addComponent(tfCapacidadeTanque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblMalas)
          .addComponent(tfMalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lblMalasUm)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lblMalasDois)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lblMalasTres)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblConforto)
          .addComponent(tfConforto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lblConfortoum)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lblConfortoDois)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lblConfortoTres)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnInserir)
          .addComponent(btnAlterar)
          .addComponent(btnLimpar))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnConsultar)
          .addComponent(btnExcluir)
          .addComponent(btnSair))
        .addGap(37, 37, 37))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tfNomeActionPerformed

  private void miRelatorioGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioGeralActionPerformed
    RelatorioGeralEsportiva.getRelGerEsportiva().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_miRelatorioGeralActionPerformed

  private void miMenuInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMenuInicialActionPerformed
    TelaInicial.getTelaInicial().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_miMenuInicialActionPerformed

  private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
    try {
      cadTouring();
      limpar();
    } catch (CpfPeqException ex) {
      Logger.getLogger(CadTouring.class.getName()).log(Level.SEVERE, null, ex);
    } catch (CpfGrdException ex) {
      Logger.getLogger(CadTouring.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IdadeGrdException ex) {
      Logger.getLogger(CadTouring.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IdadePeqException ex) {
      Logger.getLogger(CadTouring.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_btnInserirActionPerformed

  private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
  altTouring();
  limpar();
  }//GEN-LAST:event_btnAlterarActionPerformed

  private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
  limpar();
  }//GEN-LAST:event_btnLimparActionPerformed

  private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
  consTouring();
  }//GEN-LAST:event_btnConsultarActionPerformed

  private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
    excluirTouring();
    limpar();
  }//GEN-LAST:event_btnExcluirActionPerformed

  private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
   sair();
  }//GEN-LAST:event_btnSairActionPerformed

  private void miCadEsportivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadEsportivaActionPerformed
    CadEsportiva.getCadEsportiva().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_miCadEsportivaActionPerformed

  private void miRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioActionPerformed
    RelatorioGeralTouring.getRelGerTouring().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_miRelatorioActionPerformed

  private void miCadOffroadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadOffroadActionPerformed
    CadOffroad.getCadOffroad().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_miCadOffroadActionPerformed

  private void miRegistroGeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegistroGeraActionPerformed
    RelatorioGeralOffroad.getRelGerOffroad().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_miRegistroGeraActionPerformed

  public void limpar(){
    tfPlaca.setText("");
    tfCapacidadeTanque.setText("");
    tfCilindrada.setText("");
    tfConforto.setText("");
    tfCor.setText("");
    tfCpf.setText("");
    tfIdade.setText("");
    tfMalas.setText("");
    tfMarca.setText("");
    tfModelo.setText("");
    tfNome.setText("");
    tfPeso.setText("");
    tfValor.setText("");
  }
  
  public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saída", JOptionPane.YES_NO_OPTION);
        
        if(resp == 0){
            System.exit(0);
        }
    }
  
  public void cadTouring() throws CpfPeqException, CpfGrdException, IdadeGrdException, IdadePeqException{
    try{
      t = new Touring();
      
      t.setPlaca(tfPlaca.getText());
      t.setCapacidade_tanque(Integer.parseInt(tfCapacidadeTanque.getText()));
      t.setCilindradas(Integer.parseInt(tfCilindrada.getText()));
      t.setConforto(tfConforto.getText());
      t.setCor(tfCor.getText());
      t.setCpf(Integer.parseInt(tfCpf.getText()));
      t.setIdade(Integer.parseInt(tfIdade.getText()));
      t.setMalas(tfMalas.getText());
      t.setMarca(tfMarca.getText());
      t.setModelo(tfModelo.getText());
      t.setNome(tfNome.getText());
      t.setPeso(Integer.parseInt(tfPeso.getText()));
      t.setValor(Integer.parseInt(tfValor.getText()));
      
      t = Banco.getBancoMotors().cadTouring(t);
      
      if(t != null){
        JOptionPane.showMessageDialog(null, "Moto Cadastrada!", "Aviso", 1);
      }
      else{
        JOptionPane.showMessageDialog(null, "Moto ja cadastrada!", "Aviso", 0);
      }
      
    }
    catch(NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "+Capacidade do tanque\n+Cilindradas\n+CPF\n+Idade\n+Peso\n+Valor\ndevem ser valores inteiros", "ATENCAO",2);
      limpar();
    }
  }
  
  public void consTouring(){
    t = new Touring();
    t.setPlaca(tfPlaca.getText());
    t = Banco.getBancoMotors().consTouring(t);
    
    if(t != null){
      tfPlaca.setText(t.getPlaca());
      tfCapacidadeTanque.setText(Integer.toString(t.getCapacidade_tanque()));
      tfCilindrada.setText(Integer.toString(t.getCilindradas()));
      tfConforto.setText(t.getConforto());
      tfCor.setText(t.getCor());
      tfCpf.setText(Integer.toString(t.getCpf()));
      tfIdade.setText(Integer.toString(t.getIdade()));
      tfMalas.setText(t.getMalas());
      tfMarca.setText(t.getMarca());
      tfModelo.setText(t.getModelo());
      tfNome.setText(t.getNome());
      tfPeso.setText(Integer.toString((int) t.getPeso()));
      tfValor.setText(Integer.toString((int) t.getValor()));
    }
    else{
      JOptionPane.showMessageDialog(null,"CPF nao cadastrado", "Consulta de Moto",0);
    }
  }
  
  public void excluirTouring(){
    t = new Touring();
    t.setPlaca(tfPlaca.getText());
    t = Banco.getBancoMotors().deletarTuring(t);
    
    if(t != null){
            JOptionPane.showMessageDialog(null, "Moto excluída com sucesso!", "Exclusão de Moto", 1);
        }else{
            JOptionPane.showMessageDialog(null, "Placa não cadastrada", "Exclusão de Moto", 0);
        }
    
  }
  
  public void altTouring(){
    try{
      t = new Touring();
      t.setPlaca(tfPlaca.getText());
      t = Banco.getBancoMotors().alterarTouring(t);
      
      if(t != null){
        tfPlaca.setText(t.getPlaca());
        tfCapacidadeTanque.setText(Integer.toString(t.getCapacidade_tanque()));
        tfCilindrada.setText(Integer.toString(t.getCilindradas()));
        tfConforto.setText(t.getConforto());
        tfCor.setText(t.getCor());
        tfCpf.setText(Integer.toString(t.getCpf()));
        tfIdade.setText(Integer.toString(t.getIdade()));
        tfMalas.setText(t.getMalas());
        tfMarca.setText(t.getMarca());
        tfModelo.setText(t.getModelo());
        tfNome.setText(t.getNome());
        tfPeso.setText(Integer.toString((int) t.getPeso()));
        tfValor.setText(Integer.toString((int) t.getValor()));
      }
      else{
        JOptionPane.showMessageDialog(null, "Placa não cadastrada", "Alteração de Moto", 0);
      } 
    }
    catch(NumberFormatException e){
      JOptionPane.showMessageDialog(null, "+Capacidade do Tanque\n+Cilindrada\n+Cpf\n+Idade\n+Peso\n+Valor\ndevem ser números inteiros", "ATENÇÃO", 2);
      limpar();
    }
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAlterar;
  private javax.swing.JButton btnConsultar;
  private javax.swing.JButton btnExcluir;
  private javax.swing.JButton btnInserir;
  private javax.swing.JButton btnLimpar;
  private javax.swing.JButton btnSair;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel lblCadastrodeMotoTouring;
  private javax.swing.JLabel lblCapacidadeTanque;
  private javax.swing.JLabel lblCilindrada;
  private javax.swing.JLabel lblConforto;
  private javax.swing.JLabel lblConfortoDois;
  private javax.swing.JLabel lblConfortoTres;
  private javax.swing.JLabel lblConfortoum;
  private javax.swing.JLabel lblCor;
  private javax.swing.JLabel lblCpf;
  private javax.swing.JLabel lblDadosEspecificosMoto;
  private javax.swing.JLabel lblDadosGerais;
  private javax.swing.JLabel lblDadosPessoa;
  private javax.swing.JLabel lblIdade;
  private javax.swing.JLabel lblMalas;
  private javax.swing.JLabel lblMalasDois;
  private javax.swing.JLabel lblMalasTres;
  private javax.swing.JLabel lblMalasUm;
  private javax.swing.JLabel lblMarca;
  private javax.swing.JLabel lblModelo;
  private javax.swing.JLabel lblNome;
  private javax.swing.JLabel lblPeso;
  private javax.swing.JLabel lblPlaca;
  private javax.swing.JLabel lblValor;
  private javax.swing.JMenu mbEsportiva;
  private javax.swing.JMenuBar mbMenu;
  private javax.swing.JMenu mbOffroad;
  private javax.swing.JMenu mbTouring;
  private javax.swing.JMenu mbVoltar;
  private javax.swing.JMenuItem miCadEsportiva;
  private javax.swing.JMenuItem miCadOffroad;
  private javax.swing.JMenuItem miMenuInicial;
  private javax.swing.JMenuItem miRegistroGera;
  private javax.swing.JMenuItem miRelatorio;
  private javax.swing.JMenuItem miRelatorioGeral;
  private javax.swing.JTextField tfCapacidadeTanque;
  private javax.swing.JTextField tfCilindrada;
  private javax.swing.JTextField tfConforto;
  private javax.swing.JTextField tfCor;
  private javax.swing.JTextField tfCpf;
  private javax.swing.JTextField tfIdade;
  private javax.swing.JTextField tfMalas;
  private javax.swing.JTextField tfMarca;
  private javax.swing.JTextField tfModelo;
  private javax.swing.JTextField tfNome;
  private javax.swing.JTextField tfPeso;
  private javax.swing.JTextField tfPlaca;
  private javax.swing.JTextField tfValor;
  // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backup;

import Classe.Calculadora;

/**
 *
 * @author williank
 */
public class CalculadoraGrafica_old extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraGrafica
     */
    public CalculadoraGrafica_old() {
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

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campo4 = new javax.swing.JFormattedTextField();
        campo5 = new javax.swing.JFormattedTextField();
        jPanel6 = new javax.swing.JPanel();
        campo6 = new javax.swing.JTextField();
        ButtonMultiplicar1 = new javax.swing.JButton();
        ButtonDividir1 = new javax.swing.JButton();
        ButtonDiminur1 = new javax.swing.JButton();
        ButtonSomar1 = new javax.swing.JButton();
        PainelDoisNumeros = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        PanelOperacaoDois_Numeros = new javax.swing.JPanel();
        labelN1_dois = new javax.swing.JLabel();
        labeln1_dois = new javax.swing.JLabel();
        campoN1_dois = new javax.swing.JFormattedTextField();
        campoN2_dois = new javax.swing.JFormattedTextField();
        PainelOperacaoDois_Resultado = new javax.swing.JPanel();
        campoResultado_dois = new javax.swing.JTextField();
        ButtonMultiplicar = new javax.swing.JButton();
        ButtonDividir = new javax.swing.JButton();
        ButtonDiminur = new javax.swing.JButton();
        ButtonSomar = new javax.swing.JButton();
        PainelUmNumero = new javax.swing.JPanel();
        PainelUmNumero_numeros = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        campoN1_um = new javax.swing.JFormattedTextField();
        PainelUmNumero_resultado = new javax.swing.JPanel();
        campoResultado_um = new javax.swing.JTextField();
        ButtonFatorial = new javax.swing.JButton();
        ButtonFibonacci = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Números"));
        jPanel5.setToolTipText("Números");

        jLabel3.setText("Nº 1");

        jLabel4.setText("Nº 2");

        campo4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        campo5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(campo5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(campo4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        campo6.setEditable(false);
        campo6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        campo6.setToolTipText("");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(campo6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campo6)
                .addContainerGap())
        );

        ButtonMultiplicar1.setText("Multiplicar");

        ButtonDividir1.setText("Dividir");
        ButtonDividir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDividir1ActionPerformed(evt);
            }
        });

        ButtonDiminur1.setText("Diminuir");
        ButtonDiminur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDiminur1ActionPerformed(evt);
            }
        });

        ButtonSomar1.setText("Somar");
        ButtonSomar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSomar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(ButtonSomar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonDiminur1)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 45, Short.MAX_VALUE)
                        .addComponent(ButtonDividir1)
                        .addGap(38, 38, 38)
                        .addComponent(ButtonMultiplicar1)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSomar1)
                    .addComponent(ButtonDiminur1)
                    .addComponent(ButtonDividir1)
                    .addComponent(ButtonMultiplicar1))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelDoisNumeros.setBorder(new javax.swing.border.MatteBorder(null));

        labelTitulo.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Operação com dois números");

        PanelOperacaoDois_Numeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Números"));
        PanelOperacaoDois_Numeros.setToolTipText("Números");

        labelN1_dois.setText("Nº 1");

        labeln1_dois.setText("Nº 2");

        campoN1_dois.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        campoN2_dois.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        javax.swing.GroupLayout PanelOperacaoDois_NumerosLayout = new javax.swing.GroupLayout(PanelOperacaoDois_Numeros);
        PanelOperacaoDois_Numeros.setLayout(PanelOperacaoDois_NumerosLayout);
        PanelOperacaoDois_NumerosLayout.setHorizontalGroup(
            PanelOperacaoDois_NumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOperacaoDois_NumerosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelOperacaoDois_NumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOperacaoDois_NumerosLayout.createSequentialGroup()
                        .addComponent(labeln1_dois)
                        .addGap(18, 18, 18)
                        .addComponent(campoN2_dois, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelOperacaoDois_NumerosLayout.createSequentialGroup()
                        .addComponent(labelN1_dois)
                        .addGap(18, 18, 18)
                        .addComponent(campoN1_dois, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        PanelOperacaoDois_NumerosLayout.setVerticalGroup(
            PanelOperacaoDois_NumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOperacaoDois_NumerosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelOperacaoDois_NumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoN1_dois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelN1_dois))
                .addGap(18, 18, 18)
                .addGroup(PanelOperacaoDois_NumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeln1_dois)
                    .addComponent(campoN2_dois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelOperacaoDois_Resultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        campoResultado_dois.setEditable(false);
        campoResultado_dois.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        campoResultado_dois.setToolTipText("");

        javax.swing.GroupLayout PainelOperacaoDois_ResultadoLayout = new javax.swing.GroupLayout(PainelOperacaoDois_Resultado);
        PainelOperacaoDois_Resultado.setLayout(PainelOperacaoDois_ResultadoLayout);
        PainelOperacaoDois_ResultadoLayout.setHorizontalGroup(
            PainelOperacaoDois_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelOperacaoDois_ResultadoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(campoResultado_dois, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        PainelOperacaoDois_ResultadoLayout.setVerticalGroup(
            PainelOperacaoDois_ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelOperacaoDois_ResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoResultado_dois)
                .addContainerGap())
        );

        ButtonMultiplicar.setText("Multiplicar");
        ButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMultiplicarActionPerformed(evt);
            }
        });

        ButtonDividir.setText("Dividir");
        ButtonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDividirActionPerformed(evt);
            }
        });

        ButtonDiminur.setText("Diminuir");
        ButtonDiminur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDiminurActionPerformed(evt);
            }
        });

        ButtonSomar.setText("Somar");
        ButtonSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSomarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelDoisNumerosLayout = new javax.swing.GroupLayout(PainelDoisNumeros);
        PainelDoisNumeros.setLayout(PainelDoisNumerosLayout);
        PainelDoisNumerosLayout.setHorizontalGroup(
            PainelDoisNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDoisNumerosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PainelDoisNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PainelDoisNumerosLayout.createSequentialGroup()
                        .addComponent(ButtonSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonDiminur, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelOperacaoDois_Numeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PainelDoisNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PainelDoisNumerosLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(PainelOperacaoDois_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelDoisNumerosLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(ButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonMultiplicar)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addComponent(labelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PainelDoisNumerosLayout.setVerticalGroup(
            PainelDoisNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDoisNumerosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelDoisNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelOperacaoDois_Numeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelOperacaoDois_Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PainelDoisNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSomar)
                    .addComponent(ButtonDiminur)
                    .addComponent(ButtonDividir)
                    .addComponent(ButtonMultiplicar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PainelUmNumero.setBorder(new javax.swing.border.MatteBorder(null));

        PainelUmNumero_numeros.setBorder(javax.swing.BorderFactory.createTitledBorder("Números"));
        PainelUmNumero_numeros.setToolTipText("Números");

        jLabel5.setText("Nº 1");

        campoN1_um.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        javax.swing.GroupLayout PainelUmNumero_numerosLayout = new javax.swing.GroupLayout(PainelUmNumero_numeros);
        PainelUmNumero_numeros.setLayout(PainelUmNumero_numerosLayout);
        PainelUmNumero_numerosLayout.setHorizontalGroup(
            PainelUmNumero_numerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelUmNumero_numerosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(campoN1_um, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        PainelUmNumero_numerosLayout.setVerticalGroup(
            PainelUmNumero_numerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelUmNumero_numerosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PainelUmNumero_numerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoN1_um, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        PainelUmNumero_resultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        campoResultado_um.setEditable(false);
        campoResultado_um.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        campoResultado_um.setToolTipText("");

        javax.swing.GroupLayout PainelUmNumero_resultadoLayout = new javax.swing.GroupLayout(PainelUmNumero_resultado);
        PainelUmNumero_resultado.setLayout(PainelUmNumero_resultadoLayout);
        PainelUmNumero_resultadoLayout.setHorizontalGroup(
            PainelUmNumero_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelUmNumero_resultadoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(campoResultado_um, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        PainelUmNumero_resultadoLayout.setVerticalGroup(
            PainelUmNumero_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelUmNumero_resultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoResultado_um)
                .addContainerGap())
        );

        ButtonFatorial.setText("Calcular Fatorial");
        ButtonFatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFatorialActionPerformed(evt);
            }
        });

        ButtonFibonacci.setText("Calcular Fibonacci");
        ButtonFibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFibonacciActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Operação com um número");

        javax.swing.GroupLayout PainelUmNumeroLayout = new javax.swing.GroupLayout(PainelUmNumero);
        PainelUmNumero.setLayout(PainelUmNumeroLayout);
        PainelUmNumeroLayout.setHorizontalGroup(
            PainelUmNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelUmNumeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelUmNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PainelUmNumero_numeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonFatorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PainelUmNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelUmNumeroLayout.createSequentialGroup()
                        .addComponent(PainelUmNumero_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PainelUmNumeroLayout.createSequentialGroup()
                        .addComponent(ButtonFibonacci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37))))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PainelUmNumeroLayout.setVerticalGroup(
            PainelUmNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelUmNumeroLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelUmNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PainelUmNumero_numeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelUmNumero_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PainelUmNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonFatorial)
                    .addComponent(ButtonFibonacci))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PainelUmNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelDoisNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelDoisNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PainelUmNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSomarActionPerformed
        Calculadora c1 = new Calculadora();
        c1.setNumero1(Double.parseDouble(campoN1_dois.getText()));
        c1.setNumero2(Double.parseDouble(campoN2_dois.getText()));
        
        String soma = ""+c1.somar()+"";
        campoResultado_dois.setText(soma);
    }//GEN-LAST:event_ButtonSomarActionPerformed

    private void ButtonDiminurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDiminurActionPerformed
        Calculadora c1 = new Calculadora();
        c1.setNumero1(Double.parseDouble(campoN1_dois.getText()));
        c1.setNumero2(Double.parseDouble(campoN2_dois.getText()));
        
        String subtracao = ""+c1.diminuir()+"";
        campoResultado_dois.setText(subtracao);
    }//GEN-LAST:event_ButtonDiminurActionPerformed

    private void ButtonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDividirActionPerformed
        Calculadora c1 = new Calculadora();
        c1.setNumero1(Double.parseDouble(campoN1_dois.getText()));
        c1.setNumero2(Double.parseDouble(campoN2_dois.getText()));
        
        String dividir = ""+c1.dividir()+"";
        campoResultado_dois.setText(dividir);
    }//GEN-LAST:event_ButtonDividirActionPerformed

    private void ButtonDividir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDividir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDividir1ActionPerformed

    private void ButtonDiminur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDiminur1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDiminur1ActionPerformed

    private void ButtonSomar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSomar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSomar1ActionPerformed

    private void ButtonFatorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFatorialActionPerformed
        Calculadora c1 = new Calculadora();
        c1.setNumero1(Double.parseDouble(campoN1_um.getText()));
        
        int numero = (int) c1.getNumero1();
        
        String fatorial = ""+c1.fatorial(numero)+"";
        campoResultado_um.setText(fatorial);  
    }//GEN-LAST:event_ButtonFatorialActionPerformed

    private void ButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMultiplicarActionPerformed
        Calculadora c1 = new Calculadora();
        c1.setNumero1(Double.parseDouble(campoN1_dois.getText()));
        c1.setNumero2(Double.parseDouble(campoN2_dois.getText()));
        
        String multiplicar = ""+c1.multiplicar()+"";
        campoResultado_dois.setText(multiplicar);
    }//GEN-LAST:event_ButtonMultiplicarActionPerformed

    private void ButtonFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFibonacciActionPerformed
        Calculadora c1 = new Calculadora();
        c1.setNumero1(Double.parseDouble(campoN1_um.getText()));
        
        int numero = (int) c1.getNumero1();
        
        String fibonacci = ""+c1.calcularFibonacci(numero)+"";
        campoResultado_um.setText(fibonacci); 
    }//GEN-LAST:event_ButtonFibonacciActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraGrafica_old.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGrafica_old.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGrafica_old.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGrafica_old.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraGrafica_old().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDiminur;
    private javax.swing.JButton ButtonDiminur1;
    private javax.swing.JButton ButtonDividir;
    private javax.swing.JButton ButtonDividir1;
    private javax.swing.JButton ButtonFatorial;
    private javax.swing.JButton ButtonFibonacci;
    private javax.swing.JButton ButtonMultiplicar;
    private javax.swing.JButton ButtonMultiplicar1;
    private javax.swing.JButton ButtonSomar;
    private javax.swing.JButton ButtonSomar1;
    private javax.swing.JPanel PainelDoisNumeros;
    private javax.swing.JPanel PainelOperacaoDois_Resultado;
    private javax.swing.JPanel PainelUmNumero;
    private javax.swing.JPanel PainelUmNumero_numeros;
    private javax.swing.JPanel PainelUmNumero_resultado;
    private javax.swing.JPanel PanelOperacaoDois_Numeros;
    private javax.swing.JFormattedTextField campo4;
    private javax.swing.JFormattedTextField campo5;
    private javax.swing.JTextField campo6;
    private javax.swing.JFormattedTextField campoN1_dois;
    private javax.swing.JFormattedTextField campoN1_um;
    private javax.swing.JFormattedTextField campoN2_dois;
    private javax.swing.JTextField campoResultado_dois;
    private javax.swing.JTextField campoResultado_um;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelN1_dois;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labeln1_dois;
    // End of variables declaration//GEN-END:variables
}

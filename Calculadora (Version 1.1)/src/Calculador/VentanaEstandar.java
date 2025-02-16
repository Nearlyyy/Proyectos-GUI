package Calculador;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class VentanaEstandar extends javax.swing.JFrame {
    private String cadenaNumeros = "";
    private double numero1, resultado;
    private String operacion = "nula";
    private boolean activado = true;
    private boolean punto = true;

    public VentanaEstandar() {
        initComponents();
        setSize(395,400);
        setLocationRelativeTo(null);
        setTitle("Calculadora Estándar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        botonRaizCuadrada = new javax.swing.JButton();
        botonDividir = new javax.swing.JButton();
        botonLimpiarPantalla = new javax.swing.JButton();
        pantalla = new javax.swing.JLabel();
        botonEliminarCaracter = new javax.swing.JButton();
        pantallaMostrarOperaciones = new javax.swing.JLabel();
        botonNueve = new javax.swing.JButton();
        botonOcho = new javax.swing.JButton();
        botonSiete = new javax.swing.JButton();
        botonSeis = new javax.swing.JButton();
        botonCinco = new javax.swing.JButton();
        botonCuatro = new javax.swing.JButton();
        botonTres = new javax.swing.JButton();
        botonDos = new javax.swing.JButton();
        botonUno = new javax.swing.JButton();
        botonMultiplicar = new javax.swing.JButton();
        botonRestar = new javax.swing.JButton();
        botonSumar = new javax.swing.JButton();
        botonCero = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        cambiarSigno = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        botonCambiar = new javax.swing.JMenu();
        cambiarCientifica = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(352, 302));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        botonRaizCuadrada.setBackground(new java.awt.Color(204, 255, 255));
        botonRaizCuadrada.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonRaizCuadrada.setText("√");
        botonRaizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRaizCuadradaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonRaizCuadrada, gridBagConstraints);

        botonDividir.setBackground(new java.awt.Color(204, 255, 255));
        botonDividir.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonDividir.setText("÷");
        botonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDividirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonDividir, gridBagConstraints);

        botonLimpiarPantalla.setBackground(new java.awt.Color(255, 204, 204));
        botonLimpiarPantalla.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonLimpiarPantalla.setText("C");
        botonLimpiarPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarPantallaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonLimpiarPantalla, gridBagConstraints);

        pantalla.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantalla.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 60;
        jPanel1.add(pantalla, gridBagConstraints);

        botonEliminarCaracter.setBackground(new java.awt.Color(204, 255, 255));
        botonEliminarCaracter.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonEliminarCaracter.setText("<-");
        botonEliminarCaracter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCaracterActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonEliminarCaracter, gridBagConstraints);

        pantallaMostrarOperaciones.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pantallaMostrarOperaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantallaMostrarOperaciones.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        jPanel1.add(pantallaMostrarOperaciones, gridBagConstraints);

        botonNueve.setBackground(new java.awt.Color(204, 204, 255));
        botonNueve.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonNueve.setText("9");
        botonNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNueveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonNueve, gridBagConstraints);

        botonOcho.setBackground(new java.awt.Color(204, 204, 255));
        botonOcho.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonOcho.setText("8");
        botonOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOchoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonOcho, gridBagConstraints);

        botonSiete.setBackground(new java.awt.Color(204, 204, 255));
        botonSiete.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonSiete.setText("7");
        botonSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSieteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonSiete, gridBagConstraints);

        botonSeis.setBackground(new java.awt.Color(204, 204, 255));
        botonSeis.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonSeis.setText("6");
        botonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeisActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonSeis, gridBagConstraints);

        botonCinco.setBackground(new java.awt.Color(204, 204, 255));
        botonCinco.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonCinco.setText("5");
        botonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCincoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonCinco, gridBagConstraints);

        botonCuatro.setBackground(new java.awt.Color(204, 204, 255));
        botonCuatro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonCuatro.setText("4");
        botonCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuatroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonCuatro, gridBagConstraints);

        botonTres.setBackground(new java.awt.Color(204, 204, 255));
        botonTres.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonTres.setText("3");
        botonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTresActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonTres, gridBagConstraints);

        botonDos.setBackground(new java.awt.Color(204, 204, 255));
        botonDos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonDos.setText("2");
        botonDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonDos, gridBagConstraints);

        botonUno.setBackground(new java.awt.Color(204, 204, 255));
        botonUno.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonUno.setText("1");
        botonUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUnoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonUno, gridBagConstraints);

        botonMultiplicar.setBackground(new java.awt.Color(204, 255, 255));
        botonMultiplicar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonMultiplicar.setText("X");
        botonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonMultiplicar, gridBagConstraints);

        botonRestar.setBackground(new java.awt.Color(204, 255, 255));
        botonRestar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonRestar.setText("-");
        botonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonRestar, gridBagConstraints);

        botonSumar.setBackground(new java.awt.Color(204, 255, 255));
        botonSumar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonSumar.setText("+");
        botonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonSumar, gridBagConstraints);

        botonCero.setBackground(new java.awt.Color(204, 204, 255));
        botonCero.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonCero.setText("0");
        botonCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonCero, gridBagConstraints);

        botonPunto.setBackground(new java.awt.Color(204, 255, 255));
        botonPunto.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonPunto.setText(".");
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonPunto, gridBagConstraints);

        botonIgual.setBackground(new java.awt.Color(204, 255, 255));
        botonIgual.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonIgual.setText("=");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jPanel1.add(botonIgual, gridBagConstraints);

        cambiarSigno.setBackground(new java.awt.Color(204, 255, 255));
        cambiarSigno.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cambiarSigno.setText("±");
        cambiarSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarSignoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(cambiarSigno, gridBagConstraints);

        botonCambiar.setText("Opciones");

        cambiarCientifica.setText("Cambiar a Cientifica");
        botonCambiar.add(cambiarCientifica);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        botonCambiar.add(salir);

        jMenuBar1.add(botonCambiar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void botonUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUnoActionPerformed
        if(pantalla.getText() == "0"){
            cadenaNumeros = "1";
        } else {
            cadenaNumeros += "1";
        }
        pantalla.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_botonUnoActionPerformed

    private void botonDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDosActionPerformed
        if(pantalla.getText() == "0"){
            cadenaNumeros = "2";
        } else {
            cadenaNumeros += "2";
        }
        pantalla.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_botonDosActionPerformed

    private void botonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTresActionPerformed
        if(pantalla.getText() == "0"){
            cadenaNumeros = "3";
        } else {
            cadenaNumeros += "3";
        }
        pantalla.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_botonTresActionPerformed

    private void botonCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuatroActionPerformed
        if(pantalla.getText() == "0"){
            cadenaNumeros = "4";
        } else {
            cadenaNumeros += "4";
        }
        pantalla.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_botonCuatroActionPerformed

    private void botonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCincoActionPerformed
        if(pantalla.getText() == "0"){
            cadenaNumeros = "5";
        } else {
            cadenaNumeros += "5";
        }
        pantalla.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_botonCincoActionPerformed

    private void botonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeisActionPerformed
        if(pantalla.getText() == "0"){
            cadenaNumeros = "6";
        } else {
            cadenaNumeros += "6";
        }
        pantalla.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_botonSeisActionPerformed

    private void botonSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSieteActionPerformed
        if(pantalla.getText() == "0"){
            cadenaNumeros = "7";
        } else {
            cadenaNumeros += "7";
        }
        pantalla.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_botonSieteActionPerformed

    private void botonOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOchoActionPerformed
        if(pantalla.getText() == "0"){
            cadenaNumeros = "8";
        } else {
            cadenaNumeros += "8";
        }
        pantalla.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_botonOchoActionPerformed

    private void botonNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNueveActionPerformed
        if(pantalla.getText() == "0"){
            cadenaNumeros = "9";
        } else {
            cadenaNumeros += "9";
        }
        pantalla.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_botonNueveActionPerformed

    private void botonCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCeroActionPerformed
        if(pantalla.getText() == "0"){
            cadenaNumeros = "0";
        } else {
            cadenaNumeros += "0";
        }
        pantalla.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_botonCeroActionPerformed

    private void botonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumarActionPerformed
        if(activado == true) { 
            numero1 = Double.parseDouble(cadenaNumeros);
            pantallaMostrarOperaciones.setText(cadenaNumeros + " + ");
            cadenaNumeros = "";
            operacion = "sumar";

            activado = false; 
            punto = true;
        }
    }//GEN-LAST:event_botonSumarActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        double numero2;
        if(operacion.equals("nula")){
            
            pantalla.setText(cadenaNumeros);
            
        } else if (operacion.equals("sumar")) {
            
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1 + numero2;
            pantalla.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
            
        } else if (operacion.equals("restar")){
            
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1 - numero2;
            pantalla.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
            
        } else if (operacion.equals("multiplicar")){
            
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1 * numero2;
            pantalla.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
            
        } else if(operacion.equals("dividir")){
            
            numero2 = Double.parseDouble(cadenaNumeros);
            if(numero2 == 0){
                pantalla.setText("Indefinido");
            } else {
                resultado = numero1 / numero2;
                pantalla.setText(String.format("%.2f", resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            }           
        }
        
        pantallaMostrarOperaciones.setText("");
        activado = true;
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestarActionPerformed
        if(activado == true) { 
            numero1 = Double.parseDouble(cadenaNumeros);
            pantallaMostrarOperaciones.setText(cadenaNumeros + " - ");
            cadenaNumeros = "";
            operacion = "restar";

            activado = false; 
            punto = true;
        }
    }//GEN-LAST:event_botonRestarActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        if(punto == true){
            if(cadenaNumeros == ""){
                cadenaNumeros = "0.";
            } else {
                cadenaNumeros += ".";
            }
        }
        pantalla.setText(cadenaNumeros);
        punto = false;
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void cambiarSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarSignoActionPerformed
        if(cadenaNumeros.charAt(0) != '-'){
            cadenaNumeros = "-"+cadenaNumeros;
        } else {
            cadenaNumeros = cadenaNumeros.substring(1, cadenaNumeros.length());
        }
        pantalla.setText(cadenaNumeros);
    }//GEN-LAST:event_cambiarSignoActionPerformed

    private void botonEliminarCaracterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCaracterActionPerformed
        int tamaño = cadenaNumeros.length();
        if(tamaño > 0){
            if(tamaño == 1){
                cadenaNumeros = "0";
            } else {
                cadenaNumeros = cadenaNumeros.substring(0, cadenaNumeros.length()-1);
            }
        }
        pantalla.setText(cadenaNumeros);
    }//GEN-LAST:event_botonEliminarCaracterActionPerformed

    private void botonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicarActionPerformed
        if(activado == true) { 
            numero1 = Double.parseDouble(cadenaNumeros);
            pantallaMostrarOperaciones.setText(cadenaNumeros + " * ");
            cadenaNumeros = "";
            operacion = "multiplicar";

            activado = false; 
            punto = true;
        }
    }//GEN-LAST:event_botonMultiplicarActionPerformed

    private void botonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDividirActionPerformed
        if(activado == true) { 
            numero1 = Double.parseDouble(cadenaNumeros);
            pantallaMostrarOperaciones.setText(cadenaNumeros + " / ");
            cadenaNumeros = "";
            operacion = "dividir";

            activado = false; 
            punto = true;
        }
    }//GEN-LAST:event_botonDividirActionPerformed

    private void botonRaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRaizCuadradaActionPerformed

        numero1 = Double.parseDouble(cadenaNumeros);
        pantallaMostrarOperaciones.setText("sqrt ("+cadenaNumeros+")");
        resultado = Math.sqrt(numero1);
        pantalla.setText(String.format("%.2f",resultado));
        cadenaNumeros = String.valueOf(resultado);

        punto = true;
    }//GEN-LAST:event_botonRaizCuadradaActionPerformed

    private void botonLimpiarPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarPantallaActionPerformed
        pantalla.setText("");
        pantallaMostrarOperaciones.setText("");
        pantalla.setText("0");
        cadenaNumeros = "";
        operacion = "nula";
    }//GEN-LAST:event_botonLimpiarPantallaActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(VentanaEstandar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(VentanaEstandar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(VentanaEstandar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(VentanaEstandar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEstandar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu botonCambiar;
    private javax.swing.JButton botonCero;
    private javax.swing.JButton botonCinco;
    private javax.swing.JButton botonCuatro;
    private javax.swing.JButton botonDividir;
    private javax.swing.JButton botonDos;
    private javax.swing.JButton botonEliminarCaracter;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonLimpiarPantalla;
    private javax.swing.JButton botonMultiplicar;
    private javax.swing.JButton botonNueve;
    private javax.swing.JButton botonOcho;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonRaizCuadrada;
    private javax.swing.JButton botonRestar;
    private javax.swing.JButton botonSeis;
    private javax.swing.JButton botonSiete;
    private javax.swing.JButton botonSumar;
    private javax.swing.JButton botonTres;
    private javax.swing.JButton botonUno;
    private javax.swing.JMenuItem cambiarCientifica;
    private javax.swing.JButton cambiarSigno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pantalla;
    private javax.swing.JLabel pantallaMostrarOperaciones;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}

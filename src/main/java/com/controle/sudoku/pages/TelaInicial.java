package com.controle.sudoku.pages;

import java.awt.Color;
import javax.swing.JTextField;

/**
 * 
 * @author jose.leite
 */
public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        sudoku = new int[9][9];
        textsFields = new JTextField[9][9];
        initComponents();
        carregarFase();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1x1 = new javax.swing.JTextField();
        txt2x1 = new javax.swing.JTextField();
        txt3x1 = new javax.swing.JTextField();
        txt1x3 = new javax.swing.JTextField();
        txt1x2 = new javax.swing.JTextField();
        txt2x2 = new javax.swing.JTextField();
        txt2x3 = new javax.swing.JTextField();
        txt3x2 = new javax.swing.JTextField();
        txt3x3 = new javax.swing.JTextField();
        txt1x4 = new javax.swing.JTextField();
        txt1x5 = new javax.swing.JTextField();
        txt1x6 = new javax.swing.JTextField();
        txt1x7 = new javax.swing.JTextField();
        txt1x8 = new javax.swing.JTextField();
        txt1x9 = new javax.swing.JTextField();
        txt2x4 = new javax.swing.JTextField();
        txt2x5 = new javax.swing.JTextField();
        txt2x6 = new javax.swing.JTextField();
        txt2x7 = new javax.swing.JTextField();
        txt2x8 = new javax.swing.JTextField();
        txt2x9 = new javax.swing.JTextField();
        txt3x4 = new javax.swing.JTextField();
        txt3x5 = new javax.swing.JTextField();
        txt3x6 = new javax.swing.JTextField();
        txt3x7 = new javax.swing.JTextField();
        txt3x8 = new javax.swing.JTextField();
        txt3x9 = new javax.swing.JTextField();
        txt4x1 = new javax.swing.JTextField();
        txt5x1 = new javax.swing.JTextField();
        txt6x1 = new javax.swing.JTextField();
        txt7x1 = new javax.swing.JTextField();
        txt8x1 = new javax.swing.JTextField();
        txt9x1 = new javax.swing.JTextField();
        txt4x2 = new javax.swing.JTextField();
        txt4x3 = new javax.swing.JTextField();
        txt4x4 = new javax.swing.JTextField();
        txt4x5 = new javax.swing.JTextField();
        txt4x6 = new javax.swing.JTextField();
        txt4x7 = new javax.swing.JTextField();
        txt4x8 = new javax.swing.JTextField();
        txt4x9 = new javax.swing.JTextField();
        txt5x2 = new javax.swing.JTextField();
        txt5x3 = new javax.swing.JTextField();
        txt5x4 = new javax.swing.JTextField();
        txt5x5 = new javax.swing.JTextField();
        txt5x6 = new javax.swing.JTextField();
        txt5x7 = new javax.swing.JTextField();
        txt5x8 = new javax.swing.JTextField();
        txt5x9 = new javax.swing.JTextField();
        txt6x2 = new javax.swing.JTextField();
        txt6x3 = new javax.swing.JTextField();
        txt6x4 = new javax.swing.JTextField();
        txt6x5 = new javax.swing.JTextField();
        txt6x6 = new javax.swing.JTextField();
        txt6x7 = new javax.swing.JTextField();
        txt6x8 = new javax.swing.JTextField();
        txt6x9 = new javax.swing.JTextField();
        txt7x2 = new javax.swing.JTextField();
        txt7x3 = new javax.swing.JTextField();
        txt7x4 = new javax.swing.JTextField();
        txt7x5 = new javax.swing.JTextField();
        txt7x6 = new javax.swing.JTextField();
        txt7x7 = new javax.swing.JTextField();
        txt7x8 = new javax.swing.JTextField();
        txt7x9 = new javax.swing.JTextField();
        txt8x2 = new javax.swing.JTextField();
        txt8x3 = new javax.swing.JTextField();
        txt8x4 = new javax.swing.JTextField();
        txt8x5 = new javax.swing.JTextField();
        txt8x6 = new javax.swing.JTextField();
        txt8x7 = new javax.swing.JTextField();
        txt9x2 = new javax.swing.JTextField();
        txt9x3 = new javax.swing.JTextField();
        txt9x4 = new javax.swing.JTextField();
        txt9x5 = new javax.swing.JTextField();
        txt8x8 = new javax.swing.JTextField();
        txt8x9 = new javax.swing.JTextField();
        txt9x6 = new javax.swing.JTextField();
        txt9x7 = new javax.swing.JTextField();
        txt9x8 = new javax.swing.JTextField();
        txt9x9 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt1x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1x1KeyReleased(evt);
            }
        });

        txt2x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2x1KeyReleased(evt);
            }
        });

        txt3x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt3x1KeyReleased(evt);
            }
        });

        txt1x3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1x3KeyReleased(evt);
            }
        });

        txt1x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1x2KeyReleased(evt);
            }
        });

        txt2x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2x2KeyReleased(evt);
            }
        });

        txt2x3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2x3KeyReleased(evt);
            }
        });

        txt3x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt3x2KeyReleased(evt);
            }
        });

        txt3x3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt3x3KeyReleased(evt);
            }
        });

        txt1x4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1x4KeyReleased(evt);
            }
        });

        txt1x5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1x5KeyReleased(evt);
            }
        });

        txt1x6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1x6KeyReleased(evt);
            }
        });

        txt1x7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1x7KeyReleased(evt);
            }
        });

        txt1x8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1x8KeyReleased(evt);
            }
        });

        txt1x9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1x9KeyReleased(evt);
            }
        });

        txt2x4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2x4KeyReleased(evt);
            }
        });

        txt2x5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2x5KeyReleased(evt);
            }
        });

        txt2x6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2x6KeyReleased(evt);
            }
        });

        txt2x7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2x7KeyReleased(evt);
            }
        });

        txt2x8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2x8KeyReleased(evt);
            }
        });

        txt2x9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2x9KeyReleased(evt);
            }
        });

        txt3x4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt3x4KeyReleased(evt);
            }
        });

        txt3x5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt3x5KeyReleased(evt);
            }
        });

        txt3x6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt3x6KeyReleased(evt);
            }
        });

        txt3x7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt3x7KeyReleased(evt);
            }
        });

        txt3x8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt3x8KeyReleased(evt);
            }
        });

        txt3x9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt3x9KeyReleased(evt);
            }
        });

        txt4x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt4x1KeyReleased(evt);
            }
        });

        txt5x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt5x1KeyReleased(evt);
            }
        });

        txt6x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt6x1KeyReleased(evt);
            }
        });

        txt7x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt7x1KeyReleased(evt);
            }
        });

        txt4x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt4x2KeyReleased(evt);
            }
        });

        txt4x3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt4x3KeyReleased(evt);
            }
        });

        txt4x4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt4x4KeyReleased(evt);
            }
        });

        txt4x5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt4x5KeyReleased(evt);
            }
        });

        txt4x6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt4x6KeyReleased(evt);
            }
        });

        txt4x7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt4x7KeyReleased(evt);
            }
        });

        txt4x8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt4x8KeyReleased(evt);
            }
        });

        txt4x9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt4x9KeyReleased(evt);
            }
        });

        txt5x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt5x2KeyReleased(evt);
            }
        });

        txt5x3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt5x3KeyReleased(evt);
            }
        });

        txt5x4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt5x4KeyReleased(evt);
            }
        });

        txt5x5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt5x5KeyReleased(evt);
            }
        });

        txt5x6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt5x6KeyReleased(evt);
            }
        });

        txt5x7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt5x7KeyReleased(evt);
            }
        });

        txt5x8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt5x8KeyReleased(evt);
            }
        });

        txt5x9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt5x9KeyReleased(evt);
            }
        });

        txt6x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt6x2KeyReleased(evt);
            }
        });

        txt6x3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt6x3KeyReleased(evt);
            }
        });

        txt6x4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt6x4KeyReleased(evt);
            }
        });

        txt6x5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt6x5KeyReleased(evt);
            }
        });

        txt6x6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt6x6KeyReleased(evt);
            }
        });

        txt6x7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt6x7KeyReleased(evt);
            }
        });

        txt6x8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt6x8KeyReleased(evt);
            }
        });

        txt6x9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt6x9KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt1x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt3x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txt4x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt5x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt6x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txt7x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt8x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt9x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt3x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt4x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt5x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt6x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt7x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt8x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt9x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt1x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt3x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt4x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt5x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt6x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txt7x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt8x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt9x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt1x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt3x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt4x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt5x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt6x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txt7x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt8x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt9x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt3x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txt4x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt5x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt6x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txt7x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt8x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt9x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt1x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt2x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt3x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txt4x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt5x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt6x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt1x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt2x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt3x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt4x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt5x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt6x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt7x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt8x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt9x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt7x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt8x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt9x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt1x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt3x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txt4x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt5x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt6x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt7x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt8x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt9x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt1x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt3x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt4x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt5x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt6x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txt7x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt8x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt9x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9x5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1x7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9x7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1x1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1x1KeyReleased
        setVetor(txt1x1,1,1);
    }//GEN-LAST:event_txt1x1KeyReleased

    private void txt1x2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1x2KeyReleased
        setVetor(txt1x2,1,2);
    }//GEN-LAST:event_txt1x2KeyReleased

    private void txt1x3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1x3KeyReleased
        setVetor(txt1x3,1,3);
    }//GEN-LAST:event_txt1x3KeyReleased

    private void txt1x4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1x4KeyReleased
        setVetor(txt1x4,1,4);
    }//GEN-LAST:event_txt1x4KeyReleased

    private void txt1x5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1x5KeyReleased
        setVetor(txt1x5,1,5);
    }//GEN-LAST:event_txt1x5KeyReleased

    private void txt1x6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1x6KeyReleased
        setVetor(txt1x6,1,6);
    }//GEN-LAST:event_txt1x6KeyReleased

    private void txt1x7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1x7KeyReleased
       setVetor(txt1x7,1,7);
    }//GEN-LAST:event_txt1x7KeyReleased

    private void txt1x8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1x8KeyReleased
       setVetor(txt1x8,1,8);
    }//GEN-LAST:event_txt1x8KeyReleased

    private void txt1x9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1x9KeyReleased
       setVetor(txt1x9,1,9);
    }//GEN-LAST:event_txt1x9KeyReleased

    private void txt2x1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2x1KeyReleased
        setVetor(txt2x1,2,1);
    }//GEN-LAST:event_txt2x1KeyReleased

    private void txt2x2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2x2KeyReleased
        setVetor(txt2x2,2,2);
    }//GEN-LAST:event_txt2x2KeyReleased

    private void txt2x3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2x3KeyReleased
       setVetor(txt2x3,2,3);
    }//GEN-LAST:event_txt2x3KeyReleased

    private void txt2x4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2x4KeyReleased
        setVetor(txt2x4,2,4);
    }//GEN-LAST:event_txt2x4KeyReleased

    private void txt2x5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2x5KeyReleased
        setVetor(txt2x5,2,5);
    }//GEN-LAST:event_txt2x5KeyReleased

    private void txt2x6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2x6KeyReleased
        setVetor(txt2x6,2,6);
    }//GEN-LAST:event_txt2x6KeyReleased

    private void txt2x7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2x7KeyReleased
        setVetor(txt2x7,2,7);
    }//GEN-LAST:event_txt2x7KeyReleased

    private void txt2x8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2x8KeyReleased
        setVetor(txt2x8,2,8);
    }//GEN-LAST:event_txt2x8KeyReleased

    private void txt2x9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2x9KeyReleased
        setVetor(txt2x9,2,9);
    }//GEN-LAST:event_txt2x9KeyReleased

    private void txt3x1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3x1KeyReleased
        setVetor(txt3x1,3,1);
    }//GEN-LAST:event_txt3x1KeyReleased

    private void txt3x2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3x2KeyReleased
        setVetor(txt3x2,3,2);
    }//GEN-LAST:event_txt3x2KeyReleased

    private void txt3x3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3x3KeyReleased
        setVetor(txt3x3,3,3);
    }//GEN-LAST:event_txt3x3KeyReleased

    private void txt3x4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3x4KeyReleased
        setVetor(txt3x4,3,4);
    }//GEN-LAST:event_txt3x4KeyReleased

    private void txt3x5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3x5KeyReleased
        setVetor(txt3x5,3,5);
    }//GEN-LAST:event_txt3x5KeyReleased

    private void txt3x6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3x6KeyReleased
        setVetor(txt3x6,3,6);
    }//GEN-LAST:event_txt3x6KeyReleased

    private void txt3x7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3x7KeyReleased
        setVetor(txt3x7,3,7);
    }//GEN-LAST:event_txt3x7KeyReleased

    private void txt3x8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3x8KeyReleased
        setVetor(txt3x8,3,8);
    }//GEN-LAST:event_txt3x8KeyReleased

    private void txt3x9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3x9KeyReleased
        setVetor(txt3x9,3,9);
    }//GEN-LAST:event_txt3x9KeyReleased

    private void txt4x1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4x1KeyReleased
        setVetor(txt4x1,4,1);
    }//GEN-LAST:event_txt4x1KeyReleased

    private void txt4x2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4x2KeyReleased
        setVetor(txt4x2,4,2);
    }//GEN-LAST:event_txt4x2KeyReleased

    private void txt4x3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4x3KeyReleased
        setVetor(txt4x3,4,3);
    }//GEN-LAST:event_txt4x3KeyReleased

    private void txt4x4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4x4KeyReleased
        setVetor(txt4x4,4,4);
    }//GEN-LAST:event_txt4x4KeyReleased

    private void txt4x5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4x5KeyReleased
        setVetor(txt4x5,4,5);
    }//GEN-LAST:event_txt4x5KeyReleased

    private void txt4x6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4x6KeyReleased
        setVetor(txt4x6,4,6);
    }//GEN-LAST:event_txt4x6KeyReleased

    private void txt4x7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4x7KeyReleased
        setVetor(txt4x7,4,7);
    }//GEN-LAST:event_txt4x7KeyReleased

    private void txt4x8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4x8KeyReleased
        setVetor(txt4x8,4,8);
    }//GEN-LAST:event_txt4x8KeyReleased

    private void txt4x9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4x9KeyReleased
        setVetor(txt4x9,4,9);
    }//GEN-LAST:event_txt4x9KeyReleased

    private void txt5x1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5x1KeyReleased
        setVetor(txt5x1,5,1);
    }//GEN-LAST:event_txt5x1KeyReleased

    private void txt5x2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5x2KeyReleased
        setVetor(txt5x2,5,2);
    }//GEN-LAST:event_txt5x2KeyReleased

    private void txt5x3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5x3KeyReleased
        setVetor(txt5x3,5,3);
    }//GEN-LAST:event_txt5x3KeyReleased

    private void txt5x4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5x4KeyReleased
        setVetor(txt5x4,5,4);
    }//GEN-LAST:event_txt5x4KeyReleased

    private void txt5x5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5x5KeyReleased
        setVetor(txt5x5,5,5);
    }//GEN-LAST:event_txt5x5KeyReleased

    private void txt5x6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5x6KeyReleased
        setVetor(txt5x6,5,6);
    }//GEN-LAST:event_txt5x6KeyReleased

    private void txt5x7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5x7KeyReleased
        setVetor(txt5x7,5,7);
    }//GEN-LAST:event_txt5x7KeyReleased

    private void txt5x8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5x8KeyReleased
        setVetor(txt5x8,5,8);
    }//GEN-LAST:event_txt5x8KeyReleased

    private void txt5x9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5x9KeyReleased
        setVetor(txt5x9,5,9);
    }//GEN-LAST:event_txt5x9KeyReleased

    private void txt6x1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6x1KeyReleased
        setVetor(txt6x1,3,1);
    }//GEN-LAST:event_txt6x1KeyReleased

    private void txt6x2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6x2KeyReleased
        setVetor(txt3x2,6,2);
    }//GEN-LAST:event_txt6x2KeyReleased

    private void txt6x3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6x3KeyReleased
        setVetor(txt6x3,6,3);
    }//GEN-LAST:event_txt6x3KeyReleased

    private void txt6x4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6x4KeyReleased
        setVetor(txt6x4,6,4);
    }//GEN-LAST:event_txt6x4KeyReleased

    private void txt6x5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6x5KeyReleased
        setVetor(txt6x5,6,5);
    }//GEN-LAST:event_txt6x5KeyReleased

    private void txt6x6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6x6KeyReleased
        setVetor(txt6x6,6,6);
    }//GEN-LAST:event_txt6x6KeyReleased

    private void txt6x7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6x7KeyReleased
        setVetor(txt6x7,6,7);
    }//GEN-LAST:event_txt6x7KeyReleased

    private void txt6x8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6x8KeyReleased
        setVetor(txt6x8,6,8);
    }//GEN-LAST:event_txt6x8KeyReleased

    private void txt6x9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6x9KeyReleased
        setVetor(txt6x9,6,9);
    }//GEN-LAST:event_txt6x9KeyReleased

    private void txt7x1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7x1KeyReleased
        setVetor(txt7x1,7,1);
    }//GEN-LAST:event_txt7x1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField txt1x1;
    private javax.swing.JTextField txt1x2;
    private javax.swing.JTextField txt1x3;
    private javax.swing.JTextField txt1x4;
    private javax.swing.JTextField txt1x5;
    private javax.swing.JTextField txt1x6;
    private javax.swing.JTextField txt1x7;
    private javax.swing.JTextField txt1x8;
    private javax.swing.JTextField txt1x9;
    private javax.swing.JTextField txt2x1;
    private javax.swing.JTextField txt2x2;
    private javax.swing.JTextField txt2x3;
    private javax.swing.JTextField txt2x4;
    private javax.swing.JTextField txt2x5;
    private javax.swing.JTextField txt2x6;
    private javax.swing.JTextField txt2x7;
    private javax.swing.JTextField txt2x8;
    private javax.swing.JTextField txt2x9;
    private javax.swing.JTextField txt3x1;
    private javax.swing.JTextField txt3x2;
    private javax.swing.JTextField txt3x3;
    private javax.swing.JTextField txt3x4;
    private javax.swing.JTextField txt3x5;
    private javax.swing.JTextField txt3x6;
    private javax.swing.JTextField txt3x7;
    private javax.swing.JTextField txt3x8;
    private javax.swing.JTextField txt3x9;
    private javax.swing.JTextField txt4x1;
    private javax.swing.JTextField txt4x2;
    private javax.swing.JTextField txt4x3;
    private javax.swing.JTextField txt4x4;
    private javax.swing.JTextField txt4x5;
    private javax.swing.JTextField txt4x6;
    private javax.swing.JTextField txt4x7;
    private javax.swing.JTextField txt4x8;
    private javax.swing.JTextField txt4x9;
    private javax.swing.JTextField txt5x1;
    private javax.swing.JTextField txt5x2;
    private javax.swing.JTextField txt5x3;
    private javax.swing.JTextField txt5x4;
    private javax.swing.JTextField txt5x5;
    private javax.swing.JTextField txt5x6;
    private javax.swing.JTextField txt5x7;
    private javax.swing.JTextField txt5x8;
    private javax.swing.JTextField txt5x9;
    private javax.swing.JTextField txt6x1;
    private javax.swing.JTextField txt6x2;
    private javax.swing.JTextField txt6x3;
    private javax.swing.JTextField txt6x4;
    private javax.swing.JTextField txt6x5;
    private javax.swing.JTextField txt6x6;
    private javax.swing.JTextField txt6x7;
    private javax.swing.JTextField txt6x8;
    private javax.swing.JTextField txt6x9;
    private javax.swing.JTextField txt7x1;
    private javax.swing.JTextField txt7x2;
    private javax.swing.JTextField txt7x3;
    private javax.swing.JTextField txt7x4;
    private javax.swing.JTextField txt7x5;
    private javax.swing.JTextField txt7x6;
    private javax.swing.JTextField txt7x7;
    private javax.swing.JTextField txt7x8;
    private javax.swing.JTextField txt7x9;
    private javax.swing.JTextField txt8x1;
    private javax.swing.JTextField txt8x2;
    private javax.swing.JTextField txt8x3;
    private javax.swing.JTextField txt8x4;
    private javax.swing.JTextField txt8x5;
    private javax.swing.JTextField txt8x6;
    private javax.swing.JTextField txt8x7;
    private javax.swing.JTextField txt8x8;
    private javax.swing.JTextField txt8x9;
    private javax.swing.JTextField txt9x1;
    private javax.swing.JTextField txt9x2;
    private javax.swing.JTextField txt9x3;
    private javax.swing.JTextField txt9x4;
    private javax.swing.JTextField txt9x5;
    private javax.swing.JTextField txt9x6;
    private javax.swing.JTextField txt9x7;
    private javax.swing.JTextField txt9x8;
    private javax.swing.JTextField txt9x9;
    // End of variables declaration//GEN-END:variables
    private int[][] sudoku;
    private JTextField[][] textsFields;
    
    private void carregarFase() {
        
    }

    private void setVetor(JTextField field, int coluna, int linha){
     if(!field.getText().equals("")){
        sudoku[coluna-1][linha-1]= Integer.parseInt(field.getText());
        textsFields[coluna-1][linha-1] = field;
        boolean numeroExiste = validaSudoku(Integer.parseInt(field.getText()),coluna-1,linha-1);
         System.out.println(numeroExiste?"erro":"certo");
       }
    }

    private boolean validaSudoku(int numero, int coluna, int linha) {
        for(int i =0;i<9;i++){
            if(sudoku[coluna][i]==numero && i != linha){
                textsFields[coluna][linha].setForeground(Color.red);
                return true;
            }
            if(sudoku[i][linha]==numero && i != coluna){
                textsFields[coluna][linha].setForeground(Color.red);
                return true;
            }
        }
        textsFields[coluna][linha].setForeground(Color.black);
        return false;
    }
}

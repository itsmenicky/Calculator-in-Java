package com.br.screen;

public class screenCalculator extends javax.swing.JFrame {
    public screenCalculator() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_c = new javax.swing.JButton();
        btn_zero = new javax.swing.JButton();
        btn_four = new javax.swing.JButton();
        btn_seven = new javax.swing.JButton();
        btn_one = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_porc = new javax.swing.JButton();
        btn_nine = new javax.swing.JButton();
        btn_sub = new javax.swing.JButton();
        btn_five = new javax.swing.JButton();
        btn_multi = new javax.swing.JButton();
        btn_six = new javax.swing.JButton();
        btn_eight = new javax.swing.JButton();
        btn_two = new javax.swing.JButton();
        btn_point = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_three = new javax.swing.JButton();
        btn_equal = new javax.swing.JButton();
        txtfield_panel = new javax.swing.JTextField();
        txtfield_panelfirst = new javax.swing.JTextField();
        txtfield_panelop = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        btn_c.setBackground(new java.awt.Color(255, 51, 51));
        btn_c.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_c.setForeground(new java.awt.Color(255, 255, 255));
        btn_c.setText("C");
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });

        btn_zero.setBackground(new java.awt.Color(102, 102, 102));
        btn_zero.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_zero.setForeground(new java.awt.Color(255, 255, 255));
        btn_zero.setText("0");
        btn_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_zeroActionPerformed(evt);
            }
        });

        btn_four.setBackground(new java.awt.Color(102, 102, 102));
        btn_four.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_four.setForeground(new java.awt.Color(255, 255, 255));
        btn_four.setText("4");
        btn_four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fourActionPerformed(evt);
            }
        });

        btn_seven.setBackground(new java.awt.Color(102, 102, 102));
        btn_seven.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_seven.setForeground(new java.awt.Color(255, 255, 255));
        btn_seven.setText("7");
        btn_seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sevenActionPerformed(evt);
            }
        });

        btn_one.setBackground(new java.awt.Color(102, 102, 102));
        btn_one.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_one.setForeground(new java.awt.Color(255, 255, 255));
        btn_one.setText("1");
        btn_one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oneActionPerformed(evt);
            }
        });

        btn_div.setBackground(new java.awt.Color(255, 51, 51));
        btn_div.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_div.setForeground(new java.awt.Color(255, 255, 255));
        btn_div.setText("/");
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });

        btn_porc.setBackground(new java.awt.Color(255, 51, 51));
        btn_porc.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_porc.setForeground(new java.awt.Color(255, 255, 255));
        btn_porc.setText("%");
        btn_porc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcActionPerformed(evt);
            }
        });

        btn_nine.setBackground(new java.awt.Color(102, 102, 102));
        btn_nine.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_nine.setForeground(new java.awt.Color(255, 255, 255));
        btn_nine.setText("9");
        btn_nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nineActionPerformed(evt);
            }
        });

        btn_sub.setBackground(new java.awt.Color(255, 51, 51));
        btn_sub.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_sub.setForeground(new java.awt.Color(255, 255, 255));
        btn_sub.setText("-");
        btn_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subActionPerformed(evt);
            }
        });

        btn_five.setBackground(new java.awt.Color(102, 102, 102));
        btn_five.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_five.setForeground(new java.awt.Color(255, 255, 255));
        btn_five.setText("5");
        btn_five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fiveActionPerformed(evt);
            }
        });

        btn_multi.setBackground(new java.awt.Color(255, 51, 51));
        btn_multi.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_multi.setForeground(new java.awt.Color(255, 255, 255));
        btn_multi.setText("X");
        btn_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiActionPerformed(evt);
            }
        });

        btn_six.setBackground(new java.awt.Color(102, 102, 102));
        btn_six.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_six.setForeground(new java.awt.Color(255, 255, 255));
        btn_six.setText("6");
        btn_six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sixActionPerformed(evt);
            }
        });

        btn_eight.setBackground(new java.awt.Color(102, 102, 102));
        btn_eight.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_eight.setForeground(new java.awt.Color(255, 255, 255));
        btn_eight.setText("8");
        btn_eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eightActionPerformed(evt);
            }
        });

        btn_two.setBackground(new java.awt.Color(102, 102, 102));
        btn_two.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_two.setForeground(new java.awt.Color(255, 255, 255));
        btn_two.setText("2");
        btn_two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_twoActionPerformed(evt);
            }
        });

        btn_point.setBackground(new java.awt.Color(102, 102, 102));
        btn_point.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_point.setForeground(new java.awt.Color(255, 255, 255));
        btn_point.setText(".");
        btn_point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pointActionPerformed(evt);
            }
        });

        btn_del.setBackground(new java.awt.Color(0, 0, 0));
        btn_del.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_del.setForeground(new java.awt.Color(255, 255, 255));
        btn_del.setText("DEL");
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(255, 51, 51));
        btn_add.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("+");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_three.setBackground(new java.awt.Color(102, 102, 102));
        btn_three.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_three.setForeground(new java.awt.Color(255, 255, 255));
        btn_three.setText("3");
        btn_three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_threeActionPerformed(evt);
            }
        });

        btn_equal.setBackground(new java.awt.Color(255, 51, 51));
        btn_equal.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btn_equal.setForeground(new java.awt.Color(255, 255, 255));
        btn_equal.setText("=");
        btn_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalActionPerformed(evt);
            }
        });

        txtfield_panel.setBackground(new java.awt.Color(214, 217, 223));
        txtfield_panel.setFont(new java.awt.Font("Malgun Gothic", 0, 36)); // NOI18N
        txtfield_panel.setForeground(new java.awt.Color(0, 0, 0));
        txtfield_panel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtfield_panel.setBorder(null);
        txtfield_panel.setCaretColor(new java.awt.Color(255, 255, 255));

        txtfield_panelfirst.setBackground(new java.awt.Color(214, 217, 223));
        txtfield_panelfirst.setFont(new java.awt.Font("Malgun Gothic", 0, 8)); // NOI18N
        txtfield_panelfirst.setForeground(new java.awt.Color(214, 217, 223));
        txtfield_panelfirst.setBorder(null);
        txtfield_panelfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfield_panelfirstActionPerformed(evt);
            }
        });

        txtfield_panelop.setBackground(new java.awt.Color(214, 217, 223));
        txtfield_panelop.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        txtfield_panelop.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfield_panel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_four, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_five, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_six, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_point, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_del, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_one, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_two, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_three, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_equal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btn_seven, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_eight, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_nine, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btn_c, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_porc, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_div, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_sub, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                    .addComponent(btn_multi, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtfield_panelop, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtfield_panelfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(txtfield_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfield_panelop, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfield_panelfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_c, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_porc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_div, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_multi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_seven, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nine, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eight, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_four, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_five, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_six, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_one, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_two, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_three, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_point, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_del, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_porcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcActionPerformed
       txtfield_panelop.setText("%");
        String valor1 = txtfield_panel.getText();
        txtfield_panelfirst.setText(valor1);
        txtfield_panel.setText("");
    }//GEN-LAST:event_btn_porcActionPerformed

    private void btn_eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eightActionPerformed

        if(txtfield_panel != null){
            String content = txtfield_panel.getText();
            txtfield_panel.setText(content + "8");
        }else{
            txtfield_panel.setText("8");
        }
    }//GEN-LAST:event_btn_eightActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        txtfield_panelop.setText("+");
        String valor1 = txtfield_panel.getText();
        txtfield_panelfirst.setText(valor1);
        txtfield_panel.setText("");
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subActionPerformed
        txtfield_panelop.setText("-");
        String valor1 = txtfield_panel.getText();
        txtfield_panelfirst.setText(valor1);
        txtfield_panel.setText("");
    }//GEN-LAST:event_btn_subActionPerformed

    private void btn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiActionPerformed
       txtfield_panelop.setText("X");
        String valor1 = txtfield_panel.getText();
        txtfield_panelfirst.setText(valor1);
        txtfield_panel.setText("");
    }//GEN-LAST:event_btn_multiActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
       txtfield_panelop.setText("/");
        String valor1 = txtfield_panel.getText();
        txtfield_panelfirst.setText(valor1);
        txtfield_panel.setText("");
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
       txtfield_panel.setText("");
       txtfield_panelop.setText("");
       txtfield_panelfirst.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nineActionPerformed
      if(txtfield_panel != null){
            String content = txtfield_panel.getText();
            txtfield_panel.setText(content + "9");
        }else{
            txtfield_panel.setText("9");
        }
    }//GEN-LAST:event_btn_nineActionPerformed

    private void btn_sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sevenActionPerformed
        if(txtfield_panel != null){
            String content = txtfield_panel.getText();
            txtfield_panel.setText(content + "7");
        }else{
            txtfield_panel.setText("7");
        }
    }//GEN-LAST:event_btn_sevenActionPerformed

    private void btn_fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fourActionPerformed
       if(txtfield_panel != null){
            String content = txtfield_panel.getText();
            txtfield_panel.setText(content + "4");
        }else{
            txtfield_panel.setText("4");
        }
    }//GEN-LAST:event_btn_fourActionPerformed

    private void btn_fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fiveActionPerformed
        if(txtfield_panel != null){
            String content = txtfield_panel.getText();
            txtfield_panel.setText(content + "5");
        }else{
            txtfield_panel.setText("5");
        }
    }//GEN-LAST:event_btn_fiveActionPerformed

    private void btn_sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sixActionPerformed
      if(txtfield_panel != null){
            String content = txtfield_panel.getText();
            txtfield_panel.setText(content + "6");
        }else{
            txtfield_panel.setText("6");
        }
    }//GEN-LAST:event_btn_sixActionPerformed

    private void btn_oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oneActionPerformed
       if(txtfield_panel != null){
            String content = txtfield_panel.getText();
            txtfield_panel.setText(content + "1");
        }else{
            txtfield_panel.setText("1");
        }
    }//GEN-LAST:event_btn_oneActionPerformed

    private void btn_twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_twoActionPerformed
     if(txtfield_panel != null){
            String content = txtfield_panel.getText();
            txtfield_panel.setText(content + "2");
        }else{
            txtfield_panel.setText("2");
        }
    }//GEN-LAST:event_btn_twoActionPerformed

    private void btn_threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_threeActionPerformed
        if(txtfield_panel != null){
            String content = txtfield_panel.getText();
            txtfield_panel.setText(content + "3");
        }else{
            txtfield_panel.setText("3");
        }
    }//GEN-LAST:event_btn_threeActionPerformed

    private void btn_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_zeroActionPerformed
       if(txtfield_panel != null){
            String content = txtfield_panel.getText();
            txtfield_panel.setText(content + "0");
        }else{
            txtfield_panel.setText("0");
        }
    }//GEN-LAST:event_btn_zeroActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
       String digitos = txtfield_panel.getText();
       String Apagarultimo = digitos.substring(0, digitos.length() -1);
       txtfield_panel.setText(Apagarultimo);
    }//GEN-LAST:event_btn_delActionPerformed

    private void btn_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equalActionPerformed
        String operacao = txtfield_panelop.getText();
        String valor1 = txtfield_panelfirst.getText();
        String valor2 = txtfield_panel.getText();
        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        
        switch(operacao){
            case "+":
                double soma = num1 + num2;
                String resultsum = Double.toString(soma);
                txtfield_panelop.setText("");
                txtfield_panel.setText(resultsum);
                break;
            case "-":
                double sub = num1 - num2;
                String resultsub = Double.toString(sub);
                txtfield_panelop.setText("");
                txtfield_panel.setText(resultsub);
                break;
            case "X":
                double mult = num1 * num2;
                String resultmult = Double.toString(mult);
                txtfield_panelop.setText("");
                txtfield_panel.setText(resultmult);
                break;
            case "/":
                double div = num1 / num2;
                String resultdiv = Double.toString(div);
                txtfield_panelop.setText("");
                txtfield_panel.setText(resultdiv);
                break;
            case "%":
                double porc = num1 / 100;
                double porcnum = porc * num2;
                String resultporc = Double.toString(porcnum);
                txtfield_panelop.setText("");
                txtfield_panel.setText(resultporc);
                break;
        }
    }//GEN-LAST:event_btn_equalActionPerformed

    private void txtfield_panelfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfield_panelfirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfield_panelfirstActionPerformed

    private void btn_pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pointActionPerformed
      if(txtfield_panel != null){
            String content = txtfield_panel.getText();
            txtfield_panel.setText(content + ".");
        }else{
            txtfield_panel.setText(".");
        }
    }//GEN-LAST:event_btn_pointActionPerformed

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
            java.util.logging.Logger.getLogger(screenCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(screenCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(screenCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(screenCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new screenCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_eight;
    private javax.swing.JButton btn_equal;
    private javax.swing.JButton btn_five;
    private javax.swing.JButton btn_four;
    private javax.swing.JButton btn_multi;
    private javax.swing.JButton btn_nine;
    private javax.swing.JButton btn_one;
    private javax.swing.JButton btn_point;
    private javax.swing.JButton btn_porc;
    private javax.swing.JButton btn_seven;
    private javax.swing.JButton btn_six;
    private javax.swing.JButton btn_sub;
    private javax.swing.JButton btn_three;
    private javax.swing.JButton btn_two;
    private javax.swing.JButton btn_zero;
    private javax.swing.JTextField txtfield_panel;
    private javax.swing.JTextField txtfield_panelfirst;
    private javax.swing.JTextField txtfield_panelop;
    // End of variables declaration//GEN-END:variables

}
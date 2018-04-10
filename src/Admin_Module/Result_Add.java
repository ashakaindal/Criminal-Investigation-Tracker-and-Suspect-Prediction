/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin_Module;

import Admin_Module.Case_Add;
import Admin_Module.Officer_Add;
import Admin_Module.Officer_To_Case;
import Admin_Module.Result_Predict;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek S Chaudhary
 */
public class Result_Add extends javax.swing.JFrame {

    /**
     * Creates new form Result_Add
     */
    public Result_Add() {
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

        jPanel2 = new javax.swing.JPanel();
        nav_add_case = new javax.swing.JButton();
        nav_add_officer = new javax.swing.JButton();
        nav_add_case_officer = new javax.swing.JButton();
        nav_predict_result = new javax.swing.JButton();
        nav_add_result = new javax.swing.JButton();
        nav_view_suspect = new javax.swing.JButton();
        nav_view_evidence = new javax.swing.JButton();
        nav_view_case_history = new javax.swing.JButton();
        nav_logout = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        case_id = new javax.swing.JTextField();
        case_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        result_note = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav_add_case.setText("Add Case");
        nav_add_case.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_add_caseActionPerformed(evt);
            }
        });
        jPanel2.add(nav_add_case, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, -1));

        nav_add_officer.setText("Add Officer");
        nav_add_officer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_add_officerActionPerformed(evt);
            }
        });
        jPanel2.add(nav_add_officer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, -1));

        nav_add_case_officer.setText("Add Case Officer");
        nav_add_case_officer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_add_case_officerActionPerformed(evt);
            }
        });
        jPanel2.add(nav_add_case_officer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, -1));

        nav_predict_result.setText("Predict Result");
        nav_predict_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_predict_resultActionPerformed(evt);
            }
        });
        jPanel2.add(nav_predict_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 120, -1));

        nav_add_result.setText("Add Result");
        jPanel2.add(nav_add_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, -1));

        nav_view_suspect.setText("View Suspects");
        jPanel2.add(nav_view_suspect, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 120, -1));

        nav_view_evidence.setText("View Evidence");
        jPanel2.add(nav_view_evidence, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 120, -1));

        nav_view_case_history.setText("View Case History");
        jPanel2.add(nav_view_case_history, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 120, -1));

        nav_logout.setText("Logout");
        nav_logout.setToolTipText("");
        nav_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_logoutActionPerformed(evt);
            }
        });
        jPanel2.add(nav_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 120, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel5.setText("Menu");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(34, 45, 65));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Result");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Case ID:");

        case_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case_idActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Case Name:");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Suspects:");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(97, 212, 191));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Submit");
        jLabel8.setToolTipText("");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Note:");

        result_note.setColumns(20);
        result_note.setRows(5);
        jScrollPane1.setViewportView(result_note);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(88, 88, 88)
                        .addComponent(case_id, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(72, 72, 72)
                        .addComponent(case_name, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(case_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(case_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void case_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_case_idActionPerformed

    private void nav_add_caseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_add_caseActionPerformed
        Case_Add c = new Case_Add();
        c.setVisible(true);
    }//GEN-LAST:event_nav_add_caseActionPerformed

    private void nav_add_officerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_add_officerActionPerformed
        Officer_Add o = new Officer_Add();
        o.setVisible(true);
    }//GEN-LAST:event_nav_add_officerActionPerformed

    private void nav_add_case_officerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_add_case_officerActionPerformed
        Officer_To_Case c = new Officer_To_Case();
        c.setVisible(true);
    }//GEN-LAST:event_nav_add_case_officerActionPerformed

    private void nav_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nav_logoutActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","root");
            String sql="Insert into cases(case_id, case_name, guilty, note) values(?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, case_id.getText());
            pst.setString(2, case_name.getText());
            String value1 = jComboBox1.getSelectedItem().toString();
            pst.setString(3, value1);
            pst.setString(4, result_note.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Case Result Added Successfully");
            Result_Add ra = new Result_Add();
            ra.setVisible(true);
            setVisible(false);
            case_id.setText("");
            case_name.setText("");
            result_note.setText("");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void nav_predict_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_predict_resultActionPerformed
        Result_Predict rp = new Result_Predict();
        rp.setVisible(true);
    }//GEN-LAST:event_nav_predict_resultActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Result_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result_Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField case_id;
    private javax.swing.JTextField case_name;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nav_add_case;
    private javax.swing.JButton nav_add_case_officer;
    private javax.swing.JButton nav_add_officer;
    private javax.swing.JButton nav_add_result;
    private javax.swing.JButton nav_logout;
    private javax.swing.JButton nav_predict_result;
    private javax.swing.JButton nav_view_case_history;
    private javax.swing.JButton nav_view_evidence;
    private javax.swing.JButton nav_view_suspect;
    private javax.swing.JTextArea result_note;
    // End of variables declaration//GEN-END:variables
}
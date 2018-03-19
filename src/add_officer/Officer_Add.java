package add_officer;

import add_case.Case_Add;
import assign_case_officer.Officer_To_Case;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Abhishek S Chaudhary
 */
public class Officer_Add extends javax.swing.JFrame {

    /**
     * Creates new form Officer_Add
     */
    public Officer_Add() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        officer_id = new javax.swing.JTextField();
        officer_name = new javax.swing.JTextField();
        mob_no = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        email_id = new javax.swing.JTextField();
        area = new javax.swing.JTextField();
        attach_image = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        image_path = new javax.swing.JTextField();
        submit_add_officer = new javax.swing.JButton();
        nav_add_case = new javax.swing.JButton();
        nav_add_officer = new javax.swing.JButton();
        nav_add_case_officer = new javax.swing.JButton();
        nav_predict_result = new javax.swing.JButton();
        nav_add_result = new javax.swing.JButton();
        nav_view_suspect = new javax.swing.JButton();
        nav_view_evidence = new javax.swing.JButton();
        nav_view_case_history = new javax.swing.JButton();
        nav_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1123, 530));

        jPanel1.setPreferredSize(new java.awt.Dimension(1123, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Add Officer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jLabel2.setText("Officer ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jLabel3.setText("Officer Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jLabel4.setText("Mobile No.:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jLabel5.setText("Address:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jLabel6.setText("E-Mail ID:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        jLabel7.setText("Area:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        jLabel8.setText("Image");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        officer_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                officer_idActionPerformed(evt);
            }
        });
        jPanel1.add(officer_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 150, -1));
        jPanel1.add(officer_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 150, -1));
        jPanel1.add(mob_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 150, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 180, 50));
        jPanel1.add(email_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 150, -1));
        jPanel1.add(area, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 150, -1));

        attach_image.setText("Choose File");
        attach_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attach_imageActionPerformed(evt);
            }
        });
        jPanel1.add(attach_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        jButton2.setText("Upload");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, -1, -1));
        jPanel1.add(image_path, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 130, -1));

        submit_add_officer.setText("Submit");
        jPanel1.add(submit_add_officer, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        nav_add_case.setText("Add Case");
        nav_add_case.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_add_caseActionPerformed(evt);
            }
        });
        jPanel1.add(nav_add_case, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 120, -1));

        nav_add_officer.setText("Add Officer");
        nav_add_officer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_add_officerActionPerformed(evt);
            }
        });
        jPanel1.add(nav_add_officer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 120, -1));

        nav_add_case_officer.setText("Add Case Officer");
        nav_add_case_officer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_add_case_officerActionPerformed(evt);
            }
        });
        jPanel1.add(nav_add_case_officer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 120, -1));

        nav_predict_result.setText("Predict Result");
        jPanel1.add(nav_predict_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 120, -1));

        nav_add_result.setText("Add Result");
        jPanel1.add(nav_add_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 120, -1));

        nav_view_suspect.setText("View Suspects");
        jPanel1.add(nav_view_suspect, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 120, -1));

        nav_view_evidence.setText("View Evidence");
        jPanel1.add(nav_view_evidence, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 120, -1));

        nav_view_case_history.setText("View Case History");
        jPanel1.add(nav_view_case_history, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 120, -1));

        nav_logout.setText("Logout");
        nav_logout.setToolTipText("");
        nav_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(nav_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void officer_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_officer_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_officer_idActionPerformed

    private void attach_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attach_imageActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        image_path.setText(filename);
    }//GEN-LAST:event_attach_imageActionPerformed

    private void nav_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nav_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(Officer_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Officer_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Officer_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Officer_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Officer_Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField area;
    private javax.swing.JButton attach_image;
    private javax.swing.JTextField email_id;
    private javax.swing.JTextField image_path;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField mob_no;
    private javax.swing.JButton nav_add_case;
    private javax.swing.JButton nav_add_case_officer;
    private javax.swing.JButton nav_add_officer;
    private javax.swing.JButton nav_add_result;
    private javax.swing.JButton nav_logout;
    private javax.swing.JButton nav_predict_result;
    private javax.swing.JButton nav_view_case_history;
    private javax.swing.JButton nav_view_evidence;
    private javax.swing.JButton nav_view_suspect;
    private javax.swing.JTextField officer_id;
    private javax.swing.JTextField officer_name;
    private javax.swing.JButton submit_add_officer;
    // End of variables declaration//GEN-END:variables
}
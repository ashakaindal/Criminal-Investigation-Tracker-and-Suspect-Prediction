package add_officer;

import add_case.Case_Add;
import assign_case_officer.Officer_To_Case;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

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
        nav_add_case = new javax.swing.JButton();
        nav_add_officer = new javax.swing.JButton();
        nav_add_case_officer = new javax.swing.JButton();
        nav_predict_result = new javax.swing.JButton();
        nav_add_result = new javax.swing.JButton();
        nav_view_suspect = new javax.swing.JButton();
        nav_view_evidence = new javax.swing.JButton();
        nav_view_case_history = new javax.swing.JButton();
        nav_logout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        officer_id = new javax.swing.JTextField();
        officer_name = new javax.swing.JTextField();
        officer_mob = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        officer_address = new javax.swing.JTextArea();
        officer_email = new javax.swing.JTextField();
        officer_area = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(780, 550));

        jPanel1.setPreferredSize(new java.awt.Dimension(1123, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav_add_case.setText("Add Case");
        nav_add_case.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_add_caseActionPerformed(evt);
            }
        });
        jPanel1.add(nav_add_case, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, -1));

        nav_add_officer.setText("Add Officer");
        nav_add_officer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_add_officerActionPerformed(evt);
            }
        });
        jPanel1.add(nav_add_officer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, -1));

        nav_add_case_officer.setText("Add Case Officer");
        nav_add_case_officer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_add_case_officerActionPerformed(evt);
            }
        });
        jPanel1.add(nav_add_case_officer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, -1));

        nav_predict_result.setText("Predict Result");
        jPanel1.add(nav_predict_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, -1));

        nav_add_result.setText("Add Result");
        jPanel1.add(nav_add_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, -1));

        nav_view_suspect.setText("View Suspects");
        jPanel1.add(nav_view_suspect, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 120, -1));

        nav_view_evidence.setText("View Evidence");
        jPanel1.add(nav_view_evidence, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 120, -1));

        nav_view_case_history.setText("View Case History");
        jPanel1.add(nav_view_case_history, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 120, -1));

        nav_logout.setText("Logout");
        nav_logout.setToolTipText("");
        nav_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(nav_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 120, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel4.setText("Menu");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(34, 45, 65));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Officer ID:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Officer Name:");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mobile No.:");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Address:");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("E-Mail ID:");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Area:");

        officer_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                officer_idActionPerformed(evt);
            }
        });

        officer_address.setColumns(20);
        officer_address.setRows(5);
        jScrollPane1.setViewportView(officer_address);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Officer");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(officer_id)
                    .addComponent(officer_name)
                    .addComponent(officer_mob)
                    .addComponent(officer_email)
                    .addComponent(officer_area)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(162, 162, 162))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(273, 273, 273))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(228, 228, 228))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(officer_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(officer_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(officer_mob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(officer_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(officer_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel10)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel12)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel13)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel14)))
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void officer_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_officer_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_officer_idActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","root");
            String sql="Insert into officers(idofficers, officers_name, officers_mobile, officers_address, officers_email, officers_area) values(?,?,?,?,?,?)";
            PreparedStatement pst1=con1.prepareStatement(sql);
            pst1.setString(1, officer_id.getText());
            pst1.setString(2, officer_name.getText());
            pst1.setString(3, officer_mob.getText());
            pst1.setString(4, officer_address.getText());
            pst1.setString(5, officer_email.getText());
            pst1.setString(6, officer_area.getText());
            pst1.execute();
            //JOptionPane.showMessageDialog(null, "Officer Added Successfully");

            JOptionPane.showMessageDialog(null, "Officer Added Successfully");
            Officer_Add ao = new Officer_Add();
            ao.setVisible(true);
            setVisible(false);
            officer_id.setText("");
            officer_name.setText("");
            officer_mob.setText("");
            officer_address.setText("");
            officer_email.setText("");
            officer_area.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }                                                  
    }//GEN-LAST:event_jLabel8MouseClicked

    private void nav_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nav_logoutActionPerformed

    private void nav_add_case_officerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_add_case_officerActionPerformed
        Officer_To_Case c = new Officer_To_Case();
        c.setVisible(true);
    }//GEN-LAST:event_nav_add_case_officerActionPerformed

    private void nav_add_officerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_add_officerActionPerformed
        Officer_Add o = new Officer_Add();
        o.setVisible(true);
    }//GEN-LAST:event_nav_add_officerActionPerformed

    private void nav_add_caseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_add_caseActionPerformed
        Case_Add c = new Case_Add();
        c.setVisible(true);
    }//GEN-LAST:event_nav_add_caseActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JTextArea officer_address;
    private javax.swing.JTextField officer_area;
    private javax.swing.JTextField officer_email;
    private javax.swing.JTextField officer_id;
    private javax.swing.JTextField officer_mob;
    private javax.swing.JTextField officer_name;
    // End of variables declaration//GEN-END:variables
}
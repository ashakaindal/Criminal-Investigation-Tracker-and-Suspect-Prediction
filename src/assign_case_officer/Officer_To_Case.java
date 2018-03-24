package assign_case_officer;

import add_case.Case_Add;
import add_officer.Officer_Add;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import predict_result.Result_Predict;

/**
 *
 * @author Abhishek S Chaudhary
 */
public class Officer_To_Case extends javax.swing.JFrame {

    Connection con4 = null;
    Connection con5 = null;
    Connection con6 = null;
    Connection conn = null;
    Connection conn1 = null;
    Connection conn2 = null;
    PreparedStatement pst4 = null;
    PreparedStatement pst5 = null;
    PreparedStatement pst6 = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    ResultSet rs2 = null;
    ResultSet rs3 = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    public Officer_To_Case() {
        initComponents();
        combobox3();
        combobox2();
    }
    private void combobox3(){
        try{
            con5=DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","root");
            String sql2 = "select * from cases";
            pst5 = con5.prepareStatement(sql2);
            rs3 = pst5.executeQuery();
            while(rs3.next()){
            String ca_id = rs3.getString("id_cases");
            jComboBox3.addItem(ca_id);
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void combobox2(){
        try{
            con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","root");
            String sql3 = "select * from officers";
            pst4 = con4.prepareStatement(sql3);
            rs2 = pst4.executeQuery();
            while(rs2.next()){
            String off_id = rs2.getString("idofficers");
            jComboBox4.addItem(off_id);
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
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
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        case_name = new javax.swing.JTextField();
        officer_name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1123, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav_add_case.setText("Add Case");
        nav_add_case.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_add_caseActionPerformed(evt);
            }
        });
        jPanel1.add(nav_add_case, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, -1));

        nav_add_officer.setText("Add Officer");
        nav_add_officer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_add_officerActionPerformed(evt);
            }
        });
        jPanel1.add(nav_add_officer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, -1));

        nav_add_case_officer.setText("Add Case Officer");
        nav_add_case_officer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_add_case_officerActionPerformed(evt);
            }
        });
        jPanel1.add(nav_add_case_officer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 120, -1));

        nav_predict_result.setText("Predict Result");
        nav_predict_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_predict_resultActionPerformed(evt);
            }
        });
        jPanel1.add(nav_predict_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, -1));

        nav_add_result.setText("Add Result");
        jPanel1.add(nav_add_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 120, -1));

        nav_view_suspect.setText("View Suspects");
        jPanel1.add(nav_view_suspect, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 120, -1));

        nav_view_evidence.setText("View Evidence");
        jPanel1.add(nav_view_evidence, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 120, -1));

        nav_view_case_history.setText("View Case History");
        jPanel1.add(nav_view_case_history, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 120, -1));

        nav_logout.setText("Logout");
        nav_logout.setToolTipText("");
        nav_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(nav_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 120, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel6.setText("Menu");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(34, 45, 65));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Assign Officer To Case");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Case ID:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Case Name:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Officer ID:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Officer Name:");

        jPanel4.setBackground(new java.awt.Color(97, 212, 191));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Submit");
        jLabel9.setToolTipText("");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jComboBox3.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox3PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox4.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox4PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox3, 0, 125, Short.MAX_VALUE)
                            .addComponent(case_name)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(officer_name)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2))
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(case_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(officer_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2=DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","root");
            String sql="Insert into officertocase(case_id, case_name, officer_id, officer_name) values(?,?,?,?)";
            PreparedStatement pst2=conn2.prepareStatement(sql);
            String value1 = jComboBox3.getSelectedItem().toString();
            pst2.setString(1, value1);
            //pst2.setString(1, jComboBox3.getText());
            pst2.setString(2, case_name.getText());
            String value2 = jComboBox4.getSelectedItem().toString();
            pst2.setString(3, value2);
            //pst2.setString(3, jComboBox4.getText());
            pst2.setString(4, officer_name.getText());
            pst2.execute();
            //JOptionPane.showMessageDialog(null, "Officer Added Successfully");

            JOptionPane.showMessageDialog(null, "Case assigned to Respective Officer Successfully");
            Officer_To_Case otc = new Officer_To_Case();
            otc.setVisible(true);
            setVisible(false);
            //jComboBox3.setText("");
            case_name.setText("");
            //jComboBox4.setText("");
            officer_name.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void nav_predict_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_predict_resultActionPerformed
        Result_Predict rp = new Result_Predict();
        rp.setVisible(true);
    }//GEN-LAST:event_nav_predict_resultActionPerformed

    private void jComboBox3PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox3PopupMenuWillBecomeInvisible
        String tmp = (String)jComboBox3.getSelectedItem();
        String sql = "select * from cases where id_cases=?";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","root");
            pst = conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("cases_name");
                case_name.setText(add1);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jComboBox3PopupMenuWillBecomeInvisible

    private void jComboBox4PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox4PopupMenuWillBecomeInvisible
        String tmp = (String)jComboBox4.getSelectedItem();
        String sql = "select * from officers where idofficers=?";
        try{
            conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","root");
            pst1 = conn1.prepareStatement(sql);
            pst1.setString(1, tmp);
            rs1 = pst1.executeQuery();
            if(rs1.next()){
                String add = rs1.getString("officers_name");
                officer_name.setText(add);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jComboBox4PopupMenuWillBecomeInvisible

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
            java.util.logging.Logger.getLogger(Officer_To_Case.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Officer_To_Case.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Officer_To_Case.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Officer_To_Case.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Officer_To_Case().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField case_name;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton nav_add_case;
    private javax.swing.JButton nav_add_case_officer;
    private javax.swing.JButton nav_add_officer;
    private javax.swing.JButton nav_add_result;
    private javax.swing.JButton nav_logout;
    private javax.swing.JButton nav_predict_result;
    private javax.swing.JButton nav_view_case_history;
    private javax.swing.JButton nav_view_evidence;
    private javax.swing.JButton nav_view_suspect;
    private javax.swing.JTextField officer_name;
    // End of variables declaration//GEN-END:variables
}

package add_case;

import add_officer.Officer_Add;
import admin_login.Login_Admin;
import assign_case_officer.Officer_To_Case;

/**
 *
 * @author Abhishek S Chaudhary
 */
public class Case_Add extends javax.swing.JFrame {

    /**
     * Creates new form Case_Add
     */
    public Case_Add() {
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
        case_id = new javax.swing.JTextField();
        case_name = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        officer_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
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
        jLabel1.setText("Add Case");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        jLabel2.setText("Case ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jLabel3.setText("Case Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        jLabel4.setText("Officer ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        jLabel5.setText("Officer Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        jLabel6.setText("Note:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));
        jPanel1.add(case_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 170, -1));
        jPanel1.add(case_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 170, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, -1));

        officer_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                officer_nameActionPerformed(evt);
            }
        });
        jPanel1.add(officer_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 170, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 170, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, -1));

        nav_add_case.setText("Add Case");
        nav_add_case.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_add_caseActionPerformed(evt);
            }
        });
        jPanel1.add(nav_add_case, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 120, -1));

        nav_add_officer.setText("Add Officer");
        nav_add_officer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_add_officerActionPerformed(evt);
            }
        });
        jPanel1.add(nav_add_officer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 120, -1));

        nav_add_case_officer.setText("Add Case Officer");
        nav_add_case_officer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_add_case_officerActionPerformed(evt);
            }
        });
        jPanel1.add(nav_add_case_officer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 120, -1));

        nav_predict_result.setText("Predict Result");
        jPanel1.add(nav_predict_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 120, -1));

        nav_add_result.setText("Add Result");
        jPanel1.add(nav_add_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 120, -1));

        nav_view_suspect.setText("View Suspects");
        jPanel1.add(nav_view_suspect, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 120, -1));

        nav_view_evidence.setText("View Evidence");
        jPanel1.add(nav_view_evidence, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 120, -1));

        nav_view_case_history.setText("View Case History");
        jPanel1.add(nav_view_case_history, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 120, -1));

        nav_logout.setText("Logout");
        nav_logout.setToolTipText("");
        nav_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(nav_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void officer_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_officer_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_officer_nameActionPerformed

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
            java.util.logging.Logger.getLogger(Case_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Case_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Case_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Case_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Case_Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField case_id;
    private javax.swing.JTextField case_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
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

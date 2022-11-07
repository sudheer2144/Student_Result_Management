
package ResultManagementSystem;

import javax.swing.*;


public class admin_HomePage extends javax.swing.JFrame {

    public admin_HomePage() {
        initComponents();
    }

    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(615, 500));
        setMinimumSize(new java.awt.Dimension(615, 500));
        setPreferredSize(new java.awt.Dimension(615, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
        jButton1.setText("Insert Student");
        jButton1.setMaximumSize(new java.awt.Dimension(120, 60));
        jButton1.setMinimumSize(new java.awt.Dimension(120, 60));
        jButton1.setPreferredSize(new java.awt.Dimension(120, 60));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 160, 60));

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jButton2.setText("Insert Result");
        jButton2.setMaximumSize(new java.awt.Dimension(120, 60));
        jButton2.setMinimumSize(new java.awt.Dimension(120, 60));
        jButton2.setPreferredSize(new java.awt.Dimension(120, 60));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 160, 60));

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jButton3.setText("List Results");
        jButton3.setMaximumSize(new java.awt.Dimension(120, 60));
        jButton3.setMinimumSize(new java.awt.Dimension(120, 60));
        jButton3.setPreferredSize(new java.awt.Dimension(120, 60));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 160, 60));

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jButton4.setText("List Students");
        jButton4.setMaximumSize(new java.awt.Dimension(120, 60));
        jButton4.setMinimumSize(new java.awt.Dimension(120, 60));
        jButton4.setPreferredSize(new java.awt.Dimension(120, 60));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 160, 60));

        jButton5.setBackground(new java.awt.Color(204, 255, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jButton5.setText("Update Student");
        jButton5.setMaximumSize(new java.awt.Dimension(120, 60));
        jButton5.setMinimumSize(new java.awt.Dimension(120, 60));
        jButton5.setPreferredSize(new java.awt.Dimension(120, 60));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 160, 60));

        jButton6.setBackground(new java.awt.Color(255, 102, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jButton6.setText("Logout");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 130, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/schoolPic1.jpg")));
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-830, -380, -1, -1));

        pack();
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {

        int flag= JOptionPane.showConfirmDialog(null, "Are you sure want to exit ?", "SYBMIT", JOptionPane.YES_NO_OPTION);
        if(flag==0)
        {
            this.setVisible(false);
            Home_Main frame=new Home_Main();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        this.setVisible(false);
        admin_Student_Registration frame=new admin_Student_Registration();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

        this.setVisible(false);
        admin_List_AllStudents frame = new admin_List_AllStudents();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        this.setVisible(false);
        admin_Insert_Results frame = new admin_Insert_Results();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

        this.setVisible(false);
        admin_List_StudentResults frame = new admin_List_StudentResults();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {

        this.setVisible(false);
        admin_Update_Student_Result frame = new admin_Update_Student_Result();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_HomePage().setVisible(true);
            }
        });
    }


    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;

}

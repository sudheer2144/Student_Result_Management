
package ResultManagementSystem;

import ConnectionProvider.connectionProvider;
import javax.swing.*;
import java.sql.*;

public class admin_Student_Registration extends javax.swing.JFrame {

    public admin_Student_Registration() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(615, 500));
        setMinimumSize(new java.awt.Dimension(615, 500));
        setPreferredSize(new java.awt.Dimension(615, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Roll No");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Father Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Course");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 230, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 230, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 230, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "BTECH", "MTECH", "BE" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "CSE", "ECE", "IT", "ME", "CE" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "MALE", "FEMALE" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 30));
        jLabel8.setText("Student Registration Form");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 380, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Branch");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/schoolPic2.png")));
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, -40, -1, -1));

        pack();
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        String gender=jComboBox3.getSelectedItem().toString();
        String branch=jComboBox2.getSelectedItem().toString();
        String course=jComboBox1.getSelectedItem().toString();
        String def="--select--";
        if(gender.equals(def)||course.equals(def)||branch.equals(def))
        {
            JOptionPane.showMessageDialog(null, "Select proper options");
        }
        else
        {
            String name=jTextField1.getText();
            String fname=jTextField3.getText();
            String rollno=jTextField2.getText();
            try
            {
                Connection conn = connectionProvider.getCon();
                Statement st=conn.createStatement();
                st.executeUpdate("insert into students values('"+name+"','"+rollno+"','"+gender+"','"+fname+"','"+course+"','"+branch+"')");
                JOptionPane.showMessageDialog(null, "SuccessFully Inserted");
                this.setVisible(false);
                admin_Student_Registration frame=new admin_Student_Registration();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        this.setVisible(false);
        admin_HomePage studentframe=new admin_HomePage();
        studentframe.setVisible(true);
        studentframe.setLocationRelativeTo(null);
        
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

        this.setVisible(false);
        admin_Student_Registration frame=new admin_Student_Registration();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_Student_Registration().setVisible(true);
            }
        });
    }


    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;

}

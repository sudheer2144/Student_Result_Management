
package ResultManagementSystem;

import ConnectionProvider.connectionProvider;
import java.sql.*;
import javax.swing.*;

public class admin_Update_Student_Result extends javax.swing.JFrame {

    public admin_Update_Student_Result() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rollnoField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        subject_mathsField = new javax.swing.JTextField();
        subject_physicsField = new javax.swing.JTextField();
        subject_chemistryField = new javax.swing.JTextField();
        subject_cProgrammingField = new javax.swing.JTextField();
        subject_eddsField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(615, 500));
        setMinimumSize(new java.awt.Dimension(615, 500));
        setPreferredSize(new java.awt.Dimension(615, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30));
        jLabel1.setText("Update Student Result");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel2.setText("Enter Roll No");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel3.setText("Physics");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel4.setText("Chemistry");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel5.setText("C");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel6.setText("EDDS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));
        getContentPane().add(rollnoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 190, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel7.setText("Maths");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/icons8-search-30.png")));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 30, 30));
        getContentPane().add(subject_mathsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 150, -1));
        getContentPane().add(subject_physicsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 150, -1));
        getContentPane().add(subject_chemistryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 150, -1));
        getContentPane().add(subject_cProgrammingField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 150, -1));
        getContentPane().add(subject_eddsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 150, -1));

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 14));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/class.png")));
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -80, -1, -1));

        pack();
    }

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {

        String rolno=rollnoField.getText();
        int maths = Integer.parseInt(subject_mathsField.getText());
        int physics = Integer.parseInt(subject_physicsField.getText());
        int chemistry = Integer.parseInt(subject_chemistryField.getText());
        int c = Integer.parseInt(subject_cProgrammingField.getText());
        int edds = Integer.parseInt(subject_eddsField.getText());
        int result=maths+physics+chemistry+c+edds;
        try
        {
            Connection conn=connectionProvider.getCon();
            Statement st=conn.createStatement();
            st.executeUpdate("update results set maths="+maths+",physics="+physics+",chemistry="+chemistry+",c="+c+",edds="+edds+",result="+result+" where rollno='"+rolno+"'");
            JOptionPane.showMessageDialog(null, "Marks Updated");
            this.setVisible(false);
            admin_Update_Student_Result frame=new admin_Update_Student_Result();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {

        this.setVisible(false);
        admin_HomePage frame=new admin_HomePage();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {

        String rollno=rollnoField.getText();
        try
        {
            Connection conn=connectionProvider.getCon();
            Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("select * from results where rollno='"+rollno+"'");
            if(!rs.first())
            {
                JOptionPane.showMessageDialog(null, "No Student Found");
            }
            else
            {
                subject_mathsField.setText(rs.getString(2));
                subject_physicsField.setText(rs.getString(3));
                subject_chemistryField.setText(rs.getString(4));
                subject_cProgrammingField.setText(rs.getString(5));
                subject_eddsField.setText(rs.getString(6));

            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_Update_Student_Result().setVisible(true);
            }
        });
    }


    private javax.swing.JButton searchButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField rollnoField;
    private javax.swing.JTextField subject_mathsField;
    private javax.swing.JTextField subject_physicsField;
    private javax.swing.JTextField subject_chemistryField;
    private javax.swing.JTextField subject_cProgrammingField;
    private javax.swing.JTextField subject_eddsField;

}

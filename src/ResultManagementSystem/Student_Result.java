
package ResultManagementSystem;

import java.sql.*;
import javax.swing.*;

public class Student_Result extends javax.swing.JFrame {

 Student_Result() {
        initComponents();
    }
    Student_Result(ResultSet rs)//this ResultSet (rs) object contains all the details about the searched student
    {
        initComponents();
        try
        {      
            nameField.setText(rs.getString(1));
            rollnoField.setText(rs.getString(2));
            fatherField.setText(rs.getString(4));
            genderField.setText(rs.getString(3));
            courseField.setText(rs.getString(5));
            branchField.setText(rs.getString(6));
            mathsField.setText(rs.getString(8));
            physicsField.setText(rs.getString(9));
            chemistryField.setText(rs.getString(10));
            nameField0.setText(rs.getString(11));
            nameField1.setText(rs.getString(12));
            nameField2.setText(rs.getString(13));
			
			//below calculates the verdict whether student got pass or fail
            int subject1 = Integer.parseInt(rs.getString(8));
            int subject2 = Integer.parseInt(rs.getString(9));
            int subject3 = Integer.parseInt(rs.getString(10));
            int subject4 = Integer.parseInt(rs.getString(11));
            int subject5 = Integer.parseInt(rs.getString(12));
            if(subject1<40||subject2<40||subject3<40||subject4<40||subject5<40)
            {
                verdictLabel.setText("Fail");
            }
            else
            {
                verdictLabel.setText("Pass");
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        } 
    }

    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        fatherField = new javax.swing.JTextField();
        courseField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        mathsField = new javax.swing.JTextField();
        physicsField = new javax.swing.JTextField();
        chemistryField = new javax.swing.JTextField();
        nameField0 = new javax.swing.JTextField();
        nameField1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        verdictLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        rollnoField = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();
        branchField = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        nameField2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(615, 500));
        setMinimumSize(new java.awt.Dimension(615, 500));
        setPreferredSize(new java.awt.Dimension(615, 500));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Segoe UI", 3, 30));
        titleLabel.setText("Student Result");
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 49, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel3.setText("Father Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel4.setText("Course");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel5.setText("Roll No");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel7.setText("Branch");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, 30));

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 120, 30));
        getContentPane().add(fatherField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 120, 30));
        getContentPane().add(courseField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 120, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12));
        jLabel8.setText("Subjects");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 50, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 12));
        jLabel9.setText("Total Marks");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12));
        jLabel10.setText("Passin Marks");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 12));
        jLabel11.setText("Marks Obtained");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel12.setText("Maths");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel13.setText("Physics");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel14.setText("Total");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel15.setText("C");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel16.setText("EDDS");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));
        getContentPane().add(mathsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 70, -1));
        getContentPane().add(physicsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 70, -1));
        getContentPane().add(chemistryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 70, -1));

        nameField0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameField0ActionPerformed(evt);
            }
        });
        getContentPane().add(nameField0, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 70, -1));
        getContentPane().add(nameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 70, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 14));
        jLabel17.setText("100");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 14));
        jLabel18.setText("100");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 14));
        jLabel19.setText("100");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 14));
        jLabel20.setText("100");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 14))
        jLabel21.setText("100");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 3, 14));
        jLabel22.setText("40");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 3, 14));
        jLabel23.setText("40");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 3, 14));
        jLabel24.setText("40");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 3, 14));
        jLabel25.setText("40");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 3, 14));
        jLabel26.setText("40");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        verdictLabel.setBackground(new java.awt.Color(255, 255, 255));
        verdictLabel.setFont(new java.awt.Font("Segoe UI", 3, 30));
        verdictLabel.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(verdictLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 70, 40));

        logoutButton.setBackground(new java.awt.Color(0, 0, 0));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 14));
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));
        getContentPane().add(rollnoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 120, 30));
        getContentPane().add(genderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 120, 30));
        getContentPane().add(branchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 120, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel28.setText("Chemistry");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));
        getContentPane().add(nameField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 70, 30));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/class.png")));
        jLabel30.setText("jLabel30");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -10, -1, -1));

        pack();
    }


    private void formComponentShown(java.awt.event.ComponentEvent evt) {
        nameField.setEditable(false);
        rollnoField.setEditable(false);
        fatherField.setEditable(false);
        genderField.setEditable(false);
        courseField.setEditable(false);
        branchField.setEditable(false);
        mathsField.setEditable(false);
        physicsField.setEditable(false);
        chemistryField.setEditable(false);
        nameField0.setEditable(false);
        nameField1.setEditable(false);
        verdictLabel.setOpaque(true);
        
    }

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
                this.setVisible(false);
                Student_Search frame=new Student_Search();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
    }



    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Result().setVisible(true);
            }
        });
    }

    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel verdictLabel;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField nameField0;
    private javax.swing.JTextField nameField1;
    private javax.swing.JTextField nameField2;
    private javax.swing.JTextField rollnoField;
    private javax.swing.JTextField fatherField;
    private javax.swing.JTextField genderField;
    private javax.swing.JTextField courseField;
    private javax.swing.JTextField branchField;
    private javax.swing.JTextField mathsField;
    private javax.swing.JTextField physicsField;
    private javax.swing.JTextField chemistryField;
}

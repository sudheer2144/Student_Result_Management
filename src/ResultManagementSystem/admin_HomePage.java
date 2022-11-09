
package ResultManagementSystem;

import javax.swing.*;


public class admin_HomePage extends javax.swing.JFrame {

    public admin_HomePage() {
        initComponents();
    }

    private void initComponents() {

        insertStudentButton = new javax.swing.JButton();
        insertResultButton = new javax.swing.JButton();
        listResultsButton = new javax.swing.JButton();
        listStudentsButton = new javax.swing.JButton();
        updateStudentButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(615, 500));
        setMinimumSize(new java.awt.Dimension(615, 500));
        setPreferredSize(new java.awt.Dimension(615, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insertStudentButton.setBackground(new java.awt.Color(204, 255, 255));
        insertStudentButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
        insertStudentButton.setText("Insert Student");
        insertStudentButton.setMaximumSize(new java.awt.Dimension(120, 60));
        insertStudentButton.setMinimumSize(new java.awt.Dimension(120, 60));
        insertStudentButton.setPreferredSize(new java.awt.Dimension(120, 60));
        insertStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertStudentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(insertStudentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 160, 60));

        insertResultButton.setBackground(new java.awt.Color(204, 255, 255));
        insertResultButton.setFont(new java.awt.Font("Segoe UI", 0, 18));
        insertResultButton.setText("Insert Result");
        insertResultButton.setMaximumSize(new java.awt.Dimension(120, 60));
        insertResultButton.setMinimumSize(new java.awt.Dimension(120, 60));
        insertResultButton.setPreferredSize(new java.awt.Dimension(120, 60));
        insertResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertResultButtonActionPerformed(evt);
            }
        });
        getContentPane().add(insertResultButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 160, 60));

        listResultsButton.setBackground(new java.awt.Color(204, 255, 255));
        listResultsButton.setFont(new java.awt.Font("Segoe UI", 0, 18));
        listResultsButton.setText("List Results");
        listResultsButton.setMaximumSize(new java.awt.Dimension(120, 60));
        listResultsButton.setMinimumSize(new java.awt.Dimension(120, 60));
        listResultsButton.setPreferredSize(new java.awt.Dimension(120, 60));
        listResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listResultsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(listResultsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 160, 60));

        listStudentsButton.setBackground(new java.awt.Color(204, 255, 255));
        listStudentsButton.setFont(new java.awt.Font("Segoe UI", 0, 18));
        listStudentsButton.setText("List Students");
        listStudentsButton.setMaximumSize(new java.awt.Dimension(120, 60));
        listStudentsButton.setMinimumSize(new java.awt.Dimension(120, 60));
        listStudentsButton.setPreferredSize(new java.awt.Dimension(120, 60));
        listStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listStudentsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(listStudentsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 160, 60));

        updateStudentButton.setBackground(new java.awt.Color(204, 255, 255));
        updateStudentButton.setFont(new java.awt.Font("Segoe UI", 0, 18));
        updateStudentButton.setText("Update Student");
        updateStudentButton.setMaximumSize(new java.awt.Dimension(120, 60));
        updateStudentButton.setMinimumSize(new java.awt.Dimension(120, 60));
        updateStudentButton.setPreferredSize(new java.awt.Dimension(120, 60));
        updateStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateStudentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 160, 60));

        logoutButton.setBackground(new java.awt.Color(255, 102, 102));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 0, 18));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 130, 60));

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/schoolPic1.jpg")));
        imageLabel.setText("imageLabel");
        getContentPane().add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-830, -380, -1, -1));

        pack();
    }

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {

        int flag= JOptionPane.showConfirmDialog(null, "Are you sure want to exit ?", "SYBMIT", JOptionPane.YES_NO_OPTION);
        if(flag==0)
        {
            this.setVisible(false);
            Home_Main frame=new Home_Main();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
    }

    private void insertStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {

        this.setVisible(false);
        admin_Student_Registration frame=new admin_Student_Registration();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void listStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {

        this.setVisible(false);
        admin_List_AllStudents frame = new admin_List_AllStudents();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    }

    private void insertResultButtonActionPerformed(java.awt.event.ActionEvent evt) {

        this.setVisible(false);
        admin_Insert_Results frame = new admin_Insert_Results();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    }

    private void listResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {

        this.setVisible(false);
        admin_List_StudentResults frame = new admin_List_StudentResults();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    }

    private void updateStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {

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


    private javax.swing.JButton insertStudentButton;
    private javax.swing.JButton insertResultButton;
    private javax.swing.JButton listResultsButton;
    private javax.swing.JButton listStudentsButton;
    private javax.swing.JButton updateStudentButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel imageLabel;

}

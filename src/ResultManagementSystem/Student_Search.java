
package ResultManagementSystem;

import ConnectionProvider.connectionProvider;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Student_Search extends javax.swing.JFrame {

    public Student_Search() {
        initComponents();
    }

    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rollnoField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(615, 500));
        setMinimumSize(new java.awt.Dimension(615, 500));
        setPreferredSize(new java.awt.Dimension(615, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel2.setText("Enter Roll No");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); 
        jLabel1.setText("Student Result");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));
        getContentPane().add(rollnoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 190, 30));

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/icons8-search-30.png")));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 40, 30));

        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 14));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/class.png")));
        imageLabel.setText("imageLabel");
        getContentPane().add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -10, -1, -1));

        pack();
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {

        String rolno=rollnoField.getText();
        try
        {
            Connection conn=connectionProvider.getCon();
            Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("select * from students inner join results where students.rollno='"+rolno+"' AND results.rollno='"+rolno+"'");
            
            if(!rs.first())
            {
                JOptionPane.showMessageDialog(null, "No Student Found");
            }
            //if the student's rollno present in the results it will get the the details of students and result and store in ResultSet(rs) object.
            //then the ResultSet(rs) object will be given as a parameter to the constructor of 'Student_Result.java' class.
            else
            {
                this.setVisible(false);
                Student_Result frame=new Student_Result(rs);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //will go back to the 'Home_Main.java' class.
        this.setVisible(false);
        Home_Main studentframe=new Home_Main();
        studentframe.setVisible(true);
        studentframe.setLocationRelativeTo(null);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Search().setVisible(true);
            }
        });
    }

  
    private javax.swing.JButton searchButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JTextField rollnoField;

}

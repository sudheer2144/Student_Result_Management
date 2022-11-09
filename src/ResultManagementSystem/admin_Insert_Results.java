
package ResultManagementSystem;

import ConnectionProvider.connectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class admin_Insert_Results extends javax.swing.JFrame {

    public admin_Insert_Results() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rollnoField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        mathsField = new javax.swing.JTextField();
        physicsField = new javax.swing.JTextField();
        chemistryField = new javax.swing.JTextField();
        cProgrammingField = new javax.swing.JTextField();
        eddsField = new javax.swing.JTextField();
        tableScrollPanel = new javax.swing.JScrollPane();
        studentDetailsTable = new javax.swing.JTable();
        saveButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(615, 500));
        setMinimumSize(new java.awt.Dimension(615, 500));
        setPreferredSize(new java.awt.Dimension(615, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("EDDS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Chemistry");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Physics");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Enter Roll No.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 130, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("C Language");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));
        getContentPane().add(rollnoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 160, 30));

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/icons8-search-30.png")));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 30, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Maths");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));
        getContentPane().add(mathsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 130, -1));
        getContentPane().add(physicsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 130, -1));
        getContentPane().add(chemistryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 130, -1));
        getContentPane().add(cProgrammingField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 130, -1));
        getContentPane().add(eddsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 130, -1));

        studentDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Roll No", "Gender", "Father Name", "Course", "Branch"
            }
        ));
        tableScrollPanel.setViewportView(studentDetailsTable);

        getContentPane().add(tableScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 580, 70));

        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 14));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 14));
        exitButton.setForeground(new java.awt.Color(255, 0, 51));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/schoolPic2.png")));
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -20, -1, -1));

        pack();
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {

        this.setVisible(false);
        admin_HomePage studentframe=new admin_HomePage();
        studentframe.setVisible(true);
        studentframe.setLocationRelativeTo(null);
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {

        String rolno=rollnoField.getText();
        try
        {
            Connection conn=connectionProvider.getCon();
            Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("select * from students where rollno='"+rolno+"'");
            studentDetailsTable.setModel(DbUtils.resultSetToTableModel(rs));
            if(!rs.first())
            {
                JOptionPane.showMessageDialog(null, "No Student Found");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {

        String rolno=rollnoField.getText();
        int maths = Integer.parseInt(mathsField.getText());
        int physics = Integer.parseInt(physicsField.getText());
        int chemistry = Integer.parseInt(chemistryField.getText());
        int c = Integer.parseInt(cProgrammingField.getText());
        int edds = Integer.parseInt(eddsField.getText());
        int result=maths+physics+chemistry+c+edds;
        try
        {
            Connection conn=connectionProvider.getCon();
            Statement st=conn.createStatement();
            st.executeUpdate("insert into results values('"+rolno+"','"+maths+"','"+physics+"','"+chemistry+"','"+c+"','"+edds+"','"+result+"')");
            JOptionPane.showMessageDialog(rootPane, "Successfully Updated");
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Provide Valid details");
        }
        this.setVisible(false);
        admin_Insert_Results frame=new admin_Insert_Results();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_Insert_Results().setVisible(true);
            }
        });
    }

    private javax.swing.JButton searchButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane tableScrollPanel;
    private javax.swing.JTable studentDetailsTable;
    private javax.swing.JTextField rollnoField;
    private javax.swing.JTextField mathsField;
    private javax.swing.JTextField physicsField;
    private javax.swing.JTextField chemistryField;
    private javax.swing.JTextField cProgrammingField;
    private javax.swing.JTextField eddsField;

}

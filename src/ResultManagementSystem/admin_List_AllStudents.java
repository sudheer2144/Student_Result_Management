
package ResultManagementSystem;

import ConnectionProvider.connectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class admin_List_AllStudents extends javax.swing.JFrame {

    public admin_List_AllStudents() {
        initComponents();
    }

    private void initComponents() {

        tableScrollPanel = new javax.swing.JScrollPane();
        studentListTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        studentListTable.setModel(new javax.swing.table.DefaultTableModel(
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
        tableScrollPanel.setViewportView(studentListTable);

        getContentPane().add(tableScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 490, 280));

        backButton.setFont(new java.awt.Font("Segoe UI", 1, 14));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30));
        jLabel1.setText("Student List");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/schoolPic1.jpg")));
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, -50, -1, -1));

        pack();
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {

        try
        {
            Connection conn=connectionProvider.getCon();
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from students");
            studentListTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {

        this.setVisible(false);
        admin_HomePage frame = new admin_HomePage();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_List_AllStudents().setVisible(true);
            }
        });
    }

    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane tableScrollPanel;
    private javax.swing.JTable studentListTable;

}

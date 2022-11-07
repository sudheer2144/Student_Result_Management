
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 490, 280));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

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
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

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

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;

}

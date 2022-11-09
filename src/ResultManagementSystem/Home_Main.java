
package ResultManagementSystem;

public class Home_Main extends javax.swing.JFrame {

   
    public Home_Main() {
        initComponents();
    }

    private void initComponents() {

        studentButton = new javax.swing.JButton();
        adminButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();

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

        studentButton.setFont(new java.awt.Font("Segoe UI", 1, 18));
        studentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/icons8-schoolboy-at-a-desk-30.png")));
        studentButton.setText("Student");
        studentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(studentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 150, 50));

        adminButton.setFont(new java.awt.Font("Segoe UI", 1, 18));
        adminButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/icons8-admin-settings-male-30.png"))); 
        adminButton.setText("Admin");
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });
        getContentPane().add(adminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 150, 50));

        titleLabel.setBackground(new java.awt.Color(0, 0, 0));
        titleLabel.setFont(new java.awt.Font("Segoe UI", 3, 30));
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Welcome to Result Management System");
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/schoolPic1.jpg")));
        imageLabel.setText("imageLabel");
        getContentPane().add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-830, -380, -1, -1));

        pack();
    }

    private void studentButtonActionPerformed(java.awt.event.ActionEvent evt) {
         //To go to STUDENT module
                this.setVisible(false);
                Student_Search frame=new Student_Search();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
    }

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //To go to ADMIN module.
        this.setVisible(false);
        admin_Login frame=new admin_Login();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {
        titleLabel.setOpaque(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home_Main frame=new Home_Main();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    private javax.swing.JButton studentButton;
    private javax.swing.JButton adminButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel titleLabel;

}

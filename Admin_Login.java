/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// package hotel_management_system;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
// import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
/**
 *
 * @author admin
 */
public class Admin_Login extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Login
     */
    boolean passwword1=false;
    public Admin_Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Admin7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LoginPanel = new javax.swing.JPanel();
        lemail = new javax.swing.JLabel();
        lpass = new javax.swing.JLabel();
        tUsername = new javax.swing.JTextField();
        tpass = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        forgotpass = new javax.swing.JLabel();
        Namasteimg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admin7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Admin7.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/Admin7.jpg"))); // NOI18N
        getContentPane().add(Admin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 560, 60));

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));

        jLabel1.setFont(new java.awt.Font("Magneto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hotel Management System");

        jLabel3.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
                jLabel3MouseEnterd(e);
            }
            public void mouseClicked(java.awt.event.MouseEvent me) {
                jLabel3MouseClicked(me);
            }
            public void mouseExited(java.awt.event.MouseEvent me) {
                jLabel3MouseExited(me);
            }
        });

        jLabel4.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SignUp");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
                jLabel4MouseEnterd(e);
            }
            public void mouseClicked(java.awt.event.MouseEvent me) {
                jLabel4MouseClicked(me);
            }
            public void mouseExited(java.awt.event.MouseEvent me) {
                jLabel4MouseExited(me);
            }
        });

        jLabel5.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(126, 90, 200));
        jLabel5.setText("Login As Admin");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
                // jLabel5MouseEnterd(e);
            }
            public void mouseClicked(java.awt.event.MouseEvent me) {
                jLabel5MouseClicked(me);
            }
            public void mouseExited(java.awt.event.MouseEvent me) {
                // jLabel5MouseExited(me);
            }
        });

        jLabel10.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Home");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
                jLabel10MouseEnterd(e);
            }
            public void mouseClicked(java.awt.event.MouseEvent me) {
                jLabel10MouseClicked(me);
            }
            public void mouseExited(java.awt.event.MouseEvent me) {
                jLabel10MouseExited(me);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 60));

        LoginPanel.setBackground(new java.awt.Color(153, 204, 255));
        LoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lemail.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lemail.setText("Username:-");
        LoginPanel.add(lemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 23, -1, 24));

        lpass.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lpass.setText("Password:-");
        LoginPanel.add(lpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 98, -1, 24));

        tUsername.setBackground(new java.awt.Color(153, 204, 255));
        tUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        tUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent ke) {
                tUsernameKeyReleased(ke);
            }
        });
        LoginPanel.add(tUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 54, 213, -1));

        tpass.setBackground(new java.awt.Color(153, 204, 255));
        tpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        tpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent ke) {
                tpassKeyReleased(ke);
            }
        });

        LoginPanel.add(tpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 129, 213, -1));

        login.setBackground(new java.awt.Color(255, 153, 51));
        login.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                loginActionPerformed(ae);
            }
        });
        LoginPanel.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 172, 95, -1));

        forgotpass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        forgotpass.setForeground(new java.awt.Color(255, 51, 51));
        forgotpass.setText("Forgot Password?");
        forgotpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 51, 51)));
        LoginPanel.add(forgotpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 206, -1, -1));

        Namasteimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Namasteimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/Login_img.jpeg"))); // NOI18N
        LoginPanel.add(Namasteimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 240));

        getContentPane().add(LoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 560, 240));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102, 80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1080, 640));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/Hotel4.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // other here 
    protected void loginActionPerformed(ActionEvent ae) {
        if(tUsername.getText().equals("")) {
            JOptionPane.showMessageDialog(tUsername, "Empty Username", "Empty Inputs", JOptionPane.WARNING_MESSAGE);
        }
        else if(tpass.getText().equals("")) {
            JOptionPane.showMessageDialog(tpass, "Empty password", "Empty Inputs", JOptionPane.WARNING_MESSAGE);
        }
        else if(passwword1!=true) {
            JOptionPane.showMessageDialog(tpass, "Invalid Password", "Invalid Inputs", JOptionPane.WARNING_MESSAGE);
        }
        else {
            try {
                Connection con = new dbConnection().getDbconnection();
                Statement stm = con.createStatement();
                String q = "select password from admin_details where username= '"+tUsername.getText()+"' ";
                ResultSet rs= stm.executeQuery(q);
                if(rs.next()) {
                    final String pass = rs.getString("password");
                    // System.out.println(pass);
                    if(pass.equals(tpass.getText())!=false) {
                        JOptionPane.showMessageDialog(null, "Welcome Admin ", "Welcome", JOptionPane.PLAIN_MESSAGE);
                        if(ae.getSource()==login) {
                            dispose();
                            new Admin_Home().setVisible(true);
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Given Details Not Found", "Not Found", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Given Details Not Found", "Not Found", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(e);
            }
        }
    }

    protected void tpassKeyReleased(KeyEvent ke) {
        String PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(tpass.getText());
        if (!match.matches()) {
            // JOptionPane.showMessageDialog(null, "Please enter the username");
            tpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, (new java.awt.Color(255, 0, 0))));
            // pass2.setText("");
            passwword1=false;
            // confi=false;
        } else {
            passwword1=true;
            tpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 255, 0)));
        }
    }

    protected void tUsernameKeyReleased(KeyEvent ke) {
        tUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.GREEN));
    }

    // signup label
    protected void jLabel4MouseEnterd(MouseEvent e) {
        jLabel4.setForeground(new java.awt.Color(126,90,200));
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.black));
    }

    protected void jLabel4MouseClicked(MouseEvent me) {
        if(me.getSource()==jLabel4) {
            dispose();
            new Manager_SignUp().setVisible(true);
        }
    }

    protected void jLabel4MouseExited(MouseEvent me) {
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setBorder(null);
    }

    // login as admin
    protected void jLabel5MouseExited(MouseEvent me) {
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setBorder(null);
    }

    protected void jLabel5MouseClicked(MouseEvent me) {
        // Login as Admin 
        // if(me.getSource()==jLabel3) {
        //     dispose();
        //     new Manager_LoginForm().setVisible(true);
        // }
    }

    protected void jLabel5MouseEnterd(MouseEvent e) {
        jLabel5.setForeground(new java.awt.Color(126,90,200));
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.black));
    }

    // home label 
    protected void jLabel10MouseEnterd(MouseEvent e) {
        jLabel10.setForeground(new java.awt.Color(126,90,200));
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.black));
    }

    protected void jLabel10MouseExited(MouseEvent me) {
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setBorder(null);
    }

    protected void jLabel10MouseClicked(MouseEvent me) {
        if(me.getSource()==jLabel10) {
            dispose();
            new HomePage().setVisible(true);
        }
    }

    // login label
    protected void jLabel3MouseExited(MouseEvent me) {
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setBorder(null);
    }

    protected void jLabel3MouseClicked(MouseEvent me) {
        if(me.getSource()==jLabel3) {
            dispose();
            new Manager_LoginForm().setVisible(true);
        }
    }

    protected void jLabel3MouseEnterd(MouseEvent e) {
        jLabel3.setForeground(new java.awt.Color(126,90,200));
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.black));

    }

    /**
     * @param args the command line arguments
     */
    // public static void main(String args[]) {
    //     /* Set the Nimbus look and feel */
    //     //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    //     /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
    //      * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
    //      */
    //     try {
    //         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //             if ("Nimbus".equals(info.getName())) {
    //                 javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //                 break;
    //             }
    //         }
    //     } catch (ClassNotFoundException ex) {
    //         java.util.logging.Logger.getLogger(Admin_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (InstantiationException ex) {
    //         java.util.logging.Logger.getLogger(Admin_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (IllegalAccessException ex) {
    //         java.util.logging.Logger.getLogger(Admin_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //         java.util.logging.Logger.getLogger(Admin_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     }
    //     //</editor-fold>

    //     /* Create and display the form */
    //     java.awt.EventQueue.invokeLater(new Runnable() {
    //         public void run() {
    //             new Admin_Login().setVisible(true);
    //         }
    //     });
    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admin7;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JLabel Namasteimg;
    private javax.swing.JLabel forgotpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lemail;
    private javax.swing.JButton login;
    private javax.swing.JLabel lpass;
    private javax.swing.JTextField tUsername;
    private javax.swing.JTextField tpass;
    // End of variables declaration//GEN-END:variables
}

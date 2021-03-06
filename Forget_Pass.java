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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

// package login_register;

/**
 *
 * @author admin
 */
public class Forget_Pass extends javax.swing.JFrame {

    /**
     * Creates new form Forget_Pass
     */
    boolean email=false,passwword1=false,confi=false,otp=false;
    int OTPm=0;
    public Forget_Pass(String name) {
        initComponents(name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String Manager_name) {

        reset_panel = new javax.swing.JPanel();
        reset_img = new javax.swing.JLabel();
        lemail = new javax.swing.JLabel();
        temail = new javax.swing.JTextField();
        lOTP = new javax.swing.JLabel();
        tOTP = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        getOTP = new javax.swing.JButton();
        tNewPass = new javax.swing.JTextField();
        lconfirmpass = new javax.swing.JLabel();
        lnewPass = new javax.swing.JLabel();
        tConfirmPass = new javax.swing.JTextField();
        verify = new javax.swing.JButton();
        header2 = new javax.swing.JPanel();
        heading = new javax.swing.JLabel();
        header1 = new javax.swing.JPanel();
        lhome = new javax.swing.JLabel();
        lsignup = new javax.swing.JLabel();
        lcustomerLoginPass = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reset_panel.setBackground(new java.awt.Color(153, 204, 255));

        reset_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reset_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/reset pass.jpg"))); // NOI18N

        lemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lemail.setText("Email:-");

        temail.setBackground(new java.awt.Color(153, 204, 255));
        temail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        temail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                temailKeyReleased(evt);
            }
        });


        lOTP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lOTP.setText("Enter OTP:-");

        tOTP.setBackground(new java.awt.Color(153, 204, 255));
        tOTP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        tOTP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tOTPKeyReleased(evt);
            }
        });
        tOTP.setEditable(false);

        submit.setBackground(new java.awt.Color(255, 153, 0));
        submit.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt,Manager_name);
            }
        });
        submit.setEnabled(false);

        
        getOTP.setText("Get OTP");
        getOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OTPm=getOTPActionPerformed(evt);
            }
        });

        tNewPass.setBackground(new java.awt.Color(153, 204, 255));
        tNewPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        tNewPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tNewPassKeyReleased(evt);
            }
        });
        tNewPass.setEditable(false);

        lconfirmpass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lconfirmpass.setText("Confirme Password:-");

        lnewPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lnewPass.setText("New Password:-");

        tConfirmPass.setBackground(new java.awt.Color(153, 204, 255));
        tConfirmPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        tConfirmPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tConfirmPassKeyReleased(evt);
            }
        });
        tConfirmPass.setEditable(false);

        verify.setBackground(new java.awt.Color(255, 255, 255));
        verify.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        verify.setForeground(new java.awt.Color(51, 255, 51));
        verify.setText(" Verify");
        verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyActionPerformed(evt,OTPm);
            }
        });
        verify.setEnabled(false);

        javax.swing.GroupLayout reset_panelLayout = new javax.swing.GroupLayout(reset_panel);
        reset_panel.setLayout(reset_panelLayout);
        reset_panelLayout.setHorizontalGroup(
            reset_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reset_panelLayout.createSequentialGroup()
                .addComponent(reset_img, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(reset_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reset_panelLayout.createSequentialGroup()
                        .addComponent(verify)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reset_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lnewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(reset_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(reset_panelLayout.createSequentialGroup()
                                .addComponent(lOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(getOTP))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, reset_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(lconfirmpass)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        reset_panelLayout.setVerticalGroup(
            reset_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reset_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lemail)
                .addGap(0, 0, 0)
                .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reset_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lOTP)
                    .addComponent(getOTP))
                .addGap(0, 0, 0)
                .addComponent(tOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lnewPass)
                .addGap(0, 0, 0)
                .addComponent(tNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lconfirmpass)
                .addGap(0, 0, 0)
                .addComponent(tConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(reset_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(verify))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(reset_panelLayout.createSequentialGroup()
                .addComponent(reset_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(reset_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 570, 270));

        header2.setBackground(new java.awt.Color(255, 102, 51));

        heading.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setText("Reset Password");

        javax.swing.GroupLayout header2Layout = new javax.swing.GroupLayout(header2);
        header2.setLayout(header2Layout);
        header2Layout.setHorizontalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header2Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(heading)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        header2Layout.setVerticalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(header2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 570, 50));

        header1.setBackground(new java.awt.Color(255, 102, 51));

        lhome.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        lhome.setForeground(new java.awt.Color(255, 255, 255));
        lhome.setText("Home");
        lhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
                lhomeMouseEnterd(e);
            }
            public void mouseClicked(java.awt.event.MouseEvent me) {
                lhomeMouseClicked(me,Manager_name);
            }
            public void mouseExited(java.awt.event.MouseEvent me) {
                lhomeMouseExited(me);
            }
        });

        lsignup.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        lsignup.setForeground(new java.awt.Color(255, 255, 255));
        lsignup.setText("SignUp");
        lsignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
                lsignupMouseEnterd(e);
            }
            public void mouseClicked(java.awt.event.MouseEvent me) {
                lsignupMouseClicked(me,Manager_name);
            }
            public void mouseExited(java.awt.event.MouseEvent me) {
                lsignupMouseExited(me);
            }
        });

        lcustomerLoginPass.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lcustomerLoginPass.setForeground(new java.awt.Color(255, 255, 255));
        lcustomerLoginPass.setText("Customer Reset Password");

        javax.swing.GroupLayout header1Layout = new javax.swing.GroupLayout(header1);
        header1.setLayout(header1Layout);
        header1Layout.setHorizontalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lcustomerLoginPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 509, Short.MAX_VALUE)
                .addComponent(lhome, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(lsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addGroup(header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcustomerLoginPass)
                    .addComponent(lhome)
                    .addComponent(lsignup))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        getContentPane().add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 40));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/Bg Image.jpeg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // don't edit here if you don't have any Idea About That ( :
    protected void verifyActionPerformed(ActionEvent evt , final int OTPm) {
        if(tOTP.getText().equals("")) {
            JOptionPane.showMessageDialog(verify, "Empty OTP", "OTP Required", JOptionPane.WARNING_MESSAGE);
        }
        else if(otp!=true) {
            JOptionPane.showMessageDialog(verify, "Invalid OTP", "Invalid Inputs", JOptionPane.WARNING_MESSAGE);
        }
        else {
            final int EnterOTP = Integer.parseInt(tOTP.getText());
            // System.out.println(EnterOTP+" "+OTPm);
            if(EnterOTP!=OTPm) {
                JOptionPane.showMessageDialog(verify, "Invalid OTP Entered", "Invalid", JOptionPane.WARNING_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(verify, "Oky Set New Password", "Set", JOptionPane.PLAIN_MESSAGE);
                tNewPass.setEditable(true);
                tConfirmPass.setEditable(true);
                temail.setEditable(false);
                verify.setEnabled(false);
                submit.setEnabled(true);
            }
        }
    }

    protected void submitActionPerformed(ActionEvent evt ,String name) {
        if(tNewPass.getText().equals("")) {
            JOptionPane.showMessageDialog(submit, "Empty Password ", "Input Empty", JOptionPane.WARNING_MESSAGE);
        }
        else if(tConfirmPass.getText().equals("")) {
            JOptionPane.showMessageDialog(submit, "Empty Confirm Password ", "Input Empty", JOptionPane.WARNING_MESSAGE);
        }
        else if(confi!=true || passwword1!=true ){
            JOptionPane.showMessageDialog(submit, "Such a Type of Invalid Password  ", "Invalid Password", JOptionPane.WARNING_MESSAGE);
        }
        else {
            try {
                Connection con = new dbConnection().getDbconnection();
                Statement stm = con.createStatement();
                String q = "update customer_details set  password='"+tNewPass.getText()+"' where email='"+temail.getText()+"'";
                int x = stm.executeUpdate(q);
                if(x!=0) {
                    JOptionPane.showMessageDialog(submit, "reset Your password", "Done !", JOptionPane.PLAIN_MESSAGE);
                    if(evt.getSource()==submit) {
                        dispose();
                        new Login_Form(name).setVisible(true);
                    }
                }
                else {
                JOptionPane.showMessageDialog(submit, "password is not changing", "not changing", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    protected int getOTPActionPerformed(ActionEvent evt) {
        if(temail.getText().equals("")) {
            JOptionPane.showMessageDialog(getOTP, "Email Required", "Empty Input", JOptionPane.WARNING_MESSAGE);
        }
        else if(email!=true) {
            JOptionPane.showMessageDialog(getOTP, "Invalid Email", "Invalid", JOptionPane.WARNING_MESSAGE);
        }
        else {
            try {
                Connection con = new dbConnection().getDbconnection();
                Statement stm = con.createStatement();
                String q = "select email from customer_details where email='"+temail.getText()+"'";
                ResultSet rs = stm.executeQuery(q);
                if(rs.next()) {
                    // 

                    final int OTPM = Mail_sending.SendOTP(rs.getString("email"),"Customer");
                    // System.out.println(OTPM);
                    temail.setEditable(false);
                    tOTP.setEditable(true);
                    JOptionPane.showMessageDialog(tOTP, "OTP Sended Fine !", "OTP Send", JOptionPane.PLAIN_MESSAGE);
                    verify.setEnabled(true);
                    return OTPM;
                }
                else {
                    JOptionPane.showMessageDialog(temail, "Given Details are not Found", "Record Not Found", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return 0;
    }

    // validation here
    protected void tConfirmPassKeyReleased(KeyEvent evt) {
        String PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(tConfirmPass.getText());
        if (!match.matches()) {
            // JOptionPane.showMessageDialog(null, "Please enter the username");
            tConfirmPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, (new java.awt.Color(255, 0, 0))));
            confi=false;
        } else {
            String s =tNewPass.getText();
            String s2 = tConfirmPass.getText();
            if(s.equals(s2)) {
                tConfirmPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 255, 0)));
                confi = true;
            }
            else {
                confi=false;
                tConfirmPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, (new java.awt.Color(255, 0, 0))));
            }
        }
    }

    protected void tNewPassKeyReleased(KeyEvent evt) {
        String PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(tNewPass.getText());
        if (!match.matches()) {
            // JOptionPane.showMessageDialog(null, "Please enter the username");
            tNewPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, (new java.awt.Color(255, 0, 0))));
            tConfirmPass.setText("");
            passwword1=false;
            confi=false;
        } else {
            passwword1=true;
            tNewPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 255, 0)));
        }
    }

    protected void tOTPKeyReleased(KeyEvent evt) {
        String PATTERN = "^[0-9]{6}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(tOTP.getText());
        if (!match.matches())
        {   otp=false;     
            tOTP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, (new java.awt.Color(255,0,0))));
        }
        else
        {
            otp=true;
            tOTP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 255, 0)));
        }
    }

    protected void temailKeyReleased(KeyEvent evt) {
        String PATTERN = "^[_A-Za-z0-9-\\+]{6,30}+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(temail.getText());
        if (!match.matches()) {
            // JOptionPane.showMessageDialog(null, "Please enter the username");
            temail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, (new java.awt.Color(255, 0, 0))));
            email=false;

        } else {
            email=true;
            temail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 255, 0)));
        }
    }

    // sign up here
    protected void lsignupMouseExited(MouseEvent me) {
        lsignup.setForeground(new java.awt.Color(255, 255, 255));
        lsignup.setBorder(null);
    }

    protected void lsignupMouseClicked(MouseEvent me,String name) {
        if(me.getSource()==lsignup) {
            dispose();
            new SignUpForm(name).setVisible(true);
        }
    }

    protected void lsignupMouseEnterd(MouseEvent e) {
        lsignup.setForeground(new java.awt.Color(126,90,200));
        lsignup.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.BLACK));
    }

    // l home label
    protected void lhomeMouseExited(MouseEvent me) {
        lhome.setForeground(new java.awt.Color(255, 255, 255));
        lhome.setBorder(null);
    }

    protected void lhomeMouseClicked(MouseEvent me,String name) {
        if(me.getSource()==lhome) {
            dispose();
            new Manager_Home(name).setVisible(true);
        }
    }

    protected void lhomeMouseEnterd(MouseEvent e) {
        lhome.setForeground(new java.awt.Color(126,90,200));
        lhome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.BLACK));
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
    //         java.util.logging.Logger.getLogger(Forget_Pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (InstantiationException ex) {
    //         java.util.logging.Logger.getLogger(Forget_Pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (IllegalAccessException ex) {
    //         java.util.logging.Logger.getLogger(Forget_Pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //         java.util.logging.Logger.getLogger(Forget_Pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     }
    //     //</editor-fold>

    //     /* Create and display the form */
    //     java.awt.EventQueue.invokeLater(new Runnable() {
    //         public void run() {
    //             new Forget_Pass("").setVisible(true);
    //         }
    //     });
    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton getOTP;
    private javax.swing.JPanel header1;
    private javax.swing.JPanel header2;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel lOTP;
    private javax.swing.JLabel lconfirmpass;
    private javax.swing.JLabel lcustomerLoginPass;
    private javax.swing.JLabel lemail;
    private javax.swing.JLabel lhome;
    private javax.swing.JLabel lnewPass;
    private javax.swing.JLabel lsignup;
    private javax.swing.JLabel reset_img;
    private javax.swing.JPanel reset_panel;
    private javax.swing.JButton submit;
    private javax.swing.JTextField tConfirmPass;
    private javax.swing.JTextField tNewPass;
    private javax.swing.JTextField tOTP;
    private javax.swing.JTextField temail;
    private javax.swing.JButton verify;
    // End of variables declaration//GEN-END:variables
}

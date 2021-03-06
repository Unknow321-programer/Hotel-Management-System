/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// package hotel_management_system;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
// import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class Customer_Data extends javax.swing.JFrame {

    /**
     * Creates new form Customer_Data
     */
    boolean email=false;
    public Customer_Data(String name) {
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

        manu = new javax.swing.JPanel();
        lRoomManage = new javax.swing.JLabel();
        lLogOut = new javax.swing.JLabel();
        customer_login = new javax.swing.JLabel();
        customer_signup = new javax.swing.JLabel();
        lCustomerData = new javax.swing.JLabel();
        lHome = new javax.swing.JLabel();
        lStaffManage = new javax.swing.JLabel();
        DataTable = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        SearchPanel = new javax.swing.JPanel();
        lemail = new javax.swing.JLabel();
        temail = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        bgimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manu.setBackground(new java.awt.Color(255, 102, 51));

        lRoomManage.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        lRoomManage.setForeground(new java.awt.Color(255, 255, 255));
        lRoomManage.setText("Room Manage");
        lRoomManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lRoomManageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lRoomManageMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent me) {
                lRoomManageMouseClicked(me,Manager_name);
            }
        });

        lLogOut.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        lLogOut.setForeground(new java.awt.Color(255, 255, 255));
        lLogOut.setText("Log Out");
        lLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lLogOutMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent me) {
                lLogOutMouseClicked(me);
            }
        });

        customer_login.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        customer_login.setForeground(new java.awt.Color(255, 255, 255));
        customer_login.setText("Customer Login");
        customer_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customer_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customer_loginMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent me) {
                customer_loginMouseClicked(me,Manager_name);
            }
        });

        customer_signup.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        customer_signup.setForeground(new java.awt.Color(255, 255, 255));
        customer_signup.setText("Customer SignUP");
        customer_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customer_signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customer_signupMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent me) {
                customer_signupMouseClicked(me,Manager_name);
            }
        });

        lCustomerData.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        lCustomerData.setForeground(new java.awt.Color(126, 90, 200));
        lCustomerData.setText("Customer Data");
        lCustomerData.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        lHome.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        lHome.setForeground(new java.awt.Color(255, 255, 255));
        lHome.setText("Home");
        lHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lHomeMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent me) {
                lHomeMouseClicked(me,Manager_name);
            }
        });

        lStaffManage.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        lStaffManage.setForeground(new java.awt.Color(255, 255, 255));
        lStaffManage.setText("Satff Manage");
        lStaffManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lStaffManageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lStaffManageMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent me) {
                lStaffManageMouseClicked(me,Manager_name);
            }
        });

        javax.swing.GroupLayout manuLayout = new javax.swing.GroupLayout(manu);
        manu.setLayout(manuLayout);
        manuLayout.setHorizontalGroup(
            manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lHome)
                .addGap(46, 46, 46)
                .addComponent(lCustomerData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(lRoomManage)
                .addGap(49, 49, 49)
                .addComponent(lStaffManage)
                .addGap(41, 41, 41)
                .addComponent(customer_login)
                .addGap(32, 32, 32)
                .addComponent(customer_signup)
                .addGap(39, 39, 39)
                .addComponent(lLogOut)
                .addGap(25, 25, 25))
        );
        manuLayout.setVerticalGroup(
            manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(manuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lRoomManage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customer_login)
                    .addComponent(customer_signup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lLogOut)
                    .addComponent(lCustomerData, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lHome)
                    .addComponent(lStaffManage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(manu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 50));

        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Email", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DataTable.setViewportView(CustomerTable);

        getContentPane().add(DataTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 930, 470));

        SearchPanel.setBackground(new java.awt.Color(255, 153, 102));

        lemail.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lemail.setForeground(new java.awt.Color(255, 255, 255));
        lemail.setText("Email:-");

        Search.setBackground(new java.awt.Color(153, 204, 255));
        Search.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                SearchActionPerformed(ae);
            }
        });

        temail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent ke) {
                temailKeyReleased(ke);
            }
        });

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(lemail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search)
                    .addComponent(lemail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(SearchPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1080, 50));

        bgimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/reception2.jpeg"))); // NOI18N
        getContentPane().add(bgimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    protected void lHomeMouseClicked(MouseEvent me, String manager_name) {
        if(me.getSource()==lHome) {
            dispose();
            new Manager_Home(manager_name).setVisible(true);
        }
    }

    protected void temailKeyReleased(KeyEvent ke) {
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

    protected void SearchActionPerformed(ActionEvent ae) {
        if(temail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Email is Empty","Empty Inputs",JOptionPane.WARNING_MESSAGE);
        }
        else if (email!=true) {
            JOptionPane.showMessageDialog(null, "Email is Invalid","Invalid Inputs",JOptionPane.WARNING_MESSAGE);
        }
        else {
            try {
                Connection con = new dbConnection().getDbconnection();
                Statement stm = con.createStatement();
                String q = "select * from customer_details where email='"+temail.getText()+"'";
                DefaultTableModel dtm = (DefaultTableModel)CustomerTable.getModel();
                while(dtm.getRowCount()>0) 
                dtm.removeRow(dtm.getRowCount()-1);
                ResultSet rs = stm.executeQuery(q);
                while(rs.next()) {
                    String[] Row = {
                        Integer.toString(rs.getInt("id")),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("password")
                    };
                    dtm.addRow(Row);
                }
                
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(e);
            }
        }
    }

    private void lRoomManageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lRoomManageMouseEntered
        // TODO add your handling code here:
        lRoomManage.setForeground(new java.awt.Color(126,90,200));
        lRoomManage.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));
    }//GEN-LAST:event_lRoomManageMouseEntered

    private void lRoomManageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lRoomManageMouseExited
        // TODO add your handling code here:
        lRoomManage.setForeground(Color.white);
        lRoomManage.setBorder(null);
    }//GEN-LAST:event_lRoomManageMouseExited

    private void lStaffManageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lStaffManageMouseEntered
        // TODO add your handling code here:
        lStaffManage.setForeground(new java.awt.Color(126,90,200));
        lStaffManage.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));
    }//GEN-LAST:event_lStaffManageMouseEntered

    private void lStaffManageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lStaffManageMouseExited
        // TODO add your handling code here:
        lStaffManage.setForeground(Color.white);
        lStaffManage.setBorder(null);
    }//GEN-LAST:event_lStaffManageMouseExited

    private void lLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lLogOutMouseEntered
        // TODO add your handling code here:
        lLogOut.setForeground(new java.awt.Color(126,90,200));
        lLogOut.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));
    }//GEN-LAST:event_lLogOutMouseEntered

    private void lLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lLogOutMouseExited
        // TODO add your handling code here:
        lLogOut.setForeground(Color.white);
        lLogOut.setBorder(null);
    }//GEN-LAST:event_lLogOutMouseExited

    private void customer_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer_loginMouseEntered
        // TODO add your handling code here:
        customer_login.setForeground(new java.awt.Color(126,90,200));
        customer_login.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));
    }//GEN-LAST:event_customer_loginMouseEntered

    private void customer_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer_loginMouseExited
        // TODO add your handling code here:
        customer_login.setForeground(Color.white);
        customer_login.setBorder(null);
    }//GEN-LAST:event_customer_loginMouseExited

    private void customer_signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer_signupMouseEntered
        // TODO add your handling code here:
        customer_signup.setForeground(new java.awt.Color(126,90,200));
        customer_signup.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));
    }//GEN-LAST:event_customer_signupMouseEntered

    private void customer_signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer_signupMouseExited
        // TODO add your handling code here:
        customer_signup.setForeground(Color.white);
        customer_signup.setBorder(null);
    }//GEN-LAST:event_customer_signupMouseExited

    private void lHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lHomeMouseEntered
        // TODO add your handling code here:
        lHome.setForeground(new java.awt.Color(126,90,200));
        lHome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));
    }//GEN-LAST:event_lHomeMouseEntered

    private void lHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lHomeMouseExited
        // TODO add your handling code here:
        lHome.setForeground(Color.white);
        lHome.setBorder(null);
    }//GEN-LAST:event_lHomeMouseExited


    private void customer_signupMouseClicked(MouseEvent me,String name) {
        if(me.getSource()==customer_signup) {
            dispose();
            new SignUpForm(name).setVisible(true);
        }
    }
 
    protected void lRoomManageMouseClicked(MouseEvent me,String name) {
        if(me.getSource()==lRoomManage) {
            dispose();
            new RoomManage(name).setVisible(true);
        }
    }

    protected void lStaffManageMouseClicked(MouseEvent me,String name) {
        if(me.getSource()==lStaffManage) {
            dispose();
            new employee(name).setVisible(true);
        }
    }
    
    protected void customer_loginMouseClicked(MouseEvent me,String name) {
        if(me.getSource()==customer_login) {
            dispose();
            new Login_Form(name).setVisible(true);
        }
    }

    protected void lLogOutMouseClicked(MouseEvent me) {
        if(me.getSource()==lLogOut) {
            JOptionPane.showConfirmDialog(null, "You Are Going To Logout");
            dispose();
            new HomePage().setVisible(true);
        }
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
    //         java.util.logging.Logger.getLogger(Customer_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (InstantiationException ex) {
    //         java.util.logging.Logger.getLogger(Customer_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (IllegalAccessException ex) {
    //         java.util.logging.Logger.getLogger(Customer_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //         java.util.logging.Logger.getLogger(Customer_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     }
    //     //</editor-fold>

    //     /* Create and display the form */
    //     java.awt.EventQueue.invokeLater(new Runnable() {
    //         public void run() {
    //             new Customer_Data("NAME").setVisible(true);
    //         }
    //     });
    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomerTable;
    private javax.swing.JScrollPane DataTable;
    private javax.swing.JButton Search;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JLabel bgimg;
    private javax.swing.JLabel customer_login;
    private javax.swing.JLabel customer_signup;
    private javax.swing.JLabel lCustomerData;
    private javax.swing.JLabel lHome;
    private javax.swing.JLabel lLogOut;
    private javax.swing.JLabel lRoomManage;
    private javax.swing.JLabel lStaffManage;
    private javax.swing.JLabel lemail;
    private javax.swing.JPanel manu;
    private javax.swing.JTextField temail;
    // End of variables declaration//GEN-END:variables
}

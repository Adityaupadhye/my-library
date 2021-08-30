/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author 521949
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class page5 extends javax.swing.JFrame {
    
    data db;

    /**
     * Creates new form page5
     */
    public page5() {
        initComponents();
        db=new data();
        new page1().scaleImg(bg_label, "images/rom.jpg");
    }

    public page5(String r) {
        initComponents();
        L.setText(r);
        db=new data();
        new page1().scaleImg(bg_label, "images/rom.jpg");
    }

    @Override
    public void dispose() {
        super.dispose(); 
        db.closeConnection();
    }

    public void message() {
        String c = L.getText();
        page10 x = new page10(c);
        int n = JOptionPane.showConfirmDialog(rootPane, "added to cart..select another category?", "add to cart", 1, -1);
        if (n == 0) {
            page2 s = new page2(c);
            s.setVisible(true);
            dispose();
        }
        if (n == 1) {
            int z = JOptionPane.showConfirmDialog(rootPane, "books added to cart..proceed to checkout?", "conifrmation", 1, -1);
            if (z == 0) {
                x.setVisible(true);
                dispose();
            }
            if (z == 1) {
                page2 y = new page2(c);
                y.setVisible(true);
                dispose();
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        P1 = new javax.swing.JPanel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        rb5 = new javax.swing.JRadioButton();
        rb6 = new javax.swing.JRadioButton();
        cart_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lc = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        bg_label = new javax.swing.JLabel();
        L = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ROMANCE");
        setBounds(new java.awt.Rectangle(50, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1200, 680));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        P1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 3, true), "Romance", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24), new java.awt.Color(255, 51, 255))); // NOI18N
        P1.setForeground(new java.awt.Color(255, 51, 255));
        P1.setToolTipText("Romance");
        P1.setOpaque(false);

        rb1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rb1.setForeground(new java.awt.Color(255, 0, 255));
        rb1.setText("The Girl in the Picture");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        rb2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rb2.setForeground(new java.awt.Color(255, 51, 255));
        rb2.setText("Fairytale: A Novel");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        rb3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rb3.setForeground(new java.awt.Color(255, 51, 255));
        rb3.setText("The Last Move");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });

        rb4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rb4.setForeground(new java.awt.Color(255, 51, 255));
        rb4.setText("Unloved, a love story");
        rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4ActionPerformed(evt);
            }
        });

        rb5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rb5.setForeground(new java.awt.Color(255, 51, 255));
        rb5.setText("Without Merit: A Novel");
        rb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb5ActionPerformed(evt);
            }
        });

        rb6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rb6.setForeground(new java.awt.Color(255, 51, 255));
        rb6.setText("Her Last Goodbye ");
        rb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb6)
                    .addComponent(rb5)
                    .addComponent(rb4)
                    .addComponent(rb1)
                    .addComponent(rb2)
                    .addComponent(rb3))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(rb1)
                .addGap(58, 58, 58)
                .addComponent(rb2)
                .addGap(64, 64, 64)
                .addComponent(rb3)
                .addGap(47, 47, 47)
                .addComponent(rb4)
                .addGap(51, 51, 51)
                .addComponent(rb5)
                .addGap(43, 43, 43)
                .addComponent(rb6)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(P1);
        P1.setBounds(20, 20, 430, 560);

        cart_btn.setBackground(new java.awt.Color(102, 255, 0));
        cart_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cart_btn.setText("ADD TO CART");
        cart_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        cart_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cart_btnActionPerformed(evt);
            }
        });
        getContentPane().add(cart_btn);
        cart_btn.setBounds(270, 590, 180, 40);

        back_btn.setBackground(new java.awt.Color(51, 255, 0));
        back_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back_btn.setText("BACK");
        back_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        getContentPane().add(back_btn);
        back_btn.setBounds(80, 590, 170, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2.setText("books in cart:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(900, 30, 170, 40);

        lc.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lc.setForeground(new java.awt.Color(255, 0, 255));
        getContentPane().add(lc);
        lc.setBounds(1080, 20, 50, 60);

        l6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/p5/Her Last Goodbye -rom.jpg"))); // NOI18N
        getContentPane().add(l6);
        l6.setBounds(780, 80, 330, 500);

        l5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/p5/Without Merit-A Novel-rom.jpg"))); // NOI18N
        getContentPane().add(l5);
        l5.setBounds(780, 80, 330, 500);

        l4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/p5/Unloved, a love story-rom.jpg"))); // NOI18N
        getContentPane().add(l4);
        l4.setBounds(820, 80, 260, 350);

        l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/p5/The Last Move-rom.jpg"))); // NOI18N
        getContentPane().add(l3);
        l3.setBounds(780, 80, 330, 500);

        l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/p5/Fairytale -A Novel-rom.jpg"))); // NOI18N
        getContentPane().add(l2);
        l2.setBounds(780, 80, 330, 500);

        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/p5/The Girl in the Picture-rom.jpg"))); // NOI18N
        getContentPane().add(l1);
        l1.setBounds(780, 80, 330, 500);

        bg_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/p5/rom.jpg"))); // NOI18N
        bg_label.setMaximumSize(new java.awt.Dimension(2000, 2000));
        bg_label.setPreferredSize(new java.awt.Dimension(1200, 680));
        getContentPane().add(bg_label);
        bg_label.setBounds(0, 0, 1200, 680);
        getContentPane().add(L);
        L.setBounds(1360, 20, 180, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        String c = L.getText();
        new page2(c).setVisible(true);
        dispose();

    }//GEN-LAST:event_back_btnActionPerformed

    private void cart_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cart_btnActionPerformed
        try {
            String category = P1.getToolTipText();
            //Class.forName("java.sql.Driver");
            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "#1506");
            //Statement st = con.createStatement();
            
            //HashMap<String, String> map = new HashMap<>();
            List<String> bookNames = new ArrayList<>();
            
            //rb.getText gets the bookname
            if(rb1.isSelected()) bookNames.add(rb1.getText());
            if(rb2.isSelected()) bookNames.add(rb2.getText());
            if(rb3.isSelected()) bookNames.add(rb3.getText());
            if(rb4.isSelected()) bookNames.add(rb4.getText());
            if(rb5.isSelected()) bookNames.add(rb5.getText());
            if(rb6.isSelected()) bookNames.add(rb6.getText());
            
//            if (rb1.isSelected()) {
//                String n1 = rb1.getText();
//                String sql = "insert into books values('" + n1 + "','" + category + "');";
//                //st.executeUpdate(sql);
//                db.newUpdateQuery(sql);
//
//            }
//            if (rb2.isSelected()) {
//                String n2 = rb2.getText();
//                String sql = "insert into books values('" + n2 + "','" + category + "')";
//                //st.executeUpdate(sql);
//                db.newUpdateQuery(sql);
//
//            }
//            if (rb3.isSelected()) {
//                String n3 = rb3.getText();
//                String sql = "insert into books values('" + n3 + "','" + category + "')";
//                //st.executeUpdate(sql);
//                db.newUpdateQuery(sql);
//
//            }
//            if (rb4.isSelected()) {
//                String n4 = rb4.getText();
//                String sql = "insert into books values('" + n4 + "','" + category + "')";
//                //st.executeUpdate(sql);
//                db.newUpdateQuery(sql);
//                
//            }
//            if (rb5.isSelected()) {
//                String n5 = rb5.getText();
//                String sql = "insert into books values('" + n5 + "','" + category + "')";
//                //st.executeUpdate(sql);
//                db.newUpdateQuery(sql);
//
//            }
//            if (rb6.isSelected()) {
//                String n6 = rb6.getText();
//                String sql = "insert into books values('" + n6 + "','" + category + "')";
//                //st.executeUpdate(sql);
//                db.newUpdateQuery(sql);
//
//            }

            
            for(var bookname: bookNames){
                db.insertBook(bookname, category);
            }

            //String countCategoryBooksQuery = "select count(*) from books where category='" + category + "';";
            //ResultSet rs = db.newQuery(countCategoryBooksQuery);
            //rs.first();
            int count = db.getTotalBooksCount(category);
            if (count == 0) {
                JOptionPane.showMessageDialog(rootPane, "no book selected");
            } 
            else {
                message();
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error: "+e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_cart_btnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(false);
        try {
            int totalBooksInCart = db.getTotalBooksCount();
            lc.setText("" + totalBooksInCart);
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowActivated

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        l1.setVisible(true);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        l2.setVisible(true);
        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(false);
        l1.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        l3.setVisible(true);
        l1.setVisible(false);
        l2.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_rb3ActionPerformed

    private void rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4ActionPerformed
        l4.setVisible(true);
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(false);        
    }//GEN-LAST:event_rb4ActionPerformed

    private void rb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb5ActionPerformed
        l5.setVisible(true);
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l6.setVisible(false);    
    }//GEN-LAST:event_rb5ActionPerformed

    private void rb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb6ActionPerformed
        l6.setVisible(true);
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);        
    }//GEN-LAST:event_rb6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(page5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(page5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(page5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L;
    private javax.swing.JPanel P1;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bg_label;
    private javax.swing.JButton cart_btn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel lc;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    private javax.swing.JRadioButton rb6;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.*;
import javax.swing.JTable;

/**
 *
 * @author Aditya Upadhye
 */
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.*;

public class page10 extends javax.swing.JFrame {

//    Connection con = null;
//    Statement st = null;
//    ResultSet rs = null;
    private final data db;
    private page1 page1 = new page1();

    /**
     * Creates new form page10
     */
    public page10() {
        db = new data();
        initComponents();
        page1.scaleImg(bg_label, "images/c5.jpg");
    }

    public page10(String u) {
        initComponents();
        page1.scaleImg(bg_label, "images/c5.jpg");
        db = new data();
        nameTF.setText(u);
    }

    private boolean showDeleteDialog(String bookName) {
        int option = JOptionPane.showConfirmDialog(
                null, "Want to delete \"" + bookName + "\" from your cart?", "Confirm deletion",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE
        );

        if (option == JOptionPane.OK_OPTION) {
            System.out.println("delete to be called");
            if (db.deleteBook(bookName)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error deleting book from database");
            }
        }

        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        doneBtn = new javax.swing.JButton();
        emptyCartBtn = new javax.swing.JButton();
        bg_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SUMMARY");
        setPreferredSize(new java.awt.Dimension(1200, 680));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        nameTF.setEditable(false);
        nameTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameTF.setForeground(new java.awt.Color(255, 255, 255));
        nameTF.setEnabled(false);
        nameTF.setOpaque(false);
        getContentPane().add(nameTF);
        nameTF.setBounds(360, 50, 260, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name of User :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 50, 190, 40);

        t1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name of Book", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t1.setGridColor(new java.awt.Color(0, 0, 0));
        t1.setOpaque(false);
        t1.setRowHeight(25);
        t1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 120, 660, 300);

        doneBtn.setBackground(new java.awt.Color(0, 0, 0));
        doneBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        doneBtn.setForeground(new java.awt.Color(255, 255, 0));
        doneBtn.setText("DONE");
        doneBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        doneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneBtnActionPerformed(evt);
            }
        });
        getContentPane().add(doneBtn);
        doneBtn.setBounds(140, 430, 180, 40);

        emptyCartBtn.setBackground(new java.awt.Color(0, 0, 0));
        emptyCartBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        emptyCartBtn.setForeground(new java.awt.Color(255, 255, 0));
        emptyCartBtn.setText("Empty My Cart");
        emptyCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptyCartBtnActionPerformed(evt);
            }
        });
        getContentPane().add(emptyCartBtn);
        emptyCartBtn.setBounds(360, 430, 220, 40);

        bg_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/c5.jpg"))); // NOI18N
        bg_label.setPreferredSize(new java.awt.Dimension(1490, 785));
        getContentPane().add(bg_label);
        bg_label.setBounds(0, 0, 1500, 790);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {

            //DefaultTableModel tm = (DefaultTableModel) t1.getModel();
            //Class.forName("java.sql.Driver");
            //con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");
            //String getAllBooks = "select * from books;";
            //st = con.createStatement();
//            List<Object[]> books = db.getAllBooks();
//            books.forEach(book -> {
//                tm.addRow(book);
//            });
//            while (rs.next()) {
//                String bookName = rs.getString("book_name");
//                String category = rs.getString("category");
//                Object ob[] = {bookName, category};
//                tm.addRow(ob);
//            }
            //rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            String u = nameTF.getText();

            nameTF.setText(User.name);

//            String getNameQuery = "SELECT name FROM users WHERE username='" + u + "'";
//            ResultSet nameResultSet = db.newQuery(getNameQuery);
//            System.out.println(nameResultSet);
//            //nameResultSet.first();
//            if(!nameResultSet.isClosed()){
//                String name = nameResultSet.getString("name");
//                nameTF.setText(name);
//            }
            DefaultTableModel tm = (DefaultTableModel) t1.getModel();
            List<Object[]> books = db.getAllBooks();
            books.forEach(book -> {
                tm.addRow(book);
            });
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowOpened

    private void doneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneBtnActionPerformed
        int n = JOptionPane.showConfirmDialog(rootPane, "Thank You for using our app" + "\n exit?", "THANKYOU", 1, -1);
        if (n == 0) {
            dispose();
            System.exit(0);
        }
        if (n == 1) {
            new page1().setVisible(true);
            dispose();
        }
        if (n == 2) {
            dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_doneBtnActionPerformed

    private void emptyCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptyCartBtnActionPerformed
        if (showDeleteDialog("All books")) {
            if (db.deleteMyBooks()) {
                DefaultTableModel tm = (DefaultTableModel) t1.getModel();
                tm.setRowCount(0);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error in deleting books");
            }
        }
    }//GEN-LAST:event_emptyCartBtnActionPerformed

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
        JTable source = (JTable) evt.getSource();
        int row = source.rowAtPoint(evt.getPoint());
        DefaultTableModel tm = (DefaultTableModel) source.getModel();
        //tm.removeRow(row);
        //int col = source.columnAtPoint(evt.getPoint());
        String value = source.getModel().getValueAt(row, 0).toString();
        if (showDeleteDialog(value)) {
            tm.removeRow(row);
        }

        System.out.println(value);
    }//GEN-LAST:event_t1MouseClicked

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
            java.util.logging.Logger.getLogger(page10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(page10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(page10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_label;
    private javax.swing.JButton doneBtn;
    private javax.swing.JButton emptyCartBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTable t1;
    // End of variables declaration//GEN-END:variables
}

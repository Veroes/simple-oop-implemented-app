package researead.views.dialogmsg;

import researead.views.Library; 
import java.awt.Frame;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import researead.controllers.BookController;
import researead.models.Book;

public class Dialog_EditBook extends javax.swing.JDialog {
    private final BookController bookController;
    private Book newEditedBook;
    private static Book oldBook;

    public Dialog_EditBook(Frame parent, boolean modal, Book book) {
        super(parent, modal);
        initComponents();
        bookController = new BookController();
        oldBook = book;
        EditBookTitle.setText(oldBook.getTitle());
        EditBookAuthor.setText(oldBook.getAuthor());
        EditBookStatus.setSelectedItem(oldBook.getStatus());
        EditBookCurrentPage.setValue(oldBook.getCurrentPage());
        EditBookTotalPage.setValue(oldBook.getTotalPage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        EditBookTitle = new javax.swing.JTextField();
        EditBookAuthor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        EditBookCoverURL = new javax.swing.JTextField();
        Button_Discard = new javax.swing.JButton();
        Button_Save = new javax.swing.JButton();
        EditBookStatus = new javax.swing.JComboBox<>();
        EditBookCurrentPage = new javax.swing.JSpinner();
        EditBookTotalPage = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 246, 244));

        jPanel2.setBackground(new java.awt.Color(126, 151, 151));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(247, 246, 244));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Book");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );

        jLabel2.setText("Title");

        jLabel3.setText("Author");

        jLabel5.setText("Status");

        jLabel6.setText("Page");

        jLabel7.setText("Cover URL");

        EditBookTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBookTitleActionPerformed(evt);
            }
        });

        EditBookAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBookAuthorActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("/");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        EditBookCoverURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBookCoverURLActionPerformed(evt);
            }
        });

        Button_Discard.setBackground(new java.awt.Color(255, 255, 254));
        Button_Discard.setText("Discard");
        Button_Discard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Button_Discard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_DiscardMouseClicked(evt);
            }
        });
        Button_Discard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DiscardActionPerformed(evt);
            }
        });

        Button_Save.setBackground(new java.awt.Color(255, 255, 254));
        Button_Save.setText("Save");
        Button_Save.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Button_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SaveActionPerformed(evt);
            }
        });

        EditBookStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reading", "Finished" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button_Discard, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditBookCoverURL)
                            .addComponent(EditBookAuthor)
                            .addComponent(EditBookStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(EditBookCurrentPage, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(EditBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(EditBookTotalPage, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(132, 132, 132))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(EditBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditBookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(EditBookStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(EditBookCurrentPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditBookTotalPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditBookCoverURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Discard, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditBookTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBookTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBookTitleActionPerformed

    private void EditBookAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBookAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBookAuthorActionPerformed

    private void EditBookCoverURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBookCoverURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBookCoverURLActionPerformed

    private void Button_DiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DiscardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_DiscardActionPerformed

    private void Button_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SaveActionPerformed
        // TODO add your handling code here:
        String title = EditBookTitle.getText();
        String author = EditBookAuthor.getText();
        String coverUrl = EditBookCoverURL.getText();
        int totalPage = (int) EditBookTotalPage.getValue();
        int currentPage = (int) EditBookCurrentPage.getValue();
        String status = (String) EditBookStatus.getSelectedItem();
        
        byte[] coverBook = getBlobFromURL(coverUrl);
        
        newEditedBook = new Book(title, author, status, currentPage, totalPage, coverBook);
        
        bookController.updateBook(newEditedBook, oldBook.getTitle());
        
        this.dispose();
    }//GEN-LAST:event_Button_SaveActionPerformed
    private byte[] getBlobFromURL(String url) {
        try {
            URL imageUrl = new URL(url);
            URLConnection connection = imageUrl.openConnection();

            try (InputStream inputStream = connection.getInputStream();
                 ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {

                byte[] buffer = new byte[1024];
                int bytesRead;

                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

                return outputStream.toByteArray();
            }
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }
    
    private void Button_DiscardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DiscardMouseClicked
        // TODO add your handling code here:
        
        // Menutup dialog 
        this.dispose();

        // Kembali ke halaman library
        Library libraryPage = (Library) SwingUtilities.getWindowAncestor(this);
        libraryPage.setLocationRelativeTo(null);
        libraryPage.setVisible(true);
    }//GEN-LAST:event_Button_DiscardMouseClicked

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
            java.util.logging.Logger.getLogger(Dialog_EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dialog_EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dialog_EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dialog_EditBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dialog_EditBook dialog = new Dialog_EditBook(new javax.swing.JFrame(), true, oldBook);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Discard;
    private javax.swing.JButton Button_Save;
    private javax.swing.JTextField EditBookAuthor;
    private javax.swing.JTextField EditBookCoverURL;
    private javax.swing.JSpinner EditBookCurrentPage;
    private javax.swing.JComboBox<String> EditBookStatus;
    private javax.swing.JTextField EditBookTitle;
    private javax.swing.JSpinner EditBookTotalPage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

package popehiflo;

import java.awt.FileDialog;

/**
 *
 * @author popehiflo
 */
public class textEditorGui extends javax.swing.JFrame {

    String fileName;
    
    public textEditorGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newFileMenuItem = new javax.swing.JMenuItem();
        openFileMenuItem = new javax.swing.JMenuItem();
        saveFileMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cutTextMenuItem = new javax.swing.JMenuItem();
        copyTextMenuItem = new javax.swing.JMenuItem();
        pasteTextMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchButton.setText("Search");

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchButton)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        newFileMenuItem.setText("New");
        newFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(newFileMenuItem);

        openFileMenuItem.setText("Open");
        openFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(openFileMenuItem);

        saveFileMenuItem.setText("Save");
        saveFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveFileMenuItem);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        cutTextMenuItem.setText("Cut text");
        cutTextMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutTextMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(cutTextMenuItem);

        copyTextMenuItem.setText("Copy text");
        copyTextMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyTextMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(copyTextMenuItem);

        pasteTextMenuItem.setText("Paste text");
        pasteTextMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteTextMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(pasteTextMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cutTextMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutTextMenuItemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cutTextMenuItemActionPerformed

    private void newFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileMenuItemActionPerformed
        textArea.setText("");
        setTitle(fileName);
    }//GEN-LAST:event_newFileMenuItemActionPerformed

    private void openFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileMenuItemActionPerformed
        FileDialog fileDialog = new FileDialog(textEditorGui.this, "Open File", FileDialog.LOAD);
        setVisible(true);
    }//GEN-LAST:event_openFileMenuItemActionPerformed

    private void saveFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveFileMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void copyTextMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyTextMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyTextMenuItemActionPerformed

    private void pasteTextMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteTextMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasteTextMenuItemActionPerformed
    
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
            java.util.logging.Logger.getLogger(textEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(textEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(textEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(textEditorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new textEditorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copyTextMenuItem;
    private javax.swing.JMenuItem cutTextMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem newFileMenuItem;
    private javax.swing.JMenuItem openFileMenuItem;
    private javax.swing.JMenuItem pasteTextMenuItem;
    private javax.swing.JMenuItem saveFileMenuItem;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}

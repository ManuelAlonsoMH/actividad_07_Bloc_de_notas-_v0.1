
package view;

/**
 *
 * @author alons
 */
public class ViewNB extends javax.swing.JFrame {

  
    public ViewNB() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_texto = new javax.swing.JTextArea();
        jf_menu = new javax.swing.JMenuBar();
        jmenu = new javax.swing.JMenu();
        jmi_guardar = new javax.swing.JMenuItem();
        jmi_leer = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jta_texto.setColumns(20);
        jta_texto.setForeground(new java.awt.Color(102, 255, 0));
        jta_texto.setRows(5);
        jScrollPane1.setViewportView(jta_texto);

        jf_menu.setBackground(new java.awt.Color(102, 255, 204));
        jf_menu.setForeground(new java.awt.Color(255, 255, 204));

        jmenu.setText("NOTAS");

        jmi_guardar.setText("Guardar");
        jmenu.add(jmi_guardar);

        jmi_leer.setText("Leer");
        jmenu.add(jmi_leer);

        jf_menu.add(jmenu);

        setJMenuBar(jf_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
            java.util.logging.Logger.getLogger(ViewNB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewNB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewNB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewNB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewNB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JMenuBar jf_menu;
    public javax.swing.JMenu jmenu;
    public javax.swing.JMenuItem jmi_guardar;
    public javax.swing.JMenuItem jmi_leer;
    public javax.swing.JTextArea jta_texto;
    // End of variables declaration//GEN-END:variables
}

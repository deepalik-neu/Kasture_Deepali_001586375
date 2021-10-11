/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.Car;
import model.CarListHistory;

/**
 *
 * @author deepalikasture
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    CarListHistory carList;
    public MainJFrame() {
        initComponents();
        
        carList = new CarListHistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnCreateCar = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        btnSearchCarDetails = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setPreferredSize(new java.awt.Dimension(800, 900));

        controlPanel.setBackground(new java.awt.Color(0, 102, 102));

        btnCreateCar.setText("Add Car");
        btnCreateCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCarActionPerformed(evt);
            }
        });

        btnViewDetails.setText("View Car Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnSearchCarDetails.setText("Search Car Deatils");
        btnSearchCarDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCarDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearchCarDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(btnCreateCar)
                .addGap(18, 18, 18)
                .addComponent(btnViewDetails)
                .addGap(18, 18, 18)
                .addComponent(btnSearchCarDetails)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(controlPanel);

        workArea.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("UBER CATLOG");

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCarActionPerformed
        // TODO add your handling code here:
        CreateJPanel createPanel = new CreateJPanel(carList);
        jSplitPane1.setRightComponent(createPanel);
    }//GEN-LAST:event_btnCreateCarActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
          ViewJPanel viewPanel = new ViewJPanel(carList);
        jSplitPane1.setRightComponent(viewPanel);
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnSearchCarDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCarDetailsActionPerformed
        // TODO add your handling code here:
        ViewSearchDetails search = new ViewSearchDetails(carList);
        jSplitPane1.setRightComponent(search);
    }//GEN-LAST:event_btnSearchCarDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCar;
    private javax.swing.JButton btnSearchCarDetails;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}

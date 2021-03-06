/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DatabaseUtilities;

import java.io.File;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 * This class allows for UI interaction with the "Black Box" of raw CanBus 
 * messages in the database by allowing the user to specify a start and end 
 * timestamp for the range of messages to interact with and then either 
 * saving those messages to a file, deleting them or both
 * 
 * @author Alex Williams
 */
public class BlackBoxMessagesSelector extends javax.swing.JFrame {

    /**
     * Creates new form BlackBoxMessagesSelector
     */
    public BlackBoxMessagesSelector() {
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

        saveFileChooser = new javax.swing.JFileChooser();
        blackBoxManagerTitleLabel = new javax.swing.JLabel();
        PilotCheckbox = new javax.swing.JCheckBox();
        SailplaneCheckbox = new javax.swing.JCheckBox();
        AirfieldCheckbox = new javax.swing.JCheckBox();
        RunwayCheckbox = new javax.swing.JCheckBox();
        PositionCheckbox = new javax.swing.JCheckBox();
        ParachuteCheckbox = new javax.swing.JCheckBox();
        ProfileCheckbox = new javax.swing.JCheckBox();
        SubmitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        blackBoxManagerTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        blackBoxManagerTitleLabel.setText("Database Exporter");

        PilotCheckbox.setText("Pilot");
        PilotCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilotCheckboxActionPerformed(evt);
            }
        });

        SailplaneCheckbox.setText("Sailplane");

        AirfieldCheckbox.setText("Airfield");

        RunwayCheckbox.setText("Runway");

        PositionCheckbox.setText("Position");

        ParachuteCheckbox.setText("Parachute");

        ProfileCheckbox.setText("Profile");

        SubmitButton.setText("Submit");
        SubmitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                submitButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(blackBoxManagerTitleLabel)
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RunwayCheckbox)
                            .addComponent(ParachuteCheckbox)
                            .addComponent(PilotCheckbox)
                            .addComponent(SailplaneCheckbox)
                            .addComponent(PositionCheckbox)
                            .addComponent(AirfieldCheckbox)
                            .addComponent(ProfileCheckbox)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(SubmitButton)))
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackBoxManagerTitleLabel)
                .addGap(31, 31, 31)
                .addComponent(PilotCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SailplaneCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AirfieldCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProfileCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RunwayCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PositionCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ParachuteCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(SubmitButton)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PilotCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilotCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PilotCheckboxActionPerformed

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
            java.util.logging.Logger.getLogger(BlackBoxMessagesSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlackBoxMessagesSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlackBoxMessagesSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlackBoxMessagesSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlackBoxMessagesSelector().setVisible(true);
            }
        });
    }
    
    private void submitButtonMousePressed(java.awt.event.MouseEvent evt) 
    {
        exportData();     
    }
    
    protected void exportData()
    {
        /*
        if(PilotCheckbox.isSelected())
        {
            try
            {
                DatabaseExporter.exportDatabase("PILOT");
                System.out.println("Exported pilot");
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
        if(SailplaneCheckbox.isSelected())
        {
            try
            {
                DatabaseExporter.exportDatabase("SAILPLANE");
                System.out.println("Exported sailplane");
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
        if(AirfieldCheckbox.isSelected())
        {
            try
            {
                DatabaseExporter.exportDatabase("AIRFIELD");
                System.out.println("Exported airfield");
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
        if(ProfileCheckbox.isSelected())
        {
            try
            {
                DatabaseExporter.exportDatabase("PROFILE");
                System.out.println("Exported profile");
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
        if(RunwayCheckbox.isSelected())
        {
            try
            {
                DatabaseExporter.exportDatabase("RUNWAY");
                System.out.println("Exported runway");
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
        if(PositionCheckbox.isSelected())
        {
            try
            {
                DatabaseExporter.exportDatabase("POSITION");
                System.out.println("Exported position");
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
        if(ParachuteCheckbox.isSelected())
        {
            try
            {
                DatabaseExporter.exportDatabase("PARACHUTE");
                System.out.println("Exported parachute");
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
        */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AirfieldCheckbox;
    private javax.swing.JCheckBox ParachuteCheckbox;
    private javax.swing.JCheckBox PilotCheckbox;
    private javax.swing.JCheckBox PositionCheckbox;
    private javax.swing.JCheckBox ProfileCheckbox;
    private javax.swing.JCheckBox RunwayCheckbox;
    private javax.swing.JCheckBox SailplaneCheckbox;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel blackBoxManagerTitleLabel;
    private javax.swing.JFileChooser saveFileChooser;
    // End of variables declaration//GEN-END:variables

    private File saveFile = null;

    /**
     * Get the value of saveFile
     *
     * @return the value of saveFile
     */
    public File getSaveFile() {
        return saveFile;
    }

    /**
     * Set the value of saveFile
     *
     * @param saveFile new value of saveFile
     */
    public void setSaveFile(File saveFile) {
        this.saveFile = saveFile;
    }
}

/*
 * Copyright 2007 Sun Microsystems, Inc.
 *
 * This file is part of jVoiceBridge.
 *
 * jVoiceBridge is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License version 2 as 
 * published by the Free Software Foundation and distributed hereunder 
 * to you.
 *
 * jVoiceBridge is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Sun designates this particular file as subject to the "Classpath"
 * exception as provided by Sun in the License file that accompanied this 
 * code. 
 */

package bridgemonitor;

import com.sun.mpk20.voicelib.impl.service.voice.BridgeConnection;

/**
 *
 * @author  jp
 */
public class BridgeStatusPanel extends javax.swing.JPanel {
    
    private BridgeMonitorUI ui;

    private BridgeMonitor bridgeMonitor;

    /** Creates new form BridgeStatusPanel */
    public BridgeStatusPanel() {
        initComponents();

	bridgeMonitor = new BridgeMonitor(this);
    }
    
    public void setUI(BridgeMonitorUI ui) {
 	this.ui = ui;
	bridgeMonitor.initialize();
    }

    public javax.swing.JTable getCallTable() {
	ui.setCallTableOwner(this);
	return ui.getCallTable();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        bridgeTextField = new javax.swing.JTextField();
        monitorButton = new javax.swing.JButton();
        callBar = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        bridgeInfoButton = new javax.swing.JButton();
        enableButton = new javax.swing.JButton();
        callLabel = new javax.swing.JLabel();

        bridgeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bridgeTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bridgeTextFieldKeyTyped(evt);
            }
        });

        monitorButton.setText("Monitor");
        monitorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monitorButtonMouseClicked(evt);
            }
        });

        callBar.setLayout(new java.awt.BorderLayout());

        statusLabel.setText("Offline");

        bridgeInfoButton.setText("Bridge Info");
        bridgeInfoButton.setEnabled(false);
        bridgeInfoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bridgeInfoButtonMouseClicked(evt);
            }
        });

        enableButton.setText("Enable");
        enableButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enableButtonMouseClicked(evt);
            }
        });

        callLabel.setText("           ");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(enableButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(bridgeInfoButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(monitorButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(bridgeTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                    .add(layout.createSequentialGroup()
                        .add(61, 61, 61)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(statusLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, callBar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, callLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(callBar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .add(12, 12, 12)
                .add(callLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(statusLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(monitorButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(bridgeTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(12, 12, 12)
                .add(bridgeInfoButton)
		.add(enableButton))
        );
    }// </editor-fold>//GEN-END:initComponents

private void enableButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enableButtonMouseClicked
        bridgeMonitor.enableButtonMouseClicked(evt);
}//GEN-LAST:event_enableButtonMouseClicked

    private void bridgeInfoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bridgeInfoButtonMouseClicked
        bridgeMonitor.bridgeInfoButtonMouseClicked(evt);
}//GEN-LAST:event_bridgeInfoButtonMouseClicked

    private void bridgeTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bridgeTextFieldKeyReleased
        bridgeMonitor.bridgeTextFieldKeyReleased(evt);
}//GEN-LAST:event_bridgeTextFieldKeyReleased

    private void bridgeTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bridgeTextFieldKeyTyped
        bridgeMonitor.bridgeTextFieldKeyTyped(evt);
}//GEN-LAST:event_bridgeTextFieldKeyTyped

private void monitorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monitorButtonMouseClicked
        bridgeMonitor.monitorButtonMouseClicked(evt);
}//GEN-LAST:event_monitorButtonMouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enableButton;
    private javax.swing.JButton bridgeInfoButton;
    private javax.swing.JTextField bridgeTextField;
    private javax.swing.JPanel callBar;
    private javax.swing.JLabel callLabel;
    private javax.swing.JButton monitorButton;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
    
    public javax.swing.JTextField getBridgeTextField() {
	return bridgeTextField;
    }

    public javax.swing.JPanel getCallBar() {
	return callBar;
    }

    public javax.swing.JLabel getCallLabel() {
	return callLabel;
    }

    public javax.swing.JButton getMonitorButton() {
	return monitorButton;
    }

    public javax.swing.JLabel getStatusLabel() {
	return statusLabel;
    }

    public javax.swing.JButton getBridgeInfoButton() {
	return bridgeInfoButton;
    }

    public javax.swing.JButton getEnableButton() {
	return enableButton;
    }

    public void callTableMouseClicked(java.awt.event.MouseEvent evt) {
	bridgeMonitor.callTableMouseClicked(evt);
    }

}

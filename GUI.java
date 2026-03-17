/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parkinglist;

/**
 *
 * @author Rostyslav Kuznets
 * Student number: 24326776
 * Course title: BSHCIFSC2
 */
public class GUI extends javax.swing.JFrame {

    private ParkingList parkingList = new ParkingList();
    private WaitingQueue waitingQueue = new WaitingQueue();
    private CancelledStack cancelledStack = new CancelledStack();

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI.class.getName());

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }
    
    
    // clear all input fields and output area
    private void clearAll() {
        regTF.setText("");
        ownerTF.setText("");
        zoneTF.setText("");
        displayTA.setText("");
        typeCB.setSelectedIndex(0);
    }

    // create either a Car or Van object from form data
    private Vehicle createVehicleFromForm() {
    String reg = regTF.getText().trim();
    String owner = ownerTF.getText().trim();
    String zone = zoneTF.getText().trim();
    String type = typeCB.getSelectedItem().toString();

    if (reg.isEmpty() || owner.isEmpty() || zone.isEmpty()) {
        return null;
    }

    if (type.equals("Car")) {
        return new Car(reg, owner, zone);
    } else {
        return new Van(reg, owner, zone);
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        reg = new javax.swing.JLabel();
        owner = new javax.swing.JLabel();
        zone = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        regTF = new javax.swing.JTextField();
        ownerTF = new javax.swing.JTextField();
        zoneTF = new javax.swing.JTextField();
        typeCB = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        addBookingBTN = new javax.swing.JButton();
        enqueueBTN = new javax.swing.JButton();
        assignBTN = new javax.swing.JButton();
        searchBTN = new javax.swing.JButton();
        updateZone = new javax.swing.JButton();
        cancelBTN = new javax.swing.JButton();
        viewActiveBTN = new javax.swing.JButton();
        viewWaitingBTN = new javax.swing.JButton();
        viewCancelledBTN = new javax.swing.JButton();
        clearBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        reg.setText("Registrarion Number:");

        owner.setText("Owner Name:");

        zone.setText("Zone:");

        type.setText("Vehicle Type:");

        zoneTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoneTFActionPerformed(evt);
            }
        });

        typeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Van" }));
        typeCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typeCBItemStateChanged(evt);
            }
        });
        typeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeCBActionPerformed(evt);
            }
        });

        displayTA.setColumns(20);
        displayTA.setRows(5);
        jScrollPane2.setViewportView(displayTA);

        jLabel1.setText("                                                            Smart DockLands Parking");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addBookingBTN.setText("Add Booking");
        addBookingBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookingBTNActionPerformed(evt);
            }
        });

        enqueueBTN.setText("Add To Waiting Queue");
        enqueueBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enqueueBTNActionPerformed(evt);
            }
        });

        assignBTN.setText("Assign Next Vehicle");
        assignBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBTNActionPerformed(evt);
            }
        });

        searchBTN.setText("Search Vehicle");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        updateZone.setForeground(new java.awt.Color(153, 153, 0));
        updateZone.setText("Update Zone");
        updateZone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateZoneActionPerformed(evt);
            }
        });

        cancelBTN.setBackground(new java.awt.Color(255, 102, 51));
        cancelBTN.setText("Cancel Booking");
        cancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTNActionPerformed(evt);
            }
        });

        viewActiveBTN.setBackground(new java.awt.Color(153, 153, 153));
        viewActiveBTN.setText("View Active Bookings");
        viewActiveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActiveBTNActionPerformed(evt);
            }
        });

        viewWaitingBTN.setBackground(new java.awt.Color(153, 153, 153));
        viewWaitingBTN.setText("View Waiting Queue");
        viewWaitingBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewWaitingBTNActionPerformed(evt);
            }
        });

        viewCancelledBTN.setBackground(new java.awt.Color(153, 153, 153));
        viewCancelledBTN.setText("View Cancelled Bookings");
        viewCancelledBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCancelledBTNActionPerformed(evt);
            }
        });

        clearBTN.setBackground(new java.awt.Color(0, 0, 255));
        clearBTN.setForeground(new java.awt.Color(255, 255, 255));
        clearBTN.setText("Clear");
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });

        exitBTN.setBackground(new java.awt.Color(204, 102, 0));
        exitBTN.setForeground(new java.awt.Color(255, 255, 255));
        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(348, 348, 348)
                            .addComponent(clearBTN)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(exitBTN))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(enqueueBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(addBookingBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(assignBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(reg)
                                .addComponent(owner)
                                .addComponent(zone)
                                .addComponent(type))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ownerTF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(zoneTF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(regTF)
                                .addComponent(typeCB, javax.swing.GroupLayout.Alignment.LEADING, 0, 415, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(viewActiveBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(viewCancelledBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(viewWaitingBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cancelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(searchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(updateZone, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg)
                    .addComponent(regTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(owner)
                    .addComponent(ownerTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zone)
                    .addComponent(zoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type)
                    .addComponent(typeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enqueueBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBookingBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateZone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewActiveBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewCancelledBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewWaitingBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBTN)
                    .addComponent(clearBTN))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zoneTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoneTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zoneTFActionPerformed

    private void typeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeCBActionPerformed

    private void typeCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typeCBItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_typeCBItemStateChanged

    private void enqueueBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enqueueBTNActionPerformed
        Vehicle vehicle = createVehicleFromForm();

        if (vehicle == null) {
            displayTA.setText("Please fill in all fields.");
            return;
        }

        waitingQueue.enqueue(vehicle);
        displayTA.setText("Vehicle added to waiting queue:\n" + vehicle);
    }//GEN-LAST:event_enqueueBTNActionPerformed

    private void assignBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBTNActionPerformed
        Vehicle nextVehicle = waitingQueue.dequeue();

        if (nextVehicle == null) {
            displayTA.setText("Waiting queue is empty.");
            return;
        }

        parkingList.add(nextVehicle);
        displayTA.setText("Vehicle assigned from queue to active bookings:\n" + nextVehicle);
    }//GEN-LAST:event_assignBTNActionPerformed

    private void updateZoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateZoneActionPerformed
        String reg = regTF.getText().trim();
        String newZone = zoneTF.getText().trim();

        if (reg.isEmpty() || newZone.isEmpty()) {
            displayTA.setText("Enter registration number and new zone.");
            return;
        }

        boolean updated = parkingList.updateZone(reg, newZone);

        if (updated) {
            displayTA.setText("Zone updated successfully for " + reg);
        } else {
            displayTA.setText("Vehicle not found. Zone not updated.");
        }
    }//GEN-LAST:event_updateZoneActionPerformed

    private void addBookingBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookingBTNActionPerformed
        Vehicle vehicle = createVehicleFromForm();

        if (vehicle == null) {
            displayTA.setText("Please fill in all fields.");
            return;
        }

        parkingList.add(vehicle);
        displayTA.setText("Vehicle added to active bookings:\n" + vehicle);
    }//GEN-LAST:event_addBookingBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed

    String reg = regTF.getText().trim();

    if (reg.isEmpty()) {
        displayTA.setText("Enter a registration number to search.");
        return;
    }

    Vehicle found = parkingList.searchByRegistration(reg);

    if (found != null) {
        displayTA.setText("Vehicle found in active bookings:\n" + found);
    } else {
        displayTA.setText("Vehicle not found in active bookings.");
    }

    }//GEN-LAST:event_searchBTNActionPerformed

    private void cancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTNActionPerformed
        String reg = regTF.getText().trim();

        if (reg.isEmpty()) {
            displayTA.setText("Enter registration number to cancel.");
            return;
        }

        Vehicle vehicle = parkingList.searchByRegistration(reg);

        if (vehicle == null) {
            displayTA.setText("Vehicle not found in active bookings.");
            return;
        }

        cancelledStack.push(vehicle);
        parkingList.removeByRegistration(reg);

        displayTA.setText("Booking cancelled and pushed to cancelled stack:\n" + vehicle);
    }//GEN-LAST:event_cancelBTNActionPerformed

    private void viewActiveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActiveBTNActionPerformed
        displayTA.setText(parkingList.display());
    }//GEN-LAST:event_viewActiveBTNActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        clearAll();
    }//GEN-LAST:event_clearBTNActionPerformed

    private void viewWaitingBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewWaitingBTNActionPerformed
        displayTA.setText(waitingQueue.display());
    }//GEN-LAST:event_viewWaitingBTNActionPerformed

    private void viewCancelledBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCancelledBTNActionPerformed
        displayTA.setText(cancelledStack.display());
    }//GEN-LAST:event_viewCancelledBTNActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new GUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookingBTN;
    private javax.swing.JButton assignBTN;
    private javax.swing.JButton cancelBTN;
    private javax.swing.JButton clearBTN;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JButton enqueueBTN;
    private javax.swing.JButton exitBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel owner;
    private javax.swing.JTextField ownerTF;
    private javax.swing.JLabel reg;
    private javax.swing.JTextField regTF;
    private javax.swing.JButton searchBTN;
    private javax.swing.JLabel type;
    private javax.swing.JComboBox<String> typeCB;
    private javax.swing.JButton updateZone;
    private javax.swing.JButton viewActiveBTN;
    private javax.swing.JButton viewCancelledBTN;
    private javax.swing.JButton viewWaitingBTN;
    private javax.swing.JLabel zone;
    private javax.swing.JTextField zoneTF;
    // End of variables declaration//GEN-END:variables
}

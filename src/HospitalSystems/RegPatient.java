package HospitalSystems;

import java.awt.Checkbox;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author TONMOY
 */
public class RegPatient extends javax.swing.JFrame {

    /**
     * Creates new form Check
     */
    public RegPatient() {
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

        inoutGroup = new javax.swing.ButtonGroup();
        infoPanel = new javax.swing.JPanel();
        addingPatientNameLabel = new javax.swing.JLabel();
        menutomainSeparator = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        regLabel = new javax.swing.JLabel();
        regTextfield = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        patientLabel = new javax.swing.JLabel();
        patientIDTextfield = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        dateLabel = new javax.swing.JLabel();
        dateTextfield = new javax.swing.JTextField();
        patientinfoLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        firstnameLabel = new javax.swing.JLabel();
        firstnameTextfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lastnameTextfield = new javax.swing.JTextField();
        sidePanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        regPatient_Label = new javax.swing.JButton();
        outdoorPatient_Label = new javax.swing.JButton();
        indoorPatient_Label = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        patientbirthdateTextfield = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ageTextfield = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        departmentCombobox = new javax.swing.JComboBox<String>();
        doctorsCombobox = new javax.swing.JComboBox<String>();
        jLabel10 = new javax.swing.JLabel();
        heightTextfield = new javax.swing.JTextField();
        weightTextfield = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        sexdetCombobox = new javax.swing.JComboBox<String>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        emailTextfield = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        contactTextfield = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressfield = new javax.swing.JTextArea();
        saveInfoButton = new javax.swing.JButton();
        indoorRadioButton = new javax.swing.JRadioButton();
        outdoorRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoPanel.setBackground(new java.awt.Color(65, 65, 67));
        infoPanel.setPreferredSize(new java.awt.Dimension(850, 600));
        infoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addingPatientNameLabel.setBackground(new java.awt.Color(204, 0, 0));
        addingPatientNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addingPatientNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        addingPatientNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addingPatientNameLabel.setText("Register Patient");
        infoPanel.add(addingPatientNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 185, 28));

        menutomainSeparator.setBackground(new java.awt.Color(153, 153, 153));
        infoPanel.add(menutomainSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 10));

        jSeparator1.setBackground(new java.awt.Color(51, 0, 51));
        infoPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 56, 630, 10));

        regLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        regLabel.setForeground(new java.awt.Color(255, 255, 255));
        regLabel.setText("Registration No.");
        infoPanel.add(regLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, 20));

        regTextfield.setBackground(new java.awt.Color(65, 65, 67));
        regTextfield.setForeground(new java.awt.Color(255, 255, 255));
        regTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        regTextfield.setBorder(null);
        regTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regTextfieldActionPerformed(evt);
            }
        });
        infoPanel.add(regTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 150, -1));
        infoPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 150, 20));

        patientLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        patientLabel.setForeground(new java.awt.Color(255, 255, 255));
        patientLabel.setText("Patient ID");
        infoPanel.add(patientLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 70, 20));

        patientIDTextfield.setBackground(new java.awt.Color(65, 65, 67));
        patientIDTextfield.setForeground(new java.awt.Color(255, 255, 255));
        patientIDTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        patientIDTextfield.setBorder(null);
        patientIDTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIDTextfieldActionPerformed(evt);
            }
        });
        infoPanel.add(patientIDTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 170, -1));
        infoPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 108, 170, 20));

        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setText("Date");
        infoPanel.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 70, -1));

        dateTextfield.setEditable(false);
        dateTextfield.setText("Today's date..");
        dateTextfield.setBorder(null);
        infoPanel.add(dateTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 100, -1));

        patientinfoLabel.setForeground(new java.awt.Color(255, 255, 255));
        patientinfoLabel.setText("Patient Info.");
        infoPanel.add(patientinfoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 70, 20));
        infoPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 590, 10));

        firstnameLabel.setBackground(new java.awt.Color(255, 255, 255));
        firstnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstnameLabel.setText("First Name");
        infoPanel.add(firstnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 60, 20));

        firstnameTextfield.setBackground(new java.awt.Color(65, 65, 67));
        firstnameTextfield.setForeground(new java.awt.Color(255, 255, 255));
        firstnameTextfield.setText("NA");
        firstnameTextfield.setBorder(null);
        firstnameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTextfieldActionPerformed(evt);
            }
        });
        infoPanel.add(firstnameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 220, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name");
        infoPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 50, 20));

        lastnameTextfield.setBackground(new java.awt.Color(65, 65, 67));
        lastnameTextfield.setForeground(new java.awt.Color(255, 255, 255));
        lastnameTextfield.setText("NA");
        lastnameTextfield.setBorder(null);
        lastnameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameTextfieldActionPerformed(evt);
            }
        });
        infoPanel.add(lastnameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 250, -1));

        sidePanel.setBackground(new java.awt.Color(0, 102, 204));

        jButton1.setBackground(new java.awt.Color(0, 64, 81));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HospitalSystems/Back_48px.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        regPatient_Label.setBackground(new java.awt.Color(255, 255, 255));
        regPatient_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        regPatient_Label.setText("Register Patient");
        regPatient_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regPatient_LabelActionPerformed(evt);
            }
        });

        outdoorPatient_Label.setBackground(new java.awt.Color(255, 255, 255));
        outdoorPatient_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        outdoorPatient_Label.setText("Outdoor Patients");
        outdoorPatient_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outdoorPatient_LabelActionPerformed(evt);
            }
        });

        indoorPatient_Label.setBackground(new java.awt.Color(255, 255, 255));
        indoorPatient_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        indoorPatient_Label.setText("Indoor Patients");

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(regPatient_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outdoorPatient_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(indoorPatient_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(regPatient_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(outdoorPatient_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(indoorPatient_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        infoPanel.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 500));
        infoPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 220, 10));
        infoPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 250, 10));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Birthdate");
        infoPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 60, 20));

        patientbirthdateTextfield.setBackground(new java.awt.Color(65, 65, 67));
        patientbirthdateTextfield.setForeground(new java.awt.Color(255, 255, 255));
        patientbirthdateTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        patientbirthdateTextfield.setBorder(null);
        patientbirthdateTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientbirthdateTextfieldActionPerformed(evt);
            }
        });
        infoPanel.add(patientbirthdateTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 100, 20));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Age");
        infoPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 30, 20));

        ageTextfield.setBackground(new java.awt.Color(65, 65, 67));
        ageTextfield.setForeground(new java.awt.Color(255, 255, 255));
        ageTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ageTextfield.setBorder(null);
        ageTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextfieldActionPerformed(evt);
            }
        });
        infoPanel.add(ageTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 50, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Consulting Doctor");
        infoPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 150, 20));

        departmentCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General Physiology", "cardiology", "Urology" }));
        departmentCombobox.setToolTipText("Select Department");
        departmentCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentComboboxActionPerformed(evt);
            }
        });
        infoPanel.add(departmentCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 170, -1));

        doctorsCombobox.setToolTipText("Select Doctor");
        doctorsCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorsComboboxActionPerformed(evt);
            }
        });
        infoPanel.add(doctorsCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 170, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Height");
        infoPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 40, 20));

        heightTextfield.setBackground(new java.awt.Color(65, 65, 67));
        heightTextfield.setForeground(new java.awt.Color(255, 255, 255));
        heightTextfield.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        heightTextfield.setBorder(null);
        infoPanel.add(heightTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 50, -1));

        weightTextfield.setBackground(new java.awt.Color(65, 65, 67));
        weightTextfield.setForeground(new java.awt.Color(255, 255, 255));
        weightTextfield.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        weightTextfield.setBorder(null);
        weightTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTextfieldActionPerformed(evt);
            }
        });
        infoPanel.add(weightTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 60, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Weight");
        infoPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 40, 20));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sex");
        infoPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, 20));
        infoPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 100, 10));
        infoPanel.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 50, 10));
        infoPanel.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 50, 10));
        infoPanel.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 60, 10));

        sexdetCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        sexdetCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexdetComboboxActionPerformed(evt);
            }
        });
        infoPanel.add(sexdetCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("meter");
        infoPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("KGs");
        infoPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, -1, 20));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Email");
        infoPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 50, 20));

        emailTextfield.setBackground(new java.awt.Color(65, 65, 67));
        emailTextfield.setForeground(new java.awt.Color(255, 255, 255));
        emailTextfield.setBorder(null);
        infoPanel.add(emailTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 250, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Contact No.");
        infoPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        contactTextfield.setBackground(new java.awt.Color(65, 65, 67));
        contactTextfield.setForeground(new java.awt.Color(255, 255, 255));
        contactTextfield.setText("NA");
        contactTextfield.setBorder(null);
        contactTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTextfieldActionPerformed(evt);
            }
        });
        infoPanel.add(contactTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 200, -1));
        infoPanel.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 250, 20));
        infoPanel.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 200, 20));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Address");
        infoPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        addressfield.setBackground(new java.awt.Color(204, 204, 204));
        addressfield.setColumns(20);
        addressfield.setRows(5);
        jScrollPane1.setViewportView(addressfield);

        infoPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 540, 110));

        saveInfoButton.setBackground(new java.awt.Color(116, 249, 0));
        saveInfoButton.setText("SaveInfo");
        saveInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInfoButtonActionPerformed(evt);
            }
        });
        infoPanel.add(saveInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, 80, -1));

        inoutGroup.add(indoorRadioButton);
        indoorRadioButton.setText("Indoor");
        indoorRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indoorRadioButtonActionPerformed(evt);
            }
        });
        infoPanel.add(indoorRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 70, -1));

        inoutGroup.add(outdoorRadioButton);
        outdoorRadioButton.setText("Outdoor");
        outdoorRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outdoorRadioButtonActionPerformed(evt);
            }
        });
        infoPanel.add(outdoorRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 70, -1));

        getContentPane().add(infoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regTextfieldActionPerformed

    private void patientIDTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIDTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIDTextfieldActionPerformed

    private void firstnameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTextfieldActionPerformed

    private void lastnameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameTextfieldActionPerformed

    private void patientbirthdateTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientbirthdateTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientbirthdateTextfieldActionPerformed

    private void ageTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextfieldActionPerformed

    private void weightTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightTextfieldActionPerformed

    private void contactTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactTextfieldActionPerformed

    private void saveInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInfoButtonActionPerformed
       String upper_letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String lower_leters = upper_letters.toLowerCase();
       String numbers = "1234567890";
       Random rand = new Random();
       String password = Integer.toString(rand.nextInt(999999));
       
      //String patient_pass = upper_letters.indexOf(rand.nextInt(10));
      
       patientID = patientIDTextfield.getText();
       
       filename = "Management_files/PatientList" + "/" +  patientID;
        try{
              
            PrintStream patientWriter;
            /*Taking Input of the form in a LinkedList*/
            patientInfo.add(patientType);
            patientInfo.add(regTextfield.getText());
            patientInfo.add(patientID);
            patientInfo.add(doctorsCombobox.getSelectedItem());
            patientInfo.add(firstnameTextfield.getText());
            patientInfo.add(lastnameTextfield.getText());
            patientInfo.add(patientbirthdateTextfield.getText());
            patientInfo.add(ageTextfield.getText());
            patientInfo.add(heightTextfield.getText());
            patientInfo.add(weightTextfield.getText());
            patientInfo.add(sexdetCombobox.getSelectedItem());
            patientInfo.add(emailTextfield.getText());
            patientInfo.add(contactTextfield.getText());
            patientInfo.add(addressfield.getText());
            //end of taking input
            
            if(firstnameTextfield.getText().equals("NA") || lastnameTextfield.getText().equals("NA") || contactTextfield.getText().equals("NA")){
                   JOptionPane.showMessageDialog(null, "Unable to save file....Name/Contact cannot be empty");               
                
            }
            else{
                patientWriter = new PrintStream(new File(filename + ".txt"));
                BufferedWriter id_writer = new BufferedWriter(new FileWriter(id_filename, true));
                
                
                
                id_writer.append(patientID + " " + password);
                id_writer.newLine();
                id_writer.close();
                
                
                for(int i = 0; i < patientInfo.size(); i++){
                        //System.out.println((String) patientInfo.get(i));
                        patientWriter.println((String) patientInfo.get(i));
                        //patientWriter.append("\n");
                    }


                    JOptionPane.showMessageDialog(null, "Your Password is: " + password);
                    JOptionPane.showMessageDialog(null, "Successfully Saved");
                    patientWriter.close();
            }
            
        }catch(Exception e){
            System.out.println("Could not be Saved");
            JOptionPane.showMessageDialog(null, "Unable To Save...Fatal Error!!!!");
        }
       
    }//GEN-LAST:event_saveInfoButtonActionPerformed

    private void departmentComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentComboboxActionPerformed
        // TODO add your handling code here:
        int index = departmentCombobox.getSelectedIndex();
        if(index == 0){
            doctorsCombobox.removeAllItems();
            this.doctors_name = "Medicine.txt";
            try{
                BufferedReader br = new BufferedReader(new FileReader(file_doctors));

                String temp = br.readLine();

                while(temp != null){
                    doctorsCombobox.addItem(temp);
                    temp = br.readLine();
                }
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Daktar Pailam na re :( ");
            }
        }
    }//GEN-LAST:event_departmentComboboxActionPerformed

    private void doctorsComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorsComboboxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_doctorsComboboxActionPerformed

    private void indoorRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indoorRadioButtonActionPerformed
        if(indoorRadioButton.isSelected()){
            patientType = "Indoor Patient";
        }
    }//GEN-LAST:event_indoorRadioButtonActionPerformed

    private void outdoorRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outdoorRadioButtonActionPerformed
        if(outdoorRadioButton.isSelected()){
            patientType = "Outdoor Patient";
        }
    }//GEN-LAST:event_outdoorRadioButtonActionPerformed

    private void sexdetComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexdetComboboxActionPerformed
        if(sexdetCombobox.getSelectedIndex() == 0){
            
        }
    }//GEN-LAST:event_sexdetComboboxActionPerformed

    private void regPatient_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regPatient_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regPatient_LabelActionPerformed

    private void outdoorPatient_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outdoorPatient_LabelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
                Outdoor_Patient outPatient = new Outdoor_Patient();
        outPatient.setVisible(true);
        
    }//GEN-LAST:event_outdoorPatient_LabelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new LogIn_Page().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    //SelfMade Private Variables Scope Declaration
    private String filename = "Management_files/PatientList";
    private String id_filename = "Management_files/ID_list/idpasslist_Patient.txt";
    private File fileObj = new File(filename);
    private String patientID;
    private LinkedList patientInfo = new LinkedList();
    private String doctors_name;
    private File file_doctors = new File("Management_files/Doctor's/Medicine.txt");
    private String patientType;
    private String Sex;
    
    //End of Declaration
    
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
            java.util.logging.Logger.getLogger(RegPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addingPatientNameLabel;
    private javax.swing.JTextArea addressfield;
    private javax.swing.JTextField ageTextfield;
    private javax.swing.JTextField contactTextfield;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateTextfield;
    private javax.swing.JComboBox<String> departmentCombobox;
    private javax.swing.JComboBox<String> doctorsCombobox;
    private javax.swing.JTextField emailTextfield;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JTextField firstnameTextfield;
    private javax.swing.JTextField heightTextfield;
    private javax.swing.JButton indoorPatient_Label;
    private javax.swing.JRadioButton indoorRadioButton;
    private javax.swing.JPanel infoPanel;
    private javax.swing.ButtonGroup inoutGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField lastnameTextfield;
    private javax.swing.JSeparator menutomainSeparator;
    private javax.swing.JButton outdoorPatient_Label;
    private javax.swing.JRadioButton outdoorRadioButton;
    private javax.swing.JTextField patientIDTextfield;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JTextField patientbirthdateTextfield;
    private javax.swing.JLabel patientinfoLabel;
    private javax.swing.JLabel regLabel;
    private javax.swing.JButton regPatient_Label;
    private javax.swing.JTextField regTextfield;
    private javax.swing.JButton saveInfoButton;
    private javax.swing.JComboBox<String> sexdetCombobox;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTextField weightTextfield;
    // End of variables declaration//GEN-END:variables

}

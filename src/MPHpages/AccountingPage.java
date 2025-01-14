package MPHpages;

import javax.swing.JOptionPane;

public class AccountingPage extends javax.swing.JFrame {
   
    
    public AccountingPage(String firstName, String lastName) {
        initComponents();
   
        String fullName = firstName + " " + lastName;
        employeepageheaderLBL.setText("Welcome, " + fullName + "!");
        employeepagenameLBL.setText(fullName);
    }
    
    public AccountingPage() {
        initComponents(); // Call the initComponents method to initialize components
        // This will center the window after the components have been initialized and packed
        setLocationRelativeTo(null);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emppagemainPNL = new javax.swing.JPanel();
        emppagemenuPNL = new javax.swing.JPanel();
        logoutemppgPB = new javax.swing.JButton();
        iconprofileepLBL = new javax.swing.JLabel();
        employeepagenameLBL = new javax.swing.JLabel();
        emppageheaderPNL = new javax.swing.JPanel();
        emppagelogoLBL = new javax.swing.JLabel();
        employeepageheaderLBL = new javax.swing.JLabel();
        specialaccessPNL = new javax.swing.JPanel();
        userrolesaccessPNL = new javax.swing.JLabel();
        hrmanagerpagePB = new javax.swing.JButton();
        accountingpagePB = new javax.swing.JButton();
        personaldetPB = new javax.swing.JButton();
        attendanceemppgPB = new javax.swing.JButton();
        payrollemppgPB = new javax.swing.JButton();
        requestleaveemppgPB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        emppagemainPNL.setBackground(new java.awt.Color(204, 204, 204));
        emppagemainPNL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        emppagemainPNL.setLayout(null);

        emppagemenuPNL.setBackground(new java.awt.Color(102, 102, 102));
        emppagemenuPNL.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        emppagemenuPNL.setForeground(new java.awt.Color(51, 51, 55));

        logoutemppgPB.setBackground(new java.awt.Color(255, 51, 51));
        logoutemppgPB.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        logoutemppgPB.setText("Log out");
        logoutemppgPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutemppgPBActionPerformed(evt);
            }
        });

        iconprofileepLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/USER 128 X 128.png"))); // NOI18N

        employeepagenameLBL.setBackground(new java.awt.Color(204, 204, 204));
        employeepagenameLBL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        employeepagenameLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        employeepagenameLBL.setText("Employee user");
        employeepagenameLBL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout emppagemenuPNLLayout = new javax.swing.GroupLayout(emppagemenuPNL);
        emppagemenuPNL.setLayout(emppagemenuPNLLayout);
        emppagemenuPNLLayout.setHorizontalGroup(
            emppagemenuPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emppagemenuPNLLayout.createSequentialGroup()
                .addGroup(emppagemenuPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emppagemenuPNLLayout.createSequentialGroup()
                        .addGroup(emppagemenuPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(emppagemenuPNLLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(iconprofileepLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(emppagemenuPNLLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(logoutemppgPB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(emppagemenuPNLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(employeepagenameLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        emppagemenuPNLLayout.setVerticalGroup(
            emppagemenuPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emppagemenuPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconprofileepLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeepagenameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutemppgPB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        employeepagenameLBL.getAccessibleContext().setAccessibleName("");

        emppagemainPNL.add(emppagemenuPNL);
        emppagemenuPNL.setBounds(0, 0, 200, 280);

        emppageheaderPNL.setBackground(new java.awt.Color(102, 102, 102));
        emppageheaderPNL.setForeground(new java.awt.Color(51, 51, 55));

        emppagelogoLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/MPH LOGO 90 X 50.png"))); // NOI18N

        employeepageheaderLBL.setBackground(new java.awt.Color(204, 204, 204));
        employeepageheaderLBL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        employeepageheaderLBL.setText(" ");
        employeepageheaderLBL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout emppageheaderPNLLayout = new javax.swing.GroupLayout(emppageheaderPNL);
        emppageheaderPNL.setLayout(emppageheaderPNLLayout);
        emppageheaderPNLLayout.setHorizontalGroup(
            emppageheaderPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emppageheaderPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(employeepageheaderLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(emppagelogoLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        emppageheaderPNLLayout.setVerticalGroup(
            emppageheaderPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emppageheaderPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(emppageheaderPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(employeepageheaderLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(emppageheaderPNLLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(emppagelogoLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        emppagemainPNL.add(emppageheaderPNL);
        emppageheaderPNL.setBounds(200, 0, 730, 60);

        specialaccessPNL.setBackground(new java.awt.Color(102, 102, 102));
        specialaccessPNL.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        specialaccessPNL.setForeground(new java.awt.Color(102, 102, 102));

        userrolesaccessPNL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userrolesaccessPNL.setForeground(new java.awt.Color(204, 204, 204));
        userrolesaccessPNL.setText("ADMIN ACCESS");

        hrmanagerpagePB.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        hrmanagerpagePB.setText("HR/MANAGER");
        hrmanagerpagePB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrmanagerpagePBActionPerformed(evt);
            }
        });

        accountingpagePB.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        accountingpagePB.setText("ACCOUNTING");
        accountingpagePB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountingpagePBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout specialaccessPNLLayout = new javax.swing.GroupLayout(specialaccessPNL);
        specialaccessPNL.setLayout(specialaccessPNLLayout);
        specialaccessPNLLayout.setHorizontalGroup(
            specialaccessPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, specialaccessPNLLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(specialaccessPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountingpagePB, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hrmanagerpagePB, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userrolesaccessPNL, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        specialaccessPNLLayout.setVerticalGroup(
            specialaccessPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(specialaccessPNLLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(userrolesaccessPNL)
                .addGap(27, 27, 27)
                .addComponent(hrmanagerpagePB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(accountingpagePB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        emppagemainPNL.add(specialaccessPNL);
        specialaccessPNL.setBounds(0, 280, 200, 230);

        personaldetPB.setBackground(new java.awt.Color(255, 51, 51));
        personaldetPB.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        personaldetPB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/DETAILS 64 X 64.png"))); // NOI18N
        personaldetPB.setText("Employee Details");
        personaldetPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personaldetPBActionPerformed(evt);
            }
        });
        emppagemainPNL.add(personaldetPB);
        personaldetPB.setBounds(280, 100, 220, 130);

        attendanceemppgPB.setBackground(new java.awt.Color(255, 51, 51));
        attendanceemppgPB.setFont(new java.awt.Font("Helvetica", 1, 10)); // NOI18N
        attendanceemppgPB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ATTENDANCE 64 X 64.png"))); // NOI18N
        attendanceemppgPB.setText("Attendance Details");
        emppagemainPNL.add(attendanceemppgPB);
        attendanceemppgPB.setBounds(580, 100, 200, 130);

        payrollemppgPB.setBackground(new java.awt.Color(255, 51, 51));
        payrollemppgPB.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        payrollemppgPB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/REQUEST LEAVE 64 X 64.png"))); // NOI18N
        payrollemppgPB.setText("Salary Information");
        payrollemppgPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payrollemppgPBActionPerformed(evt);
            }
        });
        emppagemainPNL.add(payrollemppgPB);
        payrollemppgPB.setBounds(280, 280, 220, 130);

        requestleaveemppgPB.setBackground(new java.awt.Color(255, 51, 51));
        requestleaveemppgPB.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        requestleaveemppgPB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/PAYROLL 64 X 64.png"))); // NOI18N
        requestleaveemppgPB.setText("Payslip Information");
        requestleaveemppgPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestleaveemppgPBActionPerformed(evt);
            }
        });
        emppagemainPNL.add(requestleaveemppgPB);
        requestleaveemppgPB.setBounds(580, 280, 210, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(emppagemainPNL, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(emppagemainPNL, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutemppgPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutemppgPBActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Confirm Logout", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            // Close EmployeePage
            this.dispose();
            // Open LoginPage
            ALoginPage loginPage = new ALoginPage();
            loginPage.setVisible(true);
        }
  
    }//GEN-LAST:event_logoutemppgPBActionPerformed

    private void hrmanagerpagePBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrmanagerpagePBActionPerformed
        // create an instance of adminwindow
        AdminWindow adminWindow = new AdminWindow();
        adminWindow.setLocationRelativeTo(null); //Center the AdminWindow
        // Set the AdminWindow to be visible
        adminWindow.setVisible(true);
    }//GEN-LAST:event_hrmanagerpagePBActionPerformed

    private void accountingpagePBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountingpagePBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountingpagePBActionPerformed

    private void personaldetPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personaldetPBActionPerformed
        // Displays Emp details with basic salary information
       
    }//GEN-LAST:event_personaldetPBActionPerformed

    private void payrollemppgPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payrollemppgPBActionPerformed
   // Opens employee details page with basic pay information
        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.setLocationRelativeTo(null); // Center the AboutPage
        employeeDetails.setVisible(true);
        this.dispose(); // Close the current EmployeePage        
    }//GEN-LAST:event_payrollemppgPBActionPerformed

    private void requestleaveemppgPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestleaveemppgPBActionPerformed
        // opens payslip information for all employees
        PayInfo payInfo = new PayInfo();
        payInfo.setLocationRelativeTo(null);
        payInfo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_requestleaveemppgPBActionPerformed

    /**
     * @param args the command line arguments
     */
   

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountingpagePB;
    private javax.swing.JButton attendanceemppgPB;
    private javax.swing.JLabel employeepageheaderLBL;
    private javax.swing.JLabel employeepagenameLBL;
    private javax.swing.JPanel emppageheaderPNL;
    private javax.swing.JLabel emppagelogoLBL;
    private javax.swing.JPanel emppagemainPNL;
    private javax.swing.JPanel emppagemenuPNL;
    private javax.swing.JButton hrmanagerpagePB;
    private javax.swing.JLabel iconprofileepLBL;
    private javax.swing.JButton logoutemppgPB;
    private javax.swing.JButton payrollemppgPB;
    private javax.swing.JButton personaldetPB;
    private javax.swing.JButton requestleaveemppgPB;
    private javax.swing.JPanel specialaccessPNL;
    private javax.swing.JLabel userrolesaccessPNL;
    // End of variables declaration//GEN-END:variables
}

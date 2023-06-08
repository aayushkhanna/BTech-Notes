
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class ViewEmployee extends javax.swing.JInternalFrame {

   
    String username;

    public ViewEmployee(String username) {
        initComponents();
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
        setClosable(true);
        this.username = username;
        setData();

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        empid = new javax.swing.JLabel();
        txteid = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        gender = new javax.swing.JLabel();
        rbmale = new javax.swing.JRadioButton();
        rbfemale = new javax.swing.JRadioButton();
        salary = new javax.swing.JLabel();
        txtsal = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadd = new javax.swing.JTextArea();
        designation = new javax.swing.JLabel();
        idesignation = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txthire = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rbsingle = new javax.swing.JRadioButton();
        rbmarried = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtdob = new javax.swing.JTextField();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        empid.setText("EmpId");
        getContentPane().add(empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 20));

        txteid.setEditable(false);
        getContentPane().add(txteid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 110, -1));

        name.setText("Name");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, 20));

        txtname.setEditable(false);
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 110, -1));

        gender.setText("Gender");
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        buttonGroup1.add(rbmale);
        rbmale.setText("Male");
        getContentPane().add(rbmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        buttonGroup1.add(rbfemale);
        rbfemale.setText("Female");
        getContentPane().add(rbfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        salary.setText("Salary");
        getContentPane().add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, 20));

        txtsal.setEditable(false);
        getContentPane().add(txtsal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 110, -1));

        address.setText("Address");
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        txtadd.setEditable(false);
        txtadd.setColumns(20);
        txtadd.setRows(5);
        jScrollPane1.setViewportView(txtadd);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 210, 90));

        designation.setText("Designation");
        getContentPane().add(designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        idesignation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Project Manager", "Team Leader", "Team Member" }));
        getContentPane().add(idesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 150, -1));

        jLabel1.setText("Hire Date");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        txthire.setEditable(false);
        getContentPane().add(txthire, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 110, -1));

        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        txtemail.setEditable(false);
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 210, -1));

        jLabel3.setText("Contact No.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        txtcontact.setEditable(false);
        getContentPane().add(txtcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 150, -1));

        jLabel4.setText("Marital Status");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        buttonGroup2.add(rbsingle);
        rbsingle.setText("Single");
        getContentPane().add(rbsingle, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, -1, -1));

        buttonGroup2.add(rbmarried);
        rbmarried.setText("Married");
        rbmarried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmarriedActionPerformed(evt);
            }
        });
        getContentPane().add(rbmarried, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, -1, -1));

        jLabel5.setText("Date of Birth");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        txtdob.setEditable(false);
        txtdob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdobActionPerformed(evt);
            }
        });
        getContentPane().add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtMarksActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void rbmarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmarriedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbmarriedActionPerformed

    private void txtdobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdobActionPerformed

    void setData() {

        try {

            Class.forName("oracle.jdbc.OracleDriver");
            String str = "jdbc:oracle:thin:@localhost:1521:";
            Connection x = DriverManager.getConnection(str, "project", "12345");
            String q = "select * from employee where username=?";
            PreparedStatement y = x.prepareStatement(q);
            y.setString(1, username);
            ResultSet rs = y.executeQuery();

            String eid, name, gender, sal, address, email, designation, dob, contact, marital, hiredate;
            while (rs.next()) {
                eid = rs.getString("EmpId");
                name = rs.getString("Name");
                gender = rs.getString("Gender");
                sal = rs.getString("Salary");
                hiredate = rs.getString("Hire_Date");
                address = rs.getString("Address");
                email = rs.getString("Email");
                designation = rs.getString("Designation");
                dob = rs.getString("Date_of_Birth");
                contact = rs.getString("Contact");
                marital = rs.getString("Marital_Status");

                txteid.setText(eid);
                txtname.setText(name);
                txtcontact.setText(contact);
                txtsal.setText(sal);

                txthire.setText(hiredate);
                txtadd.setText(address);
                txtemail.setText(email);
                if (marital.equalsIgnoreCase("single")) {
                    rbsingle.setSelected(true);  
                    rbmarried.setEnabled(false);
                } else {
                    rbmarried.setSelected(true);
                    rbsingle.setEnabled(false);
                }

                if (gender.equalsIgnoreCase("male")) {
                    rbmale.setSelected(true);
                    rbfemale.setEnabled(false);
                } else {
                    rbfemale.setSelected(true);
                    rbmale.setEnabled(false);
                }
                txtdob.setText(dob);
                idesignation.setSelectedItem(designation);

            }
            y.close();
            x.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());
            ex.printStackTrace();
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel designation;
    private javax.swing.JLabel empid;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox idesignation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private javax.swing.JRadioButton rbmarried;
    private javax.swing.JRadioButton rbsingle;
    private javax.swing.JLabel salary;
    private javax.swing.JTextArea txtadd;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txteid;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthire;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsal;
    // End of variables declaration//GEN-END:variables
}

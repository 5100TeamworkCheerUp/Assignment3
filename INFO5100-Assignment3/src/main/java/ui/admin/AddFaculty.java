/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin;

import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import ui.MainJframe;

/**
 *
 * @author HYR
 */
public class AddFaculty extends javax.swing.JPanel {

    /**
     * Creates new form AddFaculty
     */
    private MainJframe main;
    Department department;
    FacultyProfile facultyProfile;
    ManageFaculty manage;

    public AddFaculty(MainJframe m,ManageFaculty manage,Department department) {
        initComponents();
        main = m ;
        this.manage = manage;
        this.department = department;

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblFaculty = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        lblName1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblName.setText("Age:");

        btnSave.setBackground(new java.awt.Color(0, 153, 102));
        btnSave.setText("save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtTitle.setText("Create New Faculty Profile");

        btnBack.setBackground(new java.awt.Color(255, 0, 0));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblFaculty.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblFaculty.setText("Faculty Name:");

        lblName1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblName1.setText("Date of Birth:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBack)
                        .addGap(129, 129, 129)
                        .addComponent(txtTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFaculty)
                            .addComponent(lblName)
                            .addComponent(lblName1))))
                .addContainerGap(257, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(txtTitle))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(txtName.getText()!=null && txtAge.getText()!=null && txtDOB.getText()!=null){
            Person person = new Person(txtName.getText(), Integer.parseInt(txtAge.getText()), txtDOB.getText());
            department.getPersonDirectory().newPerson(person);
            department.getFacultyDirectory().newFaculty(person);
            JOptionPane.showMessageDialog(this, "This Faculty Saved."); 
        }else{
            JOptionPane.showMessageDialog(this, "Please enter all information."); 
        }
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblFaculty;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables

    private void backAction() {
        main.getCardLayout().previous(main.getCards());
        manage.refreshTable();
        main.getCards().remove(manage.af);
    }
}

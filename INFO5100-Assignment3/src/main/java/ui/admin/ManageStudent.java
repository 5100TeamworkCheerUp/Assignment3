/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin;

import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.StudentProfile;
import javax.swing.table.DefaultTableModel;
import ui.MainJframe;

/**
 *
 * @author HYR
 */
public class ManageStudent extends javax.swing.JPanel {

    /**
     * Creates new form ManageStudent
     */
    MainJframe main;
    Department department;
    AdminWorkAreaJpanel admin;
    AddStudent addStudent;
    public ManageStudent(MainJframe m, Department department, AdminWorkAreaJpanel admin) {
        initComponents();
        main = m;
        this.department = department;
        this.admin = admin;
        refreshTable();
        
    }
    
    public void refreshTable() {

        DefaultTableModel model = (DefaultTableModel) tblStudentDirectory.getModel();
        model.setRowCount(0);
        for (StudentProfile sp : department.getstudentDirectory().getStudentlist()) {
            
            Object row[] = new Object[3];
            row[0] = sp;
            row[1] = sp.getPerson().getName();
            row[2] = sp.getPerson().getDob();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manage = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentDirectory = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        lblStudent = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        manage.setBackground(new java.awt.Color(204, 204, 255));

        tblStudentDirectory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblStudentDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Date of Birth"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudentDirectory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentDirectoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudentDirectory);

        btnCreate.setBackground(new java.awt.Color(0, 153, 102));
        btnCreate.setText("New Student");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblStudent.setText("Student name:");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("Manage Student Directory");

        btnBack.setBackground(new java.awt.Color(204, 51, 0));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageLayout = new javax.swing.GroupLayout(manage);
        manage.setLayout(manageLayout);
        manageLayout.setHorizontalGroup(
            manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageLayout.createSequentialGroup()
                .addGroup(manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(manageLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageLayout.createSequentialGroup()
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(266, 266, 266))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        manageLayout.setVerticalGroup(
            manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(lblStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 1, Short.MAX_VALUE)
                    .addComponent(manage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(manage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblStudentDirectoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentDirectoryMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblStudentDirectory.getSelectedRow();
        StudentProfile sp = (StudentProfile) tblStudentDirectory.getValueAt(selectedRowIndex, 0);
        lblStudent.setText("Student : " + sp.getPerson().getName());
    }//GEN-LAST:event_tblStudentDirectoryMouseClicked

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        addStudent = new AddStudent(main,this,department);
        main.getCards().add(addStudent);
        main.getCardLayout().next(main.getCards());
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStudent;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel manage;
    private javax.swing.JTable tblStudentDirectory;
    // End of variables declaration//GEN-END:variables

    private void backAction() {
        admin.populateCmbStudent();
        main.getCardLayout().previous(main.getCards());
        main.getCards().remove(admin.msjp);
    }
}
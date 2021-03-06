




import Bean.DatabaseManager;
import javax.swing.*;
import Bean.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isra Khan
 */
public class FacultyFrame extends javax.swing.JFrame {
    

    /**
     * Creates new form FacultyFrame
     */
    
    public FacultyFrame() {
        initComponents();

        java.awt.Toolkit kit=this.getToolkit();
        java.awt.Dimension d=kit.getScreenSize();
        this.setBounds(0,0,d.width,d.height);
        FacultyIdTextField.setEditable(false);
     
        
    
           getFaculty();
     
    }
    
    private void getFaculty(){
        try{
            java.util.Vector v=DatabaseManager.getFaculty();
            FacultiesList.setListData(v);
            
        }//try
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Error:"+e.getMessage());
        }
    
    }
    
     private void clear(){
 
     FacultyIdTextField.setText("");
     FacultyNameTextField.setText("");
     RemarksTextArea.setText("");
 
 }
     
     private void addFaculty(){
         String facName=FacultyNameTextField.getText();
         String remarks=RemarksTextArea.getText();
         try{
         int rows=DatabaseManager.addFaculty(facName,remarks);
         if(rows>=1){
         getFaculty();
            clear();
            JOptionPane.showMessageDialog(this,rows+"Records Saved");
           
         }//if
         }catch(Exception e){
             e.printStackTrace();
                JOptionPane.showMessageDialog(this,"Error:"+e.getMessage());
                
         
         }//catch
     }//method
         
         
           private void deleteFaculty(){
   
       FacultyBean bean=(FacultyBean) FacultiesList.getSelectedValue();
       if(bean==null)return;
        try{
            int rows=DatabaseManager.deletefaculty(bean.getFacId());
                if(rows>=1){
                getFaculty();
                    clear();
                        JOptionPane.showMessageDialog(this,rows+"Records Deleted");
                }
                
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this,e.getMessage());
                
                }
            
        }//deleteFaculty
   
   
           private void updateFaculty(){
           
                   
     
   
       FacultyBean bean=(FacultyBean) FacultiesList.getSelectedValue();
       if(bean==null)return;
       
        String facName=FacultyNameTextField.getText();
        String remarks=RemarksTextArea.getText();
        try{
            int rows=DatabaseManager.updateFaculty(bean.getFacId(),facName,remarks);
                if(rows>=1){
                getFaculty();
                    clear();
                        JOptionPane.showMessageDialog(this,rows+"Records updated");
                }
                
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this,e.getMessage());
                
                }
            
        }//deleteFaculty
           
           
           
           
           
           
         
     
     
    
    
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FacultyIdLabel = new javax.swing.JLabel();
        FacultyIdTextField = new javax.swing.JTextField();
        FacultyStdLabel = new javax.swing.JLabel();
        FacultyNameTextField = new javax.swing.JTextField();
        FacultiesLabel = new javax.swing.JLabel();
        FacultyLabel = new javax.swing.JLabel();
        RemarksLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RemarksTextArea = new javax.swing.JTextArea();
        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        FacultiesList = new javax.swing.JList();

        getContentPane().setLayout(null);

        FacultyIdLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FacultyIdLabel.setText("Faculty ID");
        getContentPane().add(FacultyIdLabel);
        FacultyIdLabel.setBounds(30, 70, 112, 47);

        FacultyIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacultyIdTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(FacultyIdTextField);
        FacultyIdTextField.setBounds(130, 70, 110, 40);

        FacultyStdLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FacultyStdLabel.setText("Faculty Name");
        getContentPane().add(FacultyStdLabel);
        FacultyStdLabel.setBounds(10, 130, 130, 41);

        FacultyNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacultyNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(FacultyNameTextField);
        FacultyNameTextField.setBounds(130, 130, 320, 40);

        FacultiesLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FacultiesLabel.setText("Faculties");
        getContentPane().add(FacultiesLabel);
        FacultiesLabel.setBounds(470, 40, 67, 22);

        FacultyLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FacultyLabel.setText("Faculty");
        getContentPane().add(FacultyLabel);
        FacultyLabel.setBounds(170, 10, 130, 40);

        RemarksLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RemarksLabel.setText("Remarks");
        getContentPane().add(RemarksLabel);
        RemarksLabel.setBounds(120, 180, 67, 22);

        RemarksTextArea.setColumns(20);
        RemarksTextArea.setRows(5);
        jScrollPane2.setViewportView(RemarksTextArea);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(120, 210, 330, 96);

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton);
        AddButton.setBounds(120, 320, 60, 30);

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton);
        DeleteButton.setBounds(190, 320, 70, 30);

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateButton);
        UpdateButton.setBounds(280, 320, 80, 30);

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton);
        ClearButton.setBounds(380, 320, 70, 30);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(470, 320, 110, 30);

        FacultiesList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        FacultiesList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                FacultiesListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(FacultiesList);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(470, 70, 110, 240);
    }// </editor-fold>//GEN-END:initComponents

    private void FacultyNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacultyNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FacultyNameTextFieldActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
      updateFaculty();
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        clear();
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
      hide();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void FacultiesListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_FacultiesListValueChanged
        FacultyBean bean=(FacultyBean)FacultiesList.getSelectedValue();
    
    if(bean==null) return;
        FacultyIdTextField.setText(""+bean.getFacId());
        FacultyNameTextField.setText(bean.getFacName());
        RemarksTextArea.setText(bean.getRemarks());
    
    }//GEN-LAST:event_FacultiesListValueChanged

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        addFaculty();
    }//GEN-LAST:event_AddButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        deleteFaculty();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void FacultyIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacultyIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FacultyIdTextFieldActionPerformed
       public static void main(String args[]) {
                new FacultyFrame().setVisible(true);
         }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel FacultiesLabel;
    private javax.swing.JList FacultiesList;
    private javax.swing.JLabel FacultyIdLabel;
    private javax.swing.JTextField FacultyIdTextField;
    private javax.swing.JLabel FacultyLabel;
    private javax.swing.JTextField FacultyNameTextField;
    private javax.swing.JLabel FacultyStdLabel;
    private javax.swing.JLabel RemarksLabel;
    private javax.swing.JTextArea RemarksTextArea;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}

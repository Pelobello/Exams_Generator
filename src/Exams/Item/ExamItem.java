
package Exams.Item;

import Exams.Controller.PopulateExamResult;
import Exams.Model.ModelData;
import Exams.PanelPopup.PopupData;
import java.awt.Cursor;
import raven.glasspanepopup.GlassPanePopup;



public class ExamItem extends javax.swing.JPanel {
  private PopulateExamResult per;
    public void setData(ModelData data) {
        this.data = data;
        titleData.setText(data.getTitle());
       
    }

  private PopupData pd;
    public ExamItem() {
        initComponents();
         setCursor(new Cursor(Cursor.HAND_CURSOR));
         per = new PopulateExamResult();
         pd = new PopupData();
    }
    

 private ModelData data;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleData = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        titleData.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        titleData.setForeground(new java.awt.Color(102, 102, 102));
        titleData.setText("Test");
        titleData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleData, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titleData, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void titleDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleDataActionPerformed
per.populateData(titleData.getText(), pd.resultTable);
  GlassPanePopup.showPopup(pd);
    }//GEN-LAST:event_titleDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton titleData;
    // End of variables declaration//GEN-END:variables
}

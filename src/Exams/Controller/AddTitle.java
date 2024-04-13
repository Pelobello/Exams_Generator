/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exams.Controller;

import Exams.Database.DatabaseConnection;
import Exams.Forms.MainForm;
import Exams.Model.ModelData;
import Exams.Model.ModelTitle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class AddTitle {
    private PreparedStatement p;
    private ResultSet rs;
    private MainForm mainForm;
    
    public AddTitle(MainForm mainForm) {
        this.mainForm = mainForm;
         
    }
    public void addData(ModelTitle data){
        try {
             DatabaseConnection connection = new DatabaseConnection();
            Connection con = connection.getCConnection();
           String sql = "insert into title(Title)values(?)";
           p = con.prepareStatement(sql);
           p.setString(1, data.getTitle());
           p.execute();
            JOptionPane.showMessageDialog(null, "Succes");
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

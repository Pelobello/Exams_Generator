
package Exams.Controller;
import Exams.Database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class PopulateExamResult {
 private PreparedStatement p;
    private ResultSet rs;
    
    
    public PopulateExamResult() {
    }
    
    public void populateData(String sqlQueries,JTable table){
        try {
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setRowCount(0);
             DatabaseConnection connection = new DatabaseConnection();
            Connection con = connection.getCConnection();
            String sql = "SELECT * FROM exam_result WHERE ExamTitle = ?";
            
            p = con.prepareStatement(sql);
            p.setString(1, sqlQueries);
            
            rs = p.executeQuery();
            
            while (rs.next()) {                
                Vector <Object> v = new Vector<>();
                for (int i = 0; i < 30; i++) {
                    v.add(rs.getInt("id"));
                    v.add(rs.getString("ExamTitle"));
                     v.add(rs.getString("FullName"));
                    
                }
                model.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


package arabakiralamaotomasyonu;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author EKREM
 */
public class DbHelper {
    private String userName="root";
    private String password="123456";
    private String dbUrl="jdbc:mysql://localhost:3307/arabakiralama";
    
   
    
  public Connection getConnection() throws SQLException{
    return DriverManager.getConnection(dbUrl,userName,password);
  }
  
 
  public void showErrorMessage(SQLException exception){
      System.out.println("Error: "+exception.getMessage());
      System.out.println("Error code: "+exception.getErrorCode());
      if(exception.getErrorCode()==1062){
          JOptionPane.showMessageDialog(null,"Lütfen Farklı Bir Plaka Giriniz. ");
      }
  }
    
}

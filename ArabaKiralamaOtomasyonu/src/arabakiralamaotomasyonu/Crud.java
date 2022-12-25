
package arabakiralamaotomasyonu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EKREM
 */
public class Crud extends Hesapla{
    DefaultTableModel model;
    public void musteriTable(JTable tblMusteri) {
        model=(DefaultTableModel)tblMusteri.getModel();
        model.setRowCount(0);
        try {
            ArrayList<Musteriler> customers=getMusteriler();
            for(Musteriler musteriler: customers){
                Object[] row={musteriler.getMusteriId(),musteriler.getMusteriAd()
                        ,musteriler.getMusteriSoyad(),musteriler.getMusteriAdres(),musteriler.getMusteriTel(),musteriler.getMusteriEposta()};
                model.addRow(row);
            }
            }
            catch (SQLException ex) {
            
        }
    }
        public ArrayList<Musteriler> getMusteriler() throws SQLException{
        Connection connection=null;
        DbHelper helper=new DbHelper();
        Statement statement=null;
        ResultSet resultSet;
        ArrayList<Musteriler> customers=null;
        
        try{
            connection=helper.getConnection();
            statement=connection.createStatement();
            resultSet=statement.executeQuery("select * from musteri");
            customers= new ArrayList<Musteriler>();
            while(resultSet.next()){
                customers.add(new Musteriler(
                        resultSet.getInt("musteriID"),
                        resultSet.getString("musteriAd"),
                        resultSet.getString("musteriSoyad"),
                        resultSet.getString("musteriAdres"),
                        resultSet.getString("musteriTel"),
                        resultSet.getString("musteriEposta")));
            }
        }catch(SQLException exception){
            helper.showErrorMessage(exception);
            
        }finally{
            statement.close();
            connection.close();
        }
        
        return customers;
        }
        public ArrayList<Arabalar> getArabalar() throws SQLException{
        Connection connection=null;
        DbHelper helper=new DbHelper();
        Statement statement=null;
        ResultSet resultSet;
        ArrayList<Arabalar> cars=null;
        
        try{
            connection=helper.getConnection();
            statement=connection.createStatement();
            resultSet=statement.executeQuery("select * from arabalar");
            cars= new ArrayList<Arabalar>();
            while(resultSet.next()){
                cars.add(new Arabalar(
                        resultSet.getInt("arabaID"),
                        resultSet.getString("plaka"),
                        resultSet.getString("marka"),
                        resultSet.getString("model"),
                        resultSet.getString("durum"),
                        resultSet.getInt("ucret")));
            }
        }catch(SQLException exception){
            helper.showErrorMessage(exception);
            
        }finally{
            statement.close();
            connection.close();
        }
        
        return cars;
        
    }
   
    public void arabaTable(JTable tblAraba) {
        model=(DefaultTableModel)tblAraba.getModel();
        model.setRowCount(0);
        try {
            ArrayList<Arabalar> cars=getArabalar();
            for(Arabalar arabalar: cars){
                Object[] row={arabalar.getArabaId(),arabalar.getPlaka()
                        ,arabalar.getMarka(),arabalar.getModel(),arabalar.getDurum(),arabalar.getUcret()};
                model.addRow(row);
            }
            }
            catch (SQLException ex) {
            
        }
    }
    } 


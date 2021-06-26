package DAO.Repository;
import DAO.DbContext.DatabaseConnection;
import DAO.IRepository.IRepositoryPattren;
import Model.Medicament;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MedicamentRepository implements IRepositoryPattren<Medicament>{
    @Override
    public List<Medicament> getAll() {
        List<Medicament> medicaments=new ArrayList<Medicament>();
        Medicament medicament;
        try{
            Connection connection= DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("select * from medicament;");
                ResultSet r= preparedStatement.executeQuery();
                while (r.next()){
                    medicament =new Medicament(r.getInt("id"),r.getString("nom"),r.getInt("qute")
                    ,r.getString("methode"),r.getInt("ordannaceId"));
                    medicaments.add(medicament);
                }
            }
        }catch (Exception e){

        }

        return medicaments;
    }

    @Override
    public List<Medicament> getAllByPatient(int id) {
        return null;
    }

    @Override
    public Medicament getById(int id) {
        Medicament medicament=null;
        try{
            Connection connection=DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("select * from medicament where id=?;");
                preparedStatement.setInt(1,id);
                ResultSet r= preparedStatement.executeQuery();
                if (r.next()){
                    medicament =new Medicament(r.getInt("id"),r.getString("nom"),r.getInt("qute")
                            ,r.getString("methode"),r.getInt("ordannaceId"));
                }
            }
        }catch (Exception e){

        }

        return medicament;
    }

    @Override
    public void create(Medicament element) {
        try{
            Connection connection=DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("insert into medicament " +
                        "values(?,?,?,?,?);");
                preparedStatement.setInt(1,element.getId());
                preparedStatement.setString(2, element.getNom());
                preparedStatement.setInt(3,element.getQute());
                preparedStatement.setString(4,element.getMethode());
                preparedStatement.setInt(5,element.getOrdannaceId());
                preparedStatement.executeUpdate();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try{
            Connection connection=DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("delete from consultation where id=?");
                preparedStatement.setInt(1,id);
                preparedStatement.executeUpdate();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(Medicament element) {
        try{
            Connection connection=DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("update medicament  set nom=?,qute=?" +
                        "methode=? where id=?");
                preparedStatement.setString(1, element.getNom());
                preparedStatement.setInt(2,element.getQute());
                preparedStatement.setString(3,element.getMethode());
                preparedStatement.setInt(4,element.getId());
                preparedStatement.executeUpdate();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

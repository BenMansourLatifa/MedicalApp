package DAO.Repository;
import DAO.DbContext.DatabaseConnection;
import DAO.IRepository.IRepositoryPattren;
import Model.Consultation;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultationRepository  implements IRepositoryPattren<Consultation> {

    @Override
    public List<Consultation> getAll() {
        List<Consultation> consultations=new ArrayList<Consultation>();
        Consultation consultation;
        try{
            Connection connection=DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("select * from consultation;");
                ResultSet r= preparedStatement.executeQuery();
                while (r.next()){
                    consultation =new Consultation(r.getInt("id"),r.getDate("date"),r.getString("type")
                    ,r.getString("remarques"),r.getInt("partientid"));
                    consultations.add(consultation);
                }
            }
        }catch (Exception e){

        }
        return consultations;
    }
    public ResultSet getAllByR() {

        ResultSet r=null;
        try{
            Connection connection=DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("select * from consultation;");
                 r= preparedStatement.executeQuery();
            }
        }catch (Exception e){

        }
        return r;
    }
    @Override
    public List<Consultation> getAllByPatient(int id){
        return null;
    }

    @Override
    public Consultation getById(int id) {
        Consultation consultation=null;
        try{
            Connection connection=DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("select * from consultation where id=?;");
                preparedStatement.setInt(1,id);
                ResultSet r= preparedStatement.executeQuery();
                while (r.next()){
                    consultation =new Consultation(r.getInt("id"),r.getDate("date"),r.getString("type")
                            ,r.getString("remarques"),r.getInt("partientid"));
                }
            }
        }catch (Exception e){

        }

        return consultation;
    }


    @Override
    public void create(Consultation element) {
        try{
            Connection connection=DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("insert into consultation(date,type,remarques,patientid) " +
                        "values(?,?,?,?);");
                preparedStatement.setDate(1, (Date) element.getDate());
                preparedStatement.setString(2,element.getType());
                preparedStatement.setString(3,element.getRemarques());
                preparedStatement.setInt(4,element.getPatientId());
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
    public void update(Consultation element) {
        try{
            Connection connection=DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("update consultation  set date=?,type=?" +
                        "remarques=? where id=?");
                preparedStatement.setDate(1, (Date) element.getDate());
                preparedStatement.setString(2,element.getType());
                preparedStatement.setString(3,element.getRemarques());
                preparedStatement.setInt(4,element.getId());
                preparedStatement.executeUpdate();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

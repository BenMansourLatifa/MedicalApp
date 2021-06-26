package DAO.Repository;
import DAO.DbContext.DatabaseConnection;
import DAO.IRepository.IRepositoryPattren;
import Model.Patient;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PatientRepository implements IRepositoryPattren<Patient>{
    @Override
    public List<Patient> getAll() {
        List<Patient> patients=new ArrayList<Patient>();
        Patient patient;
        try{
            Connection connection= DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("select * from patient;");
                ResultSet r= preparedStatement.executeQuery();
                while (r.next()){
                    patient =new Patient(r.getInt("id"),r.getString("nom"),r.getString("prenom"),
                            r.getString("email"),r.getString("sexe"),r.getString("address")
                            ,r.getInt("zip"),r.getString("ville"),r.getInt("cnss")
                            ,r.getString("gpsng"),r.getDate("datenais"));
                    patients.add(patient);
                }
            }
        }catch (Exception e){

        }
        return patients;
    }
    public ResultSet getAllByR() {
        ResultSet r=null;
        try{
            Connection connection= DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("select * from patient;");
                 r= preparedStatement.executeQuery();
            }
        }catch (Exception e){

        }
        return r;
    }
    @Override
    public List<Patient> getAllByPatient(int id) {
        return null;
    }

    @Override
    public Patient getById(int id) {
        Patient patient=null;
        try{
            Connection connection=DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("select * from patient where id=?;");
                preparedStatement.setInt(1,id);
                ResultSet r= preparedStatement.executeQuery();
                while (r.next()){
                    patient =new Patient(r.getInt("id"),r.getString("nom"),r.getString("prenom"),
                            r.getString("email"),r.getString("sexe"),r.getString("address")
                            ,r.getInt("zip"),r.getString("ville"),r.getInt("cnss")
                            ,r.getString("gpsng"),r.getDate("datenais"));
                }
            }
        }catch (Exception e){

        }

        return patient;
    }

    @Override
    public void create(Patient element) {
        try{
            Connection connection= DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("insert into patient " +
                        "values(?,?,?,?,?,?,?,?,?,?,?);");
                preparedStatement.setInt(1,element.getId());
                preparedStatement.setString(2,element.getNom());
                preparedStatement.setString(3,element.getPrenom());
                preparedStatement.setString(4,element.getEmail());
                preparedStatement.setString(5,element.getSexe());
                preparedStatement.setString(6,element.getAddress());
                preparedStatement.setInt(7,element.getZip());
                preparedStatement.setString(8,element.getVille());
                preparedStatement.setInt(9,element.getCnss());
                preparedStatement.setString(10,element.getGpsng());
                preparedStatement.setDate(11,(Date) element.getDatenais());

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
                PreparedStatement preparedStatement=connection.prepareStatement("delete from patient where id=?");
                preparedStatement.setInt(1,id);
                preparedStatement.executeUpdate();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(Patient element) {
        try{
            Connection connection=DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("update patient  " +
                        "set nom=?,prenom=?,email=?,sexe=?,address=?,zip=?,ville=?,cnss=?,gpsng=?,datenais=? where id=?");
                preparedStatement.setString(1,element.getNom());
                preparedStatement.setString(2,element.getPrenom());
                preparedStatement.setString(3,element.getEmail());
                preparedStatement.setString(4,element.getSexe());
                preparedStatement.setString(5,element.getAddress());
                preparedStatement.setInt(6,element.getZip());
                preparedStatement.setString(7,element.getVille());
                preparedStatement.setInt(8,element.getCnss());
                preparedStatement.setString(9,element.getGpsng());
                preparedStatement.setDate(10,(Date) element.getDatenais());
                preparedStatement.setInt(11,element.getId());

                int i=preparedStatement.executeUpdate();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

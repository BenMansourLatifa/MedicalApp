package DAO.Repository;
import DAO.DbContext.DatabaseConnection;
import DAO.IRepository.IRepositoryPattren;
import Model.Ordannace;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrdannaceRepository implements IRepositoryPattren<Ordannace>{
    @Override
    public List<Ordannace> getAll() {
        List<Ordannace> ordannaces=new ArrayList<Ordannace>();
        Ordannace ordannace;
        try{
            Connection connection= DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("select * from ordannace;");
                ResultSet r= preparedStatement.executeQuery();
                while (r.next()){
                    ordannace =new Ordannace(r.getInt("id"),r.getInt("consultationid"));
                    ordannaces.add(ordannace);
                }
            }
        }catch (Exception e){

        }
        return ordannaces;
    }

    @Override
    public List<Ordannace> getAllByPatient(int id) {
        return null;
    }

    @Override
    public Ordannace getById(int id) {
        Ordannace ordannace=null;
        try{
            Connection connection=DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("select * from ordannace where id=?;");
                preparedStatement.setInt(1,id);
                ResultSet r= preparedStatement.executeQuery();
                if (r.next()){
                    ordannace =new Ordannace(r.getInt("id"),r.getInt("consultationid"));
                }
            }
        }catch (Exception e){

        }

        return ordannace;
    }

    @Override
    public void create(Ordannace element) {
        try{
            Connection connection= DatabaseConnection.getInstance().getConnection() ;
            if(connection != null){
                PreparedStatement preparedStatement=connection.prepareStatement("insert into ordannace " +
                        "values(?,?);");
                preparedStatement.setInt(1,element.getId());
                preparedStatement.setInt(2, element.getConsultationid());

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
                PreparedStatement preparedStatement=connection.prepareStatement("delete from ordannace where id=?");
                preparedStatement.setInt(1,id);
                preparedStatement.executeUpdate();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(Ordannace element) {

    }
}
